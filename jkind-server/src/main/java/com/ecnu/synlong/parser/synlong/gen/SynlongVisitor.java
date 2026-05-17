// Generated from jkind-server/src/main/java/com/ecnu/synlong/parser/synlong/Synlong.g4 by ANTLR 4.13.2
package com.ecnu.synlong.parser.synlong.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SynlongParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SynlongVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(SynlongParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(SynlongParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UserOpDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOpDeclaration(SynlongParser.UserOpDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#type_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_block(SynlongParser.Type_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(SynlongParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeExprDef}
	 * labeled alternative in {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExprDef(SynlongParser.TypeExprDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDef(SynlongParser.EnumDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(SynlongParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongType(SynlongParser.LongTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(SynlongParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ULongType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitULongType(SynlongParser.ULongTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortType(SynlongParser.ShortTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteType(SynlongParser.ByteTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealType(SynlongParser.RealTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(SynlongParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(SynlongParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(SynlongParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SynlongParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UShortType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUShortType(SynlongParser.UShortTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UByteType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUByteType(SynlongParser.UByteTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(SynlongParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UIntType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUIntType(SynlongParser.UIntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(SynlongParser.Field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_block(SynlongParser.Const_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(SynlongParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstId}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstId(SynlongParser.ConstIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstUnaryOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstUnaryOp(SynlongParser.ConstUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstBinArithOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBinArithOp(SynlongParser.ConstBinArithOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstStruct}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStruct(SynlongParser.ConstStructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstArray}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstArray(SynlongParser.ConstArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstAtom}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstAtom(SynlongParser.ConstAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstBinRelOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBinRelOp(SynlongParser.ConstBinRelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstBinBoolOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBinBoolOp(SynlongParser.ConstBinBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_list(SynlongParser.Const_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#const_label_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_label_expr(SynlongParser.Const_label_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UserOpDecl}
	 * labeled alternative in {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOpDecl(SynlongParser.UserOpDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportedOpDecl}
	 * labeled alternative in {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportedOpDecl(SynlongParser.ImportedOpDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionKind}
	 * labeled alternative in {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionKind(SynlongParser.FunctionKindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeKind}
	 * labeled alternative in {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeKind(SynlongParser.NodeKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SynlongParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#returns_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturns_clause(SynlongParser.Returns_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyOpBody}
	 * labeled alternative in {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyOpBody(SynlongParser.EmptyOpBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullOpBody}
	 * labeled alternative in {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullOpBody(SynlongParser.FullOpBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#local_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_block(SynlongParser.Local_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#var_decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decls(SynlongParser.Var_declsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#var_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_id(SynlongParser.Var_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#when_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_decl(SynlongParser.When_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClockId}
	 * labeled alternative in {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockId(SynlongParser.ClockIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotClock}
	 * labeled alternative in {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotClock(SynlongParser.NotClockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#last_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_decl(SynlongParser.Last_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SynlongParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateMachineReturn}
	 * labeled alternative in {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMachineReturn(SynlongParser.StateMachineReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyLhs}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyLhs(SynlongParser.EmptyLhsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LhsList}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsList(SynlongParser.LhsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#lhs_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs_id(SynlongParser.Lhs_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(SynlongParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#returns_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturns_var(SynlongParser.Returns_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#state_machine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_machine(SynlongParser.State_machineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#state_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_decl(SynlongParser.State_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateBodyWithLocal}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBodyWithLocal(SynlongParser.StateBodyWithLocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateBodyLocalOnly}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBodyLocalOnly(SynlongParser.StateBodyLocalOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateBodyLetOnly}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBodyLetOnly(SynlongParser.StateBodyLetOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateBodySingleEq}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBodySingleEq(SynlongParser.StateBodySingleEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#let_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_block(SynlongParser.Let_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(SynlongParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LastExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastExpr(SynlongParser.LastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TempoExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempoExpr(SynlongParser.TempoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(SynlongParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(SynlongParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructExpr(SynlongParser.StructExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MixedConstructor}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixedConstructor(SynlongParser.MixedConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpr(SynlongParser.SwitchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApplyExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyExpr(SynlongParser.ApplyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleId}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleId(SynlongParser.SimpleIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructAccess}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructAccess(SynlongParser.StructAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(SynlongParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(SynlongParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleAtom}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAtom(SynlongParser.SimpleAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleIdWithParens}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdWithParens(SynlongParser.SimpleIdWithParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinRelOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinRelOp(SynlongParser.BinRelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCast}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(SynlongParser.TypeCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinArithOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinArithOp(SynlongParser.BinArithOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinBoolOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinBoolOp(SynlongParser.BinBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreExpr(SynlongParser.PreExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowExpr(SynlongParser.ArrowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FbyExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbyExpr(SynlongParser.FbyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FbySimpleExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbySimpleExpr(SynlongParser.FbySimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhenExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpr(SynlongParser.WhenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MergeExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeExpr(SynlongParser.MergeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(SynlongParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArraySlice}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySlice(SynlongParser.ArraySliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDefault}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefault(SynlongParser.ArrayDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayRepeat}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRepeat(SynlongParser.ArrayRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayConstructor}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConstructor(SynlongParser.ArrayConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#struct_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_expr(SynlongParser.Struct_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#label_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_expr(SynlongParser.Label_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#mixed_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_constructor(SynlongParser.Mixed_constructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SynlongParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexItem}
	 * labeled alternative in {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexItem(SynlongParser.IndexItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(SynlongParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfThenElse}
	 * labeled alternative in {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(SynlongParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseOf}
	 * labeled alternative in {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseOf(SynlongParser.CaseOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(SynlongParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternId}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternId(SynlongParser.PatternIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternChar}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternChar(SynlongParser.PatternCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternInt}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternInt(SynlongParser.PatternIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternTrue}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternTrue(SynlongParser.PatternTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternFalse}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternFalse(SynlongParser.PatternFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternWildcard}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternWildcard(SynlongParser.PatternWildcardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleApply(SynlongParser.SimpleApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IteratorApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorApply(SynlongParser.IteratorApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapwApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapwApply(SynlongParser.MapwApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapwiApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapwiApply(SynlongParser.MapwiApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FoldwApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoldwApply(SynlongParser.FoldwApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FoldwiApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoldwiApply(SynlongParser.FoldwiApplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#iterator_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterator_header(SynlongParser.Iterator_headerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IteratorPrefixOperator}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteratorPrefixOperator(SynlongParser.IteratorPrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOfficialOp(SynlongParser.PlusOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOfficialOp(SynlongParser.MinusOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOfficialOp(SynlongParser.MulOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOfficialOp(SynlongParser.DivOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOfficialOp(SynlongParser.ModOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivIntOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivIntOfficialOp(SynlongParser.DivIntOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOfficialOp(SynlongParser.EqOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeOfficialOp(SynlongParser.NeOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOfficialOp(SynlongParser.LtOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtOfficialOp(SynlongParser.GtOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeOfficialOp(SynlongParser.LeOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeOfficialOp(SynlongParser.GeOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOfficialOp(SynlongParser.AndOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOfficialOp(SynlongParser.OrOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorOfficialOp}
	 * labeled alternative in {@link SynlongParser#iterator_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorOfficialOp(SynlongParser.XorOfficialOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#iterator_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterator_arg_list(SynlongParser.Iterator_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixId}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixId(SynlongParser.PrefixIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixUnaryOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOp(SynlongParser.PrefixUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixBinaryOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixBinaryOp(SynlongParser.PrefixBinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MakeOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeOp(SynlongParser.MakeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlattenOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlattenOp(SynlongParser.FlattenOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusDollar(SynlongParser.PlusDollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusDollar(SynlongParser.MinusDollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotDollar(SynlongParser.NotDollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShortDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortDollar(SynlongParser.ShortDollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDollar(SynlongParser.IntDollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDollar(SynlongParser.FloatDollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealDollar(SynlongParser.RealDollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOp(SynlongParser.PlusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOp(SynlongParser.MinusOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(SynlongParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOp(SynlongParser.DivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModOp(SynlongParser.ModOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivIntOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivIntOp(SynlongParser.DivIntOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(SynlongParser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeOp(SynlongParser.NeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOp(SynlongParser.LtOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtOp(SynlongParser.GtOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeOp(SynlongParser.LeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeOp(SynlongParser.GeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOp(SynlongParser.AndOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOp(SynlongParser.OrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorOp(SynlongParser.XorOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Map}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(SynlongParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fold}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold(SynlongParser.FoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mapi}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapi(SynlongParser.MapiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Foldi}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoldi(SynlongParser.FoldiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mapfold}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapfold(SynlongParser.MapfoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SynlongParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(SynlongParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(SynlongParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(SynlongParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(SynlongParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(SynlongParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(SynlongParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(SynlongParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(SynlongParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivInt}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivInt(SynlongParser.DivIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(SynlongParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe(SynlongParser.NeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(SynlongParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(SynlongParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Le}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(SynlongParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(SynlongParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(SynlongParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(SynlongParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(SynlongParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(SynlongParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(SynlongParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(SynlongParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SynlongParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UInteger}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUInteger(SynlongParser.UIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(SynlongParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(SynlongParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UShort}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUShort(SynlongParser.UShortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Short}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(SynlongParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(SynlongParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#realizabilityInputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealizabilityInputs(SynlongParser.RealizabilityInputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#ivc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIvc(SynlongParser.IvcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SynlongParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynlongParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(SynlongParser.AssertionContext ctx);
}