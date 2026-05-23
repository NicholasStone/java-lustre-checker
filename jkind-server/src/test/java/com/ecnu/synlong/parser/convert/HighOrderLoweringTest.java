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

        assertContains(lustre, "sum = a + b");
        assertContains(lustre, "neg = -a");
        assertContains(lustre, "inverted = not x");
        assertContains(lustre, "both = x and y");
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

        assertContains(lustre, "c = [");
        assertContains(lustre, "a[0] + b[0]");
        assertContains(lustre, "a[1] + b[1]");
        assertContains(lustre, "a[2] + b[2]");
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
        boolean existed = Files.exists(resultPath);
        byte[] original = existed ? Files.readAllBytes(resultPath) : null;
        try {
            return SynlongConverter.convert(synlong);
        } finally {
            restoreReferenceResult(resultPath, existed, original);
        }
    }

    private static void restoreReferenceResult(Path resultPath, boolean existed, byte[] original) throws IOException {
        if (existed) {
            Files.write(resultPath, original);
        } else {
            Files.deleteIfExists(resultPath);
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

    private static void assertContains(String actual, String expected) {
        assertTrue(actual.contains(expected), "Expected generated Lustre to contain: " + expected + "\n" + actual);
    }

}
