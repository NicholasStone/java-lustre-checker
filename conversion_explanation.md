# Synlong到Lustre转换案例分析：核反应堆冷却子系统

## 案例概述

本案例展示了一个核反应堆冷却子系统的控制逻辑，从Synlong语言转换到Lustre语言的完整过程。该案例体现了多个重要的转换技巧和语言特性。

## 转换技巧详解

### 1. 自动机状态转换

**Synlong原代码**:
```synlong
automaton CoolingSystemSM
    initial state SystemInitialization
    unless
        if NORMAL_OPERATION = coolantTemp.status and NORMAL_OPERATION = coolantPressure.status
            resume NormalOperation;
        if EMERGENCY_STATE = emergencyStop.value and NORMAL_OPERATION = emergencyStop.status
            restart EmergencyShutdown;
```

**转换后的Lustre代码**:
```lustre
state = if (pre(state) = SystemInitialization) then SystemInitialization
else if (pre(state) = SystemInitialization and NORMAL_OPERATION = coolantPressure.status and NORMAL_OPERATION = coolantTemp.status) then NormalOperation
else if (pre(state) = SystemInitialization and EMERGENCY_STATE = emergencyStop.value and NORMAL_OPERATION = emergencyStop.status) then EmergencyShutdown
else pre(state);
```

**转换技巧**:
- `initial state` → 初始条件判断 `if (pre(state) = SystemInitialization)`
- `unless` → `else if` 条件链
- `resume/restart` → 直接状态转换
- 使用 `pre(state)` 获取前一时刻的状态

### 2. 变量作用域和前缀处理

**转换策略**:
- **全局变量**（输入、输出、节点级局部变量）：不加前缀
- **状态局部变量**：添加状态名前缀

**示例**:
```lustre
-- 全局变量（不加前缀）
coolantTemp : analog;
pumpControl : analog;

-- 状态局部变量（加前缀）
SystemInitialization_initPumpSpeed : real;
NormalOperation_optimalSpeed : real;
EmergencyShutdown_shutdownSpeed : real;
```

### 3. Make函数转换

**Synlong原代码**:
```synlong
pumpControl = (make analog)(initPumpSpeed, systemReady);
```

**转换后的Lustre代码**:
```lustre
-- 生成构造函数
node make_analog(value : real; status : bool) returns (result : analog);
let
    result = result {value := value};
    -- result = result {status := status};
tel;

-- 调用构造函数
pumpControl = make_analog(SystemInitialization_initPumpSpeed, SystemInitialization_systemReady);
```

**转换技巧**:
- `(make type)` → 生成对应的构造函数节点
- 构造函数只设置第一个字段，其他字段注释掉（Lustre特性）

### 4. Flatten函数转换

**Synlong原代码**:
```synlong
pumpRunning, currentSpeed, pumpHealthy = flatten_PumpStatus(pumpHealth);
```

**转换后的Lustre代码**:
```lustre
-- 生成flatten函数
node flatten_PumpStatus(pump : PumpStatus) returns (isRunning : bool; currentSpeed : real; isHealthy : bool);
let
    isRunning = pump.isRunning;
    currentSpeed = pump.currentSpeed;
    isHealthy = pump.isHealthy;
tel;

-- 调用flatten函数
flatten_PumpStatus(NormalOperation_pumpHealth).isHealthy
```

**转换技巧**:
- `flatten_type` → 生成对应的分解函数
- 函数返回结构体的各个字段
- 调用时使用点记法访问字段

### 5. Switch语句转换

**Synlong原代码**:
```synlong
pumpControl = switch safetyLevel of
    | 0.5 -> (make analog)(emergencySpeed, NORMAL_OPERATION)
    | 1.0 -> (make analog)(COOLANT_FLOW_LOW, EMERGENCY_STATE)
    | _ -> (make analog)(0.0, EMERGENCY_STATE)
end;
```

**转换后的Lustre代码**:
```lustre
pumpControl = if OverheatProtection_safetyLevel = 0.5 then make_analog(OverheatProtection_emergencySpeed, NORMAL_OPERATION) 
else if OverheatProtection_safetyLevel = 1.0 then make_analog(COOLANT_FLOW_LOW, EMERGENCY_STATE) 
else make_analog(0.0, EMERGENCY_STATE);
```

**转换技巧**:
- `switch...of...end` → `if...then...else if...else` 链
- 模式匹配转换为条件判断

### 6. Last操作符转换

**Synlong原代码**:
```synlong
lastSafeSpeed = last pumpControl.value;
```

**转换后的Lustre代码**:
```lustre
EmergencyShutdown_lastSafeSpeed = if (state = EmergencyShutdown) then pre(pumpControl.value) else pre(EmergencyShutdown_lastSafeSpeed);
```

**转换技巧**:
- `last variable` → `pre(variable)`
- 需要在状态条件中正确处理

### 7. 条件赋值语句转换

**Synlong原代码**:
```synlong
var
    optimalSpeed : real;
    flowAdjustment : real;
let
    flowAdjustment = coolantFlow.value * 0.4;
    optimalSpeed = COOLANT_FLOW_NORMAL + flowAdjustment;
```

**转换后的Lustre代码**:
```lustre
-- Variable NormalOperation_flowAdjustment assignment
NormalOperation_flowAdjustment = if (state = NormalOperation) then coolantFlow.value * 0.4 else pre(NormalOperation_flowAdjustment);

-- Variable NormalOperation_optimalSpeed assignment
NormalOperation_optimalSpeed = if (state = NormalOperation) then COOLANT_FLOW_NORMAL + NormalOperation_flowAdjustment else pre(NormalOperation_optimalSpeed);
```

**转换技巧**:
- 状态内的赋值 → 条件赋值语句
- 使用 `if (state = StateName) then value else pre(variable)`
- 变量名添加状态前缀避免冲突

## 实际应用意义

### 核反应堆冷却子系统功能

1. **SystemInitialization**: 系统初始化状态，确保所有传感器正常
2. **NormalOperation**: 正常运行状态，根据流量调整泵速
3. **OverheatProtection**: 过热保护状态，降低泵速增加冷却
4. **EmergencyShutdown**: 紧急停机状态，安全关闭系统

### 关键控制参数

- **温度控制**: COOLANT_TEMP_LOW (25°C), COOLANT_TEMP_HIGH (85°C)
- **压力控制**: COOLANT_PRESSURE_LOW (0.5MPa), COOLANT_PRESSURE_HIGH (15.5MPa)
- **流量控制**: COOLANT_FLOW_LOW (0.1m³/s), COOLANT_FLOW_NORMAL (2.5m³/s)

### 安全机制

1. **传感器状态监控**: 确保所有传感器正常工作
2. **温度保护**: 自动降低泵速防止过热
3. **紧急停机**: 响应紧急停机信号
4. **渐进降速**: 使用last操作符实现安全的渐进停机

## 转换效果总结

1. **状态机转换**: 完整保留了自动机的状态转换逻辑
2. **变量作用域**: 正确处理了全局变量和局部变量的作用域
3. **结构体操作**: 实现了make和flatten函数的完整转换
4. **条件逻辑**: 将switch语句转换为if-else链
5. **时序操作**: 正确处理了last操作符的时序语义
6. **代码可读性**: 保持了原代码的逻辑结构和可读性

这个案例展示了Synlong到Lustre转换的完整流程，涵盖了实际工业控制系统中常用的各种语言特性和转换技巧。
