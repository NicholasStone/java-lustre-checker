package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongLexer;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 自动机转换器工厂类
 * 提供从Lustre代码到自动机模型的转换功能
 */
@Slf4j
public class AutomatonConverter {
    
    /**
     * 将Lustre代码转换为自动机模型JSON字符串
     * @param lustreCode Lustre代码字符串
     * @return 自动机模型JSON字符串
     */
    public static String convertToAutomaton(String lustreCode) {
        try {
            // 解析Lustre代码
            CharStream input = CharStreams.fromString(lustreCode);
            SynlongLexer lexer = new SynlongLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new SynlongErrorListener());
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SynlongParser parser = new SynlongParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SynlongErrorListener());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
            
            ParseTree tree = parser.program();
            
            // 创建上下文和转换器
            SynlongToLustreContext context = new SynlongToLustreContext();
            LustreToAutomatonConverter converter = new LustreToAutomatonConverter(context);
            
            // 执行转换
            converter.visit(tree);
            
            // 返回JSON字符串
            return converter.toJsonString();
            
        } catch (Exception e) {
            log.error("转换Lustre代码到自动机模型失败: {}", e.getMessage(), e);
            throw new RuntimeException("转换失败: " + e.getMessage(), e);
        }
    }
}
