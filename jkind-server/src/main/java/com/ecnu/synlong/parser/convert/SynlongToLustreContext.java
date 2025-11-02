package com.ecnu.synlong.parser.convert;

import java.util.*;

public class SynlongToLustreContext {
    // 状态名映射
    private final Map<String, String> stateNameMap = new HashMap<>();
    // 已声明变量集合
    private final Set<String> declaredVars = new HashSet<>();
    // 全局变量集合（输入、输出、节点级局部变量）
    private final Set<String> globalVars = new HashSet<>();
    // 初始状态
    private String initialState = null;
    // 最终状态集合
    private final Set<String> finalStates = new HashSet<>();
    
    // 新增：状态机相关收集
    private final Set<String> allStates = new HashSet<>();
    private final Map<String, Set<String>> stateLocalVars = new HashMap<>();
    private final Map<String, String> stateBodies = new HashMap<>();
    private final Map<String, List<String>> stateTransitions = new HashMap<>();
    
    // 新增：状态局部变量类型和赋值收集
    private final Map<String, Map<String, String>> stateVarTypes = new HashMap<>(); // stateName -> (varName -> type)
    private final Map<String, List<String>> stateAssignments = new HashMap<>(); // stateName -> list of assignments
    
    // 新增：全局类型定义收集
    private final List<String> globalTypeDefs = new ArrayList<>();
    private final List<String> globalConstDefs = new ArrayList<>();
    private final List<String> globalNodeDefs = new ArrayList<>();
    
    // 新增：结构体构造函数收集
    private final Set<String> structTypes = new HashSet<>(); // 需要生成构造函数的结构体类型
    private final Set<String> flattenTypes = new HashSet<>(); // 需要生成flatten函数的结构体类型
    private final Map<String, Map<String, String>> structFields = new HashMap<>(); // 结构体名 -> (字段名 -> 字段类型)

    public void addState(String synlongState, String lustreState) {
        stateNameMap.put(synlongState, lustreState);
    }

    public String getLustreState(String synlongState) {
        return stateNameMap.getOrDefault(synlongState, synlongState);
    }

    public void declareVar(String var) {
        declaredVars.add(var);
    }

    public boolean isVarDeclared(String var) {
        return declaredVars.contains(var);
    }
    
    public void addGlobalVariable(String var) {
        globalVars.add(var);
    }
    
    public boolean isGlobalVariable(String var) {
        return globalVars.contains(var);
    }
    
    public Set<String> getGlobalVars() {
        return Collections.unmodifiableSet(globalVars);
    }

    public void setInitialState(String state) {
        this.initialState = state;
    }

    public String getInitialState() {
        return initialState;
    }

    public void addFinalState(String state) {
        finalStates.add(state);
    }

    public boolean isFinalState(String state) {
        return finalStates.contains(state);
    }

    public Set<String> getFinalStates() {
        return Collections.unmodifiableSet(finalStates);
    }
    
    // 新增：状态机相关方法
    public void addStateToEnum(String stateName) {
        allStates.add(stateName);
    }
    
    public Set<String> getAllStates() {
        return Collections.unmodifiableSet(allStates);
    }
    
    public void addStateLocalVar(String stateName, String varName) {
        stateLocalVars.computeIfAbsent(stateName, k -> new HashSet<>()).add(varName);
    }
    
    public Set<String> getStateLocalVars(String stateName) {
        return stateLocalVars.getOrDefault(stateName, Collections.emptySet());
    }
    
    public void setStateBody(String stateName, String body) {
        stateBodies.put(stateName, body);
    }
    
    public String getStateBody(String stateName) {
        return stateBodies.get(stateName);
    }
    
    public void addStateTransition(String stateName, String transition) {
        stateTransitions.computeIfAbsent(stateName, k -> new ArrayList<>()).add(transition);
    }
    
    public List<String> getStateTransitions(String stateName) {
        return stateTransitions.getOrDefault(stateName, Collections.emptyList());
    }
    
    // 新增：状态局部变量类型和赋值方法
    public void addStateVarType(String stateName, String varName, String type) {
        stateVarTypes.computeIfAbsent(stateName, k -> new HashMap<>()).put(varName, type);
    }
    
    public String getStateVarType(String stateName, String varName) {
        return stateVarTypes.getOrDefault(stateName, Collections.emptyMap()).get(varName);
    }
    
    // 生成带前缀的变量名
    public String getPrefixedVarName(String stateName, String varName) {
        return stateName + "_" + varName;
    }
    
    // 检查变量是否是状态局部变量（需要前缀）
    public boolean isStateLocalVar(String stateName, String varName) {
        return stateVarTypes.containsKey(stateName) && 
               stateVarTypes.get(stateName).containsKey(varName);
    }
    
    // 检查变量是否需要前缀（只有非全局的状态变量才需要前缀）
    public boolean needsPrefix(String stateName, String varName) {
        return isStateLocalVar(stateName, varName) && !isGlobalVariable(varName);
    }
    
    // 获取变量在特定状态下的正确名称（如果是状态变量且非全局变量则加前缀）
    public String getCorrectVarName(String stateName, String varName) {
        if (needsPrefix(stateName, varName)) {
            return getPrefixedVarName(stateName, varName);
        }
        return varName; // 全局变量或非状态变量保持原名
    }
    
    public void addStateAssignment(String stateName, String assignment) {
        stateAssignments.computeIfAbsent(stateName, k -> new ArrayList<>()).add(assignment);
    }
    
    public List<String> getStateAssignments(String stateName) {
        return stateAssignments.getOrDefault(stateName, Collections.emptyList());
    }
    
    // 获取所有状态局部变量的类型信息（带前缀）
    public Map<String, String> getAllStateVarTypes() {
        Map<String, String> allVarTypes = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> stateEntry : stateVarTypes.entrySet()) {
            String stateName = stateEntry.getKey();
            Map<String, String> stateVars = stateEntry.getValue();
            for (Map.Entry<String, String> varEntry : stateVars.entrySet()) {
                String originalVarName = varEntry.getKey();
                String varType = varEntry.getValue();
                // 只有非全局变量才需要前缀
                if (!isGlobalVariable(originalVarName)) {
                    String prefixedVarName = getPrefixedVarName(stateName, originalVarName);
                    allVarTypes.put(prefixedVarName, varType);
                }
            }
        }
        return allVarTypes;
    }
    
    // 新增：全局定义收集方法
    public void addGlobalTypeDef(String typeDef) {
        globalTypeDefs.add(typeDef);
    }
    
    public void addGlobalConstDef(String constDef) {
        globalConstDefs.add(constDef);
    }
    
    public void addGlobalNodeDef(String nodeDef) {
        globalNodeDefs.add(nodeDef);
    }
    
    public List<String> getGlobalTypeDefs() {
        return Collections.unmodifiableList(globalTypeDefs);
    }
    
    public List<String> getGlobalConstDefs() {
        return Collections.unmodifiableList(globalConstDefs);
    }
    
    public List<String> getGlobalNodeDefs() {
        return Collections.unmodifiableList(globalNodeDefs);
    }
    
    // 生成状态枚举类型定义
    public String generateStateEnumType() {
        if (allStates.isEmpty()) {
            return "";
        }
        return "type State = enum {" + String.join(", ", allStates) + "};\n";
    }
    
    // 生成状态机局部变量定义（只包含状态机相关变量，不包含状态变量本身）
    public String generateStateMachineLocalVars() {
        Map<String, String> uniqueVars = getUniqueStateVars();
        
        if (uniqueVars.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        // 只生成状态局部变量，状态变量本身由调用方处理
        for (Map.Entry<String, String> entry : uniqueVars.entrySet()) {
            String varName = entry.getKey();
            String varType = entry.getValue();
            sb.append("\t").append(varName).append(" : ").append(varType).append(";\n");
        }
        return sb.toString();
    }
    
    // 获取唯一的状态变量（处理重复定义）
    private Map<String, String> getUniqueStateVars() {
        Map<String, String> uniqueVars = new HashMap<>();
        Map<String, List<String>> varNameToStates = new HashMap<>(); // 变量名 -> 定义它的状态列表
        Map<String, Set<String>> varNameToTypes = new HashMap<>(); // 变量名 -> 类型集合
        
        // 收集所有变量名及其对应的状态和类型
        for (Map.Entry<String, Map<String, String>> stateEntry : stateVarTypes.entrySet()) {
            String stateName = stateEntry.getKey();
            Map<String, String> stateVars = stateEntry.getValue();
            
            for (Map.Entry<String, String> varEntry : stateVars.entrySet()) {
                String originalVarName = varEntry.getKey();
                String varType = varEntry.getValue();
                
                varNameToStates.computeIfAbsent(originalVarName, k -> new ArrayList<>()).add(stateName);
                varNameToTypes.computeIfAbsent(originalVarName, k -> new HashSet<>()).add(varType);
            }
        }
        
        // 处理每个变量
        for (Map.Entry<String, List<String>> entry : varNameToStates.entrySet()) {
            String originalVarName = entry.getKey();
            List<String> states = entry.getValue();
            Set<String> types = varNameToTypes.get(originalVarName);
            
            // 如果是全局变量，不添加前缀
            if (isGlobalVariable(originalVarName)) {
                continue; // 全局变量不在这里处理
            }
            
            if (states.size() == 1) {
                // 只在一个状态中定义，使用前缀名
                String stateName = states.get(0);
                String prefixedName = getPrefixedVarName(stateName, originalVarName);
                String varType = types.iterator().next();
                uniqueVars.put(prefixedName, varType);
            } else {
                // 在多个状态中定义，需要合并
                if (types.size() == 1) {
                    // 类型相同，使用原变量名
                    String varType = types.iterator().next();
                    uniqueVars.put(originalVarName, varType);
                } else {
                    // 类型不同，仍使用前缀名（避免类型冲突）
                    for (String stateName : states) {
                        String prefixedName = getPrefixedVarName(stateName, originalVarName);
                        String varType = stateVarTypes.get(stateName).get(originalVarName);
                        uniqueVars.put(prefixedName, varType);
                    }
                }
            }
        }
        
        return uniqueVars;
    }
    
    // 检查是否有状态机变量需要声明
    public boolean hasStateMachineVars() {
        return !allStates.isEmpty() || !getAllStateVarTypes().isEmpty();
    }
    
    // 生成状态机条件赋值（处理重复变量合并）
    public String generateStateMachineConditionalAssignments() {
        StringBuilder sb = new StringBuilder();
        Map<String, List<StateAssignment>> varAssignments = groupAssignmentsByVariable();
        
        for (Map.Entry<String, List<StateAssignment>> entry : varAssignments.entrySet()) {
            String varName = entry.getKey();
            List<StateAssignment> assignments = entry.getValue();
            
            if (assignments.size() == 1) {
                // 单个状态的赋值
                StateAssignment assignment = assignments.get(0);
                sb.append("\t-- Variable ").append(varName).append(" assignment\n");
                sb.append("\t").append(varName).append(" = if (state = ").append(assignment.stateName)
                  .append(") then ").append(assignment.rhs)
                  .append(" else pre(").append(varName).append(");\n");
            } else {
                // 多个状态的赋值，生成if-else链
                sb.append("\t-- Variable ").append(varName).append(" assignments (merged)\n");
                sb.append("\t").append(varName).append(" = ");
                
                for (int i = 0; i < assignments.size(); i++) {
                    StateAssignment assignment = assignments.get(i);
                    if (i == 0) {
                        sb.append("if (state = ").append(assignment.stateName).append(") then ").append(assignment.rhs);
                    } else {
                        sb.append(" else if (state = ").append(assignment.stateName).append(") then ").append(assignment.rhs);
                    }
                }
                sb.append(" else pre(").append(varName).append(");\n");
            }
        }
        
        return sb.toString();
    }
    
    // 按变量分组赋值语句
    private Map<String, List<StateAssignment>> groupAssignmentsByVariable() {
        Map<String, List<StateAssignment>> grouped = new HashMap<>();
        
        for (String stateName : allStates) {
            List<String> assignments = getStateAssignments(stateName);
            for (String assignment : assignments) {
                int eq = assignment.indexOf('=');
                if (eq > 0) {
                    String originalLhs = assignment.substring(0, eq).trim();
                    String originalRhs = assignment.substring(eq + 1).trim();
                    
                    // 确定最终的变量名
                    String finalVarName;
                    if (isGlobalVariable(originalLhs) || isVariableSharedAcrossStates(originalLhs)) {
                        finalVarName = originalLhs; // 全局变量或共享变量使用原名
                    } else {
                        finalVarName = getPrefixedVarName(stateName, originalLhs); // 单独变量使用前缀名
                    }
                    
                    // 处理右侧表达式中的变量引用
                    String processedRhs = processRhsVariableReferences(stateName, originalRhs);
                    
                    StateAssignment stateAssignment = new StateAssignment(stateName, processedRhs);
                    grouped.computeIfAbsent(finalVarName, k -> new ArrayList<>()).add(stateAssignment);
                }
            }
        }
        
        return grouped;
    }
    
    // 检查变量是否在多个状态间共享（同名且同类型，但不是全局变量）
    private boolean isVariableSharedAcrossStates(String varName) {
        if (isGlobalVariable(varName)) {
            return false; // 全局变量不算共享状态变量
        }
        
        int stateCount = 0;
        Set<String> types = new HashSet<>();
        
        for (Map.Entry<String, Map<String, String>> stateEntry : stateVarTypes.entrySet()) {
            Map<String, String> stateVars = stateEntry.getValue();
            if (stateVars.containsKey(varName)) {
                stateCount++;
                types.add(stateVars.get(varName));
            }
        }
        
        return stateCount > 1 && types.size() == 1; // 多个状态且类型相同
    }
    
    // 内部类：状态赋值
    private static class StateAssignment {
        final String stateName;
        final String rhs;
        
        StateAssignment(String stateName, String rhs) {
            this.stateName = stateName;
            this.rhs = rhs;
        }
    }
    
    // 处理右侧表达式中的变量引用，为状态变量添加前缀
    private String processRhsVariableReferences(String currentStateName, String rhs) {
        // 这是一个简化版本，实际可能需要更复杂的解析
        // 目前只处理简单的变量引用
        String processedRhs = rhs;
        
        // 检查是否包含当前状态的局部变量
        for (Map.Entry<String, Map<String, String>> stateEntry : stateVarTypes.entrySet()) {
            String stateName = stateEntry.getKey();
            Map<String, String> stateVars = stateEntry.getValue();
            
            for (String varName : stateVars.keySet()) {
                // 只有非全局的状态变量才需要添加前缀
                if (stateName.equals(currentStateName) && !isGlobalVariable(varName) && processedRhs.contains(varName)) {
                    // 简单的字符串替换，实际应该使用更精确的解析
                    processedRhs = processedRhs.replaceAll("\\b" + varName + "\\b", getPrefixedVarName(stateName, varName));
                }
            }
        }
        
        return processedRhs;
    }
    
    // 新增：结构体构造函数相关方法
    public void addStructType(String typeName) {
        structTypes.add(typeName);
    }
    
    public Set<String> getStructTypes() {
        return Collections.unmodifiableSet(structTypes);
    }
    
    // 新增：flatten函数相关方法
    public void addFlattenType(String typeName) {
        flattenTypes.add(typeName);
    }
    
    public Set<String> getFlattenTypes() {
        return Collections.unmodifiableSet(flattenTypes);
    }
    
    // 添加结构体字段信息
    public void addStructField(String structName, String fieldName, String fieldType) {
        structFields.computeIfAbsent(structName, k -> new HashMap<>()).put(fieldName, fieldType);
    }
    
    // 获取结构体字段信息
    public Map<String, String> getStructFields(String structName) {
        return structFields.getOrDefault(structName, Collections.emptyMap());
    }
    
    // 生成结构体构造函数
    public String generateStructConstructors() {
        StringBuilder sb = new StringBuilder();
        
        for (String typeName : structTypes) {
            Map<String, String> fields = getStructFields(typeName);
            
            if (fields.isEmpty()) {
                // 如果没有字段信息，使用默认的value和status
                sb.append("node make_").append(typeName).append("(value : int; status : bool) returns (result : ").append(typeName).append(");\n");
                sb.append("let\n");
                sb.append("\tresult = result {value := value};\n");
                sb.append("\t-- result = result {status := status};\n");
                sb.append("tel;\n\n");
            } else {
                // 根据实际字段生成参数和返回值
                List<String> paramList = new ArrayList<>();
                List<String> fieldNames = new ArrayList<>();
                
                for (Map.Entry<String, String> field : fields.entrySet()) {
                    String fieldName = field.getKey();
                    String fieldType = field.getValue();
                    paramList.add(fieldName + " : " + fieldType);
                    fieldNames.add(fieldName);
                }
                
                // 生成函数签名
                sb.append("node make_").append(typeName).append("(")
                  .append(String.join("; ", paramList))
                  .append(") returns (result : ").append(typeName).append(");\n");
                
                // 生成函数体 - 第一个字段正常定义，其他字段注释掉
                sb.append("let\n");
                for (int i = 0; i < fieldNames.size(); i++) {
                    String fieldName = fieldNames.get(i);
                    if (i == 0) {
                        sb.append("\tresult = result {").append(fieldName).append(" := ").append(fieldName).append("};\n");
                    } else {
                        sb.append("\t-- result = result {").append(fieldName).append(" := ").append(fieldName).append("};\n");
                    }
                }
                sb.append("tel;\n\n");
            }
        }
        
        return sb.toString();
    }
    
    // 生成结构体flatten函数
    public String generateFlattenFunctions() {
        StringBuilder sb = new StringBuilder();
        
        for (String typeName : flattenTypes) {
            Map<String, String> fields = getStructFields(typeName);
            
            if (!fields.isEmpty()) {
                // 生成返回参数列表
                List<String> returnParams = new ArrayList<>();
                List<String> assignments = new ArrayList<>();
                
                for (Map.Entry<String, String> field : fields.entrySet()) {
                    String fieldName = field.getKey();
                    String fieldType = field.getValue();
                    returnParams.add(fieldName + " : " + fieldType);
                    assignments.add(fieldName + " = result." + fieldName);
                }
                
                // 生成函数签名
                sb.append("node flatten_").append(typeName).append("(result : ").append(typeName)
                  .append(") returns (").append(String.join("; ", returnParams)).append(");\n");
                
                // 生成函数体
                sb.append("let\n");
                for (String assignment : assignments) {
                    sb.append("\t").append(assignment).append(";\n");
                }
                sb.append("tel;\n\n");
            }
        }
        
        return sb.toString();
    }
}
