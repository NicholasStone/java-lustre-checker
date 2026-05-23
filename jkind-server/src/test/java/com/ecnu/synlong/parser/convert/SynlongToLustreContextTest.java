package com.ecnu.synlong.parser.convert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SynlongToLustreContextTest {
    @Test
    public void preservesSourceOrderForGeneratedContextDefinitions() {
        SynlongToLustreContext context = new SynlongToLustreContext();

        context.addStateToEnum("Idle");
        context.addStateToEnum("Running");
        context.addStateToEnum("Done");

        assertEquals("type State = enum {Idle, Running, Done};\n", context.generateStateEnumType());

        context.addStructType("Pair");
        context.addStructField("Pair", "left", "int");
        context.addStructField("Pair", "right", "bool");

        String constructor = context.generateStructConstructors();
        assertTrue(constructor.contains("node make_Pair(left : int; right : bool) returns (result : Pair);"));
        assertTrue(constructor.indexOf("left : int") < constructor.indexOf("right : bool"));

        context.addFlattenType("Pair");
        String flatten = context.generateFlattenFunctions();
        assertTrue(flatten.contains("returns (left : int; right : bool);"));
        assertTrue(flatten.indexOf("left = result.left") < flatten.indexOf("right = result.right"));
    }

    @Test
    public void allocatesDeterministicTempNames() {
        SynlongToLustreContext context = new SynlongToLustreContext();

        assertEquals("__map_index_0", context.allocateTempName("map-index"));
        assertEquals("__map_index_1", context.allocateTempName("map index"));
        assertEquals("___1fold_2", context.allocateTempName("1fold"));
        assertEquals("__tmp_3", context.allocateTempName(null));
    }

    @Test
    public void registersHelperNodeDefinitionsOnce() {
        SynlongToLustreContext context = new SynlongToLustreContext();
        String helper = "node helper(x : int) returns (y : int);\nlet\n\ty = x;\ntel;";

        context.registerHelperNodeDef("helper", helper);
        context.registerHelperNodeDef("helper", helper);

        assertTrue(context.hasHelperNodeDef("helper"));
        assertEquals(1, context.getGlobalNodeDefs().size());
        assertEquals(helper, context.getGlobalNodeDefs().get(0));

        SynlongToLustreException exception = assertThrows(SynlongToLustreException.class,
                () -> context.registerHelperNodeDef("helper", helper + "\n"));
        assertTrue(exception.getMessage().contains("Conflicting helper node definition"));
    }
}
