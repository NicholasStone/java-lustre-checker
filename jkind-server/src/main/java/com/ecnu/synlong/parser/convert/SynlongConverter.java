package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongLexer;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;

public class SynlongConverter {
	
	private static final Logger log = LoggerFactory.getLogger(SynlongConverter.class);
    /**
     * 将Synlong代码转换为Lustre代码
     * @param synlongCode Synlong代码字符串
     * @return Lustre代码字符串
     */
    public static String convert(String synlongCode) {
        try {
            CharStream input = CharStreams.fromString(synlongCode);
            SynlongLexer lexer = new SynlongLexer(input);
            // 使用自定义错误监听器
            lexer.removeErrorListeners();
            lexer.addErrorListener(new SynlongErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SynlongParser parser = new SynlongParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SynlongErrorListener());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
//            parser.setTrace(true);
            ParseTree tree = parser.program();

            SynlongToLustreContext context = new SynlongToLustreContext();
            SynlongToLustreVisitor visitor = new SynlongToLustreVisitor(context);
            String result = visitor.visit(tree);
//            log.info("Synlong转换Lustre结果：\n{}", result);

            // 输出result到result.txt文件
            try {
                Path out = Paths.get("reference/result.txt");
                Files.write(out, result.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            } catch (IOException e) {
                log.warn("写入 result.txt 失败: {}", e.getMessage());
            }

            return result;
        } catch (Exception e) {
            log.error("Synlong转换Lustre失败: ", e);
            throw new SynlongToLustreException(e.getMessage());
        }
    }

}
