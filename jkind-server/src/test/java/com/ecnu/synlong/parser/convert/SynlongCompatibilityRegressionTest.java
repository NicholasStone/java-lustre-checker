package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.service.LustreService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SynlongCompatibilityRegressionTest {
    @Test
    public void acceptsParenthesizedNegativeConstants() throws Exception {
        String synlong =
                "const period : real = 20;\n" +
                "const values : real^3 = [(-0.5), (-1.0E-3), -2.0];\n" +
                "node main() returns (ok : bool)\n" +
                "let\n" +
                "  ok = true;\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertTrue(lustre.contains("(-0.5)"));
        assertTrue(lustre.contains("(-0.001"));
        assertTrue(lustre.contains("const period : real = 20.0;"));
        new LustreService().parseLustre(lustre);
    }

    @Test
    public void emitsTypedRecordConstantsIncludingArrayElements() throws Exception {
        String synlong =
                "const zero : analog = {value : 0.0, status : false};\n" +
                "const pair : analog_pair = [{value : 1.0, status : false}, {value : 2.0, status : true}];\n" +
                "type analog = {value : real, status : bool};\n" +
                "type analog_pair = analog^2;\n" +
                "node main() returns (ok : bool)\n" +
                "let\n" +
                "  ok = zero.status;\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertTrue(lustre.contains("analog {value = 0.0; status = false}"));
        assertTrue(lustre.contains("analog {value = 1.0; status = false}"));
        assertTrue(lustre.contains("analog {value = 2.0; status = true}"));
        new LustreService().parseLustre(lustre);
    }

    @Test
    public void lowersLegacyExpressionsAndIteratorSyntax() throws Exception {
        String synlong =
                "type ints = int^2;\n" +
                "function add(acc : int; value : int) returns (result : int);\n" +
                "node main(input : analog; values : ints) returns (sum : int; castValue : real)\n" +
                "var changed : bool;\n" +
                "let\n" +
                "  _ = input;\n" +
                "  changed = not (last 'sum = sum);\n" +
                "  sum = fold<<add,2>>(0, values);\n" +
                "  values = (values with [0] = sum);\n" +
                "  castValue = real (input.value);\n" +
                "tel;\n" +
                "type analog = {value : real, status : bool};\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertTrue(!lustre.contains("_ ="));
        assertTrue(lustre.contains("add((add(0, values[0])), values[1])"));
        assertTrue(lustre.contains("castValue = (input.value)"));
        assertTrue(lustre.contains("values[0 := sum]"));
        assertTrue(lustre.contains("not (pre(sum) = sum)"));
        new LustreService().parseLustre(lustre);
    }

    @Test
    public void lowersNestedActivateBlocksToConditionalEquations() throws Exception {
        String synlong =
                "node main(select : int; a : int; b : int; c : int) returns (out : int)\n" +
                "var first : real;\n" +
                "let\n" +
                "  activate ifBlock1\n" +
                "    if (select = 0) then\n" +
                "      var first : int;\n" +
                "      let\n" +
                "        first = a + 1;\n" +
                "        out = first;\n" +
                "      tel\n" +
                "    else\n" +
                "      if (select = 1) then\n" +
                "        activate ifBlock2\n" +
                "          if (b > 0) then\n" +
                "            let out = b; tel\n" +
                "          else\n" +
                "            let out = -b; tel\n" +
                "        returns .. ;\n" +
                "      else\n" +
                "        let out = c; tel\n" +
                "  returns .. ;\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertTrue(lustre.contains("__activate_first : int;"));
        assertTrue(!lustre.contains("activate ifBlock"));
        assertTrue(lustre.contains("out = if"));
        new LustreService().parseLustre(lustre);
    }

    @Test
    public void lowersStateFlattenAndFbyWithoutSynlongResidue() throws Exception {
        String synlong =
                "type binary = {value : bool, status : bool};\n" +
                "node main(input : binary) returns (out : bool)\n" +
                "let\n" +
                "  automaton Control\n" +
                "    initial state Init\n" +
                "    var value : bool; status : bool; held : bool;\n" +
                "    let\n" +
                "      value, status = (flatten binary)(input);\n" +
                "      held = fby(value; 1; false);\n" +
                "      out = held;\n" +
                "    tel\n" +
                "  returns .. ;\n" +
                "tel;\n";

        String lustre = convertPreservingReferenceResult(synlong);

        assertTrue(lustre.contains("input.value"), lustre);
        assertTrue(lustre.contains("input.status"), lustre);
        assertTrue(lustre.contains("false -> pre("));
        assertTrue(!lustre.contains("fby("));
        new LustreService().parseLustre(lustre);
    }

    private String convertPreservingReferenceResult(String synlong) throws IOException {
        Path result = Paths.get("reference/result.txt");
        boolean existed = Files.exists(result);
        byte[] previous = existed ? Files.readAllBytes(result) : null;
        try {
            return SynlongConverter.convert(synlong);
        } finally {
            if (existed) {
                Files.write(result, previous);
            } else {
                Files.deleteIfExists(result);
            }
        }
    }
}
