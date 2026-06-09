package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.service.LustreService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TDD coverage for thesis-facing high-order source maps and iterator lowering.
 */
public class HighOrderSourceMapTest {
    @Test
    public void fixedCountMapProducesDeterministicSourceMapEntries() throws Exception {
        String synlong =
                "type int_array = int^3;\n" +
                "node main(a : int_array; b : int_array) returns (c : int_array)\n" +
                "let\n" +
                "  c = (map << $+$; 3 >>)(a, b);\n" +
                "tel;\n";

        HighOrderConversionResult first = convertWithMetadataPreservingReferenceResult(synlong);
        HighOrderConversionResult second = convertWithMetadataPreservingReferenceResult(synlong);

        assertEquals(first.getSourceMapEntries(), second.getSourceMapEntries());
        assertEquals(3, first.getSourceMapEntries().size());

        HighOrderSourceMapEntry stage0 = first.getSourceMapEntries().get(0);
        assertEquals("map", stage0.getIterator());
        assertEquals("$+$", stage0.getOperator());
        assertEquals(3, stage0.getCount());
        assertEquals(0, stage0.getStage());
        assertEquals(Arrays.asList("a[0]", "b[0]"), stage0.getSourceArguments());
        assertEquals("a[0] + b[0]", stage0.getGeneratedExpression());

        assertContainsIgnoringWhitespace(first.getLustre(), "c = [a[0] + b[0], a[1] + b[1], a[2] + b[2]]");
        assertNoHighOrderResidue(first.getLustre());
        assertParsesAsLustre(first.getLustre());
    }

    @Test
    public void fixedCountFoldLowersToNestedAccumulatorAndSourceMapStages() throws Exception {
        String synlong =
                "type int_array = int^3;\n" +
                "node main(a : int_array) returns (c : int)\n" +
                "let\n" +
                "  c = (fold << $+$; 3 >>)(0, a);\n" +
                "tel;\n";

        HighOrderConversionResult result = convertWithMetadataPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(result.getLustre(), "c = (((0 + a[0]) + a[1]) + a[2])");
        assertNoHighOrderResidue(result.getLustre());
        assertParsesAsLustre(result.getLustre());

        assertEquals(3, result.getSourceMapEntries().size());
        assertEquals("fold", result.getSourceMapEntries().get(0).getIterator());
        assertEquals(Arrays.asList("0", "a[0]"), result.getSourceMapEntries().get(0).getSourceArguments());
        assertEquals("0 + a[0]", result.getSourceMapEntries().get(0).getGeneratedExpression());
        assertEquals(Arrays.asList("(0 + a[0])", "a[1]"), result.getSourceMapEntries().get(1).getSourceArguments());
        assertEquals("(0 + a[0]) + a[1]", result.getSourceMapEntries().get(1).getGeneratedExpression());
        assertEquals(Arrays.asList("((0 + a[0]) + a[1])", "a[2]"), result.getSourceMapEntries().get(2).getSourceArguments());
        assertEquals("((0 + a[0]) + a[1]) + a[2]", result.getSourceMapEntries().get(2).getGeneratedExpression());
    }

    @Test
    public void grammarValidIdentifierMapfoldLowersToStagedEquationsAndSourceMap() throws Exception {
        String synlong =
                "type bool_array = bool^3;\n" +
                "node fulladd(carryIn : bool; x : bool; y : bool) returns (carryOut : bool; sum : bool)\n" +
                "let\n" +
                "  sum = x xor y xor carryIn;\n" +
                "  carryOut = x and y or carryIn and x xor y;\n" +
                "tel;\n" +
                "node main(carryIn : bool; x : bool_array; y : bool_array) returns (carryOut : bool; sum : bool_array)\n" +
                "let\n" +
                "  carryOut, sum = (mapfold << fulladd; 3 >>)(carryIn, x, y);\n" +
                "tel;\n";

        HighOrderConversionResult result = convertWithMetadataPreservingReferenceResult(synlong);
        String lustre = result.getLustre();

        assertContainsIgnoringWhitespace(lustre, "__mapfold_carryOut_1, __mapfold_sum_0 = fulladd(carryIn, x[0], y[0])");
        assertContainsIgnoringWhitespace(lustre, "__mapfold_carryOut_2, __mapfold_sum_1 = fulladd(__mapfold_carryOut_1, x[1], y[1])");
        assertContainsIgnoringWhitespace(lustre, "carryOut, __mapfold_sum_2 = fulladd(__mapfold_carryOut_2, x[2], y[2])");
        assertContainsIgnoringWhitespace(lustre, "sum = [__mapfold_sum_0, __mapfold_sum_1, __mapfold_sum_2]");
        assertNoHighOrderResidue(lustre);
        assertParsesAsLustre(lustre);

        List<HighOrderSourceMapEntry> entries = result.getSourceMapEntries();
        assertEquals(3, entries.size());
        assertEquals("mapfold", entries.get(0).getIterator());
        assertEquals("fulladd", entries.get(0).getOperator());
        assertEquals(Arrays.asList("carryIn", "x[0]", "y[0]"), entries.get(0).getSourceArguments());
        assertEquals("__mapfold_carryOut_1, __mapfold_sum_0 = fulladd(carryIn, x[0], y[0])",
                entries.get(0).getGeneratedExpression());
    }

    @Test
    public void prefixOperatorMapfoldRemainsRejectedBeforeLustreParsing() {
        String synlong =
                "type int_array = int^3;\n" +
                "node main(a : int_array) returns (out : int; mapped : int_array)\n" +
                "let\n" +
                "  out, mapped = (mapfold << $+$; 3 >>)(0, a);\n" +
                "tel;\n";

        SynlongToLustreException exception = assertThrows(SynlongToLustreException.class,
                new org.junit.jupiter.api.function.Executable() {
                    @Override
                    public void execute() throws Throwable {
                        convertWithMetadataPreservingReferenceResult(synlong);
                    }
                });
        assertTrue(exception.getMessage().contains("mapfold"));
        assertTrue(exception.getMessage().contains("identifier"));
    }

    @Test
    public void mapfoldTypeInferenceIsScopedToCurrentNode() throws Exception {
        String synlong =
                "type bool_array = bool^3;\n" +
                "node main(carryIn : bool; x : bool_array; y : bool_array) returns (carryOut : bool; sum : bool_array)\n" +
                "let\n" +
                "  carryOut, sum = (mapfold << fulladd; 3 >>)(carryIn, x, y);\n" +
                "tel;\n" +
                "node fulladd(carryIn : bool; x : bool; y : bool) returns (carryOut : bool; sum : bool)\n" +
                "let\n" +
                "  sum = x xor y xor carryIn;\n" +
                "  carryOut = x and y or carryIn and x xor y;\n" +
                "tel;\n";

        HighOrderConversionResult result = convertWithMetadataPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(result.getLustre(), "__mapfold_sum_0 : bool;");
        assertContainsIgnoringWhitespace(result.getLustre(), "sum = [__mapfold_sum_0, __mapfold_sum_1, __mapfold_sum_2]");
        assertNoHighOrderResidue(result.getLustre());
        assertParsesAsLustre(result.getLustre());
    }

    @Test
    public void mapfoldGeneratedTempsAvoidUserLocalCollisions() throws Exception {
        String synlong =
                "type bool_array = bool^3;\n" +
                "node fulladd(carryIn : bool; x : bool; y : bool) returns (carryOut : bool; sum : bool)\n" +
                "let\n" +
                "  sum = x xor y xor carryIn;\n" +
                "  carryOut = x and y or carryIn and x xor y;\n" +
                "tel;\n" +
                "node main(carryIn : bool; x : bool_array; y : bool_array) returns (carryOut : bool; sum : bool_array)\n" +
                "var\n" +
                "  __mapfold_sum_0 : bool;\n" +
                "let\n" +
                "  __mapfold_sum_0 = false;\n" +
                "  carryOut, sum = (mapfold << fulladd; 3 >>)(carryIn, x, y);\n" +
                "tel;\n";

        HighOrderConversionResult result = convertWithMetadataPreservingReferenceResult(synlong);

        assertContainsIgnoringWhitespace(result.getLustre(), "__mapfold_sum_0_1 : bool;");
        assertContainsIgnoringWhitespace(result.getLustre(), "sum = [__mapfold_sum_0_1, __mapfold_sum_1, __mapfold_sum_2]");
        assertNoHighOrderResidue(result.getLustre());
        assertParsesAsLustre(result.getLustre());
    }

    @Test
    public void repeatedMapfoldExpansionsUseDistinctGeneratedTemps() throws Exception {
        String synlong =
                "type bool_array = bool^3;\n" +
                "node fulladd(carryIn : bool; x : bool; y : bool) returns (carryOut : bool; sumBit : bool)\n" +
                "let\n" +
                "  sumBit = x xor y xor carryIn;\n" +
                "  carryOut = x and y or carryIn and x xor y;\n" +
                "tel;\n" +
                "node main(carryIn : bool; secondCarryIn : bool; x : bool_array; y : bool_array) returns (carryOut : bool; sum : bool_array; carryOut2 : bool; sum2 : bool_array)\n" +
                "let\n" +
                "  carryOut, sum = (mapfold << fulladd; 3 >>)(carryIn, x, y);\n" +
                "  carryOut2, sum2 = (mapfold << fulladd; 3 >>)(secondCarryIn, x, y);\n" +
                "tel;\n";

        HighOrderConversionResult result = convertWithMetadataPreservingReferenceResult(synlong);
        String lustre = result.getLustre();

        assertContainsIgnoringWhitespace(lustre, "__mapfold_carryOut2_1, __mapfold_sum2_0 = fulladd(secondCarryIn, x[0], y[0])");
        assertContainsIgnoringWhitespace(lustre, "sum2 = [__mapfold_sum2_0, __mapfold_sum2_1, __mapfold_sum2_2]");
        assertEquals(6, result.getSourceMapEntries().size());
        assertEquals(lustre.indexOf("__mapfold_sum_0 : bool;"), lustre.lastIndexOf("__mapfold_sum_0 : bool;"));
        assertEquals(lustre.indexOf("__mapfold_sum2_0 : bool;"), lustre.lastIndexOf("__mapfold_sum2_0 : bool;"));
        assertNoHighOrderResidue(lustre);
        assertParsesAsLustre(lustre);
    }

    private static HighOrderConversionResult convertWithMetadataPreservingReferenceResult(String synlong) throws Exception {
        Path resultPath = Paths.get("reference", "result.txt");
        Path resultDir = resultPath.getParent();
        boolean directoryExisted = resultDir == null || Files.exists(resultDir);
        boolean fileExisted = Files.exists(resultPath);
        byte[] original = fileExisted ? Files.readAllBytes(resultPath) : null;
        if (resultDir != null && !directoryExisted) {
            Files.createDirectories(resultDir);
        }
        try {
            return SynlongConverter.convertWithMetadata(synlong);
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

    private static void assertNoHighOrderResidue(String lustre) {
        assertFalse(lustre.contains("<<"), "Unexpected iterator residue:\n" + lustre);
        assertFalse(lustre.contains(">>"), "Unexpected iterator residue:\n" + lustre);
        assertFalse(lustre.contains("map <<"), "Unexpected map residue:\n" + lustre);
        assertFalse(lustre.contains("fold <<"), "Unexpected fold residue:\n" + lustre);
        assertFalse(lustre.contains("mapfold <<"), "Unexpected mapfold residue:\n" + lustre);
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
