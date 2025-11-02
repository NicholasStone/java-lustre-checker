package com.ecnu.synlong.parser.convert;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 自动机转换器测试类
 */
public class AutomatonConverterTest {
    
    @Test
    public void testConvertCarAutomatonFixed() {
        // 使用原始的Lustre代码
        String lustreCode = "node speed_up(v: int) returns (vt: int)\n" +
            "let\n" +
            "    vt = v + 10;\n" +
            "tel\n\n" +
            "node speed_down(v: int) returns (vt: int)\n" +
            "let\n" +
            "    vt = v - 10;\n" +
            "tel\n\n" +
            "node keep(v: int) returns (vt: int)\n" +
            "let\n" +
            "    vt = v;\n" +
            "tel\n\n" +
            "node N(v: int) returns ()\n" +
            "let\n" +
            "    automaton Car\n" +
            "        initial state Keep\n" +
            "        unless\n" +
            "            if v >= 100 restart SpeedDown;\n" +
            "            if v <= 100 restart SpeedUp;\n" +
            "        var limit: int;\n" +
            "        let v = keep(v); limit = 200; tel\n" +
            "        until \n" +
            "            if v >= limit restart Keep;\n" +
            "    state SpeedDown\n" +
            "        unless \n" +
            "            if v <= 150 and v >= 50 restart Keep;\n" +
            "            if v <= 100 restart SpeedUp;\n" +
            "        var limit: int; \n" +
            "        let v = speed_down(v); limit = 50; tel\n" +
            "        until if v <= limit restart SpeedDown;\n" +
            "    state SpeedUp\n" +
            "        unless \n" +
            "            if v >= 150 restart SpeedDown;\n" +
            "            if v <= 150 and v >= 50 restart Keep;\n" +
            "        var limit: int;\n" +
            "        let v = speed_up(v); limit = 150; tel\n" +
            "        until if v <= limit restart SpeedUp;\n" +
            "    returns v;\n" +
            "tel;";
        
        try {
            String result = AutomatonConverter.convertToAutomaton(lustreCode);
            
            // 验证结果不为空
            assertNotNull(result);
            assertFalse(result.trim().isEmpty());
            
            // 验证只有一个自动机，名为"Car"
            assertTrue(result.contains("\"name\":\"Car\""));
            assertFalse(result.contains("\"name\":\"speed_up\""));
            assertFalse(result.contains("\"name\":\"speed_down\""));
            assertFalse(result.contains("\"name\":\"keep\""));
            assertFalse(result.contains("\"name\":\"N\""));
            
            // 验证包含正确的状态（现在状态名称是对象结构）
            assertTrue(result.contains("\"content\":\"Keep\""));
            assertTrue(result.contains("\"content\":\"SpeedDown\""));
            assertTrue(result.contains("\"content\":\"SpeedUp\""));
            
            // 验证系统声明正确
            assertTrue(result.contains("\"system_declaration\":\"// 在这里填写模型的声明.\\\\ncar := Car()\""));
            
            System.out.println("修复后的转换结果:");
            System.out.println(result);
            
        } catch (Exception e) {
            fail("转换失败: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
