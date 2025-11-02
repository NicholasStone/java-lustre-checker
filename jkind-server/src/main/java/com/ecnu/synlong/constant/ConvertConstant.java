package com.ecnu.synlong.constant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class ConvertConstant {
    public static final String StmResult;
    public static final String CarResult;
    public static final String NuclearResult;

    static {
        try {
            StmResult = readResourceFile("StmResult.json");
            CarResult = readResourceFile("CarResult.json");
            NuclearResult = readResourceFile("NuclearResult.json");
        } catch (Exception e) {
            throw new RuntimeException("初始化失败，请检查资源文件是否存在或格式是否正确", e);
        }
    }

    private static String readResourceFile(String filename) throws Exception {
        InputStream is = ConvertConstant.class.getClassLoader()
                .getResourceAsStream("result/" + filename);
        if (is == null) {
            throw new IOException("无法找到资源文件: result/" + filename);
        }
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.joining("\n"));
        }
    }
}