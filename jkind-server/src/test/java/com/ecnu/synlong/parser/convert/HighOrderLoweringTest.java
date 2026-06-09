package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.service.LustreService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Regression coverage for Synlong high-order / derived iterator lowering.
 */
public class HighOrderLoweringTest {
    private static final String[] SUCCESS_RESIDUES = {
            "<<", ">>", "$+$", "$-$", "$*$", "$/$", "$mod$", "$div$",
            "$=$", "$<>$", "$<$", "$>$", "$<=$", "$>=$", "$and$", "$or$", "$xor$",
            "+$", "-$", "not$", "map <<", "fold <<", "mapi <<", "foldi <<", "mapfold <<"
    };

    @Test
    public void lowersPrefixOperatorsWithoutResidueAndParsesAsLustre() throws Exception {
        String synlong =
                "node main(a : int; b : int; x : bool; y : bool) returns (sum : int; neg : int; inverted : bool; both : bool)\n" +
                "let\n" +
                "  sum = $+$(a, b);\n" +
                "  neg = -$(a);\n" +
                "  inverted = not$(x);\n" +
                "  both = $and$(x, y);\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(lustre, "sum = a + b");
        assertContainsIgnoringWhitespace(lustre, "neg = -a");
        assertContainsIgnoringWhitespace(lustre, "inverted = not x");
        assertContainsIgnoringWhitespace(lustre, "both = x and y");
        assertNoSuccessResidue(lustre);
        assertParsesAsLustre(lustre);
    }

    @Test
    public void lowersFixedCountMapWithoutResidueAndParsesAsLustre() throws Exception {
        String synlong =
                "type int_array = int^3;\n" +
                "node main(a : int_array; b : int_array) returns (c : int_array)\n" +
                "let\n" +
                "  c = (map << $+$; 3 >>)(a, b);\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(lustre, "c = [");
        assertContainsIgnoringWhitespace(lustre, "a[0] + b[0]");
        assertContainsIgnoringWhitespace(lustre, "a[1] + b[1]");
        assertContainsIgnoringWhitespace(lustre, "a[2] + b[2]");
        assertNoSuccessResidue(lustre);
        assertParsesAsLustre(lustre);
    }

    @Test
    public void lowersBatteryCellOverVoltageMapInRealisticController() throws Exception {
        String synlong =
                "type voltage_array = real^4;\n" +
                "type flag_array = bool^4;\n" +
                "node main(cellVoltage : voltage_array; maxVoltage : voltage_array) returns (overVoltage : flag_array)\n" +
                "let\n" +
                "  overVoltage = (map << $>$; 4 >>)(cellVoltage, maxVoltage);\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(lustre, "overVoltage = [");
        assertContainsIgnoringWhitespace(lustre, "cellVoltage[0] > maxVoltage[0]");
        assertContainsIgnoringWhitespace(lustre, "cellVoltage[1] > maxVoltage[1]");
        assertContainsIgnoringWhitespace(lustre, "cellVoltage[2] > maxVoltage[2]");
        assertContainsIgnoringWhitespace(lustre, "cellVoltage[3] > maxVoltage[3]");
        assertNoSuccessResidue(lustre);
        assertParsesAsLustre(lustre);
    }

    @Test
    public void lowersVehicleWheelTorqueCorrectionMapInRealisticController() throws Exception {
        String synlong =
                "type torque_array = int^4;\n" +
                "node main(driverTorque : torque_array; stabilityCorrection : torque_array) returns (wheelTorque : torque_array)\n" +
                "let\n" +
                "  wheelTorque = (map << $+$; 4 >>)(driverTorque, stabilityCorrection);\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(lustre, "wheelTorque = [");
        assertContainsIgnoringWhitespace(lustre, "driverTorque[0] + stabilityCorrection[0]");
        assertContainsIgnoringWhitespace(lustre, "driverTorque[1] + stabilityCorrection[1]");
        assertContainsIgnoringWhitespace(lustre, "driverTorque[2] + stabilityCorrection[2]");
        assertContainsIgnoringWhitespace(lustre, "driverTorque[3] + stabilityCorrection[3]");
        assertNoSuccessResidue(lustre);
        assertParsesAsLustre(lustre);
    }

    @Test
    public void lowersInfusionPumpChannelEnableMapInRealisticController() throws Exception {
        String synlong =
                "type fault_array = bool^3;\n" +
                "type enable_array = bool^3;\n" +
                "node main(channelFault : fault_array) returns (channelEnabled : enable_array)\n" +
                "let\n" +
                "  channelEnabled = (map << not$; 3 >>)(channelFault);\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(lustre, "channelEnabled = [");
        assertContainsIgnoringWhitespace(lustre, "not channelFault[0]");
        assertContainsIgnoringWhitespace(lustre, "not channelFault[1]");
        assertContainsIgnoringWhitespace(lustre, "not channelFault[2]");
        assertNoSuccessResidue(lustre);
        assertParsesAsLustre(lustre);
    }

    @Test
    public void lowersTrainDoorInterlockPrefixOperatorsInRealisticController() throws Exception {
        String synlong =
                "node main(doorClosed : bool; emergencyStop : bool; tractionRequest : bool; measuredSpeed : int; calibrationOffset : int) " +
                "returns (tractionAllowed : bool; calibratedSpeed : int)\n" +
                "var\n" +
                "  noEmergency : bool;\n" +
                "  doorReady : bool;\n" +
                "let\n" +
                "  noEmergency = not$(emergencyStop);\n" +
                "  doorReady = $and$(doorClosed, noEmergency);\n" +
                "  tractionAllowed = $and$(doorReady, tractionRequest);\n" +
                "  calibratedSpeed = $-$(measuredSpeed, calibrationOffset);\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(lustre, "noEmergency = not emergencyStop");
        assertContainsIgnoringWhitespace(lustre, "doorReady = doorClosed and noEmergency");
        assertContainsIgnoringWhitespace(lustre, "tractionAllowed = doorReady and tractionRequest");
        assertContainsIgnoringWhitespace(lustre, "calibratedSpeed = measuredSpeed - calibrationOffset");
        assertNoSuccessResidue(lustre);
        assertParsesAsLustre(lustre);
    }

    @Test
    public void rejectsUnsupportedAdvancedIteratorsBeforeLustreParsing() {
        String synlong =
                "type int_array = int^3;\n" +
                "node main(a : int_array; b : int_array) returns (c : int_array)\n" +
                "let\n" +
                "  c = (mapw << $+$; 3 >> if true default (0, 0, 0))(a, b);\n" +
                "tel;\n";

        assertThrows(SynlongToLustreException.class, new org.junit.jupiter.api.function.Executable() {
            @Override
            public void execute() throws Throwable {
                convertPreservingReferenceResult(synlong);
            }
        });
    }

    @Test
    public void rejectsUnsupportedFoldwBeforeLustreParsing() {
        String synlong =
                "type int_array = int^3;\n" +
                "node main(a : int_array) returns (c : int)\n" +
                "let\n" +
                "  c = (foldw << $+$; 3 >> if true)(0, a);\n" +
                "tel;\n";

        assertThrows(SynlongToLustreException.class, new org.junit.jupiter.api.function.Executable() {
            @Override
            public void execute() throws Throwable {
                convertPreservingReferenceResult(synlong);
            }
        });
    }

    private static String convertPreservingReferenceResult(String synlong) throws Exception {
        Path resultPath = Paths.get("reference", "result.txt");
        Path resultDir = resultPath.getParent();
        boolean directoryExisted = resultDir == null || Files.exists(resultDir);
        boolean fileExisted = Files.exists(resultPath);
        byte[] original = fileExisted ? Files.readAllBytes(resultPath) : null;
        if (resultDir != null && !directoryExisted) {
            Files.createDirectories(resultDir);
        }
        try {
            return SynlongConverter.convert(synlong);
        } finally {
            restoreReferenceResult(resultPath, resultDir, directoryExisted, fileExisted, original);
        }
    }

    private static void restoreReferenceResult(Path resultPath, Path resultDir, boolean directoryExisted,
                                               boolean fileExisted, byte[] original) throws IOException {
        if (fileExisted) {
            Files.write(resultPath, original);
        } else {
            Files.deleteIfExists(resultPath);
        }
        if (resultDir != null && !directoryExisted) {
            Files.deleteIfExists(resultDir);
        }
    }

    private static void assertNoSuccessResidue(String lustre) {
        for (String residue : SUCCESS_RESIDUES) {
            assertFalse(lustre.contains(residue), "Unexpected high-order residue in generated Lustre: " + residue + "\n" + lustre);
        }
    }

    private static void assertParsesAsLustre(String lustre) throws Exception {
        new LustreService().parseLustre(lustre);
    }

    private static void assertContainsIgnoringWhitespace(String actual, String expected) {
        String normalizedActual = actual.replaceAll("\\s+", "");
        String normalizedExpected = expected.replaceAll("\\s+", "");
        assertTrue(normalizedActual.contains(normalizedExpected),
                "Expected generated Lustre to contain: " + expected + "\n" + actual);
    }

}
