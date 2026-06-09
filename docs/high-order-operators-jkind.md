# Synlong high-order operators lowered for JKind

This note describes the current lowering subset in `jkind-server` after the
Synlong parser has accepted high-order syntax but before the generated text is
sent to JKind's Lustre parser.

## Supported subset

### Prefix operator applications

`HighOrderLowerer.lowerApply` rewrites supported prefix operators into ordinary
Lustre expressions. The converter emits ordinary Lustre operator syntax without
Synlong prefix residue:

```synlong
sum = $+$(a, b);
neg = -$(a);
inverted = not$(x);
both = $and$(x, y);
```

becomes equivalent to:

```lustre
sum = a + b;
neg = -a;
inverted = not x;
both = x and y;
```

Supported unary operators are `+$`, `-$`, and `not$`. Supported binary operators
are `$+$`, `$-$`, `$*$`, `$/$`, `$mod$`, `$div$`, `$=$`, `$<>$`, `$<$`, `$>$`,
`$<=$`, `$>=$`, `$and$`, `$or$`, and `$xor$`.

A prefix `ID` that is not one of the recognized operator tokens is emitted as an
ordinary function call. Existing `(make Type)` and `(flatten Type)` visitor paths
therefore continue to register their helper generation and call `make_Type(...)`
or `flatten_Type(...)`.

### Fixed-count `map`

Fixed-count `map` with a positive integer literal count is lowered into a Lustre
array constructor:

```synlong
c = (map << $+$; 3 >>)(a, b);
```

becomes equivalent to:

```lustre
c = [a[0] + b[0], a[1] + b[1], a[2] + b[2]];
```

Arguments are extracted from the Synlong parse tree, not by splitting rendered
text on commas. Each argument is indexed for every generated element; complex
arguments are parenthesized before indexing.

### Fixed-count `fold`

Fixed-count `fold` is implemented as a `red`-style accumulator reduction:

```synlong
c = (fold << $+$; 3 >>)(0, a);
```

becomes equivalent to:

```lustre
c = (((0 + a[0]) + a[1]) + a[2]);
```

The first argument is the initial accumulator. Remaining arguments are indexed
per stage and passed to the prefix operator after the accumulator. Counts must
be fixed positive integer literals.

### Restricted fixed-count `mapfold`

`mapfold` is supported only in the bounded `fillred`-style form where the
operator is an identifier node/function and the assignment has two comma LHS
variables:

```synlong
carryOut, sum = (mapfold << fulladd; 3 >>)(carryIn, x, y);
```

The step operator must return two outputs: next accumulator first, mapped element
second. The converter emits staged equations and deterministic local temporary
variables in the surrounding node, for example:

```lustre
__mapfold_carryOut_1, __mapfold_sum_0 = fulladd(carryIn, x[0], y[0]);
__mapfold_carryOut_2, __mapfold_sum_1 = fulladd(__mapfold_carryOut_1, x[1], y[1]);
carryOut, __mapfold_sum_2 = fulladd(__mapfold_carryOut_2, x[2], y[2]);
sum = [__mapfold_sum_0, __mapfold_sum_1, __mapfold_sum_2];
```

Temporary accumulator type is taken from the first LHS variable. Mapped element
temporary type is taken from the element type of the second LHS array, including
through simple type aliases such as `type bool_array = bool^3`.

### Source-map metadata

`SynlongConverter.convert(String)` preserves the original string-only behavior.
For tests and thesis evidence, `SynlongConverter.convertWithMetadata(String)`
returns `HighOrderConversionResult`, which contains:

- `lustre`: the generated Lustre text;
- ordered `HighOrderSourceMapEntry` records for each lowered `map`, `fold`, and
  `mapfold` stage.

Each source-map entry records iterator kind, operator text, fixed count, stage
index, indexed source arguments, and generated expression/equation fragment.
The order is deterministic across repeated conversions of the same source.

## Explicitly unsupported

The converter raises `SynlongToLustreException` instead of passing unsupported
high-order syntax through to JKind for these cases:

- index-aware iterators in the shared iterator form: `mapi` and `foldi`;
- prefix-operator `mapfold`, for example `(mapfold << $+$; 3 >>)(0, a)`;
- `mapfold` without exactly two comma LHS identifiers or without enough type
  information to declare generated temporaries;
- conditional iterators: `mapw`, `mapwi`, `foldw`, and `foldwi`;
- dynamic, zero, negative, or non-integer-literal iterator counts;
- casts represented as high-order prefix operators: `short$`, `int$`, `float$`,
  and `real$`;
- wrong arity for supported unary or binary prefix operators.

These gates are intentional. The implemented subset is fixed-count and
JKind-parseable; conditional, dynamic, and broader V6 iterator semantics remain
future work.

## Residue and parser expectations

Successful generated Lustre should not contain Synlong high-order residue such
as `<<`, `>>`, `$+$`, `not$`, `map <<`, `fold <<`, or `mapfold <<`. The
regression tests in `HighOrderLoweringTest` and `HighOrderSourceMapTest` cover
residue checks, source-map determinism, unsupported boundaries, and parsing
successful outputs with `LustreService.parseLustre`.
