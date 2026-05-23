# High-order lowering implementation notes

## Implementation points

- `jkind-server/src/main/java/com/ecnu/synlong/parser/convert/HighOrderLowerer.java`
  owns the PR1 lowering rules for prefix applications and fixed-count `map`.
- `SynlongToLustreVisitor` remains the parse-tree adapter. It visits
  `list.simple_expr()` entries into structured argument lists and delegates
  simple apply and iterator apply forms to `HighOrderLowerer`.
- Unsupported high-order forms are rejected in the converter with
  `SynlongToLustreException`; they are not emitted as invalid Lustre text.
- `SynlongToLustreContext` now uses deterministic insertion-ordered collections
  for emitted definitions and exposes helper/temp hooks for later phases. PR1
  does not need generated helper nodes for the supported prefix/map subset.

## Verification focus

Use Java 17 for Maven verification in this repository; Java 21 currently trips
the compiler toolchain before tests run.

Useful targeted commands:

```bash
mise exec java@17 maven@3.9.9 -- mvn -pl jkind-server \
  -Dtest=HighOrderLoweringTest,SynlongToLustreContextTest test

mise exec java@17 maven@3.9.9 -- mvn -pl jkind-server -am test
```

Expected high-order checks:

1. Prefix applications lower to ordinary Lustre expressions without Synlong prefix residue.
2. Fixed-count `map` lowers to an array expression with indexed arguments.
3. Successful outputs contain no high-order residue tokens.
4. Successful outputs parse with `LustreService.parseLustre`.
5. Unsupported advanced iterators fail before JKind parsing.
6. `reference/result.txt` is preserved by tests that call `SynlongConverter`.

## Follow-up scope

Future phases should not silently expand PR1 behavior. Add tests and docs before
supporting `mapi`, `fold`, `foldi`, `mapfold`, `mapw`, `mapwi`, `foldw`, or
`foldwi`, especially where index ordering, accumulator ordering, or conditional
iterator semantics are still unconfirmed.
