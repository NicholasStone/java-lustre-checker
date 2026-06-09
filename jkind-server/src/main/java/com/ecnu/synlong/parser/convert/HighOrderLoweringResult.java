package com.ecnu.synlong.parser.convert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class HighOrderLoweringResult {
    private final String expression;
    private final List<HighOrderSourceMapEntry> sourceMapEntries;

    HighOrderLoweringResult(String expression, List<HighOrderSourceMapEntry> sourceMapEntries) {
        this.expression = expression;
        this.sourceMapEntries = Collections.unmodifiableList(new ArrayList<HighOrderSourceMapEntry>(sourceMapEntries));
    }

    String getExpression() {
        return expression;
    }

    List<HighOrderSourceMapEntry> getSourceMapEntries() {
        return sourceMapEntries;
    }
}
