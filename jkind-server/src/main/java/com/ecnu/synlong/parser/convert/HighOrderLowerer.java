package com.ecnu.synlong.parser.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Lowers Synlong high-order prefix operators and the PR1 supported iterator
 * subset to ordinary Lustre expressions accepted by JKind.
 *
 * <p>Boundary: direct prefix operators, fixed-count {@code map}, and fixed-count
 * {@code fold} are expression-lowered here. Restricted {@code mapfold} is handled
 * by the visitor because it emits multiple surrounding equations and local temps.</p>
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
            return "-" + maybeParenthesize(args.get(0));
        }
        if ("not$".equals(op)) {
            requireArity(op, args, 1);
            return "not " + maybeParenthesize(args.get(0));
        }

        String binaryOperator = toBinaryOperator(op);
        if (binaryOperator != null) {
            requireArity(op, args, 2);
            return maybeParenthesize(args.get(0)) + " " + binaryOperator + " " + maybeParenthesize(args.get(1));
        }

        if (isUnsupportedCast(op)) {
            throw new SynlongToLustreException("Unsupported high-order prefix operator '" + op
                    + "': casts are not supported by PR1 lowering");
        }

        return op + "(" + join(args) + ")";
    }

    public String lowerIterator(String iterator, String operator, String countText, List<String> arguments) {
        return lowerIteratorWithSourceMap(iterator, operator, countText, arguments).getExpression();
    }

    public HighOrderLoweringResult lowerIteratorWithSourceMap(String iterator, String operator, String countText, List<String> arguments) {
        String normalizedIterator = iterator == null ? "" : iterator.trim();
        if ("map".equals(normalizedIterator)) {
            return lowerMap(operator, countText, arguments);
        }
        if ("fold".equals(normalizedIterator)) {
            return lowerFold(operator, countText, arguments);
        }

        throw new SynlongToLustreException("Unsupported high-order iterator '" + normalizedIterator
                + "': supported fixed-count iterators are map and fold; restricted mapfold requires assignment context");
    }

    public int parseIteratorCount(String countText, String iterator) {
        return parsePositiveCount(countText, iterator);
    }

    private HighOrderLoweringResult lowerMap(String operator, String countText, List<String> arguments) {
        int count = parsePositiveCount(countText, "map");
        List<String> elements = new ArrayList<String>();
        List<HighOrderSourceMapEntry> entries = new ArrayList<HighOrderSourceMapEntry>();
        for (int i = 0; i < count; i++) {
            List<String> indexedArgs = new ArrayList<String>();
            for (String argument : arguments) {
                indexedArgs.add(indexArgument(argument, i));
            }
            String generated = lowerApply(operator, indexedArgs);
            elements.add(generated);
            entries.add(new HighOrderSourceMapEntry("map", normalizeOperator(operator), count, i, indexedArgs, generated));
        }
        return new HighOrderLoweringResult("[" + join(elements) + "]", entries);
    }

    private HighOrderLoweringResult lowerFold(String operator, String countText, List<String> arguments) {
        int count = parsePositiveCount(countText, "fold");
        if (arguments == null || arguments.size() < 2) {
            throw new SynlongToLustreException("Unsupported high-order fold: expected initial accumulator and at least one array argument");
        }

        String accumulator = arguments.get(0);
        List<String> arrayArguments = arguments.subList(1, arguments.size());
        List<HighOrderSourceMapEntry> entries = new ArrayList<HighOrderSourceMapEntry>();

        for (int i = 0; i < count; i++) {
            List<String> stageArgs = new ArrayList<String>();
            stageArgs.add(accumulator);
            for (String argument : arrayArguments) {
                stageArgs.add(indexArgument(argument, i));
            }
            String generated = lowerApply(operator, stageArgs);
            entries.add(new HighOrderSourceMapEntry("fold", normalizeOperator(operator), count, i, stageArgs, generated));
            accumulator = "(" + generated + ")";
        }

        return new HighOrderLoweringResult(accumulator, entries);
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

    public String indexArgument(String argument, int index) {
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
