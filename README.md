# ECNU JKind

## 介绍
这就是一个Lustre验证的Java实现，使用Jkind去验证Lustre。
- 现状：目前Jkind只能用于Lustre验证，而不能用于Scade和Synlong验证。
- 目标：扩展Jkind，使其能够支持Synlong的验证。
- 方案：将Scade和Synlong的语法转换为Lustre语法，然后使用JKind进行验证。
  - 状态机（statemachine）可以转换为Lustre的if和while语句。
  - 其他扩展语法暂时不考虑，先实现状态机的转换。

## 相关知识
### Lustre
[Lustre](jkind-common/src/main/java/jkind/lustre/parsing/Lustre.g4)是一种同步数据流编程语言，主要用于描述实时系统的行为。

### Scade
[Scade](reference/Scade.pdf)是一个商业化的Lustre扩展，主要扩展了状态机（statemachine）、一些高阶算子。

状态机:
> 1. 由状态和状态之间的迁移组成（也就是点和边）。
> 2. 边上可能有一些条件，这个条件成立时，状态机才会从一个状态迁移到另一个状态。
> 3. 状态和迁移是可以写成if/else和while语句的。

### Synlong
[Synlong](reference/Synlong.docx)也是Lustre的扩展，其实可以理解为是借鉴（抄的）Scade，语法几乎一样。

### JKind
JKind是一个Lustre验证工具，主要用于验证Lustre程序的正确性。



## 项目结构
- [jkind-common](jkind-common)：Lustre语法解析等功能。大部分是Jkind源码。
- [jkind-service](jkind-service)：Lustre解析后的验证等功能。大部分是Jkind源码。
- [jkind-server](jkind-server)：对外提供接口，相当于controller层。是我们写代码的地方。
- [jkind-api](jkind-api)：可忽略。大部分是Jkind源码。对外提供的api，但它调用后验证结果是输出到控制台的，并不好用，而我们需要把验证结果写到接口的返回值中去，所以不用考虑这个模块。

所以综合方案来看：
1. 我们最好**把代码写在jkind-server**里，大部分代码应写在[parser](jkind-server/src/main/java/com/ecnu/synlong/parser)
2. 在这里，把Synlong文件中的状态机等转化为Lustre文件，然后把这个lustre文件传递通过调用[LustreService](jkind-server/src/main/java/com/ecnu/synlong/service/LustreService.java)里的代码进行验证。

## 运行和测试
### Synlong 迭代器降级子集
当前 `jkind-server` 在 Synlong 转 Lustre 阶段支持一个受限的 Lustre V6/Synlong 迭代器子集：

- `map<<+;3>>(A,B)` 和 `(map << $+$; 3 >>)(A,B)` 会降级为逐元素核心 Lustre 数组表达式。
- `fold<<+;3>>(init,A)` 和 `(fold << $+$; 3 >>)(init,A)` 会降级为左结合核心 Lustre 表达式。
- 计数 `n` 必须是正整数字面量；操作符目前限内置二元操作符及对应 `$...$` 别名。
- `mapi`、`foldi`、`mapfold`、`mapw`、`mapwi`、`foldw`、`foldwi` 以及用户自定义迭代器操作符会显式报不支持错误。
- 这是转换端降级实现，没有向 `jkind-common` 的核心 Lustre AST、类型检查或 SMT 翻译增加原生 V6 迭代器语义。

### 启动
```bash
# 1、编译
mvn clean install -U
# 2、运行
java -jar jkind-server/target/jkind-server-1.0-SNAPSHOT.jar
```

### 测试
启动前端代码（仓库：[checker-frontend](https://github.com/iyouwei/check-frontend)），代码框里输入Synlong代码（案例参考：[lustre-demos](lustre-demos)
，但目前这里案例没有状态机，需要补充），点击验证按钮即可。
