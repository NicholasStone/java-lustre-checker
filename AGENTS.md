# AGENTS.md — Java Lustre Checker 项目指南

本文件是给后续编码 Agent 的仓库级工作说明，作用范围为仓库根目录及其所有子目录。它不是面向终端用户的 README；目标是让 Agent 在修改前快速理解项目结构、关键链路、构建测试方式、可改边界和已知风险。本文档中文优先；必要英文术语保留原类名、模块名和 endpoint。

## 1. 项目定位

这是一个基于 JKind 的 Java/Maven 多模块项目，目标是让原本主要验证 Lustre 的 JKind 能处理 Synlong/Scade 风格输入：

```text
Synlong / Scade-like 文本
  -> jkind-server API
  -> Synlong.g4 生成的 ANTLR parser
  -> SynlongToLustreVisitor / SynlongToLustreContext 生成 Lustre 文本
  -> LustreService 调用 JKind 解析、静态分析、翻译和 Director
  -> HTTP 返回 CheckResult
```

核心业务代码集中在 `jkind-server`。`jkind-common`、`jkind-service`、`jkind-api` 大量内容来自或包装 JKind，应谨慎修改。

## 2. 技术栈与构建事实

- Java：`1.8`（见根 `pom.xml` 和 `.java-version`）。
- 构建：Maven 多模块项目，根 `pom.xml` 使用 Spring Boot parent `2.7.14`。
- Parser：ANTLR runtime `4.13.2`；`jkind-server` 中的 Synlong parser 代码位于 `parser/synlong/gen`。
- Web：`jkind-server` 使用 Spring Boot Web/Validation。
- 验证：`jkind-service` 依赖 `jkind-common` 和 SMTInterpol；`jkind-server` 通过 `LustreService` 调用 JKind 风格验证流程。
- JSON：Jackson 用于自动机 JSON 与请求/响应序列化。
- Lombok：DTO 和部分类使用 `@Data` / `@Slf4j`。

## 3. Maven 模块图

根 `pom.xml` 的模块顺序：

1. `jkind-common`
   - 主要包含 JKind/Lustre AST、parser、工具类等基础代码。
   - 关键语法文件：`jkind-common/src/main/java/jkind/lustre/parsing/Lustre.g4`。
   - 依赖：ANTLR runtime、JExcelAPI。
   - Agent 默认不要在这里做 Synlong 业务改动，除非目标是修改 JKind/Lustre 底层能力。

2. `jkind-service`
   - 主要包含 JKind 验证引擎、分析、翻译、求解器桥接等服务层代码。
   - 依赖 `jkind-common`、SMTInterpol、SLF4J。
   - Agent 修改前要确认是否会影响 JKind 核心验证语义。

3. `jkind-api`
   - 依赖 `jkind-common` 和 `jkind-service`。
   - README 说明该模块基本可忽略：它偏向原 JKind API/控制台输出路径，不是当前 HTTP 返回验证结果的主路径。

4. `jkind-server`
   - 当前自定义业务和对外 API 的主要模块。
   - 负责：HTTP 接口、Synlong parser/转换、自动机 JSON 转换、调用 `LustreService` 验证。
   - 后续 Synlong/Scade 语法适配、状态机转换、接口返回行为，通常优先在此模块处理。

## 4. 顶层目录速览

- `README.md`：人类读者项目介绍、总体方案、启动测试说明。
- `AGENT.md`：旧的单数 agent 配置说明，可作历史参考；标准仓库级说明以本 `AGENTS.md` 为准。
- `conversion_explanation.md`：核反应堆冷却子系统的 Synlong -> Lustre 转换案例分析。
- `docs/high-order-operators-jkind.md`：说明高阶算子当前“语法接收/字符串透传”与 JKind 目标语法边界。
- `docs/high-order-operators-implementation-start.md`：后续补齐高阶算子降阶的实现路线建议。
- `lustre-demos/`：大量 Lustre 示例模型。
- `reference/`：Scade/Synlong 参考材料与转换结果文件；注意 `SynlongConverter` 当前会写 `reference/result.txt`。
- `.omx/`：OMX 工作流状态、上下文、计划和规格产物；通常不要把它当作项目源码。

## 5. `jkind-server` 详细结构

`jkind-server/src/main/java/com/ecnu/synlong/`：

```text
aspect/              全局异常处理
common/              BaseResponse、CheckResult、HttpCode 等响应/结果包装
config/              Spring MVC/CORS 配置
constant/            转换常量
controller/          REST API 控制器
model/               自动机 JSON 输出模型
parser/              Synlong grammar、ANTLR 生成代码、转换器
  convert/           Synlong->Lustre、Synlong/Lustre-like->Automaton JSON
  synlong/           Synlong.g4 与生成 parser/lexer/visitor/listener
request/             请求 DTO
service/             LustreService：JKind 验证桥接
SynlongApplication   Spring Boot 启动类
```

`jkind-server/src/main/resources/application.yml` 设置服务端口为 `8080`。

### 5.1 Spring Boot 入口与配置

- `SynlongApplication.java`：标准 `@SpringBootApplication` 入口。
- `GlobalCorsConfig.java`：对 `/**` 允许跨域，允许常见 HTTP 方法，`allowedOrigins("*")`。
- `GlobalExceptionHandler.java`：`@RestControllerAdvice` 捕获所有 `Exception`，记录日志并返回 `BaseResponse.error(e.getMessage())`。

### 5.2 Controller 与 endpoint

#### `LustreController` — `/lustre`

文件：`jkind-server/src/main/java/com/ecnu/synlong/controller/LustreController.java`

- `POST /lustre/check`
  - 请求体：`LustreFileParameter`，核心字段 `file`。
  - 逻辑：读取文本 `program`；如果文本不包含字符串 `aiyowei`，先执行 `SynlongConverter.convert(program)`；然后把转换后的文本作为 `String[]{program}` 传给 `lustreService.check(args)`。
  - 返回：成功时 `BaseResponse.success(CheckResult)`；若 `CheckResult.status != SUCCESS`，返回 `BaseResponse.error(result.getResult())`。
  - 重要风险：`aiyowei` 是测试后门/绕过标记；带有该字符串的输入会跳过 Synlong->Lustre 转换。

- `POST /lustre/convert`
  - 请求体：`LustreFileParameter.file`。
  - 逻辑：调用 `AutomatonConverter.convertToAutomaton(program)`。
  - 返回：`CheckResult.success(automatonJson)` 包装在 `BaseResponse` 中。

#### `AutomatonController` — `/model`

文件：`jkind-server/src/main/java/com/ecnu/synlong/controller/AutomatonController.java`

- `POST /model/convert`
  - 请求体：`AutomatonParameter.file`。
  - 当前只用 Jackson `ObjectMapper.readTree` 检查输入是否是合法 JSON。
  - 合法返回 `BaseResponse.success(1)`，非法返回 JSON 错误信息。

#### `VerifyController` — 根路径 `/verify`

文件：`jkind-server/src/main/java/com/ecnu/synlong/controller/VerifyController.java`

- `POST /verify`
  - 请求体：`VerifyParameter`，字段 `id` 和 `property`。
  - 仅接受属性前缀：`A[]`、`E[]`、`A<>`、`E<>`。
  - 特例：`A[] not deadlock` 直接返回字符串 `true`。
  - 其他属性使用 `ConcurrentHashMap` 缓存并生成随机区间字符串，属于模拟实现，不是真正模型检查。
  - 注意参数校验条件当前写作 `if (id < 0 && property == null || property.trim().isEmpty())`，存在运算符优先级/空指针风险；若修改该接口需补测试。

### 5.3 请求、响应和模型对象

- `request/LustreFileParameter.java`：`file` 字段，供 `/lustre/check` 和 `/lustre/convert` 使用。
- `request/AutomatonParameter.java`：`file` 字段，供 `/model/convert` 使用。
- `request/VerifyParameter.java`：`id`、`property` 字段，供 `/verify` 使用。
- `common/BaseResponse.java`：统一响应，`code`、`data`、`message`；`success` 使用 `HttpCode.OK = 200`，`error` 使用 `HttpCode.ERROR = -1`。
- `common/CheckResult.java`：验证结果包装，`status` 被 `@JsonIgnore`，对外主要暴露 `result`。
- `model/AutomatonModel.java`、`Automaton.java`、`Location.java`、`Transition.java`：自动机 JSON 输出结构，包含自动机、状态、迁移、坐标和声明字段。

## 6. Synlong grammar 与转换链路

### 6.1 Synlong grammar

语法源文件：`jkind-server/src/main/java/com/ecnu/synlong/parser/synlong/Synlong.g4`

它定义了 Synlong/Lustre-like 输入的主要结构：

- 顶层：`program -> decls* EOF`。
- 声明：`type_block`、`const_block`、`user_op_decl`。
- 节点/函数：`node`、`function`、`returns`、`var`、`let ... tel`。
- 状态机：`automaton`、`initial state`、`final state`、`unless`、`until`、`resume`、`restart`。
- 表达式：基础表达式、`pre`、`->`、`fby`、`when`、`merge`、数组/结构体、`if then else`、`case`、函数调用。
- 高阶算子语法：`map`、`fold`、`mapi`、`foldi`、`mapfold`、`mapw`、`mapwi`、`foldw`、`foldwi`，以及 `$+$`、`not$`、`(make T)`、`(flatten T)` 等 prefix operator。
- 属性标记：`--%PROPERTY`、`--%REALIZABLE`、`--%IVC`、`--%MAIN` 和 `assert`。

生成代码位于 `parser/synlong/gen/`。不要手改生成的 `SynlongLexer.java`、`SynlongParser.java`、`SynlongBaseVisitor.java` 等文件；应修改 `Synlong.g4` 后重新生成。

### 6.2 Synlong -> Lustre 主流程

入口文件：`jkind-server/src/main/java/com/ecnu/synlong/parser/convert/SynlongConverter.java`

流程：

```text
SynlongConverter.convert(synlongCode)
  -> CharStreams.fromString
  -> SynlongLexer + SynlongErrorListener
  -> SynlongParser + SynlongErrorListener
  -> parser.program()
  -> new SynlongToLustreContext()
  -> new SynlongToLustreVisitor(context).visit(tree)
  -> 写 reference/result.txt
  -> 返回 Lustre 文本
```

注意：转换器会尝试把结果写入 `reference/result.txt`，这意味着运行转换或相关测试可能产生工作区文件变化。

### 6.3 `SynlongToLustreVisitor`

文件：`jkind-server/src/main/java/com/ecnu/synlong/parser/convert/SynlongToLustreVisitor.java`

这是核心转换 visitor。它不是简单逐节点打印，而是包含状态机预收集和代码生成两阶段：

1. `visitProgram` 先调用 `collectStateMachineInfo(ctx)`。
2. 再调用 `generateLustreCode(ctx)` 输出完整 Lustre。

关键职责：

- 收集用户节点中的状态机、节点参数、局部变量和状态局部变量。
- 识别 `initial/final state`、`unless/until transition`、状态内 `let` 方程。
- 生成全局 type/const/node 定义。
- 处理 `make` / `flatten` 辅助函数。
- 处理数组、结构体、`pre`、`->`、`fby`、`when`、`merge`、`if then else`、`case` 等表达式。
- 把状态内赋值转为基于 `state = StateName` 的条件赋值。

### 6.4 `SynlongToLustreContext`

文件：`jkind-server/src/main/java/com/ecnu/synlong/parser/convert/SynlongToLustreContext.java`

这是转换状态容器和代码片段生成器，负责：

- Synlong 状态名到 Lustre 状态枚举的映射。
- 初始状态、终止状态、所有状态集合。
- 全局变量、状态局部变量、状态变量类型。
- 状态内 assignment 和 transition 的聚合。
- 局部变量前缀策略，避免不同状态变量冲突。
- 生成 `type State = enum {...};`。
- 生成状态机局部变量声明与条件赋值。
- 记录结构体类型字段，生成 `make_<Type>` 构造节点和 `flatten_<Type>` 展开节点。

修改状态机转换时，要优先理解 `Visitor` 和 `Context` 的协作关系，避免只改字符串输出而破坏变量作用域或状态保持语义。

### 6.5 错误处理

- `SynlongErrorListener.java`：ANTLR 错误监听器，收集/抛出语法错误。
- `SynlongToLustreException.java`：转换异常包装。
- `LustreService.parseLustre` 也会从 JKind parser 的 `StdErrErrorListener` 中提取首个语法错误信息。

## 7. 自动机 JSON 转换链路

入口：`AutomatonConverter.convertToAutomaton(lustreCode)`

文件：`jkind-server/src/main/java/com/ecnu/synlong/parser/convert/AutomatonConverter.java`

流程：

```text
AutomatonConverter.convertToAutomaton(input)
  -> SynlongLexer / SynlongParser 解析同一套 grammar
  -> LustreToAutomatonConverter.visit(tree)
  -> AutomatonModel / Automaton / Location / Transition
  -> Jackson 输出 JSON 字符串
```

`LustreToAutomatonConverter.java` 主要负责：

- 收集状态机信息。
- 为用户节点/自动机生成 `Automaton`。
- 生成参数、声明、系统声明。
- 生成 `Location` 状态节点和坐标。
- 生成 `Transition` 迁移、guard/update/select/sync 字段和坐标。
- 设置初始状态。

现有测试 `jkind-server/src/test/java/com/ecnu/synlong/parser/convert/AutomatonConverterTest.java` 主要覆盖一个 Car 自动机转换示例，断言 JSON 中包含自动机名、状态名和系统声明。

## 8. Lustre/JKind 验证链路

文件：`jkind-server/src/main/java/com/ecnu/synlong/service/LustreService.java`

`LustreService.check(String[] args)` 基本复制/改造自 JKind 主流程：

```text
JKindArgumentParser.parse(args)
  -> parseLustre(settings.filename)
  -> setMainNode(program, settings.main)
  -> StaticAnalyzer.check(program, settings.solver, settings)
  -> LinearChecker.isLinear(program) 非线性提示
  -> ensureSolverAvailable(settings.solver)
  -> Translate.translate(program)
  -> new Specification(...)
  -> new Director(settings, userSpec, analysisSpec).run()
  -> CheckResult.success(director.getResult())
```

`parseLustre(String input)` 使用 JKind 自带 `LustreLexer`、`LustreParser`、`LustreToAstVisitor`，因此 `SynlongToLustreVisitor` 的输出最终必须符合 `jkind-common/src/main/java/jkind/lustre/parsing/Lustre.g4`。

重要边界：`docs/high-order-operators-jkind.md` 指出部分高阶算子当前可能只是语法接收或字符串透传；真正进入 JKind 前必须降阶为普通 Lustre，否则 JKind parser 不一定能接受。

## 9. 构建、运行、测试

常用命令：

```bash
# 全量构建（README 记录）
mvn clean install -U

# 只构建/测试 jkind-server 及其依赖
mvn -pl jkind-server -am test

# 打包 jkind-server 及依赖
mvn -pl jkind-server -am package

# 启动服务；实际 jar 名以 target 目录为准
java -jar jkind-server/target/jkind-server-0.0.1-SNAPSHOT.jar
```

README 中也出现过 `jkind-server-1.0-SNAPSHOT.jar`；但 `jkind-server/pom.xml` 当前模块版本为 `0.0.1-SNAPSHOT`。运行前请以 `ls jkind-server/target/*.jar` 实际结果为准。

服务默认端口：`8080`。

接口手动验证可用 Postman/curl 调用：

```bash
curl -X POST http://localhost:8080/lustre/check \
  -H 'Content-Type: application/json' \
  -d '{"file":"<Synlong or Lustre text>"}'

curl -X POST http://localhost:8080/lustre/convert \
  -H 'Content-Type: application/json' \
  -d '{"file":"<automaton-containing text>"}'

curl -X POST http://localhost:8080/model/convert \
  -H 'Content-Type: application/json' \
  -d '{"file":"{\"declaration\":\"\",\"automatons\":[]}"}'
```

## 10. Agent 修改边界和建议

1. 默认优先在 `jkind-server` 修改自定义业务代码。
2. Synlong grammar 改动应从 `parser/synlong/Synlong.g4` 开始；生成代码不要手改。
3. Synlong -> Lustre 语义改动主要看 `parser/convert/SynlongToLustreVisitor.java` 和 `SynlongToLustreContext.java`。
4. 自动机 JSON 改动主要看 `AutomatonConverter.java`、`LustreToAutomatonConverter.java` 和 `model/` DTO。
5. HTTP contract 改动主要看 `controller/`、`request/`、`common/`。
6. JKind 验证底层改动才进入 `jkind-service` / `jkind-common`；这类改动风险更高，需要更强测试。
7. 不要新增依赖，除非用户明确要求。
8. 修改转换逻辑时，优先添加或更新 `jkind-server/src/test/java/...` 下的回归测试。
9. 运行转换相关测试后检查 `reference/result.txt` 是否被改动；这是当前代码行为，不一定是期望提交内容。
10. 保持 Java 8 兼容，不使用 Java 9+ API/语法。

## 11. 已知风险和容易踩坑的点

- `/verify` 当前是模拟实现：除 `A[] not deadlock` 外返回随机区间并缓存，不代表真实验证。
- `/lustre/check` 中字符串 `aiyowei` 会绕过 Synlong 转换，是测试后门/特殊路径。
- `SynlongConverter.convert` 会写 `reference/result.txt`，运行测试或服务可能污染工作区。
- 当前测试覆盖较少；已发现的测试主要是 `AutomatonConverterTest`。
- 高阶算子相关 docs 表明部分语法可能尚未真正降阶到 JKind 可解析 Lustre；不要假设 grammar 接受就等于 JKind 能验证。
- `VerifyController` 参数校验表达式存在潜在优先级/空指针问题，改动时要补充测试。
- `CheckResult.status` 使用 `@JsonIgnore`，前端看到的主要是 `result` 字段；改响应格式前要确认前端兼容。
- `jkind-common` 和 `jkind-service` 文件量较大且偏上游 JKind，轻易修改可能引入验证语义回归。

## 12. 推荐的任务完成检查清单

在声称完成前，至少确认：

- 只改了任务要求范围内的文件。
- 若改 Java：运行 `mvn -pl jkind-server -am test`，必要时全量 `mvn test` 或 `mvn clean install -U`。
- 若改转换器：新增/更新具体 Synlong/Lustre 输入的回归测试，并检查输出是否仍能被 `LustreService.parseLustre` 接受。
- 若改接口：说明 endpoint、请求体、响应体是否兼容旧前端。
- 若只是文档：检查关键文件路径、类名、endpoint 和命令是否与源码一致。
