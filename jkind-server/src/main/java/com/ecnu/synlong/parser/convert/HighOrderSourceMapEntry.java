package com.ecnu.synlong.parser.convert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Deterministic trace entry from one high-order iterator stage to generated Lustre.
 */
public final class HighOrderSourceMapEntry {
    private final String iterator;
    private final String operator;
    private final int count;
    private final int stage;
    private final List<String> sourceArguments;
    private final String generatedExpression;

    public HighOrderSourceMapEntry(String iterator, String operator, int count, int stage,
                                   List<String> sourceArguments, String generatedExpression) {
        this.iterator = iterator;
        this.operator = operator;
        this.count = count;
        this.stage = stage;
        this.sourceArguments = Collections.unmodifiableList(new ArrayList<String>(sourceArguments));
        this.generatedExpression = generatedExpression;
    }

    public String getIterator() {
        return iterator;
    }

    public String getOperator() {
        return operator;
    }

    public int getCount() {
        return count;
    }

    public int getStage() {
        return stage;
    }

    public List<String> getSourceArguments() {
        return sourceArguments;
    }

    public String getGeneratedExpression() {
        return generatedExpression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HighOrderSourceMapEntry)) {
            return false;
        }
        HighOrderSourceMapEntry that = (HighOrderSourceMapEntry) o;
        return count == that.count
                && stage == that.stage
                && safeEquals(iterator, that.iterator)
                && safeEquals(operator, that.operator)
                && safeEquals(sourceArguments, that.sourceArguments)
                && safeEquals(generatedExpression, that.generatedExpression);
    }

    @Override
    public int hashCode() {
        int result = iterator != null ? iterator.hashCode() : 0;
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + stage;
        result = 31 * result + sourceArguments.hashCode();
        result = 31 * result + (generatedExpression != null ? generatedExpression.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HighOrderSourceMapEntry{" +
                "iterator='" + iterator + '\'' +
                ", operator='" + operator + '\'' +
                ", count=" + count +
                ", stage=" + stage +
                ", sourceArguments=" + sourceArguments +
                ", generatedExpression='" + generatedExpression + '\'' +
                '}';
    }

    private static boolean safeEquals(Object a, Object b) {
        return a == null ? b == null : a.equals(b);
    }
}
