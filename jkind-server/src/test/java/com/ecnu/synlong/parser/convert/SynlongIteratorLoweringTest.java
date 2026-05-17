package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongLexer;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import jkind.lustre.parsing.LustreParseUtil;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Regression coverage for first-pass Lustre V6 map/fold iterator lowering.
 *
 * These tests intentionally exercise the converter seam rather than the solver path so they can
 * run without external SMT binaries. Solver-backed samples can be added separately once the
 * converted core Lustre output is available in the integration branch.
 */
public class SynlongIteratorLoweringTest {
    @Test
    public void officialMapPlusLowersToPointwiseCoreArray() {
        String converted = convert(minimalArrayNode("m", "map<<+;3>>([1,0,2], [3,6,-1])"));

        assertNoIteratorSyntaxRemains(converted);
        assertCoreLustre(converted);
        assertContainsIgnoringWhitespace(converted,
                "m = [1 + 3, 0 + 6, 2 + (-1)]");
    }

    @Test
    public void dollarAliasMapPlusLowersToPointwiseCoreArray() {
        String converted = convert(minimalArrayNode("m", "(map << $+$; 3 >>)([1,0,2], [3,6,-1])"));

        assertNoIteratorSyntaxRemains(converted);
        assertFalse(converted.contains("$+$"), converted);
        assertCoreLustre(converted);
        assertContainsIgnoringWhitespace(converted,
                "m = [1 + 3, 0 + 6, 2 + (-1)]");
    }

    @Test
    public void officialFoldPlusLowersToLeftFoldCoreExpression() {
        String converted = convert(minimalScalarNode("s", "fold<<+;3>>(0, [1,2,3])"));

        assertNoIteratorSyntaxRemains(converted);
        assertCoreLustre(converted);
        assertContainsIgnoringWhitespace(converted,
                "s = (((0 + 1) + 2) + 3)");
    }

    @Test
    public void dollarAliasFoldPlusLowersToLeftFoldCoreExpression() {
        String converted = convert(minimalScalarNode("s", "(fold << $+$; 3 >>)(0, [1,2,3])"));

        assertNoIteratorSyntaxRemains(converted);
        assertFalse(converted.contains("$+$"), converted);
        assertCoreLustre(converted);
        assertContainsIgnoringWhitespace(converted,
                "s = (((0 + 1) + 2) + 3)");
    }

    @Test
    public void unsupportedIteratorsFailClearly() {
        assertUnsupportedIterator("mapi", "(mapi << $+$; 3 >>)(A, B)");
        assertUnsupportedIterator("foldi", "(foldi << $+$; 3 >>)(0, A)");
        assertUnsupportedIterator("mapfold", "(mapfold << $+$; 3 >>)(0, A, B)");
        assertUnsupportedIterator("mapw", "(mapw << $+$; 3 >> if true default (0))(A, B)");
        assertUnsupportedIterator("mapwi", "(mapwi << $+$; 3 >> if true default (0))(A, B)");
        assertUnsupportedIterator("foldw", "(foldw << $+$; 3 >> if true)(0, A)");
        assertUnsupportedIterator("foldwi", "(foldwi << $+$; 3 >> if true)(0, A)");
    }

    @Test
    public void mapInvalidArityFailsClearly() {
        SynlongToLustreException ex = assertThrows(SynlongToLustreException.class,
                () -> convert(nodeWithArrayInputs("m", "int^3", "(map << $+$; 3 >>)(A)")));

        assertMessageMentions(ex, "arity", "argument", "operand", "expects", "requires");
    }

    @Test
    public void foldInvalidArityFailsClearly() {
        SynlongToLustreException ex = assertThrows(SynlongToLustreException.class,
                () -> convert(nodeWithArrayInputs("s", "int", "(fold << $+$; 3 >>)(A)")));

        assertMessageMentions(ex, "arity", "argument", "operand", "expects", "requires");
    }

    @Test
    public void nonLiteralIteratorCountFailsClearly() {
        SynlongToLustreException ex = assertThrows(SynlongToLustreException.class,
                () -> convert(nodeWithArrayInputs("m", "int^3", "(map << $+$; N >>)(A, B)")));

        assertMessageMentions(ex, "literal", "integer", "count", "constant");
    }

    @Test
    public void userDefinedIteratorOperatorFailsClearly() {
        SynlongToLustreException ex = assertThrows(SynlongToLustreException.class,
                () -> convert(nodeWithArrayInputs("m", "int^3", "map<<user_plus;3>>(A, B)")));

        assertMessageMentions(ex, "unsupported iterator operator", "user_plus");
    }

    private static void assertUnsupportedIterator(String iterator, String expression) {
        SynlongToLustreException ex = assertThrows(SynlongToLustreException.class,
                () -> convert(nodeWithArrayInputs("m", "int^3", expression)), iterator);
        assertMessageMentions(ex, "unsupported iterator", iterator);
    }

    private static void assertNoIteratorSyntaxRemains(String converted) {
        assertFalse(converted.contains("<<"), converted);
        assertFalse(converted.contains(">>"), converted);
        assertFalse(converted.contains("map<<"), converted);
        assertFalse(converted.contains("fold<<"), converted);
    }

    private static void assertContainsIgnoringWhitespace(String actual, String expectedSubstring) {
        String normalizedActual = removeWhitespace(actual);
        String normalizedExpected = removeWhitespace(expectedSubstring);
        assertTrue(normalizedActual.contains(normalizedExpected),
                "Expected converted output to contain: " + expectedSubstring + "\nActual:\n" + actual);
    }

    private static void assertCoreLustre(String converted) {
        assertDoesNotThrow(() -> LustreParseUtil.program(converted), converted);
    }

    private static void assertMessageMentions(Throwable throwable, String... expectedTerms) {
        String message = String.valueOf(throwable.getMessage()).toLowerCase();
        for (String term : expectedTerms) {
            if (message.contains(term.toLowerCase())) {
                return;
            }
        }
        throw new AssertionError("Expected error message to mention one of "
                + java.util.Arrays.toString(expectedTerms) + " but was: " + throwable.getMessage(), throwable);
    }

    private static String removeWhitespace(String value) {
        return value.replaceAll("\\s+", "");
    }

    private static String minimalArrayNode(String output, String expression) {
        return "node Main() returns (" + output + ": int^3)\n"
                + "let\n"
                + "  " + output + " = " + expression + ";\n"
                + "tel;\n";
    }

    private static String minimalScalarNode(String output, String expression) {
        return "node Main() returns (" + output + ": int)\n"
                + "let\n"
                + "  " + output + " = " + expression + ";\n"
                + "tel;\n";
    }

    private static String nodeWithArrayInputs(String output, String outputType, String expression) {
        return "node Main() returns (" + output + ": " + outputType + ")\n"
                + "var\n"
                + "  A, B: int^3;\n"
                + "  N: int;\n"
                + "let\n"
                + "  " + output + " = " + expression + ";\n"
                + "tel;\n";
    }

    private static String convert(String synlongCode) {
        try {
            CharStream input = CharStreams.fromString(synlongCode);
            SynlongLexer lexer = new SynlongLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new SynlongErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SynlongParser parser = new SynlongParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SynlongErrorListener());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
            ParseTree tree = parser.program();

            SynlongToLustreContext context = new SynlongToLustreContext();
            SynlongToLustreVisitor visitor = new SynlongToLustreVisitor(context);
            return visitor.visit(tree);
        } catch (SynlongToLustreException e) {
            throw e;
        } catch (Exception e) {
            throw new SynlongToLustreException(e.getMessage(), e);
        }
    }
}
