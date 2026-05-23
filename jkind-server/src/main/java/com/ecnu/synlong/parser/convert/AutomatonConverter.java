package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongLexer;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 自动机 JSON 转换入口。
 *
 * <p>它复用 Synlong.g4 解析状态机语法，但产物是前端/交换用 JSON，
 * 不是送入 JKind 的 Lustre 文本，也不执行性质验证。</p>
 */
@Slf4j
public class AutomatonConverter {
    
    /**
     * 将状态机文本转换为自动机模型 JSON 字符串。
     *
     * @param lustreCode 历史命名为 Lustre，实际按 Synlong grammar 解析
     * @return 自动机模型JSON字符串
     */
    public static String convertToAutomaton(String lustreCode) {
        try {
            // 与验证链路共享 parser，可视化链路后续只访问 automaton model。
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
            
            // 上下文仍用于收集状态/变量，但不会生成 JKind 可验证的 Lustre 程序。
            SynlongToLustreContext context = new SynlongToLustreContext();
            LustreToAutomatonConverter converter = new LustreToAutomatonConverter(context);
            
            converter.visit(tree);
            
            return converter.toJsonString();
            
        } catch (Exception e) {
            log.error("转换Lustre代码到自动机模型失败: {}", e.getMessage(), e);
            throw new RuntimeException("转换失败: " + e.getMessage(), e);
        }
    }
}
