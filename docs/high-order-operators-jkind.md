# Synlong high-order operators lowered for JKind

This note describes the current PR1 lowering subset in `jkind-server` after the
Synlong parser has accepted high-order syntax but before the generated text is
sent to JKind's Lustre parser.

## Supported in PR1

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

The only iterator lowered in PR1 is fixed-count `map` with a positive integer
literal count:

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

## Explicitly unsupported in PR1

The converter raises `SynlongToLustreException` instead of passing unsupported
high-order syntax through to JKind for these cases:

- non-`map` iterators in the shared iterator form: `mapi`, `fold`, `foldi`, and
  `mapfold`;
- conditional iterators: `mapw`, `mapwi`, `foldw`, and `foldwi`;
- dynamic, zero, negative, or non-integer-literal iterator counts;
- casts represented as high-order prefix operators: `short$`, `int$`, `float$`,
  and `real$`;
- wrong arity for supported unary or binary prefix operators.

These gates are intentional until the missing Lustre v6/Synlong semantics for
index order, fold accumulator conventions, and conditional iterator behavior are
confirmed.

## Residue and parser expectations

Successful generated Lustre should not contain Synlong high-order residue such
as `<<`, `>>`, `$+$`, `not$`, `map <<`, or `fold <<`. The regression tests in
`HighOrderLoweringTest` cover this residue check and parse successful outputs
with `LustreService.parseLustre`.
