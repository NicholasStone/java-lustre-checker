# Thesis evidence snippets — map/fold/mapfold/source-map

This note captures verified implementation snippets for later thesis chapters
on “面向JKind的SynLong/L2C高阶数组算子验证适配研究”. The examples are covered by
`HighOrderSourceMapTest` and `HighOrderLoweringTest`.

## Fixed-count map

Synlong input:

```synlong
type int_array = int^3;
node main(a : int_array; b : int_array) returns (c : int_array)
let
  c = (map << $+$; 3 >>)(a, b);
tel;
```

Generated core Lustre fragment:

```lustre
c = [a[0] + b[0], a[1] + b[1], a[2] + b[2]];
```

Source-map stage example:

| iterator | operator | count | stage | source arguments | generated fragment |
| --- | --- | ---: | ---: | --- | --- |
| map | `$+$` | 3 | 0 | `a[0]`, `b[0]` | `a[0] + b[0]` |

## Fixed-count fold

Synlong input:

```synlong
type int_array = int^3;
node main(a : int_array) returns (c : int)
let
  c = (fold << $+$; 3 >>)(0, a);
tel;
```

Generated core Lustre fragment:

```lustre
c = (((0 + a[0]) + a[1]) + a[2]);
```

Source-map stages:

| stage | accumulator input | indexed input | generated fragment |
| ---: | --- | --- | --- |
| 0 | `0` | `a[0]` | `0 + a[0]` |
| 1 | `(0 + a[0])` | `a[1]` | `(0 + a[0]) + a[1]` |
| 2 | `((0 + a[0]) + a[1])` | `a[2]` | `((0 + a[0]) + a[1]) + a[2]` |

## Restricted fixed-count mapfold

Synlong input:

```synlong
type bool_array = bool^3;
node fulladd(carryIn : bool; x : bool; y : bool) returns (carryOut : bool; sum : bool)
let
  sum = x xor y xor carryIn;
  carryOut = x and y or carryIn and x xor y;
tel;
node main(carryIn : bool; x : bool_array; y : bool_array) returns (carryOut : bool; sum : bool_array)
let
  carryOut, sum = (mapfold << fulladd; 3 >>)(carryIn, x, y);
tel;
```

Generated core Lustre fragment:

```lustre
__mapfold_carryOut_1, __mapfold_sum_0 = fulladd(carryIn, x[0], y[0]);
__mapfold_carryOut_2, __mapfold_sum_1 = fulladd(__mapfold_carryOut_1, x[1], y[1]);
carryOut, __mapfold_sum_2 = fulladd(__mapfold_carryOut_2, x[2], y[2]);
sum = [__mapfold_sum_0, __mapfold_sum_1, __mapfold_sum_2];
```

Source-map stage example:

| iterator | operator | count | stage | source arguments | generated fragment |
| --- | --- | ---: | ---: | --- | --- |
| mapfold | `fulladd` | 3 | 0 | `carryIn`, `x[0]`, `y[0]` | `__mapfold_carryOut_1, __mapfold_sum_0 = fulladd(carryIn, x[0], y[0])` |

## Verification commands used

```bash
JAVA_HOME=/Users/nicholas/.local/share/mise/installs/java/17.0.2/Contents/Home \
PATH=/Users/nicholas/.local/share/mise/installs/java/17.0.2/Contents/Home/bin:/Users/nicholas/.local/share/mise/installs/maven/3.9.9/apache-maven-3.9.9/bin:$PATH \
/Users/nicholas/.local/share/mise/installs/maven/3.9.9/apache-maven-3.9.9/bin/mvn \
  -pl jkind-server -am \
  -Dtest=HighOrderLoweringTest,HighOrderSourceMapTest \
  -DfailIfNoTests=false test
```

Observed result after scoped and repeated-mapfold regression coverage: 19 tests, 0 failures/errors.
