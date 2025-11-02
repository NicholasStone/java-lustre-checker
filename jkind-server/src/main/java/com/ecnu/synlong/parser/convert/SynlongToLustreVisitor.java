package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongBaseVisitor;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;
import java.util.*;

public class SynlongToLustreVisitor extends SynlongBaseVisitor<String> {
    private final SynlongToLustreContext context;

    public SynlongToLustreVisitor(SynlongToLustreContext context) {
        this.context = context;
    }

    @Override
    public String visitProgram(SynlongParser.ProgramContext ctx) {
        // 第一阶段：收集所有状态机信息
        collectStateMachineInfo(ctx);
        
        // 第二阶段：生成完整的Lustre代码
        return generateLustreCode(ctx);
    }
    
    /**
     * 第一阶段：收集状态机信息
     */
    private void collectStateMachineInfo(SynlongParser.ProgramContext ctx) {
        for (SynlongParser.DeclsContext decl : ctx.decls()) {
            if (decl instanceof SynlongParser.UserOpDeclarationContext) {
                SynlongParser.UserOpDeclarationContext userOpDecl = (SynlongParser.UserOpDeclarationContext) decl;
                collectStateMachineFromUserOp(userOpDecl.user_op_decl());
            }
        }
    }
    
    /**
     * 从用户操作声明中收集状态机信息
     */
    private void collectStateMachineFromUserOp(SynlongParser.User_op_declContext ctx) {
        if (ctx instanceof SynlongParser.UserOpDeclContext) {
            SynlongParser.UserOpDeclContext userOpCtx = (SynlongParser.UserOpDeclContext) ctx;
            
            // 收集全局变量（输入、输出、局部变量）
            collectGlobalVariables(userOpCtx);
            
            if (userOpCtx.op_body() instanceof SynlongParser.FullOpBodyContext) {
                SynlongParser.FullOpBodyContext fullBody = (SynlongParser.FullOpBodyContext) userOpCtx.op_body();
                if (fullBody.let_block() != null) {
                    collectStateMachineFromLetBlock(fullBody.let_block());
                }
            }
        }
    }
    
    /**
     * 从let块中收集状态机信息
     */
    private void collectStateMachineFromLetBlock(SynlongParser.Let_blockContext ctx) {
        for (ParseTree child : ctx.children) {
            if (child instanceof SynlongParser.StateMachineReturnContext) {
                SynlongParser.StateMachineReturnContext eq = (SynlongParser.StateMachineReturnContext) child;
                collectStateMachineInfo(eq.state_machine());
            }
        }
    }
    
    /**
     * 收集全局变量（输入、输出、局部变量）
     */
    private void collectGlobalVariables(SynlongParser.UserOpDeclContext userOpCtx) {
        // 收集输入参数
        if (userOpCtx.params() != null) {
            collectParamsAsGlobalVars(userOpCtx.params());
        }
        
        // 收集输出参数
        if (userOpCtx.returns_clause() != null && userOpCtx.returns_clause().params() != null) {
            collectParamsAsGlobalVars(userOpCtx.returns_clause().params());
        }
        
        // 收集节点级局部变量
        if (userOpCtx.op_body() instanceof SynlongParser.FullOpBodyContext) {
            SynlongParser.FullOpBodyContext fullBody = (SynlongParser.FullOpBodyContext) userOpCtx.op_body();
            if (fullBody.local_block() != null) {
                collectLocalBlockAsGlobalVars(fullBody.local_block());
            }
        }
    }
    
    /**
     * 收集参数作为全局变量
     */
    private void collectParamsAsGlobalVars(SynlongParser.ParamsContext params) {
        for (SynlongParser.Var_declsContext varDecls : params.var_decls()) {
            for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                String varName = varId.getText();
                context.addGlobalVariable(varName);
            }
        }
    }
    
    /**
     * 收集局部块作为全局变量
     */
    private void collectLocalBlockAsGlobalVars(SynlongParser.Local_blockContext localBlock) {
        for (SynlongParser.Var_declsContext varDecls : localBlock.var_decls()) {
            for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                String varName = varId.getText();
                context.addGlobalVariable(varName);
            }
        }
    }
    
    /**
     * 收集状态机信息
     */
    private void collectStateMachineInfo(SynlongParser.State_machineContext ctx) {
        for (SynlongParser.State_declContext stateDecl : ctx.state_decl()) {
            String stateName = stateDecl.ID().getText();
            context.addStateToEnum(stateName);
            
            // 检查是否为初始状态或最终状态
            boolean isInitial = stateDecl.getText().contains("initial");
            boolean isFinal = stateDecl.getText().contains("final");
            
            if (isInitial) {
                context.setInitialState(stateName);
            }
            if (isFinal) {
                context.addFinalState(stateName);
            }
            
            // 收集状态体中的局部变量和内容
            if (stateDecl.state_body() != null) {
                collectStateBodyVars(stateName, stateDecl.state_body());
                collectStateBodyContent(stateName, stateDecl.state_body());
            }
            
            // 收集转换信息
            collectStateTransitions(stateName, stateDecl);
        }
    }
    
    /**
     * 收集状态体中的局部变量
     */
    private void collectStateBodyVars(String stateName, SynlongParser.State_bodyContext stateBody) {
        if (stateBody instanceof SynlongParser.StateBodyWithLocalContext) {
            SynlongParser.StateBodyWithLocalContext localCtx = (SynlongParser.StateBodyWithLocalContext) stateBody;
            for (SynlongParser.Var_declsContext varDecls : localCtx.local_block().var_decls()) {
                String varType = visit(varDecls.type_expr());
                for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                    String varName = varId.getText();
                    context.addStateLocalVar(stateName, varName);
                    context.addStateVarType(stateName, varName, varType);
                }
            }
        } else if (stateBody instanceof SynlongParser.StateBodyLocalOnlyContext) {
            SynlongParser.StateBodyLocalOnlyContext localCtx = (SynlongParser.StateBodyLocalOnlyContext) stateBody;
            for (SynlongParser.Var_declsContext varDecls : localCtx.local_block().var_decls()) {
                String varType = visit(varDecls.type_expr());
                for (SynlongParser.Var_idContext varId : varDecls.var_id()) {
                    String varName = varId.getText();
                    context.addStateLocalVar(stateName, varName);
                    context.addStateVarType(stateName, varName, varType);
                }
            }
        }
    }
    
    /**
     * 收集状态体内容
     */
    private void collectStateBodyContent(String stateName, SynlongParser.State_bodyContext stateBody) {
        StringBuilder bodyContent = new StringBuilder();
        
        if (stateBody instanceof SynlongParser.StateBodyWithLocalContext) {
            SynlongParser.StateBodyWithLocalContext localCtx = (SynlongParser.StateBodyWithLocalContext) stateBody;
            bodyContent.append(visit(localCtx.local_block()));
            // 收集let块中的赋值语句
            collectAssignmentsFromLetBlock(stateName, localCtx.let_block());
            bodyContent.append(visit(localCtx.let_block()));
        } else if (stateBody instanceof SynlongParser.StateBodyLocalOnlyContext) {
            SynlongParser.StateBodyLocalOnlyContext localCtx = (SynlongParser.StateBodyLocalOnlyContext) stateBody;
            bodyContent.append(visit(localCtx.local_block()));
        } else if (stateBody instanceof SynlongParser.StateBodyLetOnlyContext) {
            SynlongParser.StateBodyLetOnlyContext letCtx = (SynlongParser.StateBodyLetOnlyContext) stateBody;
            // 收集let块中的赋值语句
            collectAssignmentsFromLetBlock(stateName, letCtx.let_block());
            bodyContent.append(visit(letCtx.let_block()));
        } else if (stateBody instanceof SynlongParser.StateBodySingleEqContext) {
            SynlongParser.StateBodySingleEqContext eqCtx = (SynlongParser.StateBodySingleEqContext) stateBody;
            // 收集单个赋值语句
            collectAssignmentFromEquation(stateName, eqCtx.equation());
            bodyContent.append(visit(eqCtx.equation()));
        }
        
        context.setStateBody(stateName, bodyContent.toString());
    }
    
    /**
     * 从let块中收集赋值语句
     */
    private void collectAssignmentsFromLetBlock(String stateName, SynlongParser.Let_blockContext letBlock) {
        if (letBlock == null) return;
        
        for (ParseTree child : letBlock.children) {
            if (child instanceof SynlongParser.EquationContext) {
                collectAssignmentFromEquation(stateName, (SynlongParser.EquationContext) child);
            }
        }
    }
    
    /**
     * 从方程中收集赋值语句
     */
    private void collectAssignmentFromEquation(String stateName, SynlongParser.EquationContext equation) {
        if (equation instanceof SynlongParser.AssignmentContext) {
            SynlongParser.AssignmentContext assignment = (SynlongParser.AssignmentContext) equation;
            String lhs = visit(assignment.lhs());
            String rhs = visit(assignment.expr());
            if (lhs != null && rhs != null && !lhs.trim().isEmpty()) {
                context.addStateAssignment(stateName, lhs + " = " + rhs);
            }
        }
    }
    
    /**
     * 收集状态转换信息
     */
    private void collectStateTransitions(String stateName, SynlongParser.State_declContext stateDecl) {
        Set<String> processedTransitions = new HashSet<>(); // 避免重复
        
        // 收集unless转换
        for (int i = 0; i < stateDecl.getChildCount(); i++) {
            if ("unless".equals(stateDecl.getChild(i).getText())) {
                for (int j = i + 1; j < stateDecl.getChildCount(); j++) {
                    if (stateDecl.getChild(j) instanceof SynlongParser.TransitionContext) {
                        SynlongParser.TransitionContext trans = (SynlongParser.TransitionContext) stateDecl.getChild(j);
                        String condition = visit(trans);
                        String target = trans.ID().getText();
                        String transition = "unless: " + condition + " -> " + target;
                        
                        // 避免重复添加相同的转换
                        if (!processedTransitions.contains(transition)) {
                            processedTransitions.add(transition);
                            context.addStateTransition(stateName, transition);
                        }
                    }
                }
            } else if ("until".equals(stateDecl.getChild(i).getText())) {
                for (int j = i + 1; j < stateDecl.getChildCount(); j++) {
                    if (stateDecl.getChild(j) instanceof SynlongParser.TransitionContext) {
                        SynlongParser.TransitionContext trans = (SynlongParser.TransitionContext) stateDecl.getChild(j);
                        String condition = visit(trans);
                        String target = trans.ID().getText();
                        String transition = "until: " + condition + " -> " + target;
                        
                        // 避免重复添加相同的转换
                        if (!processedTransitions.contains(transition)) {
                            processedTransitions.add(transition);
                            context.addStateTransition(stateName, transition);
                        }
                    }
                }
            }
        }
    }

    /**
     * 第二阶段：生成完整的Lustre代码
     */
    private String generateLustreCode(SynlongParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        
        // 1. 处理所有声明，收集类型和常量定义
        for (SynlongParser.DeclsContext decl : ctx.decls()) {
            if (decl instanceof SynlongParser.TypeDeclarationContext) {
                visit(decl); // 这会调用visitType_block，将类型定义添加到全局收集器
            } else if (decl instanceof SynlongParser.ConstDeclarationContext) {
                visit(decl); // 这会调用visitConst_block，将常量定义添加到全局收集器
            } else if (decl instanceof SynlongParser.UserOpDeclarationContext) {
                visit(decl); // 这会调用visitUserOpDecl，将节点定义添加到全局收集器
            }
        }
        
        // 2. 生成全局类型定义（包括状态枚举）
        sb.append(generateGlobalTypeDefs());

        // 3. 生成全局常量定义
        sb.append(generateGlobalConstDefs());
        sb.append("\n");

        // 4. 生成结构体构造函数
        String structConstructors = context.generateStructConstructors();
        if (!structConstructors.isEmpty()) {
            sb.append(structConstructors);
        }

        // 5. 生成结构体flatten函数
        String flattenFunctions = context.generateFlattenFunctions();
        if (!flattenFunctions.isEmpty()) {
            sb.append(flattenFunctions);
        }

        // 6. 生成节点和函数定义
        for (String nodeDef : context.getGlobalNodeDefs()) {
            sb.append(nodeDef).append("\n");
        }
        
        return sb.toString();
    }
    
    /**
     * 生成全局类型定义
     */
    private String generateGlobalTypeDefs() {
        StringBuilder sb = new StringBuilder();
        
        // 添加状态枚举类型
        String stateEnumType = context.generateStateEnumType();
        if (!stateEnumType.isEmpty()) {
            sb.append(stateEnumType);
        }
        
        // 添加其他全局类型定义
        for (String typeDef : context.getGlobalTypeDefs()) {
            sb.append(typeDef).append("\n");
        }
        
        return sb.toString();
    }
    
    /**
     * 生成全局常量定义
     */
    private String generateGlobalConstDefs() {
        StringBuilder sb = new StringBuilder();
        for (String constDef : context.getGlobalConstDefs()) {
            sb.append(constDef).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitType_block(SynlongParser.Type_blockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (SynlongParser.Type_declContext typeDecl : ctx.type_decl()) {
            String typeName = typeDecl.ID().getText();
            String typeDefStr = "type " + typeName;
            if (typeDecl.type_def() != null) {
                String typeDef = visit(typeDecl.type_def());
                typeDefStr += " = " + typeDef;
                
                // 如果是结构体类型，收集字段信息
                if (typeDecl.type_def() instanceof SynlongParser.TypeExprDefContext) {
                    SynlongParser.TypeExprDefContext typeExprDef = (SynlongParser.TypeExprDefContext) typeDecl.type_def();
                    if (typeExprDef.type_expr() instanceof SynlongParser.StructTypeContext) {
                        SynlongParser.StructTypeContext structType = (SynlongParser.StructTypeContext) typeExprDef.type_expr();
                        collectStructFields(typeName, structType);
                    }
                }
            }
            typeDefStr += ";";
            
            // 添加到全局类型定义收集器
            context.addGlobalTypeDef(typeDefStr);
            sb.append(typeDefStr).append("\n");
        }
        return sb.toString();
    }
    
    // 收集结构体字段信息
    private void collectStructFields(String structName, SynlongParser.StructTypeContext structType) {
        for (SynlongParser.Field_declContext field : structType.field_decl()) {
            String fieldName = field.ID().getText();
            String fieldType = visit(field.type_expr());
            context.addStructField(structName, fieldName, fieldType);
        }
    }

    @Override
    public String visitTypeExprDef(SynlongParser.TypeExprDefContext ctx) {
        return visit(ctx.type_expr());
    }

    @Override
    public String visitEnumDef(SynlongParser.EnumDefContext ctx) {
        List<String> ids = new ArrayList<>();
        for (org.antlr.v4.runtime.tree.TerminalNode id : ctx.ID()) {
            ids.add(id.getText());
        }
        return "enum {" + String.join(", ", ids) + "}";
    }

    @Override
    public String visitBoolType(SynlongParser.BoolTypeContext ctx) {
        return "bool";
    }

    @Override
    public String visitIntType(SynlongParser.IntTypeContext ctx) {
        return "int";
    }

    @Override
    public String visitRealType(SynlongParser.RealTypeContext ctx) {
        return "real";
    }

    @Override
    public String visitVarType(SynlongParser.VarTypeContext ctx) {
        return ctx.typevar().ID().getText();
    }

    @Override
    public String visitStructType(SynlongParser.StructTypeContext ctx) {
        List<String> fields = new ArrayList<>();
        for (SynlongParser.Field_declContext f : ctx.field_decl()) {
            String fieldType = visit(f.type_expr());
            fields.add(f.ID().getText() + ": " + fieldType);
        }
        return "struct {" + String.join("; ", fields) + "}";
    }

    @Override
    public String visitArrayType(SynlongParser.ArrayTypeContext ctx) {
        // 从 type^size 改为 type[size]
        String typeExpr = visit(ctx.type_expr());
        String sizeExpr = ctx.INTEGER().getText();
        return typeExpr + "[" + sizeExpr + "]";
    }

    @Override
    public String visitConst_block(SynlongParser.Const_blockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (SynlongParser.Const_declContext constDecl : ctx.const_decl()) {
            String constDefStr = "const " + constDecl.ID().getText();
            if (constDecl.type_expr() != null) {
                String typeExpr = visit(constDecl.type_expr());
                constDefStr += " : " + typeExpr;
            }
            if (constDecl.const_expr() != null) {
                String constValue = visit(constDecl.const_expr());
                constDefStr += " = " + constValue;
            }
            constDefStr += ";";
            
            // 添加到全局常量定义收集器
            context.addGlobalConstDef(constDefStr);
            sb.append(constDefStr).append("\n");
        }
        return sb.toString();
    }

    /**
     * 转换科学计数法：将科学计数法转换为实际数值
     * @param value 字符串形式的数值
     * @param isFloat 是否为浮点数类型
     */
    private String convertScientificNotation(String value, boolean isFloat) {
        if (value == null)  {
            return null;
        }
        try {
            if (value.contains("E") || value.contains("e")) {
                String plainValue = new BigDecimal(value).toPlainString();
                // 没有小数点则需要补上.0
                if (!plainValue.contains(".") && isFloat) {
                    plainValue =  plainValue + ".0";
                }
                return plainValue;
            }
        } catch (NumberFormatException e) {
            // 如果解析失败，返回原值
            return value;
        }
        
        return value;
    }

    @Override
    public String visitUserOpDecl(SynlongParser.UserOpDeclContext ctx) {
        String kind = visit(ctx.op_kind());
        String name = ctx.ID().getText();
        String params = visit(ctx.params());
        String returns = visit(ctx.returns_clause());
        StringBuilder sb = new StringBuilder();
        sb.append(kind).append(" ").append(name)
          .append(params)
          .append(" ").append(returns).append(";\n");
        
        if (ctx.op_body() != null) {
            String opBodyContent = visit(ctx.op_body());
            sb.append(opBodyContent);
        }
        
        // 添加到全局节点定义收集器
        context.addGlobalNodeDef(sb.toString());
        
        return sb.toString();
    }

    @Override
    public String visitReturns_clause(SynlongParser.Returns_clauseContext ctx) {
        // 修复返回子句：处理last关键字
        StringBuilder sb = new StringBuilder("returns (");
        if (ctx.params() != null) {
            String params = visit(ctx.params());
            // 移除外层的括号
            if (params.startsWith("(") && params.endsWith(")")) {
                params = params.substring(1, params.length() - 1);
            }
            sb.append(params);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitImportedOpDecl(SynlongParser.ImportedOpDeclContext ctx) {
        String kind = visit(ctx.op_kind());
        String name = ctx.ID().getText();
        String params = visit(ctx.params());
        String returns = visit(ctx.returns_clause());
        return kind + " " + name + params + " " + returns + ";";
    }

    @Override
    public String visitNodeKind(SynlongParser.NodeKindContext ctx) {
        return "node";
    }

    @Override
    public String visitFunctionKind(SynlongParser.FunctionKindContext ctx) {
        return "function";
    }

    @Override
    public String visitParams(SynlongParser.ParamsContext ctx) {
        if (ctx.var_decls().isEmpty()) {
            return "()";
        }
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < ctx.var_decls().size(); i++) {
            sb.append(visit(ctx.var_decls(i)));
            if (i < ctx.var_decls().size() - 1) {
                sb.append("; ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitFullOpBody(SynlongParser.FullOpBodyContext ctx) {
        StringBuilder sb = new StringBuilder();
        
        // 1. 首先处理原始的local_block
        String originalLocalVars = "";
        if (ctx.local_block() != null) {
            originalLocalVars = visit(ctx.local_block());
        }
        
        // 2. 处理let_block
        String letBlockContent = visit(ctx.let_block());
        
        // 3. 生成完整的var块（包括状态机变量）
        StringBuilder varBlock = new StringBuilder();
        if (context.hasStateMachineVars()) {
            varBlock.append("var\n");
            
            // 3.1 添加状态变量
            if (!context.getAllStates().isEmpty()) {
                varBlock.append("\tstate : State;\n");
            }
            
            // 3.2 添加原始局部变量（去掉var关键字）
            if (!originalLocalVars.isEmpty()) {
                String[] lines = originalLocalVars.split("\n");
                for (String line : lines) {
                    if (!line.trim().isEmpty() && !line.trim().equals("var")) {
                        varBlock.append(line).append("\n");
                    }
                }
            }
            
            // 3.3 添加状态机局部变量
            String stateMachineVars = context.generateStateMachineLocalVars();
            if (!stateMachineVars.isEmpty()) {
                varBlock.append(stateMachineVars);
            }
        } else if (!originalLocalVars.isEmpty()) {
            // 如果没有状态机变量，直接使用原始局部变量
            varBlock.append(originalLocalVars);
        }
        
        // 4. 组合结果
        if (varBlock.length() > 0) {
            sb.append(varBlock);
        }
        sb.append(letBlockContent);
        
        return sb.toString();
    }

    @Override
    public String visitEmptyOpBody(SynlongParser.EmptyOpBodyContext ctx) {
        return ";";
    }

    @Override
    public String visitLocal_block(SynlongParser.Local_blockContext ctx) {
        StringBuilder sb = new StringBuilder("var\n");
        for (int i = 0; i < ctx.var_decls().size(); i++) {
            sb.append("\t").append(visit(ctx.var_decls(i))).append(";\n");
        }
        return sb.toString();
    }

    @Override
    public String visitVar_decls(SynlongParser.Var_declsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.var_id().size(); i++) {
            sb.append(ctx.var_id(i).getText());
            if (i < ctx.var_id().size() - 1) {
                sb.append(", ");
            }
        }
        String typeExpr = visit(ctx.type_expr());
        sb.append(" : ").append(typeExpr);
        return sb.toString();
    }

    @Override
    public String visitAssignment(SynlongParser.AssignmentContext ctx) {
        return visit(ctx.lhs()) + " = " + visit(ctx.expr());
    }

    @Override
    public String visitStateMachineReturn(SynlongParser.StateMachineReturnContext ctx) {
        return visit(ctx.state_machine()) + "\n" + visit(ctx.return_statement());
    }

    @Override
    public String visitLhsList(SynlongParser.LhsListContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.lhs_id().size(); i++) {
            sb.append(ctx.lhs_id(i).getText());
            if (i < ctx.lhs_id().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public String visitEmptyLhs(SynlongParser.EmptyLhsContext ctx) {
        return "";
    }

    // 修复常量表达式转换
    @Override
    public String visitConstId(SynlongParser.ConstIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitConstAtom(SynlongParser.ConstAtomContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public String visitConstUnaryOp(SynlongParser.ConstUnaryOpContext ctx) {
        return ctx.unary_arith_op().getText() + visit(ctx.const_expr());
    }

    @Override
    public String visitConstBinArithOp(SynlongParser.ConstBinArithOpContext ctx) {
        return visit(ctx.const_expr(0)) + " " + visit(ctx.bin_arith_op()) + " " + visit(ctx.const_expr(1));
    }

    @Override
    public String visitConstBinRelOp(SynlongParser.ConstBinRelOpContext ctx) {
        return visit(ctx.const_expr(0)) + " " + visit(ctx.bin_relation_op()) + " " + visit(ctx.const_expr(1));
    }

    @Override
    public String visitConstBinBoolOp(SynlongParser.ConstBinBoolOpContext ctx) {
        return visit(ctx.const_expr(0)) + " " + visit(ctx.bin_bool_op()) + " " + visit(ctx.const_expr(1));
    }

    @Override
    public String visitConstStruct(SynlongParser.ConstStructContext ctx) {
        List<String> items = new ArrayList<>();
        for (SynlongParser.Const_label_exprContext cle : ctx.const_label_expr()) {
            items.add(cle.ID().getText() + ": " + visit(cle.const_expr()));
        }
        return "{" + String.join("; ", items) + "}";
    }

    @Override
    public String visitConstArray(SynlongParser.ConstArrayContext ctx) {
        return "[" + visit(ctx.const_list()) + "]";
    }

    @Override
    public String visitSimpleExpr(SynlongParser.SimpleExprContext ctx) {
        // 调用内部的simple_expr()方法
        if (ctx.simple_expr() != null) {
            return visit(ctx.simple_expr());
        }
        return "";
    }

    @Override
    public String visitLastExpr(SynlongParser.LastExprContext ctx) {
        // 将 last 'x 转换为 pre(x)
        return "pre(" + ctx.ID().getText() + ")";
    }

    @Override
    public String visitTempoExpr(SynlongParser.TempoExprContext ctx) {
        return visit(ctx.tempo_expr());
    }

    @Override
    public String visitBoolExpr(SynlongParser.BoolExprContext ctx) {
        return visit(ctx.bool_expr());
    }

    @Override
    public String visitArrayExpr(SynlongParser.ArrayExprContext ctx) {
        return visit(ctx.array_expr());
    }

    @Override
    public String visitSwitchExpr(SynlongParser.SwitchExprContext ctx) {
        return visit(ctx.switch_expr());
    }

    @Override
    public String visitApplyExpr(SynlongParser.ApplyExprContext ctx) {
        return visit(ctx.apply_expr());
    }

    @Override
    public String visitReturn_statement(SynlongParser.Return_statementContext ctx) {
        // 在状态机中，return语句实际上是赋值语句
        if (ctx.returns_var() != null) {
            String returnVars = visit(ctx.returns_var());
            if (returnVars != null && !returnVars.trim().isEmpty()) {
                // 生成赋值语句，返回变量不需要前缀
                return "\t-- Return statement handled in state machine logic";
            }
        }
        return "";
    }

    @Override
    public String visitReturns_var(SynlongParser.Returns_varContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.ID().size(); i++) {
            sb.append(ctx.ID(i).getText());
            if (i < ctx.ID().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    // ================== 状态机转换 ==================
    @Override
    public String visitState_machine(SynlongParser.State_machineContext ctx) {
        // 使用收集到的状态信息生成状态机代码
        StringBuilder sb = new StringBuilder();
        
        // 1. 生成状态转移方程
        String initialState = context.getInitialState();
        if (initialState == null && !context.getAllStates().isEmpty()) {
            initialState = context.getAllStates().iterator().next();
            context.setInitialState(initialState);
        }
        
        if (initialState != null) {
            sb.append("state = if (pre(state) = ").append(initialState).append(") then ").append(initialState).append("\n");
            
            // 生成转换条件
            for (String stateName : context.getAllStates()) {
                List<String> transitions = context.getStateTransitions(stateName);
                for (String transition : transitions) {
                    // 解析转换字符串 "unless/until: condition -> target"
                    String[] parts = transition.split(" -> ");
                    if (parts.length == 2) {
                        String[] prefixParts = parts[0].split(": ");
                        if (prefixParts.length == 2) {
                            String type = prefixParts[0]; // unless 或 until
                            String condition = prefixParts[1];
                            String target = parts[1];
                            
                            sb.append("\telse if (pre(state) = ").append(stateName)
                              .append(" and ").append(condition).append(") then ").append(target).append("\n");
                        }
                    }
                }
            }
            
            sb.append("\telse pre(state);\n");
        }
        
        // 2. 生成状态局部变量的条件赋值（保持语义）
        String conditionalAssignments = context.generateStateMachineConditionalAssignments();
        if (!conditionalAssignments.isEmpty()) {
            sb.append("\n").append(conditionalAssignments);
        }
        
        return sb.toString();
    }

    @Override
    public String visitTransition(SynlongParser.TransitionContext ctx) {
        // 修复转换表达式：从 "if expr resume/restart ID" 转换为 "expr"
        String condition = visit(ctx.expr());
        // 提取条件表达式，去掉if关键字
        if (condition.startsWith("if ")) {
            condition = condition.substring(3);
        }
        // 去掉resume/restart部分，只保留条件
        if (condition.contains("resume") || condition.contains("restart")) {
            int resumeIndex = condition.indexOf("resume");
            int restartIndex = condition.indexOf("restart");
            int cutIndex = Math.max(resumeIndex, restartIndex);
            if (cutIndex > 0) {
                condition = condition.substring(0, cutIndex).trim();
            }
        }

        return condition;
    }

    // 处理原子表达式 - 修复数值转换
    @Override
    public String visitTrue(SynlongParser.TrueContext ctx) {
        return "true";
    }

    @Override
    public String visitFalse(SynlongParser.FalseContext ctx) {
        return "false";
    }

    @Override
    public String visitInteger(SynlongParser.IntegerContext ctx) {
        String value = ctx.INTEGER().getText();
        return convertScientificNotation(value, false);
    }

    @Override
    public String visitFloat(SynlongParser.FloatContext ctx) {
        String value = ctx.FLOAT().getText();
        return convertScientificNotation(value, true);
    }

    @Override
    public String visitChar(SynlongParser.CharContext ctx) {
        return ctx.CHAR().getText();
    }

    @Override
    public String visitReal(SynlongParser.RealContext ctx) {
        String value = ctx.REAL().getText();
        return convertScientificNotation(value, true);
    }

    @Override
    public String visitUInteger(SynlongParser.UIntegerContext ctx) {
        String value = ctx.UINT().getText();
        return convertScientificNotation(value, true);
    }

    @Override
    public String visitUShort(SynlongParser.UShortContext ctx) {
        return ctx.USHORT().getText();
    }

    @Override
    public String visitShort(SynlongParser.ShortContext ctx) {
        return ctx.SHORT().getText();
    }

    // 处理操作符
    @Override
    public String visitPlus(SynlongParser.PlusContext ctx) {
        return "+";
    }

    @Override
    public String visitMinus(SynlongParser.MinusContext ctx) {
        return "-";
    }

    @Override
    public String visitMul(SynlongParser.MulContext ctx) {
        return "*";
    }

    @Override
    public String visitDiv(SynlongParser.DivContext ctx) {
        return "/";
    }

    @Override
    public String visitEq(SynlongParser.EqContext ctx) {
        return "=";
    }

    @Override
    public String visitNe(SynlongParser.NeContext ctx) {
        return "<>";
    }

    @Override
    public String visitLt(SynlongParser.LtContext ctx) {
        return "<";
    }

    @Override
    public String visitGt(SynlongParser.GtContext ctx) {
        return ">";
    }

    @Override
    public String visitLe(SynlongParser.LeContext ctx) {
        return "<=";
    }

    @Override
    public String visitGe(SynlongParser.GeContext ctx) {
        return ">=";
    }

    @Override
    public String visitAnd(SynlongParser.AndContext ctx) {
        return "and";
    }

    @Override
    public String visitOr(SynlongParser.OrContext ctx) {
        return "or";
    }

    @Override
    public String visitNot(SynlongParser.NotContext ctx) {
        return "not";
    }



    // 处理数组访问和更新
    @Override
    public String visitArrayAccess(SynlongParser.ArrayAccessContext ctx) {
        String array = visit(ctx.simple_expr());
        String index = visit(ctx.const_expr());
        if (array != null && index != null) {
            return array + "[" + index + "]";
        }
        return "";
    }

    @Override
    public String visitStructAccess(SynlongParser.StructAccessContext ctx) {
        String struct = visit(ctx.simple_expr());
        String field = ctx.ID().getText();
        if (struct != null) {
            return struct + "." + field;
        }
        return "";
    }

    // 处理条件表达式
    @Override
    public String visitIfThenElse(SynlongParser.IfThenElseContext ctx) {
        String condition = visit(ctx.simple_expr(0));
        String thenExpr = visit(ctx.simple_expr(1));
        String elseExpr = visit(ctx.simple_expr(2));
        
        if (condition != null && thenExpr != null && elseExpr != null) {
            return "if " + condition + " then " + thenExpr + " else " + elseExpr;
        }
        return "";
    }

    // 处理函数调用
    @Override
    public String visitSimpleApply(SynlongParser.SimpleApplyContext ctx) {
        StringBuilder sb = new StringBuilder();
        // SimpleApplyContext没有直接的ID方法，需要从prefix_operator获取
        if (ctx.prefix_operator() != null) {
            String prefixOp = visit(ctx.prefix_operator());
            if (prefixOp == null) {
                prefixOp = "";
            }
            // 处理 (make type) 语法
            if (prefixOp.contains("make")) {
                // 提取类型名
                String typeName = prefixOp.replaceAll(".*make\\s+(\\w+).*", "$1");
                sb.append(typeName);
            } else if (prefixOp.contains("flatten")) {
                // 处理 (flatten type) 语法
                String typeName = prefixOp.replaceAll(".*flatten\\s+(\\w+).*", "$1");
                sb.append(typeName);
            } else {
                sb.append(prefixOp);
            }
        }
        sb.append("(");
        if (ctx.list() != null) {
            String args = visit(ctx.list());
            if (args != null && !args.trim().isEmpty()) {
                sb.append(args);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String visitMakeOp(SynlongParser.MakeOpContext ctx) {
        // 处理 (make type) 语法，转换为 make_type 函数调用
        String typeName = ctx.ID().getText();
        context.addStructType(typeName); // 记录需要生成构造函数的类型
        return "make_" + typeName;
    }
    
    @Override
    public String visitFlattenOp(SynlongParser.FlattenOpContext ctx) {
        // 处理 (flatten type) 语法，转换为 flatten_type 函数调用
        String typeName = ctx.ID().getText();
        context.addFlattenType(typeName); // 记录需要生成flatten函数的类型
        return "flatten_" + typeName;
    }

    // 处理混合构造函数
    @Override
    public String visitMixedConstructor(SynlongParser.MixedConstructorContext ctx) {
        // 处理 (make type)(value, status) 语法
        if (ctx.getText().contains("make")) {
            // 提取类型和值
            String text = ctx.getText();
            if (text.contains("(") && text.contains(")")) {
                int start = text.indexOf("(");
                int end = text.lastIndexOf(")");
                if (start != -1 && end != -1) {
                    String inner = text.substring(start + 1, end);
                    String[] parts = inner.split(",");
                    if (parts.length == 2) {
                        return "{" + parts[0].trim() + ", " + parts[1].trim() + "}";
                    }
                }
            }
        }
        return ctx.getText();
    }

    // 处理状态机体
    @Override
    public String visitStateBodyWithLocal(SynlongParser.StateBodyWithLocalContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.local_block() != null) {
            sb.append(visit(ctx.local_block()));
        }
        if (ctx.let_block() != null) {
            sb.append(visit(ctx.let_block()));
        }
        return sb.toString();
    }

    @Override
    public String visitStateBodyLocalOnly(SynlongParser.StateBodyLocalOnlyContext ctx) {
        return visit(ctx.local_block());
    }

    @Override
    public String visitStateBodyLetOnly(SynlongParser.StateBodyLetOnlyContext ctx) {
        return visit(ctx.let_block());
    }

    @Override
    public String visitStateBodySingleEq(SynlongParser.StateBodySingleEqContext ctx) {
        return visit(ctx.equation());
    }

    @Override
    public String visitLet_block(SynlongParser.Let_blockContext ctx) {
        StringBuilder sb = new StringBuilder("let\n");
        // 把子表达式的LET (equation | property | assertion | main | realizabilityInputs | ivc)* TEL都拼上
        for (ParseTree child : ctx.children) {
            String childString = visit(child);
            if (childString != null && !childString.trim().isEmpty()) {
                sb.append("\t").append(childString).append(";\n");
            }
        }
        sb.append("tel\n");
        return sb.toString();
    }

    // 处理参数列表
    @Override
    public String visitList(SynlongParser.ListContext ctx) {
        if (ctx.simple_expr().isEmpty()) {
            return "";
        }
        
        List<String> args = new ArrayList<>();
        for (SynlongParser.Simple_exprContext expr : ctx.simple_expr()) {
            String arg = visit(expr);
            if (arg != null && !arg.trim().isEmpty()) {
                args.add(arg);
            }
        }
        
        return String.join(", ", args);
    }

    // 添加缺失的访问方法
    @Override
    public String visitSimpleId(SynlongParser.SimpleIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitSimpleAtom(SynlongParser.SimpleAtomContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public String visitUnaryOp(SynlongParser.UnaryOpContext ctx) {
        String op = visit(ctx.unary_arith_op());
        String expr = visit(ctx.simple_expr());
        if (op != null && expr != null) {
            return op + " " + expr;
        }
        return "";
    }

    @Override
    public String visitBinArithOp(SynlongParser.BinArithOpContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String op = visit(ctx.bin_arith_op());
        String right = visit(ctx.simple_expr(1));
        if (left != null && op != null && right != null) {
            return left + " " + op + " " + right;
        }
        return "";
    }

    @Override
    public String visitBinBoolOp(SynlongParser.BinBoolOpContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String op = visit(ctx.bin_bool_op());
        String right = visit(ctx.simple_expr(1));
        if (left != null && op != null && right != null) {
            return left + " " + op + " " + right;
        }
        return "";
    }

    @Override
    public String visitBinRelOp(SynlongParser.BinRelOpContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String op = visit(ctx.bin_relation_op());
        String right = visit(ctx.simple_expr(1));
        if (left != null && op != null && right != null) {
            return left + " " + op + " " + right;
        }
        return "";
    }

    @Override
    public String visitTypeCast(SynlongParser.TypeCastContext ctx) {
        String type = visit(ctx.type_expr());
        String expr = visit(ctx.simple_expr());
        if (type != null && expr != null) {
            return "(" + type + ") " + expr;
        }
        return "";
    }

    @Override
    public String visitSimpleIdWithParens(SynlongParser.SimpleIdWithParensContext ctx) {
        return ctx.ID().getText();
    }


    @Override
    public String visitPreExpr(SynlongParser.PreExprContext ctx) {
        String expr = visit(ctx.simple_expr());
        if (expr != null) {
            return "pre(" + expr + ")";
        }
        return "";
    }

    @Override
    public String visitArrowExpr(SynlongParser.ArrowExprContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String right = visit(ctx.simple_expr(1));
        if (left != null && right != null) {
            return left + " -> " + right;
        }
        return "";
    }

    @Override
    public String visitFbyExpr(SynlongParser.FbyExprContext ctx) {
        String init = visit(ctx.simple_expr(0));
        String delay = visit(ctx.const_expr());
        String expr = visit(ctx.simple_expr(1));
        if (init != null && delay != null && expr != null) {
            return "fby(" + init + "; " + delay + "; " + expr + ")";
        }
        return "";
    }

    @Override
    public String visitFbySimpleExpr(SynlongParser.FbySimpleExprContext ctx) {
        String left = visit(ctx.simple_expr(0));
        String right = visit(ctx.simple_expr(1));
        if (left != null && right != null) {
            return left + " fby " + right;
        }
        return "";
    }

    @Override
    public String visitWhenExpr(SynlongParser.WhenExprContext ctx) {
        String expr = visit(ctx.simple_expr());
        String clock = visit(ctx.clock_expr());
        if (expr != null && clock != null) {
            return expr + " when " + clock;
        }
        return "";
    }

    @Override
    public String visitMergeExpr(SynlongParser.MergeExprContext ctx) {
        String clock = ctx.ID().getText();
        String trueExpr = visit(ctx.simple_expr(0));
        String falseExpr = visit(ctx.simple_expr(1));
        if (trueExpr != null && falseExpr != null) {
            return "merge " + clock + "(" + trueExpr + ", " + falseExpr + ")";
        }
        return "";
    }

    @Override
    public String visitArraySlice(SynlongParser.ArraySliceContext ctx) {
        String array = visit(ctx.simple_expr());
        String start = ctx.INTEGER(0).getText();
        String end = ctx.INTEGER(1).getText();
        if (array != null) {
            return array + "[" + start + ".." + end + "]";
        }
        return "";
    }

//    @Override
//    public String visitArrayDefault(SynlongParser.ArrayDefaultContext ctx) {
//        String array = visit(ctx.simple_expr());
//        String defaultValue = visit(ctx.simple_expr(1));
//        if (array != null && defaultValue != null) {
//            return "(" + array + ".index default " + defaultValue + ")";
//        }
//        return "";
//    }

    @Override
    public String visitArrayRepeat(SynlongParser.ArrayRepeatContext ctx) {
        String array = visit(ctx.simple_expr());
        String count = visit(ctx.const_expr());
        if (array != null && count != null) {
            return array + "^" + count;
        }
        return "";
    }

    @Override
    public String visitArrayConstructor(SynlongParser.ArrayConstructorContext ctx) {
        String list = visit(ctx.list());
        if (list != null) {
            return "[" + list + "]";
        }
        return "[]";
    }

    @Override
    public String visitLabel_expr(SynlongParser.Label_exprContext ctx) {
        String label = ctx.ID().getText();
        String value = visit(ctx.simple_expr());
        if (label != null && value != null) {
            return label + ": " + value;
        }
        return "";
    }

    @Override
    public String visitCaseOf(SynlongParser.CaseOfContext ctx) {
        String expr = visit(ctx.simple_expr());
        StringBuilder sb = new StringBuilder();
        for (SynlongParser.Case_exprContext caseExpr : ctx.case_expr()) {
            String caseItem = getChildCase(caseExpr, expr);
            if (caseItem != null && !caseItem.trim().isEmpty()) {
                sb.append(caseItem);
            }
        }
        return sb.toString();
    }

    /**
     * 获取子case表达式
     */
    public String getChildCase(SynlongParser.Case_exprContext ctx, String matchExpr) {
        String pattern = visit(ctx.pattern());
        String expr = visit(ctx.simple_expr());
        // switch的default语句
        if ("_".equals(pattern)) {
            return expr;
        }
        // 常规的case语句
        if (pattern != null && expr != null) {
            return "if " + matchExpr + " = " + pattern + " then " + expr + " else ";
        }
        return "";
    }

    @Override
    public String visitPatternId(SynlongParser.PatternIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitPatternChar(SynlongParser.PatternCharContext ctx) {
        return ctx.CHAR().getText();
    }

    @Override
    public String visitPatternInt(SynlongParser.PatternIntContext ctx) {
        return ctx.INTEGER().getText();
    }

    @Override
    public String visitPatternTrue(SynlongParser.PatternTrueContext ctx) {
        return "true";
    }

    @Override
    public String visitPatternFalse(SynlongParser.PatternFalseContext ctx) {
        return "false";
    }

    @Override
    public String visitPatternWildcard(SynlongParser.PatternWildcardContext ctx) {
        return "_";
    }

    @Override
    public String visitIteratorApply(SynlongParser.IteratorApplyContext ctx) {
        String iterator = visit(ctx.iterator());
        String op = visit(ctx.prefix_operator());
        String count = visit(ctx.const_expr());
        String list = visit(ctx.list());
        if (iterator != null && op != null && count != null && list != null) {
            return "(" + iterator + " << " + op + "; " + count + " >>)(" + list + ")";
        }
        return "";
    }

    @Override
    public String visitFoldwApply(SynlongParser.FoldwApplyContext ctx) {
        String op = visit(ctx.prefix_operator());
        String count = visit(ctx.const_expr());
        String condition = visit(ctx.simple_expr());
        String list = visit(ctx.list());
        if (op != null && count != null && condition != null && list != null) {
            return "(foldw << " + op + "; " + count + " >> if " + condition + ")(" + list + ")";
        }
        return "";
    }

    @Override
    public String visitFoldwiApply(SynlongParser.FoldwiApplyContext ctx) {
        String op = visit(ctx.prefix_operator());
        String count = visit(ctx.const_expr());
        String condition = visit(ctx.simple_expr());
        String list = visit(ctx.list());
        if (op != null && count != null && condition != null && list != null) {
            return "(foldwi << " + op + "; " + count + " >> if " + condition + ")(" + list + ")";
        }
        return "";
    }

    @Override
    public String visitPrefixId(SynlongParser.PrefixIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitPrefixUnaryOp(SynlongParser.PrefixUnaryOpContext ctx) {
        return ctx.prefix_unary_operator().getText();
    }

    @Override
    public String visitPrefixBinaryOp(SynlongParser.PrefixBinaryOpContext ctx) {
        return ctx.prefix_binary_operator().getText();
    }


    @Override
    public String visitMap(SynlongParser.MapContext ctx) {
        return "map";
    }

    @Override
    public String visitFold(SynlongParser.FoldContext ctx) {
        return "fold";
    }

    @Override
    public String visitMapi(SynlongParser.MapiContext ctx) {
        return "mapi";
    }

    @Override
    public String visitFoldi(SynlongParser.FoldiContext ctx) {
        return "foldi";
    }

    @Override
    public String visitMapfold(SynlongParser.MapfoldContext ctx) {
        return "mapfold";
    }

    @Override
    public String visitClockId(SynlongParser.ClockIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitNotClock(SynlongParser.NotClockContext ctx) {
        return "not " + ctx.ID().getText();
    }

    @Override
    public String visitProperty(SynlongParser.PropertyContext ctx) {
        return "--%PROPERTY " + ctx.ID().getText();
    }

    @Override
    public String visitRealizabilityInputs(SynlongParser.RealizabilityInputsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIvc(SynlongParser.IvcContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMain(SynlongParser.MainContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAssertion(SynlongParser.AssertionContext ctx) {
        return ctx.getText();
    }

    // ================== 添加缺失的类型转换方法 ==================
    @Override
    public String visitLongType(SynlongParser.LongTypeContext ctx) {
        return "int"; // Lustre中long类型映射为int
    }

    @Override
    public String visitULongType(SynlongParser.ULongTypeContext ctx) {
        return "int"; // Lustre中无符号long类型映射为int
    }

    @Override
    public String visitShortType(SynlongParser.ShortTypeContext ctx) {
        return "int"; // Lustre中short类型映射为int
    }

    @Override
    public String visitByteType(SynlongParser.ByteTypeContext ctx) {
        return "int"; // Lustre中byte类型映射为int
    }

    @Override
    public String visitUByteType(SynlongParser.UByteTypeContext ctx) {
        return "int"; // Lustre中无符号byte类型映射为int
    }

    @Override
    public String visitUIntType(SynlongParser.UIntTypeContext ctx) {
        return "int"; // Lustre中无符号int类型映射为int
    }

    @Override
    public String visitFloatType(SynlongParser.FloatTypeContext ctx) {
        return "real"; // Lustre中float类型映射为real
    }

    @Override
    public String visitCharType(SynlongParser.CharTypeContext ctx) {
        return "int"; // Lustre中char类型映射为int
    }

    @Override
    public String visitUShortType(SynlongParser.UShortTypeContext ctx) {
        return "int"; // Lustre中无符号short类型映射为int
    }

    @Override
    public String visitField_decl(SynlongParser.Field_declContext ctx) {
        String fieldName = ctx.ID().getText();
        String fieldType = visit(ctx.type_expr());
        return fieldName + ": " + fieldType;
    }

    @Override
    public String visitTypevar(SynlongParser.TypevarContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitConst_decl(SynlongParser.Const_declContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.ID().getText());
        if (ctx.type_expr() != null) {
            String typeExpr = visit(ctx.type_expr());
            sb.append(" : ").append(typeExpr);
        }
        if (ctx.const_expr() != null) {
            String constValue = visit(ctx.const_expr());
            sb.append(" = ").append(constValue);
        }
        return sb.toString();
    }

    @Override
    public String visitConst_list(SynlongParser.Const_listContext ctx) {
        if (ctx.const_expr().isEmpty()) {
            return "";
        }
        List<String> items = new ArrayList<>();
        for (SynlongParser.Const_exprContext ce : ctx.const_expr()) {
            String item = visit(ce);
            items.add(item);
        }
        return String.join(", ", items);
    }

    @Override
    public String visitConst_label_expr(SynlongParser.Const_label_exprContext ctx) {
        String label = ctx.ID().getText();
        String value = visit(ctx.const_expr());
        return label + ": " + value;
    }

    @Override
    public String visitVar_id(SynlongParser.Var_idContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitWhen_decl(SynlongParser.When_declContext ctx) {
        if (ctx.clock_expr() != null) {
            return " when " + visit(ctx.clock_expr());
        }
        return "";
    }

    @Override
    public String visitLast_decl(SynlongParser.Last_declContext ctx) {
        if (ctx.const_expr() != null) {
            return " last = " + visit(ctx.const_expr());
        }
        return "";
    }

    @Override
    public String visitLhs_id(SynlongParser.Lhs_idContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitState_decl(SynlongParser.State_declContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.getText().contains("initial")) {
            sb.append("initial ");
        }
        if (ctx.getText().contains("final")) {
            sb.append("final ");
        }
        sb.append("state ").append(ctx.ID().getText());
        return sb.toString();
    }

    // ================== 添加缺失的表达式处理方法 ==================
    @Override
    public String visitStructExpr(SynlongParser.StructExprContext ctx) {
        if (ctx.struct_expr() != null) {
            return visit(ctx.struct_expr());
        }
        return "{}";
    }

    @Override
    public String visitMixed_constructor(SynlongParser.Mixed_constructorContext ctx) {
        // 处理 (type with .field = value) 语法
        String typeName = ctx.ID().getText();
        List<String> updates = new ArrayList<>();
        for (SynlongParser.Label_or_indexContext loi : ctx.label_or_index()) {
            String update = visit(loi);
            if (update != null && !update.trim().isEmpty()) {
                updates.add(update);
            }
        }
        if (ctx.simple_expr() != null) {
            String value = visit(ctx.simple_expr());
            if (!updates.isEmpty()) {
                return "(" + typeName + " with " + String.join(", ", updates) + " = " + value + ")";
            }
        }
        return typeName;
    }

    @Override
    public String visitLabel(SynlongParser.LabelContext ctx) {
        return "." + ctx.ID().getText();
    }

    @Override
    public String visitIndexItem(SynlongParser.IndexItemContext ctx) {
        return visit(ctx.index());
    }

    @Override
    public String visitIndex(SynlongParser.IndexContext ctx) {
        if (ctx.simple_expr() != null) {
            return "[" + visit(ctx.simple_expr()) + "]";
        }
        return "[]";
    }

    @Override
    public String visitBool_expr(SynlongParser.Bool_exprContext ctx) {
        if (ctx.list() != null) {
            String list = visit(ctx.list());
            return "#(" + list + ")";
        }
        return "#()";
    }

    // ================== 添加缺失的操作符处理方法 ==================
    @Override
    public String visitAdd(SynlongParser.AddContext ctx) {
        return "+";
    }

    @Override
    public String visitSub(SynlongParser.SubContext ctx) {
        return "-";
    }

    @Override
    public String visitMod(SynlongParser.ModContext ctx) {
        return "mod";
    }

    @Override
    public String visitDivInt(SynlongParser.DivIntContext ctx) {
        return "div";
    }

    @Override
    public String visitXor(SynlongParser.XorContext ctx) {
        return "xor";
    }

    // ================== 添加缺失的迭代器应用方法 ==================
    @Override
    public String visitMapwApply(SynlongParser.MapwApplyContext ctx) {
        String op = visit(ctx.prefix_operator());
        String count = visit(ctx.const_expr());
        String condition = visit(ctx.simple_expr());
        String defaultList = visit(ctx.list(0));
        String inputList = visit(ctx.list(1));
        return "(mapw << " + op + "; " + count + " >> if " + condition + " default " + defaultList + ")(" + inputList + ")";
    }

    @Override
    public String visitMapwiApply(SynlongParser.MapwiApplyContext ctx) {
        String op = visit(ctx.prefix_operator());
        String count = visit(ctx.const_expr());
        String condition = visit(ctx.simple_expr());
        String defaultList = visit(ctx.list(0));
        String inputList = visit(ctx.list(1));
        return "(mapwi << " + op + "; " + count + " >> if " + condition + " default " + defaultList + ")(" + inputList + ")";
    }

    // ================== 添加缺失的前缀操作符方法 ==================
    @Override
    public String visitPlusDollar(SynlongParser.PlusDollarContext ctx) {
        return "+$";
    }

    @Override
    public String visitMinusDollar(SynlongParser.MinusDollarContext ctx) {
        return "-$";
    }

    @Override
    public String visitNotDollar(SynlongParser.NotDollarContext ctx) {
        return "not$";
    }

    @Override
    public String visitShortDollar(SynlongParser.ShortDollarContext ctx) {
        return "short$";
    }

    @Override
    public String visitIntDollar(SynlongParser.IntDollarContext ctx) {
        return "int$";
    }

    @Override
    public String visitFloatDollar(SynlongParser.FloatDollarContext ctx) {
        return "float$";
    }

    @Override
    public String visitRealDollar(SynlongParser.RealDollarContext ctx) {
        return "real$";
    }

    @Override
    public String visitPlusOp(SynlongParser.PlusOpContext ctx) {
        return "$+$";
    }

    @Override
    public String visitMinusOp(SynlongParser.MinusOpContext ctx) {
        return "$-$";
    }

    @Override
    public String visitMulOp(SynlongParser.MulOpContext ctx) {
        return "$*$";
    }

    @Override
    public String visitDivOp(SynlongParser.DivOpContext ctx) {
        return "$/$";
    }

    @Override
    public String visitModOp(SynlongParser.ModOpContext ctx) {
        return "$mod$";
    }

    @Override
    public String visitDivIntOp(SynlongParser.DivIntOpContext ctx) {
        return "$div$";
    }

    @Override
    public String visitEqOp(SynlongParser.EqOpContext ctx) {
        return "$=$";
    }

    @Override
    public String visitNeOp(SynlongParser.NeOpContext ctx) {
        return "$<>$";
    }

    @Override
    public String visitLtOp(SynlongParser.LtOpContext ctx) {
        return "$<$";
    }

    @Override
    public String visitGtOp(SynlongParser.GtOpContext ctx) {
        return "$>$";
    }

    @Override
    public String visitLeOp(SynlongParser.LeOpContext ctx) {
        return "$<=$";
    }

    @Override
    public String visitGeOp(SynlongParser.GeOpContext ctx) {
        return "$>=$";
    }

    @Override
    public String visitAndOp(SynlongParser.AndOpContext ctx) {
        return "$and$";
    }

    @Override
    public String visitOrOp(SynlongParser.OrOpContext ctx) {
        return "$or$";
    }

    @Override
    public String visitXorOp(SynlongParser.XorOpContext ctx) {
        return "$xor$";
    }

    // ================== 添加缺失的声明处理方法 ==================
    @Override
    public String visitTypeDeclaration(SynlongParser.TypeDeclarationContext ctx) {
        return visit(ctx.type_block());
    }

    @Override
    public String visitConstDeclaration(SynlongParser.ConstDeclarationContext ctx) {
        return visit(ctx.const_block());
    }

    @Override
    public String visitUserOpDeclaration(SynlongParser.UserOpDeclarationContext ctx) {
        return visit(ctx.user_op_decl());
    }

    @Override
    public String visitType_decl(SynlongParser.Type_declContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.ID().getText());
        if (ctx.type_def() != null) {
            String typeDef = visit(ctx.type_def());
            sb.append(" = ").append(typeDef);
        }
        return sb.toString();
    }
}
