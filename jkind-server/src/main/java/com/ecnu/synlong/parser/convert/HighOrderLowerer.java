package com.ecnu.synlong.parser.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Lowers Synlong high-order prefix operators and the PR1 supported iterator
 * subset to ordinary Lustre expressions accepted by JKind.
 */
public class HighOrderLowerer {
    public String lowerApply(String operator, List<String> arguments) {
        String op = normalizeOperator(operator);
        List<String> args = arguments == null ? new ArrayList<String>() : arguments;

        if ("+$".equals(op)) {
            requireArity(op, args, 1);
            return maybeParenthesize(args.get(0));
        }
        if ("-$".equals(op)) {
            requireArity(op, args, 1);
            return "(-" + maybeParenthesize(args.get(0)) + ")";
        }
        if ("not$".equals(op)) {
            requireArity(op, args, 1);
            return "(not " + maybeParenthesize(args.get(0)) + ")";
        }

        String binaryOperator = toBinaryOperator(op);
        if (binaryOperator != null) {
            requireArity(op, args, 2);
            return "(" + maybeParenthesize(args.get(0)) + " " + binaryOperator + " " + maybeParenthesize(args.get(1)) + ")";
        }

        if (isUnsupportedCast(op)) {
            throw new SynlongToLustreException("Unsupported high-order prefix operator '" + op
                    + "': casts are not supported by PR1 lowering");
        }

        return op + "(" + join(args) + ")";
    }

    public String lowerIterator(String iterator, String operator, String countText, List<String> arguments) {
        String normalizedIterator = iterator == null ? "" : iterator.trim();
        if (!"map".equals(normalizedIterator)) {
            throw new SynlongToLustreException("Unsupported high-order iterator '" + normalizedIterator
                    + "': PR1 lowering supports only fixed-count map");
        }

        int count = parsePositiveCount(countText, normalizedIterator);
        List<String> elements = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            List<String> indexedArgs = new ArrayList<String>();
            for (String argument : arguments) {
                indexedArgs.add(indexArgument(argument, i));
            }
            elements.add(lowerApply(operator, indexedArgs));
        }
        return "[" + join(elements) + "]";
    }

    public SynlongToLustreException unsupportedIterator(String iterator, String reason) {
        return new SynlongToLustreException("Unsupported high-order iterator '" + iterator + "': " + reason);
    }

    private String normalizeOperator(String operator) {
        if (operator == null || operator.trim().isEmpty()) {
            throw new SynlongToLustreException("Unsupported high-order apply: missing prefix operator");
        }
        return operator.trim();
    }

    private void requireArity(String operator, List<String> arguments, int expected) {
        if (arguments.size() != expected) {
            throw new SynlongToLustreException("Unsupported high-order prefix operator '" + operator
                    + "': expected " + expected + " argument(s), found " + arguments.size());
        }
    }

    private String toBinaryOperator(String operator) {
        if ("$+$".equals(operator)) {
            return "+";
        }
        if ("$-$".equals(operator)) {
            return "-";
        }
        if ("$*$".equals(operator)) {
            return "*";
        }
        if ("$/$".equals(operator)) {
            return "/";
        }
        if ("$mod$".equals(operator)) {
            return "mod";
        }
        if ("$div$".equals(operator)) {
            return "div";
        }
        if ("$=$".equals(operator)) {
            return "=";
        }
        if ("$<>$".equals(operator)) {
            return "<>";
        }
        if ("$<$".equals(operator)) {
            return "<";
        }
        if ("$>$".equals(operator)) {
            return ">";
        }
        if ("$<=$".equals(operator)) {
            return "<=";
        }
        if ("$>=$".equals(operator)) {
            return ">=";
        }
        if ("$and$".equals(operator)) {
            return "and";
        }
        if ("$or$".equals(operator)) {
            return "or";
        }
        if ("$xor$".equals(operator)) {
            return "xor";
        }
        return null;
    }

    private boolean isUnsupportedCast(String operator) {
        return "short$".equals(operator)
                || "int$".equals(operator)
                || "float$".equals(operator)
                || "real$".equals(operator);
    }

    private int parsePositiveCount(String countText, String iterator) {
        if (countText == null) {
            throw new SynlongToLustreException("Unsupported high-order iterator '" + iterator
                    + "': missing fixed positive integer count");
        }
        String trimmed = countText.trim();
        if (!trimmed.matches("[1-9][0-9]*")) {
            throw new SynlongToLustreException("Unsupported high-order iterator '" + iterator
                    + "': count must be a fixed positive integer literal, found '" + trimmed + "'");
        }
        try {
            return Integer.parseInt(trimmed);
        } catch (NumberFormatException e) {
            throw new SynlongToLustreException("Unsupported high-order iterator '" + iterator
                    + "': count is too large, found '" + trimmed + "'", e);
        }
    }

    private String indexArgument(String argument, int index) {
        String trimmed = argument == null ? "" : argument.trim();
        if (trimmed.isEmpty()) {
            throw new SynlongToLustreException("Unsupported high-order map: empty argument at index " + index);
        }
        if (isDirectlyIndexable(trimmed)) {
            return trimmed + "[" + index + "]";
        }
        return "(" + trimmed + ")[" + index + "]";
    }

    private boolean isDirectlyIndexable(String expression) {
        return expression.matches("[A-Za-z_][A-Za-z_0-9]*(\\[[^\\]]+\\]|\\.[A-Za-z_][A-Za-z_0-9]*)*");
    }

    private String maybeParenthesize(String expression) {
        String trimmed = expression == null ? "" : expression.trim();
        if (trimmed.matches("[A-Za-z_][A-Za-z_0-9]*(\\[[^\\]]+\\]|\\.[A-Za-z_][A-Za-z_0-9]*)*")
                || trimmed.matches("[0-9]+(\\.[0-9]+)?")
                || "true".equals(trimmed)
                || "false".equals(trimmed)) {
            return trimmed;
        }
        if (trimmed.startsWith("(") && trimmed.endsWith(")")) {
            return trimmed;
        }
        return "(" + trimmed + ")";
    }

    private String join(List<String> values) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(values.get(i));
        }
        return sb.toString();
    }
}
