// Generated from Synlong.g4 by ANTLR 4.13.2
package com.ecnu.synlong.parser.synlong.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SynlongParser}.
 */
public interface SynlongListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SynlongParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(SynlongParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(SynlongParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(SynlongParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(SynlongParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UserOpDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterUserOpDeclaration(SynlongParser.UserOpDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UserOpDeclaration}
	 * labeled alternative in {@link SynlongParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitUserOpDeclaration(SynlongParser.UserOpDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#type_block}.
	 * @param ctx the parse tree
	 */
	void enterType_block(SynlongParser.Type_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#type_block}.
	 * @param ctx the parse tree
	 */
	void exitType_block(SynlongParser.Type_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(SynlongParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(SynlongParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeExprDef}
	 * labeled alternative in {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterTypeExprDef(SynlongParser.TypeExprDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeExprDef}
	 * labeled alternative in {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitTypeExprDef(SynlongParser.TypeExprDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(SynlongParser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDef}
	 * labeled alternative in {@link SynlongParser#type_def}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(SynlongParser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(SynlongParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(SynlongParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterLongType(SynlongParser.LongTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LongType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitLongType(SynlongParser.LongTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterStructType(SynlongParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitStructType(SynlongParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ULongType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterULongType(SynlongParser.ULongTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ULongType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitULongType(SynlongParser.ULongTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterShortType(SynlongParser.ShortTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitShortType(SynlongParser.ShortTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterByteType(SynlongParser.ByteTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ByteType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitByteType(SynlongParser.ByteTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterRealType(SynlongParser.RealTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitRealType(SynlongParser.RealTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterVarType(SynlongParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitVarType(SynlongParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterIntType(SynlongParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitIntType(SynlongParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(SynlongParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(SynlongParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SynlongParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SynlongParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UShortType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterUShortType(SynlongParser.UShortTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UShortType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitUShortType(SynlongParser.UShortTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UByteType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterUByteType(SynlongParser.UByteTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UByteType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitUByteType(SynlongParser.UByteTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterCharType(SynlongParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitCharType(SynlongParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UIntType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void enterUIntType(SynlongParser.UIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UIntType}
	 * labeled alternative in {@link SynlongParser#type_expr}.
	 * @param ctx the parse tree
	 */
	void exitUIntType(SynlongParser.UIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(SynlongParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(SynlongParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 */
	void enterTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#typevar}.
	 * @param ctx the parse tree
	 */
	void exitTypevar(SynlongParser.TypevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_block}.
	 * @param ctx the parse tree
	 */
	void enterConst_block(SynlongParser.Const_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_block}.
	 * @param ctx the parse tree
	 */
	void exitConst_block(SynlongParser.Const_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(SynlongParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(SynlongParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstId}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstId(SynlongParser.ConstIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstId}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstId(SynlongParser.ConstIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstUnaryOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstUnaryOp(SynlongParser.ConstUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstUnaryOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstUnaryOp(SynlongParser.ConstUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstBinArithOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstBinArithOp(SynlongParser.ConstBinArithOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstBinArithOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstBinArithOp(SynlongParser.ConstBinArithOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstStruct}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstStruct(SynlongParser.ConstStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstStruct}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstStruct(SynlongParser.ConstStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstArray}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstArray(SynlongParser.ConstArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstArray}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstArray(SynlongParser.ConstArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstAtom}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstAtom(SynlongParser.ConstAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstAtom}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstAtom(SynlongParser.ConstAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstBinRelOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstBinRelOp(SynlongParser.ConstBinRelOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstBinRelOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstBinRelOp(SynlongParser.ConstBinRelOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstParen}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstParen(SynlongParser.ConstParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstParen}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstParen(SynlongParser.ConstParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstBinBoolOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConstBinBoolOp(SynlongParser.ConstBinBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstBinBoolOp}
	 * labeled alternative in {@link SynlongParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConstBinBoolOp(SynlongParser.ConstBinBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_list}.
	 * @param ctx the parse tree
	 */
	void enterConst_list(SynlongParser.Const_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_list}.
	 * @param ctx the parse tree
	 */
	void exitConst_list(SynlongParser.Const_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#const_label_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_label_expr(SynlongParser.Const_label_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#const_label_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_label_expr(SynlongParser.Const_label_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UserOpDecl}
	 * labeled alternative in {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 */
	void enterUserOpDecl(SynlongParser.UserOpDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UserOpDecl}
	 * labeled alternative in {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 */
	void exitUserOpDecl(SynlongParser.UserOpDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportedOpDecl}
	 * labeled alternative in {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 */
	void enterImportedOpDecl(SynlongParser.ImportedOpDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportedOpDecl}
	 * labeled alternative in {@link SynlongParser#user_op_decl}.
	 * @param ctx the parse tree
	 */
	void exitImportedOpDecl(SynlongParser.ImportedOpDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionKind}
	 * labeled alternative in {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 */
	void enterFunctionKind(SynlongParser.FunctionKindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionKind}
	 * labeled alternative in {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 */
	void exitFunctionKind(SynlongParser.FunctionKindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodeKind}
	 * labeled alternative in {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 */
	void enterNodeKind(SynlongParser.NodeKindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodeKind}
	 * labeled alternative in {@link SynlongParser#op_kind}.
	 * @param ctx the parse tree
	 */
	void exitNodeKind(SynlongParser.NodeKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SynlongParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SynlongParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#returns_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturns_clause(SynlongParser.Returns_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#returns_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturns_clause(SynlongParser.Returns_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyOpBody}
	 * labeled alternative in {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 */
	void enterEmptyOpBody(SynlongParser.EmptyOpBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyOpBody}
	 * labeled alternative in {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 */
	void exitEmptyOpBody(SynlongParser.EmptyOpBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullOpBody}
	 * labeled alternative in {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 */
	void enterFullOpBody(SynlongParser.FullOpBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullOpBody}
	 * labeled alternative in {@link SynlongParser#op_body}.
	 * @param ctx the parse tree
	 */
	void exitFullOpBody(SynlongParser.FullOpBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#local_block}.
	 * @param ctx the parse tree
	 */
	void enterLocal_block(SynlongParser.Local_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#local_block}.
	 * @param ctx the parse tree
	 */
	void exitLocal_block(SynlongParser.Local_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void enterVar_decls(SynlongParser.Var_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void exitVar_decls(SynlongParser.Var_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(SynlongParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(SynlongParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#when_decl}.
	 * @param ctx the parse tree
	 */
	void enterWhen_decl(SynlongParser.When_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#when_decl}.
	 * @param ctx the parse tree
	 */
	void exitWhen_decl(SynlongParser.When_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClockId}
	 * labeled alternative in {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 */
	void enterClockId(SynlongParser.ClockIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClockId}
	 * labeled alternative in {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 */
	void exitClockId(SynlongParser.ClockIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotClock}
	 * labeled alternative in {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 */
	void enterNotClock(SynlongParser.NotClockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotClock}
	 * labeled alternative in {@link SynlongParser#clock_expr}.
	 * @param ctx the parse tree
	 */
	void exitNotClock(SynlongParser.NotClockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#last_decl}.
	 * @param ctx the parse tree
	 */
	void enterLast_decl(SynlongParser.Last_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#last_decl}.
	 * @param ctx the parse tree
	 */
	void exitLast_decl(SynlongParser.Last_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SynlongParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SynlongParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateMachineReturn}
	 * labeled alternative in {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterStateMachineReturn(SynlongParser.StateMachineReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateMachineReturn}
	 * labeled alternative in {@link SynlongParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitStateMachineReturn(SynlongParser.StateMachineReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyLhs}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterEmptyLhs(SynlongParser.EmptyLhsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyLhs}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitEmptyLhs(SynlongParser.EmptyLhsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiscardLhs}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterDiscardLhs(SynlongParser.DiscardLhsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiscardLhs}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitDiscardLhs(SynlongParser.DiscardLhsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LhsList}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhsList(SynlongParser.LhsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LhsList}
	 * labeled alternative in {@link SynlongParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhsList(SynlongParser.LhsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#lhs_id}.
	 * @param ctx the parse tree
	 */
	void enterLhs_id(SynlongParser.Lhs_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#lhs_id}.
	 * @param ctx the parse tree
	 */
	void exitLhs_id(SynlongParser.Lhs_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(SynlongParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(SynlongParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#returns_var}.
	 * @param ctx the parse tree
	 */
	void enterReturns_var(SynlongParser.Returns_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#returns_var}.
	 * @param ctx the parse tree
	 */
	void exitReturns_var(SynlongParser.Returns_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#state_machine}.
	 * @param ctx the parse tree
	 */
	void enterState_machine(SynlongParser.State_machineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#state_machine}.
	 * @param ctx the parse tree
	 */
	void exitState_machine(SynlongParser.State_machineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#state_decl}.
	 * @param ctx the parse tree
	 */
	void enterState_decl(SynlongParser.State_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#state_decl}.
	 * @param ctx the parse tree
	 */
	void exitState_decl(SynlongParser.State_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateBodyWithLocal}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void enterStateBodyWithLocal(SynlongParser.StateBodyWithLocalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateBodyWithLocal}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void exitStateBodyWithLocal(SynlongParser.StateBodyWithLocalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateBodyLocalOnly}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void enterStateBodyLocalOnly(SynlongParser.StateBodyLocalOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateBodyLocalOnly}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void exitStateBodyLocalOnly(SynlongParser.StateBodyLocalOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateBodyLetOnly}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void enterStateBodyLetOnly(SynlongParser.StateBodyLetOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateBodyLetOnly}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void exitStateBodyLetOnly(SynlongParser.StateBodyLetOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateBodySingleEq}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void enterStateBodySingleEq(SynlongParser.StateBodySingleEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateBodySingleEq}
	 * labeled alternative in {@link SynlongParser#state_body}.
	 * @param ctx the parse tree
	 */
	void exitStateBodySingleEq(SynlongParser.StateBodySingleEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#let_block}.
	 * @param ctx the parse tree
	 */
	void enterLet_block(SynlongParser.Let_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#let_block}.
	 * @param ctx the parse tree
	 */
	void exitLet_block(SynlongParser.Let_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#activate_block}.
	 * @param ctx the parse tree
	 */
	void enterActivate_block(SynlongParser.Activate_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#activate_block}.
	 * @param ctx the parse tree
	 */
	void exitActivate_block(SynlongParser.Activate_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#activate_if_chain}.
	 * @param ctx the parse tree
	 */
	void enterActivate_if_chain(SynlongParser.Activate_if_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#activate_if_chain}.
	 * @param ctx the parse tree
	 */
	void exitActivate_if_chain(SynlongParser.Activate_if_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#activate_else}.
	 * @param ctx the parse tree
	 */
	void enterActivate_else(SynlongParser.Activate_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#activate_else}.
	 * @param ctx the parse tree
	 */
	void exitActivate_else(SynlongParser.Activate_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#activate_branch}.
	 * @param ctx the parse tree
	 */
	void enterActivate_branch(SynlongParser.Activate_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#activate_branch}.
	 * @param ctx the parse tree
	 */
	void exitActivate_branch(SynlongParser.Activate_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(SynlongParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(SynlongParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(SynlongParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LastExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLastExpr(SynlongParser.LastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LastExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLastExpr(SynlongParser.LastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TempoExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTempoExpr(SynlongParser.TempoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TempoExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTempoExpr(SynlongParser.TempoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(SynlongParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(SynlongParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(SynlongParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(SynlongParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStructExpr(SynlongParser.StructExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStructExpr(SynlongParser.StructExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MixedConstructor}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMixedConstructor(SynlongParser.MixedConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MixedConstructor}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMixedConstructor(SynlongParser.MixedConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpr(SynlongParser.SwitchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpr(SynlongParser.SwitchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApplyExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterApplyExpr(SynlongParser.ApplyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApplyExpr}
	 * labeled alternative in {@link SynlongParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitApplyExpr(SynlongParser.ApplyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleId}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(SynlongParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleId}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(SynlongParser.SimpleIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleLast}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLast(SynlongParser.SimpleLastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleLast}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLast(SynlongParser.SimpleLastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructAccess}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterStructAccess(SynlongParser.StructAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructAccess}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitStructAccess(SynlongParser.StructAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(SynlongParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(SynlongParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(SynlongParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(SynlongParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleParen}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleParen(SynlongParser.SimpleParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleParen}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleParen(SynlongParser.SimpleParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleAtom}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAtom(SynlongParser.SimpleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleAtom}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAtom(SynlongParser.SimpleAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinRelOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinRelOp(SynlongParser.BinRelOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinRelOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinRelOp(SynlongParser.BinRelOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCast}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(SynlongParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCast}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(SynlongParser.TypeCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinArithOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinArithOp(SynlongParser.BinArithOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinArithOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinArithOp(SynlongParser.BinArithOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScadeRealCast}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterScadeRealCast(SynlongParser.ScadeRealCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScadeRealCast}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitScadeRealCast(SynlongParser.ScadeRealCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinBoolOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterBinBoolOp(SynlongParser.BinBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinBoolOp}
	 * labeled alternative in {@link SynlongParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitBinBoolOp(SynlongParser.BinBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void enterPreExpr(SynlongParser.PreExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void exitPreExpr(SynlongParser.PreExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void enterArrowExpr(SynlongParser.ArrowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void exitArrowExpr(SynlongParser.ArrowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FbyExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void enterFbyExpr(SynlongParser.FbyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FbyExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void exitFbyExpr(SynlongParser.FbyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FbySimpleExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void enterFbySimpleExpr(SynlongParser.FbySimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FbySimpleExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void exitFbySimpleExpr(SynlongParser.FbySimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhenExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpr(SynlongParser.WhenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhenExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpr(SynlongParser.WhenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MergeExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void enterMergeExpr(SynlongParser.MergeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MergeExpr}
	 * labeled alternative in {@link SynlongParser#tempo_expr}.
	 * @param ctx the parse tree
	 */
	void exitMergeExpr(SynlongParser.MergeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(SynlongParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(SynlongParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArraySlice}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArraySlice(SynlongParser.ArraySliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArraySlice}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArraySlice(SynlongParser.ArraySliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDefault}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefault(SynlongParser.ArrayDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDefault}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefault(SynlongParser.ArrayDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayRepeat}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayRepeat(SynlongParser.ArrayRepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayRepeat}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayRepeat(SynlongParser.ArrayRepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayConstructor}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(SynlongParser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayConstructor}
	 * labeled alternative in {@link SynlongParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(SynlongParser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#struct_expr}.
	 * @param ctx the parse tree
	 */
	void enterStruct_expr(SynlongParser.Struct_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#struct_expr}.
	 * @param ctx the parse tree
	 */
	void exitStruct_expr(SynlongParser.Struct_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#label_expr}.
	 * @param ctx the parse tree
	 */
	void enterLabel_expr(SynlongParser.Label_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#label_expr}.
	 * @param ctx the parse tree
	 */
	void exitLabel_expr(SynlongParser.Label_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#mixed_constructor}.
	 * @param ctx the parse tree
	 */
	void enterMixed_constructor(SynlongParser.Mixed_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#mixed_constructor}.
	 * @param ctx the parse tree
	 */
	void exitMixed_constructor(SynlongParser.Mixed_constructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Label}
	 * labeled alternative in {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 */
	void enterLabel(SynlongParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Label}
	 * labeled alternative in {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 */
	void exitLabel(SynlongParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexItem}
	 * labeled alternative in {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 */
	void enterIndexItem(SynlongParser.IndexItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexItem}
	 * labeled alternative in {@link SynlongParser#label_or_index}.
	 * @param ctx the parse tree
	 */
	void exitIndexItem(SynlongParser.IndexItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(SynlongParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(SynlongParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfThenElse}
	 * labeled alternative in {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(SynlongParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfThenElse}
	 * labeled alternative in {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(SynlongParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseOf}
	 * labeled alternative in {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 */
	void enterCaseOf(SynlongParser.CaseOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseOf}
	 * labeled alternative in {@link SynlongParser#switch_expr}.
	 * @param ctx the parse tree
	 */
	void exitCaseOf(SynlongParser.CaseOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(SynlongParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(SynlongParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternId}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternId(SynlongParser.PatternIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternId}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternId(SynlongParser.PatternIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternChar}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternChar(SynlongParser.PatternCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternChar}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternChar(SynlongParser.PatternCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternInt}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternInt(SynlongParser.PatternIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternInt}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternInt(SynlongParser.PatternIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternTrue}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternTrue(SynlongParser.PatternTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternTrue}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternTrue(SynlongParser.PatternTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternFalse}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternFalse(SynlongParser.PatternFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternFalse}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternFalse(SynlongParser.PatternFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternWildcard}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPatternWildcard(SynlongParser.PatternWildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternWildcard}
	 * labeled alternative in {@link SynlongParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPatternWildcard(SynlongParser.PatternWildcardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleApply(SynlongParser.SimpleApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleApply(SynlongParser.SimpleApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IteratorApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterIteratorApply(SynlongParser.IteratorApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IteratorApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitIteratorApply(SynlongParser.IteratorApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LegacyIteratorApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterLegacyIteratorApply(SynlongParser.LegacyIteratorApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LegacyIteratorApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitLegacyIteratorApply(SynlongParser.LegacyIteratorApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapwApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterMapwApply(SynlongParser.MapwApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapwApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitMapwApply(SynlongParser.MapwApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapwiApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterMapwiApply(SynlongParser.MapwiApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapwiApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitMapwiApply(SynlongParser.MapwiApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FoldwApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterFoldwApply(SynlongParser.FoldwApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FoldwApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitFoldwApply(SynlongParser.FoldwApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FoldwiApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void enterFoldwiApply(SynlongParser.FoldwiApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FoldwiApply}
	 * labeled alternative in {@link SynlongParser#apply_expr}.
	 * @param ctx the parse tree
	 */
	void exitFoldwiApply(SynlongParser.FoldwiApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixId}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixId(SynlongParser.PrefixIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixId}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixId(SynlongParser.PrefixIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixUnaryOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOp(SynlongParser.PrefixUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixUnaryOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOp(SynlongParser.PrefixUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixBinaryOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixBinaryOp(SynlongParser.PrefixBinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixBinaryOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixBinaryOp(SynlongParser.PrefixBinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MakeOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterMakeOp(SynlongParser.MakeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MakeOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitMakeOp(SynlongParser.MakeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlattenOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterFlattenOp(SynlongParser.FlattenOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlattenOp}
	 * labeled alternative in {@link SynlongParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitFlattenOp(SynlongParser.FlattenOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPlusDollar(SynlongParser.PlusDollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPlusDollar(SynlongParser.PlusDollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterMinusDollar(SynlongParser.MinusDollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitMinusDollar(SynlongParser.MinusDollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterNotDollar(SynlongParser.NotDollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitNotDollar(SynlongParser.NotDollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShortDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterShortDollar(SynlongParser.ShortDollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShortDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitShortDollar(SynlongParser.ShortDollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterIntDollar(SynlongParser.IntDollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitIntDollar(SynlongParser.IntDollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterFloatDollar(SynlongParser.FloatDollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitFloatDollar(SynlongParser.FloatDollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterRealDollar(SynlongParser.RealDollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealDollar}
	 * labeled alternative in {@link SynlongParser#prefix_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitRealDollar(SynlongParser.RealDollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(SynlongParser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(SynlongParser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterMinusOp(SynlongParser.MinusOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitMinusOp(SynlongParser.MinusOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(SynlongParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(SynlongParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterDivOp(SynlongParser.DivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitDivOp(SynlongParser.DivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterModOp(SynlongParser.ModOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitModOp(SynlongParser.ModOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivIntOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterDivIntOp(SynlongParser.DivIntOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivIntOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitDivIntOp(SynlongParser.DivIntOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(SynlongParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(SynlongParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterNeOp(SynlongParser.NeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitNeOp(SynlongParser.NeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterLtOp(SynlongParser.LtOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitLtOp(SynlongParser.LtOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterGtOp(SynlongParser.GtOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitGtOp(SynlongParser.GtOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterLeOp(SynlongParser.LeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitLeOp(SynlongParser.LeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterGeOp(SynlongParser.GeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitGeOp(SynlongParser.GeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterAndOp(SynlongParser.AndOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitAndOp(SynlongParser.AndOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOrOp(SynlongParser.OrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOrOp(SynlongParser.OrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XorOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterXorOp(SynlongParser.XorOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XorOp}
	 * labeled alternative in {@link SynlongParser#prefix_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitXorOp(SynlongParser.XorOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Map}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterMap(SynlongParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Map}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitMap(SynlongParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fold}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterFold(SynlongParser.FoldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fold}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitFold(SynlongParser.FoldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mapi}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterMapi(SynlongParser.MapiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mapi}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitMapi(SynlongParser.MapiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Foldi}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterFoldi(SynlongParser.FoldiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Foldi}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitFoldi(SynlongParser.FoldiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mapfold}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterMapfold(SynlongParser.MapfoldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mapfold}
	 * labeled alternative in {@link SynlongParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitMapfold(SynlongParser.MapfoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SynlongParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SynlongParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterMinus(SynlongParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitMinus(SynlongParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterPlus(SynlongParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitPlus(SynlongParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterNot(SynlongParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link SynlongParser#unary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitNot(SynlongParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SynlongParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SynlongParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterSub(SynlongParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitSub(SynlongParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterMul(SynlongParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitMul(SynlongParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SynlongParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SynlongParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterMod(SynlongParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitMod(SynlongParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivInt}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterDivInt(SynlongParser.DivIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivInt}
	 * labeled alternative in {@link SynlongParser#bin_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitDivInt(SynlongParser.DivIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void enterEq(SynlongParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void exitEq(SynlongParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void enterNe(SynlongParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void exitNe(SynlongParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void enterLt(SynlongParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void exitLt(SynlongParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void enterGt(SynlongParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void exitGt(SynlongParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Le}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void enterLe(SynlongParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Le}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void exitLe(SynlongParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void enterGe(SynlongParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link SynlongParser#bin_relation_op}.
	 * @param ctx the parse tree
	 */
	void exitGe(SynlongParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void enterAnd(SynlongParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void exitAnd(SynlongParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void enterOr(SynlongParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void exitOr(SynlongParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void enterXor(SynlongParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link SynlongParser#bin_bool_op}.
	 * @param ctx the parse tree
	 */
	void exitXor(SynlongParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrue(SynlongParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrue(SynlongParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalse(SynlongParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalse(SynlongParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterChar(SynlongParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitChar(SynlongParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInteger(SynlongParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInteger(SynlongParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UInteger}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterUInteger(SynlongParser.UIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UInteger}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitUInteger(SynlongParser.UIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFloat(SynlongParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFloat(SynlongParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Real}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterReal(SynlongParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitReal(SynlongParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UShort}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterUShort(SynlongParser.UShortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UShort}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitUShort(SynlongParser.UShortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Short}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterShort(SynlongParser.ShortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Short}
	 * labeled alternative in {@link SynlongParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitShort(SynlongParser.ShortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(SynlongParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(SynlongParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#realizabilityInputs}.
	 * @param ctx the parse tree
	 */
	void enterRealizabilityInputs(SynlongParser.RealizabilityInputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#realizabilityInputs}.
	 * @param ctx the parse tree
	 */
	void exitRealizabilityInputs(SynlongParser.RealizabilityInputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#ivc}.
	 * @param ctx the parse tree
	 */
	void enterIvc(SynlongParser.IvcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#ivc}.
	 * @param ctx the parse tree
	 */
	void exitIvc(SynlongParser.IvcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SynlongParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SynlongParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynlongParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(SynlongParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynlongParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(SynlongParser.AssertionContext ctx);
}