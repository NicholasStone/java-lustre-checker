// Generated from Synlong.g4 by ANTLR 4.13.2
package com.ecnu.synlong.parser.synlong.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SynlongParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, IF=106, VAR=107, LET=108, 
		TEL=109, STATE=110, UNLESS=111, UNTIL=112, RESUME=113, RESTART=114, INITIAL=115, 
		FINAL=116, AUTOMATON=117, RETURNS=118, ID=119, CHAR=120, INTEGER=121, 
		UINT=122, FLOAT=123, REAL=124, USHORT=125, SHORT=126, COMMENT=127, WS=128;
	public static final int
		RULE_program = 0, RULE_decls = 1, RULE_type_block = 2, RULE_type_decl = 3, 
		RULE_type_def = 4, RULE_type_expr = 5, RULE_field_decl = 6, RULE_typevar = 7, 
		RULE_const_block = 8, RULE_const_decl = 9, RULE_const_expr = 10, RULE_const_list = 11, 
		RULE_const_label_expr = 12, RULE_user_op_decl = 13, RULE_op_kind = 14, 
		RULE_params = 15, RULE_returns_clause = 16, RULE_op_body = 17, RULE_local_block = 18, 
		RULE_var_decls = 19, RULE_var_id = 20, RULE_when_decl = 21, RULE_clock_expr = 22, 
		RULE_last_decl = 23, RULE_equation = 24, RULE_lhs = 25, RULE_lhs_id = 26, 
		RULE_return_statement = 27, RULE_returns_var = 28, RULE_state_machine = 29, 
		RULE_state_decl = 30, RULE_state_body = 31, RULE_let_block = 32, RULE_activate_block = 33, 
		RULE_activate_if_chain = 34, RULE_activate_else = 35, RULE_activate_branch = 36, 
		RULE_transition = 37, RULE_expr = 38, RULE_simple_expr = 39, RULE_tempo_expr = 40, 
		RULE_bool_expr = 41, RULE_array_expr = 42, RULE_struct_expr = 43, RULE_label_expr = 44, 
		RULE_mixed_constructor = 45, RULE_label_or_index = 46, RULE_index = 47, 
		RULE_switch_expr = 48, RULE_case_expr = 49, RULE_pattern = 50, RULE_apply_expr = 51, 
		RULE_prefix_operator = 52, RULE_prefix_unary_operator = 53, RULE_prefix_binary_operator = 54, 
		RULE_iterator = 55, RULE_list = 56, RULE_unary_arith_op = 57, RULE_bin_arith_op = 58, 
		RULE_bin_relation_op = 59, RULE_bin_bool_op = 60, RULE_atom = 61, RULE_property = 62, 
		RULE_realizabilityInputs = 63, RULE_ivc = 64, RULE_main = 65, RULE_assertion = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decls", "type_block", "type_decl", "type_def", "type_expr", 
			"field_decl", "typevar", "const_block", "const_decl", "const_expr", "const_list", 
			"const_label_expr", "user_op_decl", "op_kind", "params", "returns_clause", 
			"op_body", "local_block", "var_decls", "var_id", "when_decl", "clock_expr", 
			"last_decl", "equation", "lhs", "lhs_id", "return_statement", "returns_var", 
			"state_machine", "state_decl", "state_body", "let_block", "activate_block", 
			"activate_if_chain", "activate_else", "activate_branch", "transition", 
			"expr", "simple_expr", "tempo_expr", "bool_expr", "array_expr", "struct_expr", 
			"label_expr", "mixed_constructor", "label_or_index", "index", "switch_expr", 
			"case_expr", "pattern", "apply_expr", "prefix_operator", "prefix_unary_operator", 
			"prefix_binary_operator", "iterator", "list", "unary_arith_op", "bin_arith_op", 
			"bin_relation_op", "bin_bool_op", "atom", "property", "realizabilityInputs", 
			"ivc", "main", "assertion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'type'", "';'", "'='", "'enum'", "'{'", "','", "'}'", "'bool'", 
			"'char'", "'byte'", "'ubyte'", "'short'", "'ushort'", "'int'", "'uint'", 
			"'long'", "'ulong'", "'float'", "'real'", "'^'", "':'", "'const'", "'('", 
			"')'", "'['", "']'", "'imported'", "'function'", "'node'", "'when'", 
			"'not'", "'last'", "'_'", "'..'", "'activate'", "'then'", "'else'", "'''", 
			"'.'", "'pre'", "'->'", "'fby'", "'merge'", "'#'", "'default'", "'with'", 
			"'case'", "'of'", "'|'", "'-'", "'true'", "'false'", "'<<'", "'>>'", 
			"'mapw'", "'mapwi'", "'foldw'", "'foldwi'", "'make'", "'flatten'", "'+$'", 
			"'-$'", "'not$'", "'short$'", "'int$'", "'float$'", "'real$'", "'$+$'", 
			"'$-$'", "'$*$'", "'$/$'", "'$mod$'", "'$div$'", "'$=$'", "'$<>$'", "'$<$'", 
			"'$>$'", "'$<=$'", "'$>=$'", "'$and$'", "'$or$'", "'$xor$'", "'map'", 
			"'fold'", "'mapi'", "'foldi'", "'mapfold'", "'+'", "'*'", "'/'", "'mod'", 
			"'div'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'xor'", 
			"'--%PROPERTY'", "'--%REALIZABLE'", "'--%IVC'", "'--%MAIN'", "'assert'", 
			"'if'", "'var'", "'let'", "'tel'", "'state'", "'unless'", "'until'", 
			"'resume'", "'restart'", "'initial'", "'final'", "'automaton'", "'returns'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "IF", "VAR", 
			"LET", "TEL", "STATE", "UNLESS", "UNTIL", "RESUME", "RESTART", "INITIAL", 
			"FINAL", "AUTOMATON", "RETURNS", "ID", "CHAR", "INTEGER", "UINT", "FLOAT", 
			"REAL", "USHORT", "SHORT", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Synlong.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SynlongParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SynlongParser.EOF, 0); }
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 809500674L) != 0)) {
				{
				{
				setState(134);
				decls();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclsContext extends ParserRuleContext {
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
	 
		public DeclsContext() { }
		public void copyFrom(DeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UserOpDeclarationContext extends DeclsContext {
		public User_op_declContext user_op_decl() {
			return getRuleContext(User_op_declContext.class,0);
		}
		public UserOpDeclarationContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUserOpDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUserOpDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUserOpDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends DeclsContext {
		public Type_blockContext type_block() {
			return getRuleContext(Type_blockContext.class,0);
		}
		public TypeDeclarationContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends DeclsContext {
		public Const_blockContext const_block() {
			return getRuleContext(Const_blockContext.class,0);
		}
		public ConstDeclarationContext(DeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				type_block();
				}
				break;
			case T__21:
				_localctx = new ConstDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				const_block();
				}
				break;
			case T__27:
			case T__28:
				_localctx = new UserOpDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				user_op_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_blockContext extends ParserRuleContext {
		public List<Type_declContext> type_decl() {
			return getRuleContexts(Type_declContext.class);
		}
		public Type_declContext type_decl(int i) {
			return getRuleContext(Type_declContext.class,i);
		}
		public Type_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterType_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitType_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitType_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_blockContext type_block() throws RecognitionException {
		Type_blockContext _localctx = new Type_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__0);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				type_decl();
				setState(149);
				match(T__1);
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(156);
				match(T__2);
				setState(157);
				type_def();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_defContext extends ParserRuleContext {
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
	 
		public Type_defContext() { }
		public void copyFrom(Type_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefContext extends Type_defContext {
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public EnumDefContext(Type_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEnumDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEnumDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeExprDefContext extends Type_defContext {
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public TypeExprDefContext(Type_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypeExprDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypeExprDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypeExprDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_def);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case ID:
				_localctx = new TypeExprDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				type_expr(0);
				}
				break;
			case T__3:
				_localctx = new EnumDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__3);
				setState(162);
				match(T__4);
				setState(163);
				match(ID);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(164);
					match(T__5);
					setState(165);
					match(ID);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_exprContext extends ParserRuleContext {
		public Type_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expr; }
	 
		public Type_exprContext() { }
		public void copyFrom(Type_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTypeContext extends Type_exprContext {
		public BoolTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LongTypeContext extends Type_exprContext {
		public LongTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLongType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLongType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLongType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructTypeContext extends Type_exprContext {
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public StructTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ULongTypeContext extends Type_exprContext {
		public ULongTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterULongType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitULongType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitULongType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortTypeContext extends Type_exprContext {
		public ShortTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterShortType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitShortType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitShortType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByteTypeContext extends Type_exprContext {
		public ByteTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterByteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitByteType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitByteType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealTypeContext extends Type_exprContext {
		public RealTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterRealType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitRealType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitRealType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarTypeContext extends Type_exprContext {
		public TypevarContext typevar() {
			return getRuleContext(TypevarContext.class,0);
		}
		public VarTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends Type_exprContext {
		public IntTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends Type_exprContext {
		public FloatTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends Type_exprContext {
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(SynlongParser.INTEGER, 0); }
		public ArrayTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UShortTypeContext extends Type_exprContext {
		public UShortTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUShortType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUShortType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUShortType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UByteTypeContext extends Type_exprContext {
		public UByteTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUByteType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUByteType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUByteType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends Type_exprContext {
		public CharTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UIntTypeContext extends Type_exprContext {
		public UIntTypeContext(Type_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_exprContext type_expr() throws RecognitionException {
		return type_expr(0);
	}

	private Type_exprContext type_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_exprContext _localctx = new Type_exprContext(_ctx, _parentState);
		Type_exprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new BoolTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new CharTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(T__8);
				}
				break;
			case T__9:
				{
				_localctx = new ByteTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new UByteTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__10);
				}
				break;
			case T__11:
				{
				_localctx = new ShortTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T__11);
				}
				break;
			case T__12:
				{
				_localctx = new UShortTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(T__12);
				}
				break;
			case T__13:
				{
				_localctx = new IntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(T__13);
				}
				break;
			case T__14:
				{
				_localctx = new UIntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(T__14);
				}
				break;
			case T__15:
				{
				_localctx = new LongTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__15);
				}
				break;
			case T__16:
				{
				_localctx = new ULongTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(T__16);
				}
				break;
			case T__17:
				{
				_localctx = new FloatTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(T__17);
				}
				break;
			case T__18:
				{
				_localctx = new RealTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(T__18);
				}
				break;
			case ID:
				{
				_localctx = new VarTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				typevar();
				}
				break;
			case T__4:
				{
				_localctx = new StructTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__4);
				setState(189);
				field_decl();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(190);
					match(T__5);
					setState(191);
					field_decl();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new Type_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type_expr);
					setState(201);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(202);
					match(T__19);
					setState(203);
					match(INTEGER);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitField_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitField_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(210);
			match(T__20);
			setState(211);
			type_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypevarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TypevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typevar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypevar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypevar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypevarContext typevar() throws RecognitionException {
		TypevarContext _localctx = new TypevarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_blockContext extends ParserRuleContext {
		public List<Const_declContext> const_decl() {
			return getRuleContexts(Const_declContext.class);
		}
		public Const_declContext const_decl(int i) {
			return getRuleContext(Const_declContext.class,i);
		}
		public Const_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_blockContext const_block() throws RecognitionException {
		Const_blockContext _localctx = new Const_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_const_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__21);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				const_decl();
				setState(217);
				match(T__1);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_const_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(224);
			match(T__20);
			setState(225);
			type_expr(0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(226);
				match(T__2);
				setState(227);
				const_expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_exprContext extends ParserRuleContext {
		public Const_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_expr; }
	 
		public Const_exprContext() { }
		public void copyFrom(Const_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstIdContext extends Const_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ConstIdContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstUnaryOpContext extends Const_exprContext {
		public Unary_arith_opContext unary_arith_op() {
			return getRuleContext(Unary_arith_opContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ConstUnaryOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstBinArithOpContext extends Const_exprContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Bin_arith_opContext bin_arith_op() {
			return getRuleContext(Bin_arith_opContext.class,0);
		}
		public ConstBinArithOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstBinArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstBinArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstBinArithOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstStructContext extends Const_exprContext {
		public List<Const_label_exprContext> const_label_expr() {
			return getRuleContexts(Const_label_exprContext.class);
		}
		public Const_label_exprContext const_label_expr(int i) {
			return getRuleContext(Const_label_exprContext.class,i);
		}
		public ConstStructContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstArrayContext extends Const_exprContext {
		public Const_listContext const_list() {
			return getRuleContext(Const_listContext.class,0);
		}
		public ConstArrayContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstAtomContext extends Const_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ConstAtomContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstBinRelOpContext extends Const_exprContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Bin_relation_opContext bin_relation_op() {
			return getRuleContext(Bin_relation_opContext.class,0);
		}
		public ConstBinRelOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstBinRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstBinRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstBinRelOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstParenContext extends Const_exprContext {
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ConstParenContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstBinBoolOpContext extends Const_exprContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Bin_bool_opContext bin_bool_op() {
			return getRuleContext(Bin_bool_opContext.class,0);
		}
		public ConstBinBoolOpContext(Const_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConstBinBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConstBinBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConstBinBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_exprContext const_expr() throws RecognitionException {
		return const_expr(0);
	}

	private Const_exprContext const_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Const_exprContext _localctx = new Const_exprContext(_ctx, _parentState);
		Const_exprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_const_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ConstIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(231);
				match(ID);
				}
				break;
			case T__50:
			case T__51:
			case CHAR:
			case INTEGER:
			case UINT:
			case FLOAT:
			case REAL:
			case USHORT:
			case SHORT:
				{
				_localctx = new ConstAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				atom();
				}
				break;
			case T__22:
				{
				_localctx = new ConstParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(T__22);
				setState(234);
				const_expr(0);
				setState(235);
				match(T__23);
				}
				break;
			case T__30:
			case T__49:
			case T__87:
				{
				_localctx = new ConstUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				unary_arith_op();
				setState(238);
				const_expr(6);
				}
				break;
			case T__24:
				{
				_localctx = new ConstArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(T__24);
				setState(241);
				const_list();
				setState(242);
				match(T__25);
				}
				break;
			case T__4:
				{
				_localctx = new ConstStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(T__4);
				setState(245);
				const_label_expr();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(246);
					match(T__5);
					setState(247);
					const_label_expr();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ConstBinArithOpContext(new Const_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_const_expr);
						setState(257);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(258);
						bin_arith_op();
						setState(259);
						const_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ConstBinBoolOpContext(new Const_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_const_expr);
						setState(261);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(262);
						bin_bool_op();
						setState(263);
						const_expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ConstBinRelOpContext(new Const_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_const_expr);
						setState(265);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(266);
						bin_relation_op();
						setState(267);
						const_expr(4);
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_listContext extends ParserRuleContext {
		public List<Const_exprContext> const_expr() {
			return getRuleContexts(Const_exprContext.class);
		}
		public Const_exprContext const_expr(int i) {
			return getRuleContext(Const_exprContext.class,i);
		}
		public Const_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_listContext const_list() throws RecognitionException {
		Const_listContext _localctx = new Const_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_const_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881301537325088L) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 547608330241L) != 0)) {
				{
				setState(274);
				const_expr(0);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(275);
					match(T__5);
					setState(276);
					const_expr(0);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_label_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Const_label_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_label_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterConst_label_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitConst_label_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitConst_label_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_label_exprContext const_label_expr() throws RecognitionException {
		Const_label_exprContext _localctx = new Const_label_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_const_label_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ID);
			setState(285);
			match(T__20);
			setState(286);
			const_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class User_op_declContext extends ParserRuleContext {
		public User_op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_op_decl; }
	 
		public User_op_declContext() { }
		public void copyFrom(User_op_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UserOpDeclContext extends User_op_declContext {
		public Op_kindContext op_kind() {
			return getRuleContext(Op_kindContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Returns_clauseContext returns_clause() {
			return getRuleContext(Returns_clauseContext.class,0);
		}
		public Op_bodyContext op_body() {
			return getRuleContext(Op_bodyContext.class,0);
		}
		public UserOpDeclContext(User_op_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUserOpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUserOpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUserOpDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportedOpDeclContext extends User_op_declContext {
		public Op_kindContext op_kind() {
			return getRuleContext(Op_kindContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Returns_clauseContext returns_clause() {
			return getRuleContext(Returns_clauseContext.class,0);
		}
		public ImportedOpDeclContext(User_op_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterImportedOpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitImportedOpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitImportedOpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_op_declContext user_op_decl() throws RecognitionException {
		User_op_declContext _localctx = new User_op_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_user_op_decl);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new UserOpDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				op_kind();
				setState(289);
				match(ID);
				setState(290);
				params();
				setState(291);
				returns_clause();
				setState(292);
				op_body();
				}
				break;
			case 2:
				_localctx = new ImportedOpDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				op_kind();
				setState(295);
				match(T__26);
				setState(296);
				match(ID);
				setState(297);
				params();
				setState(298);
				returns_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_kindContext extends ParserRuleContext {
		public Op_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_kind; }
	 
		public Op_kindContext() { }
		public void copyFrom(Op_kindContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeKindContext extends Op_kindContext {
		public NodeKindContext(Op_kindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNodeKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNodeKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNodeKind(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionKindContext extends Op_kindContext {
		public FunctionKindContext(Op_kindContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFunctionKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFunctionKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFunctionKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_kindContext op_kind() throws RecognitionException {
		Op_kindContext _localctx = new Op_kindContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_kind);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new FunctionKindContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new NodeKindContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<Var_declsContext> var_decls() {
			return getRuleContexts(Var_declsContext.class);
		}
		public Var_declsContext var_decls(int i) {
			return getRuleContext(Var_declsContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__22);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(307);
				var_decls();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(308);
					match(T__1);
					setState(309);
					var_decls();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Returns_clauseContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SynlongParser.RETURNS, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Returns_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReturns_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReturns_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReturns_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_clauseContext returns_clause() throws RecognitionException {
		Returns_clauseContext _localctx = new Returns_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returns_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(RETURNS);
			setState(320);
			params();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_bodyContext extends ParserRuleContext {
		public Op_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_body; }
	 
		public Op_bodyContext() { }
		public void copyFrom(Op_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullOpBodyContext extends Op_bodyContext {
		public Local_blockContext local_block() {
			return getRuleContext(Local_blockContext.class,0);
		}
		public Let_blockContext let_block() {
			return getRuleContext(Let_blockContext.class,0);
		}
		public FullOpBodyContext(Op_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFullOpBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFullOpBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFullOpBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyOpBodyContext extends Op_bodyContext {
		public EmptyOpBodyContext(Op_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEmptyOpBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEmptyOpBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEmptyOpBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bodyContext op_body() throws RecognitionException {
		Op_bodyContext _localctx = new Op_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_body);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new EmptyOpBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(T__1);
				}
				break;
			case EOF:
			case T__0:
			case T__21:
			case T__27:
			case T__28:
			case VAR:
			case LET:
				_localctx = new FullOpBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(323);
					local_block();
					}
				}

				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(326);
					let_block();
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(327);
						match(T__1);
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Local_blockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SynlongParser.VAR, 0); }
		public List<Var_declsContext> var_decls() {
			return getRuleContexts(Var_declsContext.class);
		}
		public Var_declsContext var_decls(int i) {
			return getRuleContext(Var_declsContext.class,i);
		}
		public Local_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLocal_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLocal_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLocal_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_blockContext local_block() throws RecognitionException {
		Local_blockContext _localctx = new Local_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_local_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(VAR);
			setState(338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335);
				var_decls();
				setState(336);
				match(T__1);
				}
				}
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declsContext extends ParserRuleContext {
		public List<Var_idContext> var_id() {
			return getRuleContexts(Var_idContext.class);
		}
		public Var_idContext var_id(int i) {
			return getRuleContext(Var_idContext.class,i);
		}
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public When_declContext when_decl() {
			return getRuleContext(When_declContext.class,0);
		}
		public Last_declContext last_decl() {
			return getRuleContext(Last_declContext.class,0);
		}
		public Var_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterVar_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitVar_decls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitVar_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declsContext var_decls() throws RecognitionException {
		Var_declsContext _localctx = new Var_declsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			var_id();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(343);
				match(T__5);
				setState(344);
				var_id();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(T__20);
			setState(351);
			type_expr(0);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(352);
				when_decl();
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(355);
				last_decl();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitVar_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class When_declContext extends ParserRuleContext {
		public Clock_exprContext clock_expr() {
			return getRuleContext(Clock_exprContext.class,0);
		}
		public When_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterWhen_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitWhen_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitWhen_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_declContext when_decl() throws RecognitionException {
		When_declContext _localctx = new When_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_when_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__29);
			setState(361);
			clock_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Clock_exprContext extends ParserRuleContext {
		public Clock_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clock_expr; }
	 
		public Clock_exprContext() { }
		public void copyFrom(Clock_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClockIdContext extends Clock_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public ClockIdContext(Clock_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterClockId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitClockId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitClockId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotClockContext extends Clock_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public NotClockContext(Clock_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNotClock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNotClock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNotClock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clock_exprContext clock_expr() throws RecognitionException {
		Clock_exprContext _localctx = new Clock_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_clock_expr);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ClockIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(ID);
				}
				break;
			case T__30:
				_localctx = new NotClockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(T__30);
				setState(365);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Last_declContext extends ParserRuleContext {
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Last_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLast_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLast_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLast_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Last_declContext last_decl() throws RecognitionException {
		Last_declContext _localctx = new Last_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_last_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__31);
			setState(369);
			match(T__2);
			setState(370);
			const_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	 
		public EquationContext() { }
		public void copyFrom(EquationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends EquationContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateMachineReturnContext extends EquationContext {
		public State_machineContext state_machine() {
			return getRuleContext(State_machineContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StateMachineReturnContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateMachineReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateMachineReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateMachineReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equation);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__32:
			case ID:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				lhs();
				setState(373);
				match(T__2);
				setState(374);
				expr();
				setState(375);
				match(T__1);
				}
				break;
			case AUTOMATON:
				_localctx = new StateMachineReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				state_machine();
				setState(378);
				return_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LhsContext extends ParserRuleContext {
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
	 
		public LhsContext() { }
		public void copyFrom(LhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DiscardLhsContext extends LhsContext {
		public DiscardLhsContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDiscardLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDiscardLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDiscardLhs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyLhsContext extends LhsContext {
		public EmptyLhsContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEmptyLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEmptyLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEmptyLhs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LhsListContext extends LhsContext {
		public List<Lhs_idContext> lhs_id() {
			return getRuleContexts(Lhs_idContext.class);
		}
		public Lhs_idContext lhs_id(int i) {
			return getRuleContext(Lhs_idContext.class,i);
		}
		public LhsListContext(LhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLhsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLhsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLhsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lhs);
		int _la;
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new EmptyLhsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(T__22);
				setState(383);
				match(T__23);
				}
				break;
			case T__32:
				_localctx = new DiscardLhsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(T__32);
				}
				break;
			case ID:
				_localctx = new LhsListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				lhs_id();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(386);
					match(T__5);
					setState(387);
					lhs_id();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lhs_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Lhs_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLhs_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLhs_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLhs_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lhs_idContext lhs_id() throws RecognitionException {
		Lhs_idContext _localctx = new Lhs_idContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lhs_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SynlongParser.RETURNS, 0); }
		public Returns_varContext returns_var() {
			return getRuleContext(Returns_varContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(RETURNS);
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(398);
				returns_var();
				}
				break;
			case T__33:
				{
				setState(399);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Returns_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public Returns_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returns_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReturns_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReturns_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReturns_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returns_varContext returns_var() throws RecognitionException {
		Returns_varContext _localctx = new Returns_varContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returns_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(404);
				match(ID);
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class State_machineContext extends ParserRuleContext {
		public TerminalNode AUTOMATON() { return getToken(SynlongParser.AUTOMATON, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public List<State_declContext> state_decl() {
			return getRuleContexts(State_declContext.class);
		}
		public State_declContext state_decl(int i) {
			return getRuleContext(State_declContext.class,i);
		}
		public State_machineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_machine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterState_machine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitState_machine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitState_machine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_machineContext state_machine() throws RecognitionException {
		State_machineContext _localctx = new State_machineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_state_machine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(AUTOMATON);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(410);
				match(ID);
				}
			}

			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				state_decl();
				}
				}
				setState(416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 97L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class State_declContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(SynlongParser.STATE, 0); }
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public State_bodyContext state_body() {
			return getRuleContext(State_bodyContext.class,0);
		}
		public TerminalNode INITIAL() { return getToken(SynlongParser.INITIAL, 0); }
		public TerminalNode FINAL() { return getToken(SynlongParser.FINAL, 0); }
		public TerminalNode UNLESS() { return getToken(SynlongParser.UNLESS, 0); }
		public TerminalNode UNTIL() { return getToken(SynlongParser.UNTIL, 0); }
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public State_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterState_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitState_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitState_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_declContext state_decl() throws RecognitionException {
		State_declContext _localctx = new State_declContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_state_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL) {
				{
				setState(418);
				match(INITIAL);
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(421);
				match(FINAL);
				}
			}

			setState(424);
			match(STATE);
			setState(425);
			match(ID);
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(426);
				match(UNLESS);
				setState(428); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(427);
						transition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(430); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			{
			setState(434);
			if (!(_input.LT(1).getType() == VAR)) throw new FailedPredicateException(this, "_input.LT(1).getType() == VAR");
			setState(435);
			state_body();
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNTIL) {
				{
				setState(437);
				match(UNTIL);
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(438);
					transition();
					}
					}
					setState(441); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IF );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class State_bodyContext extends ParserRuleContext {
		public State_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_body; }
	 
		public State_bodyContext() { }
		public void copyFrom(State_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodySingleEqContext extends State_bodyContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public StateBodySingleEqContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodySingleEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodySingleEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodySingleEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodyLetOnlyContext extends State_bodyContext {
		public Let_blockContext let_block() {
			return getRuleContext(Let_blockContext.class,0);
		}
		public StateBodyLetOnlyContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodyLetOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodyLetOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodyLetOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodyWithLocalContext extends State_bodyContext {
		public Local_blockContext local_block() {
			return getRuleContext(Local_blockContext.class,0);
		}
		public Let_blockContext let_block() {
			return getRuleContext(Let_blockContext.class,0);
		}
		public StateBodyWithLocalContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodyWithLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodyWithLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodyWithLocal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateBodyLocalOnlyContext extends State_bodyContext {
		public Local_blockContext local_block() {
			return getRuleContext(Local_blockContext.class,0);
		}
		public StateBodyLocalOnlyContext(State_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStateBodyLocalOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStateBodyLocalOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStateBodyLocalOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_bodyContext state_body() throws RecognitionException {
		State_bodyContext _localctx = new State_bodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_state_body);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new StateBodyWithLocalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				local_block();
				setState(446);
				let_block();
				}
				break;
			case 2:
				_localctx = new StateBodyLocalOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				local_block();
				}
				break;
			case 3:
				_localctx = new StateBodyLetOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				let_block();
				}
				break;
			case 4:
				_localctx = new StateBodySingleEqContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				equation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Let_blockContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(SynlongParser.LET, 0); }
		public TerminalNode TEL() { return getToken(SynlongParser.TEL, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<Activate_blockContext> activate_block() {
			return getRuleContexts(Activate_blockContext.class);
		}
		public Activate_blockContext activate_block(int i) {
			return getRuleContext(Activate_blockContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public List<RealizabilityInputsContext> realizabilityInputs() {
			return getRuleContexts(RealizabilityInputsContext.class);
		}
		public RealizabilityInputsContext realizabilityInputs(int i) {
			return getRuleContext(RealizabilityInputsContext.class,i);
		}
		public List<IvcContext> ivc() {
			return getRuleContexts(IvcContext.class);
		}
		public IvcContext ivc(int i) {
			return getRuleContext(IvcContext.class,i);
		}
		public Let_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLet_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_blockContext let_block() throws RecognitionException {
		Let_blockContext _localctx = new Let_blockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_let_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(LET);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42958061568L) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 327711L) != 0)) {
				{
				setState(461);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__32:
				case AUTOMATON:
				case ID:
					{
					setState(454);
					equation();
					}
					break;
				case T__34:
					{
					setState(455);
					activate_block();
					}
					break;
				case T__100:
					{
					setState(456);
					property();
					}
					break;
				case T__104:
					{
					setState(457);
					assertion();
					}
					break;
				case T__103:
					{
					setState(458);
					main();
					}
					break;
				case T__101:
					{
					setState(459);
					realizabilityInputs();
					}
					break;
				case T__102:
					{
					setState(460);
					ivc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(TEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Activate_blockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Activate_if_chainContext activate_if_chain() {
			return getRuleContext(Activate_if_chainContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(SynlongParser.RETURNS, 0); }
		public Activate_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activate_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterActivate_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitActivate_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitActivate_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Activate_blockContext activate_block() throws RecognitionException {
		Activate_blockContext _localctx = new Activate_blockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_activate_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__34);
			setState(469);
			match(ID);
			setState(470);
			activate_if_chain();
			setState(471);
			match(RETURNS);
			setState(472);
			match(T__33);
			setState(473);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Activate_if_chainContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Activate_branchContext activate_branch() {
			return getRuleContext(Activate_branchContext.class,0);
		}
		public Activate_elseContext activate_else() {
			return getRuleContext(Activate_elseContext.class,0);
		}
		public Activate_if_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activate_if_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterActivate_if_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitActivate_if_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitActivate_if_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Activate_if_chainContext activate_if_chain() throws RecognitionException {
		Activate_if_chainContext _localctx = new Activate_if_chainContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_activate_if_chain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(IF);
			setState(476);
			simple_expr(0);
			setState(477);
			match(T__35);
			setState(478);
			activate_branch();
			setState(479);
			match(T__36);
			setState(480);
			activate_else();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Activate_elseContext extends ParserRuleContext {
		public Activate_if_chainContext activate_if_chain() {
			return getRuleContext(Activate_if_chainContext.class,0);
		}
		public Activate_branchContext activate_branch() {
			return getRuleContext(Activate_branchContext.class,0);
		}
		public Activate_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activate_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterActivate_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitActivate_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitActivate_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Activate_elseContext activate_else() throws RecognitionException {
		Activate_elseContext _localctx = new Activate_elseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_activate_else);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				activate_if_chain();
				}
				break;
			case T__34:
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				activate_branch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Activate_branchContext extends ParserRuleContext {
		public Let_blockContext let_block() {
			return getRuleContext(Let_blockContext.class,0);
		}
		public Local_blockContext local_block() {
			return getRuleContext(Local_blockContext.class,0);
		}
		public Activate_blockContext activate_block() {
			return getRuleContext(Activate_blockContext.class,0);
		}
		public Activate_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activate_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterActivate_branch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitActivate_branch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitActivate_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Activate_branchContext activate_branch() throws RecognitionException {
		Activate_branchContext _localctx = new Activate_branchContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_activate_branch);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(486);
					local_block();
					}
				}

				setState(489);
				let_block();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				activate_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public TerminalNode RESUME() { return getToken(SynlongParser.RESUME, 0); }
		public TerminalNode RESTART() { return getToken(SynlongParser.RESTART, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(IF);
			setState(494);
			expr();
			setState(495);
			_la = _input.LA(1);
			if ( !(_la==RESUME || _la==RESTART) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(496);
			match(ID);
			setState(497);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprContext extends ExprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public SimpleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApplyExprContext extends ExprContext {
		public Apply_exprContext apply_expr() {
			return getRuleContext(Apply_exprContext.class,0);
		}
		public ApplyExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterApplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitApplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitApplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExprContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchExprContext extends ExprContext {
		public Switch_exprContext switch_expr() {
			return getRuleContext(Switch_exprContext.class,0);
		}
		public SwitchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSwitchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSwitchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSwitchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ExprContext {
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MixedConstructorContext extends ExprContext {
		public Mixed_constructorContext mixed_constructor() {
			return getRuleContext(Mixed_constructorContext.class,0);
		}
		public MixedConstructorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMixedConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMixedConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMixedConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public LastExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TempoExprContext extends ExprContext {
		public Tempo_exprContext tempo_expr() {
			return getRuleContext(Tempo_exprContext.class,0);
		}
		public TempoExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTempoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTempoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTempoExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructExprContext extends ExprContext {
		public Struct_exprContext struct_expr() {
			return getRuleContext(Struct_exprContext.class,0);
		}
		public StructExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStructExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStructExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStructExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expr);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new SimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				simple_expr(0);
				}
				break;
			case 2:
				_localctx = new LastExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(T__31);
				setState(501);
				match(T__37);
				setState(502);
				match(ID);
				}
				break;
			case 3:
				_localctx = new TempoExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				tempo_expr();
				}
				break;
			case 4:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				bool_expr();
				}
				break;
			case 5:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(505);
				array_expr();
				}
				break;
			case 6:
				_localctx = new StructExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(506);
				struct_expr();
				}
				break;
			case 7:
				_localctx = new MixedConstructorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(507);
				mixed_constructor();
				}
				break;
			case 8:
				_localctx = new SwitchExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(508);
				switch_expr();
				}
				break;
			case 9:
				_localctx = new ApplyExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(509);
				apply_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_exprContext extends ParserRuleContext {
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
	 
		public Simple_exprContext() { }
		public void copyFrom(Simple_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleIdContext extends Simple_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public SimpleIdContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleLastContext extends Simple_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public SimpleLastContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleLast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructAccessContext extends Simple_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public StructAccessContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStructAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStructAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStructAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends Simple_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ArrayAccessContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOpContext extends Simple_exprContext {
		public Unary_arith_opContext unary_arith_op() {
			return getRuleContext(Unary_arith_opContext.class,0);
		}
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public UnaryOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleParenContext extends Simple_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public SimpleParenContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAtomContext extends Simple_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SimpleAtomContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinRelOpContext extends Simple_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Bin_relation_opContext bin_relation_op() {
			return getRuleContext(Bin_relation_opContext.class,0);
		}
		public BinRelOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBinRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBinRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBinRelOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastContext extends Simple_exprContext {
		public Type_exprContext type_expr() {
			return getRuleContext(Type_exprContext.class,0);
		}
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TypeCastContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinArithOpContext extends Simple_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Bin_arith_opContext bin_arith_op() {
			return getRuleContext(Bin_arith_opContext.class,0);
		}
		public BinArithOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBinArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBinArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBinArithOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScadeRealCastContext extends Simple_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public ScadeRealCastContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterScadeRealCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitScadeRealCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitScadeRealCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinBoolOpContext extends Simple_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Bin_bool_opContext bin_bool_op() {
			return getRuleContext(Bin_bool_opContext.class,0);
		}
		public BinBoolOpContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBinBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBinBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBinBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		return simple_expr(0);
	}

	private Simple_exprContext simple_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, _parentState);
		Simple_exprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_simple_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(513);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new SimpleAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(514);
				atom();
				}
				break;
			case 3:
				{
				_localctx = new SimpleLastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(515);
				match(T__31);
				setState(516);
				match(T__37);
				setState(517);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new UnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				unary_arith_op();
				setState(519);
				simple_expr(7);
				}
				break;
			case 5:
				{
				_localctx = new TypeCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(521);
				match(T__22);
				setState(522);
				type_expr(0);
				setState(523);
				simple_expr(0);
				setState(524);
				match(T__23);
				}
				break;
			case 6:
				{
				_localctx = new ScadeRealCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(526);
				match(T__18);
				setState(527);
				simple_expr(2);
				}
				break;
			case 7:
				{
				_localctx = new SimpleParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(528);
				match(T__22);
				setState(529);
				simple_expr(0);
				setState(530);
				match(T__23);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(554);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new BinArithOpContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(534);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(535);
						bin_arith_op();
						setState(536);
						simple_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new BinBoolOpContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(538);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(539);
						bin_bool_op();
						setState(540);
						simple_expr(6);
						}
						break;
					case 3:
						{
						_localctx = new BinRelOpContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(542);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(543);
						bin_relation_op();
						setState(544);
						simple_expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ArrayAccessContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(546);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(547);
						match(T__24);
						setState(548);
						const_expr(0);
						setState(549);
						match(T__25);
						}
						break;
					case 5:
						{
						_localctx = new StructAccessContext(new Simple_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simple_expr);
						setState(551);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(552);
						match(T__38);
						setState(553);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tempo_exprContext extends ParserRuleContext {
		public Tempo_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_expr; }
	 
		public Tempo_exprContext() { }
		public void copyFrom(Tempo_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FbySimpleExprContext extends Tempo_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public FbySimpleExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFbySimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFbySimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFbySimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreExprContext extends Tempo_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public PreExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPreExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPreExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPreExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhenExprContext extends Tempo_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Clock_exprContext clock_expr() {
			return getRuleContext(Clock_exprContext.class,0);
		}
		public WhenExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterWhenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitWhenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitWhenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowExprContext extends Tempo_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public ArrowExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FbyExprContext extends Tempo_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public FbyExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFbyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFbyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFbyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MergeExprContext extends Tempo_exprContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public MergeExprContext(Tempo_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMergeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMergeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMergeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tempo_exprContext tempo_expr() throws RecognitionException {
		Tempo_exprContext _localctx = new Tempo_exprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tempo_expr);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new PreExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(T__39);
				setState(560);
				simple_expr(0);
				}
				break;
			case 2:
				_localctx = new ArrowExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				simple_expr(0);
				setState(562);
				match(T__40);
				setState(563);
				simple_expr(0);
				}
				break;
			case 3:
				_localctx = new FbyExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				match(T__41);
				setState(566);
				match(T__22);
				setState(567);
				simple_expr(0);
				setState(568);
				match(T__1);
				setState(569);
				const_expr(0);
				setState(570);
				match(T__1);
				setState(571);
				simple_expr(0);
				setState(572);
				match(T__23);
				}
				break;
			case 4:
				_localctx = new FbySimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				simple_expr(0);
				setState(575);
				match(T__41);
				setState(576);
				simple_expr(0);
				}
				break;
			case 5:
				_localctx = new WhenExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				simple_expr(0);
				setState(579);
				match(T__29);
				setState(580);
				clock_expr();
				}
				break;
			case 6:
				_localctx = new MergeExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				match(T__42);
				setState(583);
				match(ID);
				setState(584);
				match(T__22);
				setState(585);
				simple_expr(0);
				setState(586);
				match(T__5);
				setState(587);
				simple_expr(0);
				setState(588);
				match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__43);
			setState(593);
			match(T__22);
			setState(594);
			list();
			setState(595);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_exprContext extends ParserRuleContext {
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
	 
		public Array_exprContext() { }
		public void copyFrom(Array_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayRepeatContext extends Array_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ArrayRepeatContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDefaultContext extends Array_exprContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public ArrayDefaultContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraySliceContext extends Array_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(SynlongParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SynlongParser.INTEGER, i);
		}
		public ArraySliceContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArraySlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArraySlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArraySlice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayConstructorContext extends Array_exprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ArrayConstructorContext(Array_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_array_expr);
		int _la;
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new ArraySliceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				simple_expr(0);
				setState(598);
				match(T__24);
				setState(599);
				match(INTEGER);
				setState(600);
				match(T__33);
				setState(601);
				match(INTEGER);
				setState(602);
				match(T__25);
				}
				break;
			case 2:
				_localctx = new ArrayDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(T__22);
				setState(605);
				simple_expr(0);
				setState(606);
				match(T__38);
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(607);
					index();
					}
					}
					setState(610); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__24 );
				setState(612);
				match(T__44);
				setState(613);
				simple_expr(0);
				setState(614);
				match(T__23);
				}
				break;
			case 3:
				_localctx = new ArrayRepeatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				simple_expr(0);
				setState(617);
				match(T__19);
				setState(618);
				const_expr(0);
				}
				break;
			case 4:
				_localctx = new ArrayConstructorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
				match(T__24);
				setState(621);
				list();
				setState(622);
				match(T__25);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_exprContext extends ParserRuleContext {
		public List<Label_exprContext> label_expr() {
			return getRuleContexts(Label_exprContext.class);
		}
		public Label_exprContext label_expr(int i) {
			return getRuleContext(Label_exprContext.class,i);
		}
		public Struct_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterStruct_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitStruct_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitStruct_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_exprContext struct_expr() throws RecognitionException {
		Struct_exprContext _localctx = new Struct_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_struct_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__4);
			setState(627);
			label_expr();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(628);
				match(T__5);
				setState(629);
				label_expr();
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(635);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Label_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Label_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLabel_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLabel_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLabel_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_exprContext label_expr() throws RecognitionException {
		Label_exprContext _localctx = new Label_exprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_label_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(ID);
			setState(638);
			match(T__20);
			setState(639);
			simple_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mixed_constructorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<Label_or_indexContext> label_or_index() {
			return getRuleContexts(Label_or_indexContext.class);
		}
		public Label_or_indexContext label_or_index(int i) {
			return getRuleContext(Label_or_indexContext.class,i);
		}
		public Mixed_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixed_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMixed_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMixed_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMixed_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mixed_constructorContext mixed_constructor() throws RecognitionException {
		Mixed_constructorContext _localctx = new Mixed_constructorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_mixed_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__22);
			setState(642);
			match(ID);
			setState(643);
			match(T__45);
			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(644);
				label_or_index();
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 || _la==T__38 );
			setState(649);
			match(T__2);
			setState(650);
			simple_expr(0);
			setState(651);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Label_or_indexContext extends ParserRuleContext {
		public Label_or_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_or_index; }
	 
		public Label_or_indexContext() { }
		public void copyFrom(Label_or_indexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends Label_or_indexContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public LabelContext(Label_or_indexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexItemContext extends Label_or_indexContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexItemContext(Label_or_indexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIndexItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIndexItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIndexItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_or_indexContext label_or_index() throws RecognitionException {
		Label_or_indexContext _localctx = new Label_or_indexContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_label_or_index);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				match(T__38);
				setState(654);
				match(ID);
				}
				break;
			case T__24:
				_localctx = new IndexItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				index();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(T__24);
			setState(659);
			simple_expr(0);
			setState(660);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_exprContext extends ParserRuleContext {
		public Switch_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expr; }
	 
		public Switch_exprContext() { }
		public void copyFrom(Switch_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseOfContext extends Switch_exprContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<Case_exprContext> case_expr() {
			return getRuleContexts(Case_exprContext.class);
		}
		public Case_exprContext case_expr(int i) {
			return getRuleContext(Case_exprContext.class,i);
		}
		public CaseOfContext(Switch_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterCaseOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitCaseOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitCaseOf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseContext extends Switch_exprContext {
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public IfThenElseContext(Switch_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_exprContext switch_expr() throws RecognitionException {
		Switch_exprContext _localctx = new Switch_exprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_switch_expr);
		int _la;
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(IF);
				setState(663);
				simple_expr(0);
				setState(664);
				match(T__35);
				setState(665);
				simple_expr(0);
				setState(666);
				match(T__36);
				setState(667);
				simple_expr(0);
				}
				break;
			case T__22:
				_localctx = new CaseOfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(T__22);
				setState(670);
				match(T__46);
				setState(671);
				simple_expr(0);
				setState(672);
				match(T__47);
				setState(674); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(673);
					case_expr();
					}
					}
					setState(676); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__48 );
				setState(678);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_exprContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterCase_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitCase_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitCase_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_case_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(T__48);
			setState(683);
			pattern();
			setState(684);
			match(T__20);
			setState(685);
			simple_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternIntContext extends PatternContext {
		public TerminalNode INTEGER() { return getToken(SynlongParser.INTEGER, 0); }
		public PatternIntContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternCharContext extends PatternContext {
		public TerminalNode CHAR() { return getToken(SynlongParser.CHAR, 0); }
		public PatternCharContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternTrueContext extends PatternContext {
		public PatternTrueContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternWildcardContext extends PatternContext {
		public PatternWildcardContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternIdContext extends PatternContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public PatternIdContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternFalseContext extends PatternContext {
		public PatternFalseContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPatternFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPatternFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPatternFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_pattern);
		int _la;
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PatternIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(687);
				match(ID);
				}
				break;
			case CHAR:
				_localctx = new PatternCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(CHAR);
				}
				break;
			case T__49:
			case INTEGER:
				_localctx = new PatternIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__49) {
					{
					setState(689);
					match(T__49);
					}
				}

				setState(692);
				match(INTEGER);
				}
				break;
			case T__50:
				_localctx = new PatternTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new PatternFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(694);
				match(T__51);
				}
				break;
			case T__32:
				_localctx = new PatternWildcardContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(695);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Apply_exprContext extends ParserRuleContext {
		public Apply_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply_expr; }
	 
		public Apply_exprContext() { }
		public void copyFrom(Apply_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldwApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FoldwApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFoldwApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFoldwApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFoldwApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SimpleApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSimpleApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSimpleApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSimpleApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LegacyIteratorApplyContext extends Apply_exprContext {
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LegacyIteratorApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLegacyIteratorApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLegacyIteratorApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLegacyIteratorApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapwiApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public MapwiApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapwiApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapwiApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapwiApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IteratorApplyContext extends Apply_exprContext {
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IteratorApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIteratorApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIteratorApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIteratorApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapwApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public MapwApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapwApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapwApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapwApply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldwiApplyContext extends Apply_exprContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(SynlongParser.IF, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FoldwiApplyContext(Apply_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFoldwiApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFoldwiApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFoldwiApply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Apply_exprContext apply_expr() throws RecognitionException {
		Apply_exprContext _localctx = new Apply_exprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_apply_expr);
		try {
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new SimpleApplyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				prefix_operator();
				setState(699);
				match(T__22);
				setState(700);
				list();
				setState(701);
				match(T__23);
				}
				break;
			case 2:
				_localctx = new IteratorApplyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				match(T__22);
				setState(704);
				iterator();
				setState(705);
				match(T__52);
				setState(706);
				prefix_operator();
				setState(707);
				match(T__1);
				setState(708);
				const_expr(0);
				setState(709);
				match(T__53);
				setState(710);
				match(T__23);
				setState(711);
				match(T__22);
				setState(712);
				list();
				setState(713);
				match(T__23);
				}
				break;
			case 3:
				_localctx = new LegacyIteratorApplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				iterator();
				setState(716);
				match(T__52);
				setState(717);
				prefix_operator();
				setState(718);
				match(T__5);
				setState(719);
				const_expr(0);
				setState(720);
				match(T__53);
				setState(721);
				match(T__22);
				setState(722);
				list();
				setState(723);
				match(T__23);
				}
				break;
			case 4:
				_localctx = new MapwApplyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				match(T__22);
				setState(726);
				match(T__54);
				setState(727);
				match(T__52);
				setState(728);
				prefix_operator();
				setState(729);
				match(T__1);
				setState(730);
				const_expr(0);
				setState(731);
				match(T__53);
				setState(732);
				match(IF);
				setState(733);
				simple_expr(0);
				setState(734);
				match(T__44);
				setState(735);
				match(T__22);
				setState(736);
				list();
				setState(737);
				match(T__23);
				setState(738);
				match(T__23);
				setState(739);
				match(T__22);
				setState(740);
				list();
				setState(741);
				match(T__23);
				}
				break;
			case 5:
				_localctx = new MapwiApplyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(743);
				match(T__22);
				setState(744);
				match(T__55);
				setState(745);
				match(T__52);
				setState(746);
				prefix_operator();
				setState(747);
				match(T__1);
				setState(748);
				const_expr(0);
				setState(749);
				match(T__53);
				setState(750);
				match(IF);
				setState(751);
				simple_expr(0);
				setState(752);
				match(T__44);
				setState(753);
				match(T__22);
				setState(754);
				list();
				setState(755);
				match(T__23);
				setState(756);
				match(T__23);
				setState(757);
				match(T__22);
				setState(758);
				list();
				setState(759);
				match(T__23);
				}
				break;
			case 6:
				_localctx = new FoldwApplyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				match(T__22);
				setState(762);
				match(T__56);
				setState(763);
				match(T__52);
				setState(764);
				prefix_operator();
				setState(765);
				match(T__1);
				setState(766);
				const_expr(0);
				setState(767);
				match(T__53);
				setState(768);
				match(IF);
				setState(769);
				simple_expr(0);
				setState(770);
				match(T__23);
				setState(771);
				match(T__22);
				setState(772);
				list();
				setState(773);
				match(T__23);
				}
				break;
			case 7:
				_localctx = new FoldwiApplyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(775);
				match(T__22);
				setState(776);
				match(T__57);
				setState(777);
				match(T__52);
				setState(778);
				prefix_operator();
				setState(779);
				match(T__1);
				setState(780);
				const_expr(0);
				setState(781);
				match(T__53);
				setState(782);
				match(IF);
				setState(783);
				simple_expr(0);
				setState(784);
				match(T__23);
				setState(785);
				match(T__22);
				setState(786);
				list();
				setState(787);
				match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_operatorContext extends ParserRuleContext {
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
	 
		public Prefix_operatorContext() { }
		public void copyFrom(Prefix_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixIdContext extends Prefix_operatorContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public PrefixIdContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPrefixId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPrefixId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPrefixId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MakeOpContext extends Prefix_operatorContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public MakeOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMakeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMakeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMakeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixUnaryOpContext extends Prefix_operatorContext {
		public Prefix_unary_operatorContext prefix_unary_operator() {
			return getRuleContext(Prefix_unary_operatorContext.class,0);
		}
		public PrefixUnaryOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPrefixUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPrefixUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPrefixUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlattenOpContext extends Prefix_operatorContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public FlattenOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFlattenOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFlattenOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFlattenOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixBinaryOpContext extends Prefix_operatorContext {
		public Prefix_binary_operatorContext prefix_binary_operator() {
			return getRuleContext(Prefix_binary_operatorContext.class,0);
		}
		public PrefixBinaryOpContext(Prefix_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPrefixBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPrefixBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPrefixBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_prefix_operator);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new PrefixIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(ID);
				}
				break;
			case 2:
				_localctx = new PrefixUnaryOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				prefix_unary_operator();
				}
				break;
			case 3:
				_localctx = new PrefixBinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				prefix_binary_operator();
				}
				break;
			case 4:
				_localctx = new MakeOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				match(T__22);
				setState(795);
				match(T__58);
				setState(796);
				match(ID);
				setState(797);
				match(T__23);
				}
				break;
			case 5:
				_localctx = new FlattenOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(798);
				match(T__22);
				setState(799);
				match(T__59);
				setState(800);
				match(ID);
				setState(801);
				match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_unary_operatorContext extends ParserRuleContext {
		public Prefix_unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_unary_operator; }
	 
		public Prefix_unary_operatorContext() { }
		public void copyFrom(Prefix_unary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortDollarContext extends Prefix_unary_operatorContext {
		public ShortDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterShortDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitShortDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitShortDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusDollarContext extends Prefix_unary_operatorContext {
		public MinusDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMinusDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMinusDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMinusDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusDollarContext extends Prefix_unary_operatorContext {
		public PlusDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPlusDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPlusDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPlusDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatDollarContext extends Prefix_unary_operatorContext {
		public FloatDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFloatDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFloatDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFloatDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotDollarContext extends Prefix_unary_operatorContext {
		public NotDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNotDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNotDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNotDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntDollarContext extends Prefix_unary_operatorContext {
		public IntDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIntDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIntDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIntDollar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealDollarContext extends Prefix_unary_operatorContext {
		public RealDollarContext(Prefix_unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterRealDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitRealDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitRealDollar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_unary_operatorContext prefix_unary_operator() throws RecognitionException {
		Prefix_unary_operatorContext _localctx = new Prefix_unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_prefix_unary_operator);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__60:
				_localctx = new PlusDollarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(T__60);
				}
				break;
			case T__61:
				_localctx = new MinusDollarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(T__61);
				}
				break;
			case T__62:
				_localctx = new NotDollarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				match(T__62);
				}
				break;
			case T__63:
				_localctx = new ShortDollarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				match(T__63);
				}
				break;
			case T__64:
				_localctx = new IntDollarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(808);
				match(T__64);
				}
				break;
			case T__65:
				_localctx = new FloatDollarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(809);
				match(T__65);
				}
				break;
			case T__66:
				_localctx = new RealDollarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(810);
				match(T__66);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prefix_binary_operatorContext extends ParserRuleContext {
		public Prefix_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_binary_operator; }
	 
		public Prefix_binary_operatorContext() { }
		public void copyFrom(Prefix_binary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusOpContext extends Prefix_binary_operatorContext {
		public MinusOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMinusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMinusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMinusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrOpContext extends Prefix_binary_operatorContext {
		public OrOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterOrOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitOrOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitOrOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqOpContext extends Prefix_binary_operatorContext {
		public EqOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEqOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtOpContext extends Prefix_binary_operatorContext {
		public GtOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGtOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivIntOpContext extends Prefix_binary_operatorContext {
		public DivIntOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDivIntOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDivIntOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDivIntOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtOpContext extends Prefix_binary_operatorContext {
		public LtOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLtOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorOpContext extends Prefix_binary_operatorContext {
		public XorOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterXorOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitXorOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitXorOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModOpContext extends Prefix_binary_operatorContext {
		public ModOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterModOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitModOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitModOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulOpContext extends Prefix_binary_operatorContext {
		public MulOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusOpContext extends Prefix_binary_operatorContext {
		public PlusOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPlusOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPlusOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPlusOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeOpContext extends Prefix_binary_operatorContext {
		public NeOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivOpContext extends Prefix_binary_operatorContext {
		public DivOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeOpContext extends Prefix_binary_operatorContext {
		public LeOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeOpContext extends Prefix_binary_operatorContext {
		public GeOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGeOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndOpContext extends Prefix_binary_operatorContext {
		public AndOpContext(Prefix_binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAndOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAndOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAndOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_binary_operatorContext prefix_binary_operator() throws RecognitionException {
		Prefix_binary_operatorContext _localctx = new Prefix_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_prefix_binary_operator);
		try {
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__67:
				_localctx = new PlusOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(T__67);
				}
				break;
			case T__68:
				_localctx = new MinusOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				match(T__68);
				}
				break;
			case T__69:
				_localctx = new MulOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(T__69);
				}
				break;
			case T__70:
				_localctx = new DivOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(816);
				match(T__70);
				}
				break;
			case T__71:
				_localctx = new ModOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(817);
				match(T__71);
				}
				break;
			case T__72:
				_localctx = new DivIntOpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(818);
				match(T__72);
				}
				break;
			case T__73:
				_localctx = new EqOpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(819);
				match(T__73);
				}
				break;
			case T__74:
				_localctx = new NeOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(820);
				match(T__74);
				}
				break;
			case T__75:
				_localctx = new LtOpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(821);
				match(T__75);
				}
				break;
			case T__76:
				_localctx = new GtOpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(822);
				match(T__76);
				}
				break;
			case T__77:
				_localctx = new LeOpContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(823);
				match(T__77);
				}
				break;
			case T__78:
				_localctx = new GeOpContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(824);
				match(T__78);
				}
				break;
			case T__79:
				_localctx = new AndOpContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(825);
				match(T__79);
				}
				break;
			case T__80:
				_localctx = new OrOpContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(826);
				match(T__80);
				}
				break;
			case T__81:
				_localctx = new XorOpContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(827);
				match(T__81);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IteratorContext extends ParserRuleContext {
		public IteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterator; }
	 
		public IteratorContext() { }
		public void copyFrom(IteratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldContext extends IteratorContext {
		public FoldContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFold(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FoldiContext extends IteratorContext {
		public FoldiContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFoldi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFoldi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFoldi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapiContext extends IteratorContext {
		public MapiContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends IteratorContext {
		public MapContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapfoldContext extends IteratorContext {
		public MapfoldContext(IteratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMapfold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMapfold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMapfold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorContext iterator() throws RecognitionException {
		IteratorContext _localctx = new IteratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_iterator);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				_localctx = new MapContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				match(T__82);
				}
				break;
			case T__83:
				_localctx = new FoldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(T__83);
				}
				break;
			case T__84:
				_localctx = new MapiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				match(T__84);
				}
				break;
			case T__85:
				_localctx = new FoldiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				match(T__85);
				}
				break;
			case T__86:
				_localctx = new MapfoldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(834);
				match(T__86);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881305799262208L) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 547608330241L) != 0)) {
				{
				setState(837);
				simple_expr(0);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(838);
					match(T__5);
					setState(839);
					simple_expr(0);
					}
					}
					setState(844);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_arith_opContext extends ParserRuleContext {
		public Unary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_arith_op; }
	 
		public Unary_arith_opContext() { }
		public void copyFrom(Unary_arith_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends Unary_arith_opContext {
		public NotContext(Unary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends Unary_arith_opContext {
		public PlusContext(Unary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends Unary_arith_opContext {
		public MinusContext(Unary_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_arith_opContext unary_arith_op() throws RecognitionException {
		Unary_arith_opContext _localctx = new Unary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unary_arith_op);
		try {
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(T__49);
				}
				break;
			case T__87:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(T__87);
				}
				break;
			case T__30:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_arith_opContext extends ParserRuleContext {
		public Bin_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_arith_op; }
	 
		public Bin_arith_opContext() { }
		public void copyFrom(Bin_arith_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Bin_arith_opContext {
		public AddContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Bin_arith_opContext {
		public DivContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Bin_arith_opContext {
		public SubContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends Bin_arith_opContext {
		public ModContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends Bin_arith_opContext {
		public MulContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivIntContext extends Bin_arith_opContext {
		public DivIntContext(Bin_arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterDivInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitDivInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitDivInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_arith_opContext bin_arith_op() throws RecognitionException {
		Bin_arith_opContext _localctx = new Bin_arith_opContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bin_arith_op);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(T__87);
				}
				break;
			case T__49:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(T__49);
				}
				break;
			case T__88:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				match(T__88);
				}
				break;
			case T__89:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				match(T__89);
				}
				break;
			case T__90:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				match(T__90);
				}
				break;
			case T__91:
				_localctx = new DivIntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(857);
				match(T__91);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_relation_opContext extends ParserRuleContext {
		public Bin_relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_relation_op; }
	 
		public Bin_relation_opContext() { }
		public void copyFrom(Bin_relation_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeContext extends Bin_relation_opContext {
		public NeContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitNe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitNe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends Bin_relation_opContext {
		public LtContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeContext extends Bin_relation_opContext {
		public LeContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends Bin_relation_opContext {
		public EqContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends Bin_relation_opContext {
		public GtContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeContext extends Bin_relation_opContext {
		public GeContext(Bin_relation_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_relation_opContext bin_relation_op() throws RecognitionException {
		Bin_relation_opContext _localctx = new Bin_relation_opContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_bin_relation_op);
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new EqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				match(T__2);
				}
				break;
			case T__92:
				_localctx = new NeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(T__92);
				}
				break;
			case T__93:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				match(T__93);
				}
				break;
			case T__94:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				match(T__94);
				}
				break;
			case T__95:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				match(T__95);
				}
				break;
			case T__96:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(865);
				match(T__96);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_bool_opContext extends ParserRuleContext {
		public Bin_bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_bool_op; }
	 
		public Bin_bool_opContext() { }
		public void copyFrom(Bin_bool_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Bin_bool_opContext {
		public OrContext(Bin_bool_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends Bin_bool_opContext {
		public AndContext(Bin_bool_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends Bin_bool_opContext {
		public XorContext(Bin_bool_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_bool_opContext bin_bool_op() throws RecognitionException {
		Bin_bool_opContext _localctx = new Bin_bool_opContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_bin_bool_op);
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(T__97);
				}
				break;
			case T__98:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(T__98);
				}
				break;
			case T__99:
				_localctx = new XorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				match(T__99);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends AtomContext {
		public TerminalNode INTEGER() { return getToken(SynlongParser.INTEGER, 0); }
		public IntegerContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(SynlongParser.FLOAT, 0); }
		public FloatContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends AtomContext {
		public TerminalNode CHAR() { return getToken(SynlongParser.CHAR, 0); }
		public CharContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UIntegerContext extends AtomContext {
		public TerminalNode UINT() { return getToken(SynlongParser.UINT, 0); }
		public UIntegerContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends AtomContext {
		public TerminalNode REAL() { return getToken(SynlongParser.REAL, 0); }
		public RealContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends AtomContext {
		public TrueContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UShortContext extends AtomContext {
		public TerminalNode USHORT() { return getToken(SynlongParser.USHORT, 0); }
		public UShortContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterUShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitUShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitUShort(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends AtomContext {
		public FalseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortContext extends AtomContext {
		public TerminalNode SHORT() { return getToken(SynlongParser.SHORT, 0); }
		public ShortContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_atom);
		try {
			setState(882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				match(T__51);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				match(CHAR);
				}
				break;
			case INTEGER:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(876);
				match(INTEGER);
				}
				break;
			case UINT:
				_localctx = new UIntegerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(877);
				match(UINT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(878);
				match(FLOAT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(879);
				match(REAL);
				}
				break;
			case USHORT:
				_localctx = new UShortContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(880);
				match(USHORT);
				}
				break;
			case SHORT:
				_localctx = new ShortContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(881);
				match(SHORT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SynlongParser.ID, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(T__100);
			setState(885);
			match(ID);
			setState(886);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealizabilityInputsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public RealizabilityInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realizabilityInputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterRealizabilityInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitRealizabilityInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitRealizabilityInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealizabilityInputsContext realizabilityInputs() throws RecognitionException {
		RealizabilityInputsContext _localctx = new RealizabilityInputsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_realizabilityInputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(T__101);
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(889);
				match(ID);
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(890);
					match(T__5);
					setState(891);
					match(ID);
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(899);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IvcContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SynlongParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SynlongParser.ID, i);
		}
		public IvcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ivc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterIvc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitIvc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitIvc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IvcContext ivc() throws RecognitionException {
		IvcContext _localctx = new IvcContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ivc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(T__102);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(902);
				match(ID);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(903);
					match(T__5);
					setState(904);
					match(ID);
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(912);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(T__103);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(915);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssertionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SynlongListener ) ((SynlongListener)listener).exitAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SynlongVisitor ) return ((SynlongVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(T__104);
			setState(919);
			expr();
			setState(920);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return type_expr_sempred((Type_exprContext)_localctx, predIndex);
		case 10:
			return const_expr_sempred((Const_exprContext)_localctx, predIndex);
		case 30:
			return state_decl_sempred((State_declContext)_localctx, predIndex);
		case 39:
			return simple_expr_sempred((Simple_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_expr_sempred(Type_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean const_expr_sempred(Const_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean state_decl_sempred(State_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _input.LT(1).getType() == VAR;
		}
		return true;
	}
	private boolean simple_expr_sempred(Simple_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0080\u039b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0001\u0000\u0005\u0000\u0088\b\u0000\n"+
		"\u0000\f\u0000\u008b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0092\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002\u0098\b\u0002\u000b\u0002\f\u0002\u0099"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009f\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00a7\b\u0004\n\u0004\f\u0004\u00aa\t\u0004\u0001\u0004\u0003\u0004\u00ad"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00c1\b\u0005\n\u0005\f\u0005\u00c4\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00c8\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00cd\b\u0005\n\u0005\f\u0005\u00d0\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0004\b\u00dc\b\b\u000b\b\f\b\u00dd\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00e5\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f9\b\n\n\n\f\n\u00fc\t\n"+
		"\u0001\n\u0001\n\u0003\n\u0100\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u010e"+
		"\b\n\n\n\f\n\u0111\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0116\b\u000b\n\u000b\f\u000b\u0119\t\u000b\u0003\u000b\u011b\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u012d"+
		"\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0131\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0137\b\u000f\n\u000f\f\u000f"+
		"\u013a\t\u000f\u0003\u000f\u013c\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0145"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0149\b\u0011\u0003\u0011"+
		"\u014b\b\u0011\u0003\u0011\u014d\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u0153\b\u0012\u000b\u0012\f\u0012\u0154"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u015a\b\u0013\n\u0013"+
		"\f\u0013\u015d\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0162\b\u0013\u0001\u0013\u0003\u0013\u0165\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u016f\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u017d\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0185"+
		"\b\u0019\n\u0019\f\u0019\u0188\t\u0019\u0003\u0019\u018a\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0191"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u0196\b\u001c"+
		"\u000b\u001c\f\u001c\u0197\u0001\u001d\u0001\u001d\u0003\u001d\u019c\b"+
		"\u001d\u0001\u001d\u0004\u001d\u019f\b\u001d\u000b\u001d\f\u001d\u01a0"+
		"\u0001\u001e\u0003\u001e\u01a4\b\u001e\u0001\u001e\u0003\u001e\u01a7\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u01ad"+
		"\b\u001e\u000b\u001e\f\u001e\u01ae\u0003\u001e\u01b1\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u01b8\b\u001e"+
		"\u000b\u001e\f\u001e\u01b9\u0003\u001e\u01bc\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01c4"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u01ce\b \n \f \u01d1\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0003#\u01e5\b#\u0001$\u0003$\u01e8\b$\u0001$\u0001$"+
		"\u0003$\u01ec\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u01ff\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0215\b\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u022b"+
		"\b\'\n\'\f\'\u022e\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u024f\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0004*\u0261\b*\u000b*\f*\u0262\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0271"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u0277\b+\n+\f+\u027a\t+\u0001+"+
		"\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0004"+
		"-\u0286\b-\u000b-\f-\u0287\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0003.\u0291\b.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00040\u02a3"+
		"\b0\u000b0\f0\u02a4\u00010\u00010\u00030\u02a9\b0\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00032\u02b3\b2\u00012\u00012\u0001"+
		"2\u00012\u00032\u02b9\b2\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0316\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0323\b4\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u032c\b5\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u033d\b6\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u0344\b7\u00018\u00018\u00018\u00058\u0349\b8\n8\f8\u034c\t8"+
		"\u00038\u034e\b8\u00019\u00019\u00019\u00039\u0353\b9\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u035b\b:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0003;\u0363\b;\u0001<\u0001<\u0001<\u0003<\u0368\b<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0373\b=\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0005?\u037d\b?\n?"+
		"\f?\u0380\t?\u0003?\u0382\b?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"@\u0005@\u038a\b@\n@\f@\u038d\t@\u0003@\u038f\b@\u0001@\u0001@\u0001A"+
		"\u0001A\u0003A\u0395\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0000\u0003"+
		"\n\u0014NC\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0000\u0001\u0001\u0000qr\u0408\u0000\u0089\u0001"+
		"\u0000\u0000\u0000\u0002\u0091\u0001\u0000\u0000\u0000\u0004\u0093\u0001"+
		"\u0000\u0000\u0000\u0006\u009b\u0001\u0000\u0000\u0000\b\u00ac\u0001\u0000"+
		"\u0000\u0000\n\u00c7\u0001\u0000\u0000\u0000\f\u00d1\u0001\u0000\u0000"+
		"\u0000\u000e\u00d5\u0001\u0000\u0000\u0000\u0010\u00d7\u0001\u0000\u0000"+
		"\u0000\u0012\u00df\u0001\u0000\u0000\u0000\u0014\u00ff\u0001\u0000\u0000"+
		"\u0000\u0016\u011a\u0001\u0000\u0000\u0000\u0018\u011c\u0001\u0000\u0000"+
		"\u0000\u001a\u012c\u0001\u0000\u0000\u0000\u001c\u0130\u0001\u0000\u0000"+
		"\u0000\u001e\u0132\u0001\u0000\u0000\u0000 \u013f\u0001\u0000\u0000\u0000"+
		"\"\u014c\u0001\u0000\u0000\u0000$\u014e\u0001\u0000\u0000\u0000&\u0156"+
		"\u0001\u0000\u0000\u0000(\u0166\u0001\u0000\u0000\u0000*\u0168\u0001\u0000"+
		"\u0000\u0000,\u016e\u0001\u0000\u0000\u0000.\u0170\u0001\u0000\u0000\u0000"+
		"0\u017c\u0001\u0000\u0000\u00002\u0189\u0001\u0000\u0000\u00004\u018b"+
		"\u0001\u0000\u0000\u00006\u018d\u0001\u0000\u0000\u00008\u0195\u0001\u0000"+
		"\u0000\u0000:\u0199\u0001\u0000\u0000\u0000<\u01a3\u0001\u0000\u0000\u0000"+
		">\u01c3\u0001\u0000\u0000\u0000@\u01c5\u0001\u0000\u0000\u0000B\u01d4"+
		"\u0001\u0000\u0000\u0000D\u01db\u0001\u0000\u0000\u0000F\u01e4\u0001\u0000"+
		"\u0000\u0000H\u01eb\u0001\u0000\u0000\u0000J\u01ed\u0001\u0000\u0000\u0000"+
		"L\u01fe\u0001\u0000\u0000\u0000N\u0214\u0001\u0000\u0000\u0000P\u024e"+
		"\u0001\u0000\u0000\u0000R\u0250\u0001\u0000\u0000\u0000T\u0270\u0001\u0000"+
		"\u0000\u0000V\u0272\u0001\u0000\u0000\u0000X\u027d\u0001\u0000\u0000\u0000"+
		"Z\u0281\u0001\u0000\u0000\u0000\\\u0290\u0001\u0000\u0000\u0000^\u0292"+
		"\u0001\u0000\u0000\u0000`\u02a8\u0001\u0000\u0000\u0000b\u02aa\u0001\u0000"+
		"\u0000\u0000d\u02b8\u0001\u0000\u0000\u0000f\u0315\u0001\u0000\u0000\u0000"+
		"h\u0322\u0001\u0000\u0000\u0000j\u032b\u0001\u0000\u0000\u0000l\u033c"+
		"\u0001\u0000\u0000\u0000n\u0343\u0001\u0000\u0000\u0000p\u034d\u0001\u0000"+
		"\u0000\u0000r\u0352\u0001\u0000\u0000\u0000t\u035a\u0001\u0000\u0000\u0000"+
		"v\u0362\u0001\u0000\u0000\u0000x\u0367\u0001\u0000\u0000\u0000z\u0372"+
		"\u0001\u0000\u0000\u0000|\u0374\u0001\u0000\u0000\u0000~\u0378\u0001\u0000"+
		"\u0000\u0000\u0080\u0385\u0001\u0000\u0000\u0000\u0082\u0392\u0001\u0000"+
		"\u0000\u0000\u0084\u0396\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0002"+
		"\u0001\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u0000\u0000\u0001\u008d\u0001\u0001\u0000"+
		"\u0000\u0000\u008e\u0092\u0003\u0004\u0002\u0000\u008f\u0092\u0003\u0010"+
		"\b\u0000\u0090\u0092\u0003\u001a\r\u0000\u0091\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0003\u0001\u0000\u0000\u0000\u0093\u0097\u0005\u0001\u0000"+
		"\u0000\u0094\u0095\u0003\u0006\u0003\u0000\u0095\u0096\u0005\u0002\u0000"+
		"\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0005\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0005w\u0000\u0000\u009c\u009d\u0005\u0003\u0000\u0000"+
		"\u009d\u009f\u0003\b\u0004\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u0007\u0001\u0000\u0000\u0000\u00a0"+
		"\u00ad\u0003\n\u0005\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0005\u0000\u0000\u00a3\u00a8\u0005w\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0006\u0000\u0000\u00a5\u00a7\u0005w\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\u0007"+
		"\u0000\u0000\u00ac\u00a0\u0001\u0000\u0000\u0000\u00ac\u00a1\u0001\u0000"+
		"\u0000\u0000\u00ad\t\u0001\u0000\u0000\u0000\u00ae\u00af\u0006\u0005\uffff"+
		"\uffff\u0000\u00af\u00c8\u0005\b\u0000\u0000\u00b0\u00c8\u0005\t\u0000"+
		"\u0000\u00b1\u00c8\u0005\n\u0000\u0000\u00b2\u00c8\u0005\u000b\u0000\u0000"+
		"\u00b3\u00c8\u0005\f\u0000\u0000\u00b4\u00c8\u0005\r\u0000\u0000\u00b5"+
		"\u00c8\u0005\u000e\u0000\u0000\u00b6\u00c8\u0005\u000f\u0000\u0000\u00b7"+
		"\u00c8\u0005\u0010\u0000\u0000\u00b8\u00c8\u0005\u0011\u0000\u0000\u00b9"+
		"\u00c8\u0005\u0012\u0000\u0000\u00ba\u00c8\u0005\u0013\u0000\u0000\u00bb"+
		"\u00c8\u0003\u000e\u0007\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000\u00bd"+
		"\u00c2\u0003\f\u0006\u0000\u00be\u00bf\u0005\u0006\u0000\u0000\u00bf\u00c1"+
		"\u0003\f\u0006\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c7\u00ae\u0001\u0000\u0000\u0000\u00c7\u00b0\u0001"+
		"\u0000\u0000\u0000\u00c7\u00b1\u0001\u0000\u0000\u0000\u00c7\u00b2\u0001"+
		"\u0000\u0000\u0000\u00c7\u00b3\u0001\u0000\u0000\u0000\u00c7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00b5\u0001\u0000\u0000\u0000\u00c7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00c7\u00b7\u0001\u0000\u0000\u0000\u00c7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c7\u00b9\u0001\u0000\u0000\u0000\u00c7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c7\u00bb\u0001\u0000\u0000\u0000\u00c7\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ce\u0001\u0000\u0000\u0000\u00c9\u00ca\n\u0001"+
		"\u0000\u0000\u00ca\u00cb\u0005\u0014\u0000\u0000\u00cb\u00cd\u0005y\u0000"+
		"\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u000b\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005w\u0000\u0000\u00d2\u00d3\u0005\u0015\u0000\u0000"+
		"\u00d3\u00d4\u0003\n\u0005\u0000\u00d4\r\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005w\u0000\u0000\u00d6\u000f\u0001\u0000\u0000\u0000\u00d7\u00db"+
		"\u0005\u0016\u0000\u0000\u00d8\u00d9\u0003\u0012\t\u0000\u00d9\u00da\u0005"+
		"\u0002\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d8\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u0011\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005w\u0000\u0000\u00e0\u00e1\u0005\u0015"+
		"\u0000\u0000\u00e1\u00e4\u0003\n\u0005\u0000\u00e2\u00e3\u0005\u0003\u0000"+
		"\u0000\u00e3\u00e5\u0003\u0014\n\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u0013\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0006\n\uffff\uffff\u0000\u00e7\u0100\u0005w\u0000\u0000"+
		"\u00e8\u0100\u0003z=\u0000\u00e9\u00ea\u0005\u0017\u0000\u0000\u00ea\u00eb"+
		"\u0003\u0014\n\u0000\u00eb\u00ec\u0005\u0018\u0000\u0000\u00ec\u0100\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0003r9\u0000\u00ee\u00ef\u0003\u0014\n"+
		"\u0006\u00ef\u0100\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0019\u0000"+
		"\u0000\u00f1\u00f2\u0003\u0016\u000b\u0000\u00f2\u00f3\u0005\u001a\u0000"+
		"\u0000\u00f3\u0100\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0005\u0000"+
		"\u0000\u00f5\u00fa\u0003\u0018\f\u0000\u00f6\u00f7\u0005\u0006\u0000\u0000"+
		"\u00f7\u00f9\u0003\u0018\f\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000\u00fe"+
		"\u0100\u0001\u0000\u0000\u0000\u00ff\u00e6\u0001\u0000\u0000\u0000\u00ff"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ff\u00e9\u0001\u0000\u0000\u0000\u00ff"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ff\u00f0\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f4\u0001\u0000\u0000\u0000\u0100\u010f\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\n\u0005\u0000\u0000\u0102\u0103\u0003t:\u0000\u0103\u0104\u0003"+
		"\u0014\n\u0006\u0104\u010e\u0001\u0000\u0000\u0000\u0105\u0106\n\u0004"+
		"\u0000\u0000\u0106\u0107\u0003x<\u0000\u0107\u0108\u0003\u0014\n\u0005"+
		"\u0108\u010e\u0001\u0000\u0000\u0000\u0109\u010a\n\u0003\u0000\u0000\u010a"+
		"\u010b\u0003v;\u0000\u010b\u010c\u0003\u0014\n\u0004\u010c\u010e\u0001"+
		"\u0000\u0000\u0000\u010d\u0101\u0001\u0000\u0000\u0000\u010d\u0105\u0001"+
		"\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010e\u0111\u0001"+
		"\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u0110\u0015\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0112\u0117\u0003\u0014\n\u0000\u0113\u0114\u0005\u0006"+
		"\u0000\u0000\u0114\u0116\u0003\u0014\n\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u0112\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0017\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005w\u0000\u0000\u011d\u011e\u0005\u0015\u0000\u0000"+
		"\u011e\u011f\u0003\u0014\n\u0000\u011f\u0019\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0003\u001c\u000e\u0000\u0121\u0122\u0005w\u0000\u0000\u0122\u0123"+
		"\u0003\u001e\u000f\u0000\u0123\u0124\u0003 \u0010\u0000\u0124\u0125\u0003"+
		"\"\u0011\u0000\u0125\u012d\u0001\u0000\u0000\u0000\u0126\u0127\u0003\u001c"+
		"\u000e\u0000\u0127\u0128\u0005\u001b\u0000\u0000\u0128\u0129\u0005w\u0000"+
		"\u0000\u0129\u012a\u0003\u001e\u000f\u0000\u012a\u012b\u0003 \u0010\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0120\u0001\u0000\u0000\u0000"+
		"\u012c\u0126\u0001\u0000\u0000\u0000\u012d\u001b\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0005\u001c\u0000\u0000\u012f\u0131\u0005\u001d\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000"+
		"\u0131\u001d\u0001\u0000\u0000\u0000\u0132\u013b\u0005\u0017\u0000\u0000"+
		"\u0133\u0138\u0003&\u0013\u0000\u0134\u0135\u0005\u0002\u0000\u0000\u0135"+
		"\u0137\u0003&\u0013\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013a"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013b\u0133\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u0018\u0000\u0000\u013e\u001f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005v\u0000\u0000\u0140\u0141\u0003\u001e\u000f\u0000\u0141!\u0001\u0000"+
		"\u0000\u0000\u0142\u014d\u0005\u0002\u0000\u0000\u0143\u0145\u0003$\u0012"+
		"\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u014a\u0001\u0000\u0000\u0000\u0146\u0148\u0003@ \u0000\u0147"+
		"\u0149\u0005\u0002\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u0146\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u014d\u0001\u0000\u0000\u0000\u014c\u0142\u0001\u0000\u0000\u0000\u014c"+
		"\u0144\u0001\u0000\u0000\u0000\u014d#\u0001\u0000\u0000\u0000\u014e\u0152"+
		"\u0005k\u0000\u0000\u014f\u0150\u0003&\u0013\u0000\u0150\u0151\u0005\u0002"+
		"\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155%\u0001\u0000\u0000"+
		"\u0000\u0156\u015b\u0003(\u0014\u0000\u0157\u0158\u0005\u0006\u0000\u0000"+
		"\u0158\u015a\u0003(\u0014\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a"+
		"\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0015\u0000\u0000\u015f"+
		"\u0161\u0003\n\u0005\u0000\u0160\u0162\u0003*\u0015\u0000\u0161\u0160"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164"+
		"\u0001\u0000\u0000\u0000\u0163\u0165\u0003.\u0017\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\'\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0005w\u0000\u0000\u0167)\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0005\u001e\u0000\u0000\u0169\u016a\u0003,\u0016\u0000\u016a"+
		"+\u0001\u0000\u0000\u0000\u016b\u016f\u0005w\u0000\u0000\u016c\u016d\u0005"+
		"\u001f\u0000\u0000\u016d\u016f\u0005w\u0000\u0000\u016e\u016b\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f-\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005 \u0000\u0000\u0171\u0172\u0005\u0003\u0000\u0000"+
		"\u0172\u0173\u0003\u0014\n\u0000\u0173/\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u00032\u0019\u0000\u0175\u0176\u0005\u0003\u0000\u0000\u0176\u0177"+
		"\u0003L&\u0000\u0177\u0178\u0005\u0002\u0000\u0000\u0178\u017d\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0003:\u001d\u0000\u017a\u017b\u00036\u001b\u0000"+
		"\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u0174\u0001\u0000\u0000\u0000"+
		"\u017c\u0179\u0001\u0000\u0000\u0000\u017d1\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0005\u0017\u0000\u0000\u017f\u018a\u0005\u0018\u0000\u0000\u0180"+
		"\u018a\u0005!\u0000\u0000\u0181\u0186\u00034\u001a\u0000\u0182\u0183\u0005"+
		"\u0006\u0000\u0000\u0183\u0185\u00034\u001a\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000"+
		"\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u017e\u0001\u0000"+
		"\u0000\u0000\u0189\u0180\u0001\u0000\u0000\u0000\u0189\u0181\u0001\u0000"+
		"\u0000\u0000\u018a3\u0001\u0000\u0000\u0000\u018b\u018c\u0005w\u0000\u0000"+
		"\u018c5\u0001\u0000\u0000\u0000\u018d\u0190\u0005v\u0000\u0000\u018e\u0191"+
		"\u00038\u001c\u0000\u018f\u0191\u0005\"\u0000\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0005\u0002\u0000\u0000\u01937\u0001\u0000"+
		"\u0000\u0000\u0194\u0196\u0005w\u0000\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u01989\u0001\u0000\u0000\u0000"+
		"\u0199\u019b\u0005u\u0000\u0000\u019a\u019c\u0005w\u0000\u0000\u019b\u019a"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0001\u0000\u0000\u0000\u019d\u019f\u0003<\u001e\u0000\u019e\u019d\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u019e\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1;\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a4\u0005s\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a7\u0005t\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0005n\u0000\u0000\u01a9\u01b0\u0005w\u0000\u0000\u01aa\u01ac"+
		"\u0005o\u0000\u0000\u01ab\u01ad\u0003J%\u0000\u01ac\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b0\u01aa\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0004\u001e"+
		"\u0004\u0000\u01b3\u01b4\u0003>\u001f\u0000\u01b4\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b7\u0005p\u0000\u0000\u01b6\u01b8\u0003J%\u0000\u01b7"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b5\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc=\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0003$\u0012\u0000\u01be\u01bf\u0003@ \u0000\u01bf\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c4\u0003$\u0012\u0000\u01c1\u01c4\u0003@ \u0000"+
		"\u01c2\u01c4\u00030\u0018\u0000\u01c3\u01bd\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4?\u0001\u0000\u0000\u0000\u01c5\u01cf"+
		"\u0005l\u0000\u0000\u01c6\u01ce\u00030\u0018\u0000\u01c7\u01ce\u0003B"+
		"!\u0000\u01c8\u01ce\u0003|>\u0000\u01c9\u01ce\u0003\u0084B\u0000\u01ca"+
		"\u01ce\u0003\u0082A\u0000\u01cb\u01ce\u0003~?\u0000\u01cc\u01ce\u0003"+
		"\u0080@\u0000\u01cd\u01c6\u0001\u0000\u0000\u0000\u01cd\u01c7\u0001\u0000"+
		"\u0000\u0000\u01cd\u01c8\u0001\u0000\u0000\u0000\u01cd\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005m\u0000\u0000\u01d3A\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0005#\u0000\u0000\u01d5\u01d6\u0005w\u0000\u0000\u01d6\u01d7"+
		"\u0003D\"\u0000\u01d7\u01d8\u0005v\u0000\u0000\u01d8\u01d9\u0005\"\u0000"+
		"\u0000\u01d9\u01da\u0005\u0002\u0000\u0000\u01daC\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0005j\u0000\u0000\u01dc\u01dd\u0003N\'\u0000\u01dd\u01de"+
		"\u0005$\u0000\u0000\u01de\u01df\u0003H$\u0000\u01df\u01e0\u0005%\u0000"+
		"\u0000\u01e0\u01e1\u0003F#\u0000\u01e1E\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e5\u0003D\"\u0000\u01e3\u01e5\u0003H$\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5G\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e8\u0003$\u0012\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ec\u0003@ \u0000\u01ea\u01ec\u0003B!\u0000\u01eb\u01e7\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ecI\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005j\u0000\u0000\u01ee\u01ef\u0003L&\u0000"+
		"\u01ef\u01f0\u0007\u0000\u0000\u0000\u01f0\u01f1\u0005w\u0000\u0000\u01f1"+
		"\u01f2\u0005\u0002\u0000\u0000\u01f2K\u0001\u0000\u0000\u0000\u01f3\u01ff"+
		"\u0003N\'\u0000\u01f4\u01f5\u0005 \u0000\u0000\u01f5\u01f6\u0005&\u0000"+
		"\u0000\u01f6\u01ff\u0005w\u0000\u0000\u01f7\u01ff\u0003P(\u0000\u01f8"+
		"\u01ff\u0003R)\u0000\u01f9\u01ff\u0003T*\u0000\u01fa\u01ff\u0003V+\u0000"+
		"\u01fb\u01ff\u0003Z-\u0000\u01fc\u01ff\u0003`0\u0000\u01fd\u01ff\u0003"+
		"f3\u0000\u01fe\u01f3\u0001\u0000\u0000\u0000\u01fe\u01f4\u0001\u0000\u0000"+
		"\u0000\u01fe\u01f7\u0001\u0000\u0000\u0000\u01fe\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fe\u01f9\u0001\u0000\u0000\u0000\u01fe\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ffM\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0006\'\uffff\uffff\u0000\u0201\u0215\u0005w\u0000\u0000"+
		"\u0202\u0215\u0003z=\u0000\u0203\u0204\u0005 \u0000\u0000\u0204\u0205"+
		"\u0005&\u0000\u0000\u0205\u0215\u0005w\u0000\u0000\u0206\u0207\u0003r"+
		"9\u0000\u0207\u0208\u0003N\'\u0007\u0208\u0215\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0005\u0017\u0000\u0000\u020a\u020b\u0003\n\u0005\u0000\u020b"+
		"\u020c\u0003N\'\u0000\u020c\u020d\u0005\u0018\u0000\u0000\u020d\u0215"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0013\u0000\u0000\u020f\u0215"+
		"\u0003N\'\u0002\u0210\u0211\u0005\u0017\u0000\u0000\u0211\u0212\u0003"+
		"N\'\u0000\u0212\u0213\u0005\u0018\u0000\u0000\u0213\u0215\u0001\u0000"+
		"\u0000\u0000\u0214\u0200\u0001\u0000\u0000\u0000\u0214\u0202\u0001\u0000"+
		"\u0000\u0000\u0214\u0203\u0001\u0000\u0000\u0000\u0214\u0206\u0001\u0000"+
		"\u0000\u0000\u0214\u0209\u0001\u0000\u0000\u0000\u0214\u020e\u0001\u0000"+
		"\u0000\u0000\u0214\u0210\u0001\u0000\u0000\u0000\u0215\u022c\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\n\u0006\u0000\u0000\u0217\u0218\u0003t:\u0000"+
		"\u0218\u0219\u0003N\'\u0007\u0219\u022b\u0001\u0000\u0000\u0000\u021a"+
		"\u021b\n\u0005\u0000\u0000\u021b\u021c\u0003x<\u0000\u021c\u021d\u0003"+
		"N\'\u0006\u021d\u022b\u0001\u0000\u0000\u0000\u021e\u021f\n\u0004\u0000"+
		"\u0000\u021f\u0220\u0003v;\u0000\u0220\u0221\u0003N\'\u0005\u0221\u022b"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\n\t\u0000\u0000\u0223\u0224\u0005"+
		"\u0019\u0000\u0000\u0224\u0225\u0003\u0014\n\u0000\u0225\u0226\u0005\u001a"+
		"\u0000\u0000\u0226\u022b\u0001\u0000\u0000\u0000\u0227\u0228\n\b\u0000"+
		"\u0000\u0228\u0229\u0005\'\u0000\u0000\u0229\u022b\u0005w\u0000\u0000"+
		"\u022a\u0216\u0001\u0000\u0000\u0000\u022a\u021a\u0001\u0000\u0000\u0000"+
		"\u022a\u021e\u0001\u0000\u0000\u0000\u022a\u0222\u0001\u0000\u0000\u0000"+
		"\u022a\u0227\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000"+
		"\u022dO\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0005(\u0000\u0000\u0230\u024f\u0003N\'\u0000\u0231\u0232\u0003"+
		"N\'\u0000\u0232\u0233\u0005)\u0000\u0000\u0233\u0234\u0003N\'\u0000\u0234"+
		"\u024f\u0001\u0000\u0000\u0000\u0235\u0236\u0005*\u0000\u0000\u0236\u0237"+
		"\u0005\u0017\u0000\u0000\u0237\u0238\u0003N\'\u0000\u0238\u0239\u0005"+
		"\u0002\u0000\u0000\u0239\u023a\u0003\u0014\n\u0000\u023a\u023b\u0005\u0002"+
		"\u0000\u0000\u023b\u023c\u0003N\'\u0000\u023c\u023d\u0005\u0018\u0000"+
		"\u0000\u023d\u024f\u0001\u0000\u0000\u0000\u023e\u023f\u0003N\'\u0000"+
		"\u023f\u0240\u0005*\u0000\u0000\u0240\u0241\u0003N\'\u0000\u0241\u024f"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0003N\'\u0000\u0243\u0244\u0005"+
		"\u001e\u0000\u0000\u0244\u0245\u0003,\u0016\u0000\u0245\u024f\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0005+\u0000\u0000\u0247\u0248\u0005w\u0000\u0000"+
		"\u0248\u0249\u0005\u0017\u0000\u0000\u0249\u024a\u0003N\'\u0000\u024a"+
		"\u024b\u0005\u0006\u0000\u0000\u024b\u024c\u0003N\'\u0000\u024c\u024d"+
		"\u0005\u0018\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u022f"+
		"\u0001\u0000\u0000\u0000\u024e\u0231\u0001\u0000\u0000\u0000\u024e\u0235"+
		"\u0001\u0000\u0000\u0000\u024e\u023e\u0001\u0000\u0000\u0000\u024e\u0242"+
		"\u0001\u0000\u0000\u0000\u024e\u0246\u0001\u0000\u0000\u0000\u024fQ\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0005,\u0000\u0000\u0251\u0252\u0005\u0017"+
		"\u0000\u0000\u0252\u0253\u0003p8\u0000\u0253\u0254\u0005\u0018\u0000\u0000"+
		"\u0254S\u0001\u0000\u0000\u0000\u0255\u0256\u0003N\'\u0000\u0256\u0257"+
		"\u0005\u0019\u0000\u0000\u0257\u0258\u0005y\u0000\u0000\u0258\u0259\u0005"+
		"\"\u0000\u0000\u0259\u025a\u0005y\u0000\u0000\u025a\u025b\u0005\u001a"+
		"\u0000\u0000\u025b\u0271\u0001\u0000\u0000\u0000\u025c\u025d\u0005\u0017"+
		"\u0000\u0000\u025d\u025e\u0003N\'\u0000\u025e\u0260\u0005\'\u0000\u0000"+
		"\u025f\u0261\u0003^/\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0261\u0262"+
		"\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0263"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0005-\u0000\u0000\u0265\u0266\u0003N\'\u0000\u0266\u0267\u0005\u0018"+
		"\u0000\u0000\u0267\u0271\u0001\u0000\u0000\u0000\u0268\u0269\u0003N\'"+
		"\u0000\u0269\u026a\u0005\u0014\u0000\u0000\u026a\u026b\u0003\u0014\n\u0000"+
		"\u026b\u0271\u0001\u0000\u0000\u0000\u026c\u026d\u0005\u0019\u0000\u0000"+
		"\u026d\u026e\u0003p8\u0000\u026e\u026f\u0005\u001a\u0000\u0000\u026f\u0271"+
		"\u0001\u0000\u0000\u0000\u0270\u0255\u0001\u0000\u0000\u0000\u0270\u025c"+
		"\u0001\u0000\u0000\u0000\u0270\u0268\u0001\u0000\u0000\u0000\u0270\u026c"+
		"\u0001\u0000\u0000\u0000\u0271U\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"\u0005\u0000\u0000\u0273\u0278\u0003X,\u0000\u0274\u0275\u0005\u0006\u0000"+
		"\u0000\u0275\u0277\u0003X,\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0277"+
		"\u027a\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278"+
		"\u0279\u0001\u0000\u0000\u0000\u0279\u027b\u0001\u0000\u0000\u0000\u027a"+
		"\u0278\u0001\u0000\u0000\u0000\u027b\u027c\u0005\u0007\u0000\u0000\u027c"+
		"W\u0001\u0000\u0000\u0000\u027d\u027e\u0005w\u0000\u0000\u027e\u027f\u0005"+
		"\u0015\u0000\u0000\u027f\u0280\u0003N\'\u0000\u0280Y\u0001\u0000\u0000"+
		"\u0000\u0281\u0282\u0005\u0017\u0000\u0000\u0282\u0283\u0005w\u0000\u0000"+
		"\u0283\u0285\u0005.\u0000\u0000\u0284\u0286\u0003\\.\u0000\u0285\u0284"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0285"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0005\u0003\u0000\u0000\u028a\u028b"+
		"\u0003N\'\u0000\u028b\u028c\u0005\u0018\u0000\u0000\u028c[\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0005\'\u0000\u0000\u028e\u0291\u0005w\u0000"+
		"\u0000\u028f\u0291\u0003^/\u0000\u0290\u028d\u0001\u0000\u0000\u0000\u0290"+
		"\u028f\u0001\u0000\u0000\u0000\u0291]\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0005\u0019\u0000\u0000\u0293\u0294\u0003N\'\u0000\u0294\u0295\u0005"+
		"\u001a\u0000\u0000\u0295_\u0001\u0000\u0000\u0000\u0296\u0297\u0005j\u0000"+
		"\u0000\u0297\u0298\u0003N\'\u0000\u0298\u0299\u0005$\u0000\u0000\u0299"+
		"\u029a\u0003N\'\u0000\u029a\u029b\u0005%\u0000\u0000\u029b\u029c\u0003"+
		"N\'\u0000\u029c\u02a9\u0001\u0000\u0000\u0000\u029d\u029e\u0005\u0017"+
		"\u0000\u0000\u029e\u029f\u0005/\u0000\u0000\u029f\u02a0\u0003N\'\u0000"+
		"\u02a0\u02a2\u00050\u0000\u0000\u02a1\u02a3\u0003b1\u0000\u02a2\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005\u0018\u0000\u0000\u02a7\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a8\u0296\u0001\u0000\u0000\u0000\u02a8\u029d"+
		"\u0001\u0000\u0000\u0000\u02a9a\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005"+
		"1\u0000\u0000\u02ab\u02ac\u0003d2\u0000\u02ac\u02ad\u0005\u0015\u0000"+
		"\u0000\u02ad\u02ae\u0003N\'\u0000\u02aec\u0001\u0000\u0000\u0000\u02af"+
		"\u02b9\u0005w\u0000\u0000\u02b0\u02b9\u0005x\u0000\u0000\u02b1\u02b3\u0005"+
		"2\u0000\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b9\u0005y\u0000"+
		"\u0000\u02b5\u02b9\u00053\u0000\u0000\u02b6\u02b9\u00054\u0000\u0000\u02b7"+
		"\u02b9\u0005!\u0000\u0000\u02b8\u02af\u0001\u0000\u0000\u0000\u02b8\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b2\u0001\u0000\u0000\u0000\u02b8\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b9e\u0001\u0000\u0000\u0000\u02ba\u02bb\u0003"+
		"h4\u0000\u02bb\u02bc\u0005\u0017\u0000\u0000\u02bc\u02bd\u0003p8\u0000"+
		"\u02bd\u02be\u0005\u0018\u0000\u0000\u02be\u0316\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0005\u0017\u0000\u0000\u02c0\u02c1\u0003n7\u0000\u02c1\u02c2"+
		"\u00055\u0000\u0000\u02c2\u02c3\u0003h4\u0000\u02c3\u02c4\u0005\u0002"+
		"\u0000\u0000\u02c4\u02c5\u0003\u0014\n\u0000\u02c5\u02c6\u00056\u0000"+
		"\u0000\u02c6\u02c7\u0005\u0018\u0000\u0000\u02c7\u02c8\u0005\u0017\u0000"+
		"\u0000\u02c8\u02c9\u0003p8\u0000\u02c9\u02ca\u0005\u0018\u0000\u0000\u02ca"+
		"\u0316\u0001\u0000\u0000\u0000\u02cb\u02cc\u0003n7\u0000\u02cc\u02cd\u0005"+
		"5\u0000\u0000\u02cd\u02ce\u0003h4\u0000\u02ce\u02cf\u0005\u0006\u0000"+
		"\u0000\u02cf\u02d0\u0003\u0014\n\u0000\u02d0\u02d1\u00056\u0000\u0000"+
		"\u02d1\u02d2\u0005\u0017\u0000\u0000\u02d2\u02d3\u0003p8\u0000\u02d3\u02d4"+
		"\u0005\u0018\u0000\u0000\u02d4\u0316\u0001\u0000\u0000\u0000\u02d5\u02d6"+
		"\u0005\u0017\u0000\u0000\u02d6\u02d7\u00057\u0000\u0000\u02d7\u02d8\u0005"+
		"5\u0000\u0000\u02d8\u02d9\u0003h4\u0000\u02d9\u02da\u0005\u0002\u0000"+
		"\u0000\u02da\u02db\u0003\u0014\n\u0000\u02db\u02dc\u00056\u0000\u0000"+
		"\u02dc\u02dd\u0005j\u0000\u0000\u02dd\u02de\u0003N\'\u0000\u02de\u02df"+
		"\u0005-\u0000\u0000\u02df\u02e0\u0005\u0017\u0000\u0000\u02e0\u02e1\u0003"+
		"p8\u0000\u02e1\u02e2\u0005\u0018\u0000\u0000\u02e2\u02e3\u0005\u0018\u0000"+
		"\u0000\u02e3\u02e4\u0005\u0017\u0000\u0000\u02e4\u02e5\u0003p8\u0000\u02e5"+
		"\u02e6\u0005\u0018\u0000\u0000\u02e6\u0316\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e8\u0005\u0017\u0000\u0000\u02e8\u02e9\u00058\u0000\u0000\u02e9\u02ea"+
		"\u00055\u0000\u0000\u02ea\u02eb\u0003h4\u0000\u02eb\u02ec\u0005\u0002"+
		"\u0000\u0000\u02ec\u02ed\u0003\u0014\n\u0000\u02ed\u02ee\u00056\u0000"+
		"\u0000\u02ee\u02ef\u0005j\u0000\u0000\u02ef\u02f0\u0003N\'\u0000\u02f0"+
		"\u02f1\u0005-\u0000\u0000\u02f1\u02f2\u0005\u0017\u0000\u0000\u02f2\u02f3"+
		"\u0003p8\u0000\u02f3\u02f4\u0005\u0018\u0000\u0000\u02f4\u02f5\u0005\u0018"+
		"\u0000\u0000\u02f5\u02f6\u0005\u0017\u0000\u0000\u02f6\u02f7\u0003p8\u0000"+
		"\u02f7\u02f8\u0005\u0018\u0000\u0000\u02f8\u0316\u0001\u0000\u0000\u0000"+
		"\u02f9\u02fa\u0005\u0017\u0000\u0000\u02fa\u02fb\u00059\u0000\u0000\u02fb"+
		"\u02fc\u00055\u0000\u0000\u02fc\u02fd\u0003h4\u0000\u02fd\u02fe\u0005"+
		"\u0002\u0000\u0000\u02fe\u02ff\u0003\u0014\n\u0000\u02ff\u0300\u00056"+
		"\u0000\u0000\u0300\u0301\u0005j\u0000\u0000\u0301\u0302\u0003N\'\u0000"+
		"\u0302\u0303\u0005\u0018\u0000\u0000\u0303\u0304\u0005\u0017\u0000\u0000"+
		"\u0304\u0305\u0003p8\u0000\u0305\u0306\u0005\u0018\u0000\u0000\u0306\u0316"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0005\u0017\u0000\u0000\u0308\u0309"+
		"\u0005:\u0000\u0000\u0309\u030a\u00055\u0000\u0000\u030a\u030b\u0003h"+
		"4\u0000\u030b\u030c\u0005\u0002\u0000\u0000\u030c\u030d\u0003\u0014\n"+
		"\u0000\u030d\u030e\u00056\u0000\u0000\u030e\u030f\u0005j\u0000\u0000\u030f"+
		"\u0310\u0003N\'\u0000\u0310\u0311\u0005\u0018\u0000\u0000\u0311\u0312"+
		"\u0005\u0017\u0000\u0000\u0312\u0313\u0003p8\u0000\u0313\u0314\u0005\u0018"+
		"\u0000\u0000\u0314\u0316\u0001\u0000\u0000\u0000\u0315\u02ba\u0001\u0000"+
		"\u0000\u0000\u0315\u02bf\u0001\u0000\u0000\u0000\u0315\u02cb\u0001\u0000"+
		"\u0000\u0000\u0315\u02d5\u0001\u0000\u0000\u0000\u0315\u02e7\u0001\u0000"+
		"\u0000\u0000\u0315\u02f9\u0001\u0000\u0000\u0000\u0315\u0307\u0001\u0000"+
		"\u0000\u0000\u0316g\u0001\u0000\u0000\u0000\u0317\u0323\u0005w\u0000\u0000"+
		"\u0318\u0323\u0003j5\u0000\u0319\u0323\u0003l6\u0000\u031a\u031b\u0005"+
		"\u0017\u0000\u0000\u031b\u031c\u0005;\u0000\u0000\u031c\u031d\u0005w\u0000"+
		"\u0000\u031d\u0323\u0005\u0018\u0000\u0000\u031e\u031f\u0005\u0017\u0000"+
		"\u0000\u031f\u0320\u0005<\u0000\u0000\u0320\u0321\u0005w\u0000\u0000\u0321"+
		"\u0323\u0005\u0018\u0000\u0000\u0322\u0317\u0001\u0000\u0000\u0000\u0322"+
		"\u0318\u0001\u0000\u0000\u0000\u0322\u0319\u0001\u0000\u0000\u0000\u0322"+
		"\u031a\u0001\u0000\u0000\u0000\u0322\u031e\u0001\u0000\u0000\u0000\u0323"+
		"i\u0001\u0000\u0000\u0000\u0324\u032c\u0005=\u0000\u0000\u0325\u032c\u0005"+
		">\u0000\u0000\u0326\u032c\u0005?\u0000\u0000\u0327\u032c\u0005@\u0000"+
		"\u0000\u0328\u032c\u0005A\u0000\u0000\u0329\u032c\u0005B\u0000\u0000\u032a"+
		"\u032c\u0005C\u0000\u0000\u032b\u0324\u0001\u0000\u0000\u0000\u032b\u0325"+
		"\u0001\u0000\u0000\u0000\u032b\u0326\u0001\u0000\u0000\u0000\u032b\u0327"+
		"\u0001\u0000\u0000\u0000\u032b\u0328\u0001\u0000\u0000\u0000\u032b\u0329"+
		"\u0001\u0000\u0000\u0000\u032b\u032a\u0001\u0000\u0000\u0000\u032ck\u0001"+
		"\u0000\u0000\u0000\u032d\u033d\u0005D\u0000\u0000\u032e\u033d\u0005E\u0000"+
		"\u0000\u032f\u033d\u0005F\u0000\u0000\u0330\u033d\u0005G\u0000\u0000\u0331"+
		"\u033d\u0005H\u0000\u0000\u0332\u033d\u0005I\u0000\u0000\u0333\u033d\u0005"+
		"J\u0000\u0000\u0334\u033d\u0005K\u0000\u0000\u0335\u033d\u0005L\u0000"+
		"\u0000\u0336\u033d\u0005M\u0000\u0000\u0337\u033d\u0005N\u0000\u0000\u0338"+
		"\u033d\u0005O\u0000\u0000\u0339\u033d\u0005P\u0000\u0000\u033a\u033d\u0005"+
		"Q\u0000\u0000\u033b\u033d\u0005R\u0000\u0000\u033c\u032d\u0001\u0000\u0000"+
		"\u0000\u033c\u032e\u0001\u0000\u0000\u0000\u033c\u032f\u0001\u0000\u0000"+
		"\u0000\u033c\u0330\u0001\u0000\u0000\u0000\u033c\u0331\u0001\u0000\u0000"+
		"\u0000\u033c\u0332\u0001\u0000\u0000\u0000\u033c\u0333\u0001\u0000\u0000"+
		"\u0000\u033c\u0334\u0001\u0000\u0000\u0000\u033c\u0335\u0001\u0000\u0000"+
		"\u0000\u033c\u0336\u0001\u0000\u0000\u0000\u033c\u0337\u0001\u0000\u0000"+
		"\u0000\u033c\u0338\u0001\u0000\u0000\u0000\u033c\u0339\u0001\u0000\u0000"+
		"\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033b\u0001\u0000\u0000"+
		"\u0000\u033dm\u0001\u0000\u0000\u0000\u033e\u0344\u0005S\u0000\u0000\u033f"+
		"\u0344\u0005T\u0000\u0000\u0340\u0344\u0005U\u0000\u0000\u0341\u0344\u0005"+
		"V\u0000\u0000\u0342\u0344\u0005W\u0000\u0000\u0343\u033e\u0001\u0000\u0000"+
		"\u0000\u0343\u033f\u0001\u0000\u0000\u0000\u0343\u0340\u0001\u0000\u0000"+
		"\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0342\u0001\u0000\u0000"+
		"\u0000\u0344o\u0001\u0000\u0000\u0000\u0345\u034a\u0003N\'\u0000\u0346"+
		"\u0347\u0005\u0006\u0000\u0000\u0347\u0349\u0003N\'\u0000\u0348\u0346"+
		"\u0001\u0000\u0000\u0000\u0349\u034c\u0001\u0000\u0000\u0000\u034a\u0348"+
		"\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034e"+
		"\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034d\u0345"+
		"\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034eq\u0001"+
		"\u0000\u0000\u0000\u034f\u0353\u00052\u0000\u0000\u0350\u0353\u0005X\u0000"+
		"\u0000\u0351\u0353\u0005\u001f\u0000\u0000\u0352\u034f\u0001\u0000\u0000"+
		"\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0351\u0001\u0000\u0000"+
		"\u0000\u0353s\u0001\u0000\u0000\u0000\u0354\u035b\u0005X\u0000\u0000\u0355"+
		"\u035b\u00052\u0000\u0000\u0356\u035b\u0005Y\u0000\u0000\u0357\u035b\u0005"+
		"Z\u0000\u0000\u0358\u035b\u0005[\u0000\u0000\u0359\u035b\u0005\\\u0000"+
		"\u0000\u035a\u0354\u0001\u0000\u0000\u0000\u035a\u0355\u0001\u0000\u0000"+
		"\u0000\u035a\u0356\u0001\u0000\u0000\u0000\u035a\u0357\u0001\u0000\u0000"+
		"\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u0359\u0001\u0000\u0000"+
		"\u0000\u035bu\u0001\u0000\u0000\u0000\u035c\u0363\u0005\u0003\u0000\u0000"+
		"\u035d\u0363\u0005]\u0000\u0000\u035e\u0363\u0005^\u0000\u0000\u035f\u0363"+
		"\u0005_\u0000\u0000\u0360\u0363\u0005`\u0000\u0000\u0361\u0363\u0005a"+
		"\u0000\u0000\u0362\u035c\u0001\u0000\u0000\u0000\u0362\u035d\u0001\u0000"+
		"\u0000\u0000\u0362\u035e\u0001\u0000\u0000\u0000\u0362\u035f\u0001\u0000"+
		"\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0361\u0001\u0000"+
		"\u0000\u0000\u0363w\u0001\u0000\u0000\u0000\u0364\u0368\u0005b\u0000\u0000"+
		"\u0365\u0368\u0005c\u0000\u0000\u0366\u0368\u0005d\u0000\u0000\u0367\u0364"+
		"\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367\u0366"+
		"\u0001\u0000\u0000\u0000\u0368y\u0001\u0000\u0000\u0000\u0369\u0373\u0005"+
		"3\u0000\u0000\u036a\u0373\u00054\u0000\u0000\u036b\u0373\u0005x\u0000"+
		"\u0000\u036c\u0373\u0005y\u0000\u0000\u036d\u0373\u0005z\u0000\u0000\u036e"+
		"\u0373\u0005{\u0000\u0000\u036f\u0373\u0005|\u0000\u0000\u0370\u0373\u0005"+
		"}\u0000\u0000\u0371\u0373\u0005~\u0000\u0000\u0372\u0369\u0001\u0000\u0000"+
		"\u0000\u0372\u036a\u0001\u0000\u0000\u0000\u0372\u036b\u0001\u0000\u0000"+
		"\u0000\u0372\u036c\u0001\u0000\u0000\u0000\u0372\u036d\u0001\u0000\u0000"+
		"\u0000\u0372\u036e\u0001\u0000\u0000\u0000\u0372\u036f\u0001\u0000\u0000"+
		"\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0371\u0001\u0000\u0000"+
		"\u0000\u0373{\u0001\u0000\u0000\u0000\u0374\u0375\u0005e\u0000\u0000\u0375"+
		"\u0376\u0005w\u0000\u0000\u0376\u0377\u0005\u0002\u0000\u0000\u0377}\u0001"+
		"\u0000\u0000\u0000\u0378\u0381\u0005f\u0000\u0000\u0379\u037e\u0005w\u0000"+
		"\u0000\u037a\u037b\u0005\u0006\u0000\u0000\u037b\u037d\u0005w\u0000\u0000"+
		"\u037c\u037a\u0001\u0000\u0000\u0000\u037d\u0380\u0001\u0000\u0000\u0000"+
		"\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000"+
		"\u037f\u0382\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000"+
		"\u0381\u0379\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000"+
		"\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0005\u0002\u0000\u0000"+
		"\u0384\u007f\u0001\u0000\u0000\u0000\u0385\u038e\u0005g\u0000\u0000\u0386"+
		"\u038b\u0005w\u0000\u0000\u0387\u0388\u0005\u0006\u0000\u0000\u0388\u038a"+
		"\u0005w\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a\u038d\u0001"+
		"\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001"+
		"\u0000\u0000\u0000\u038c\u038f\u0001\u0000\u0000\u0000\u038d\u038b\u0001"+
		"\u0000\u0000\u0000\u038e\u0386\u0001\u0000\u0000\u0000\u038e\u038f\u0001"+
		"\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391\u0005"+
		"\u0002\u0000\u0000\u0391\u0081\u0001\u0000\u0000\u0000\u0392\u0394\u0005"+
		"h\u0000\u0000\u0393\u0395\u0005\u0002\u0000\u0000\u0394\u0393\u0001\u0000"+
		"\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0083\u0001\u0000"+
		"\u0000\u0000\u0396\u0397\u0005i\u0000\u0000\u0397\u0398\u0003L&\u0000"+
		"\u0398\u0399\u0005\u0002\u0000\u0000\u0399\u0085\u0001\u0000\u0000\u0000"+
		"P\u0089\u0091\u0099\u009e\u00a8\u00ac\u00c2\u00c7\u00ce\u00dd\u00e4\u00fa"+
		"\u00ff\u010d\u010f\u0117\u011a\u012c\u0130\u0138\u013b\u0144\u0148\u014a"+
		"\u014c\u0154\u015b\u0161\u0164\u016e\u017c\u0186\u0189\u0190\u0197\u019b"+
		"\u01a0\u01a3\u01a6\u01ae\u01b0\u01b9\u01bb\u01c3\u01cd\u01cf\u01e4\u01e7"+
		"\u01eb\u01fe\u0214\u022a\u022c\u024e\u0262\u0270\u0278\u0287\u0290\u02a4"+
		"\u02a8\u02b2\u02b8\u0315\u0322\u032b\u033c\u0343\u034a\u034d\u0352\u035a"+
		"\u0362\u0367\u0372\u037e\u0381\u038b\u038e\u0394";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}