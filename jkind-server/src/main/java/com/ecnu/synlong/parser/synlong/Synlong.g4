grammar Synlong;

//=========================
// Program
//=========================
program
    : decls* EOF
    ;

//=========================
// Declarations
//=========================
decls
    : type_block # TypeDeclaration
    | const_block # ConstDeclaration
    | user_op_decl # UserOpDeclaration
    ;

//-------------------------
// Type Declarations
//-------------------------
type_block
    : 'type' (type_decl ';')+
    ;

type_decl
    : ID ('=' type_def)?
    ;

type_def
    : type_expr # TypeExprDef
    | 'enum' '{' ID (',' ID)* '}' # EnumDef
    ;

type_expr
    : 'bool' # BoolType
    | 'char' # CharType
    | 'byte' # ByteType
    | 'ubyte' # UByteType
    | 'short' # ShortType
    | 'ushort' # UShortType
    | 'int' # IntType
    | 'uint' # UIntType
    | 'long' # LongType
    | 'ulong' # ULongType
    | 'float' # FloatType
    | 'real' # RealType
    | typevar # VarType
    | '{' field_decl (',' field_decl)* '}' # StructType
    | type_expr '^' INTEGER # ArrayType
    ;

field_decl
    : ID ':' type_expr
    ;

typevar
    : ID
    ;

//-------------------------
// Constant Block
//-------------------------
const_block
    : 'const' (const_decl ';')+
    ;

const_decl
    : ID ':' type_expr ('=' const_expr)?
    ;

const_expr
    : ID # ConstId
    | atom # ConstAtom
    | unary_arith_op const_expr # ConstUnaryOp
    | const_expr bin_arith_op const_expr # ConstBinArithOp
    | const_expr bin_bool_op const_expr # ConstBinBoolOp
    | const_expr bin_relation_op const_expr # ConstBinRelOp
    | '[' const_list ']' # ConstArray
    | '{' const_label_expr (',' const_label_expr)* '}' # ConstStruct
    ;

const_list
    : (const_expr (',' const_expr)*)?
    ;

const_label_expr
    : ID ':' const_expr
    ;

//=========================
// User Operation Declaration
//=========================
user_op_decl
    : op_kind ID params returns_clause op_body # UserOpDecl
    | op_kind 'imported' ID params returns_clause # ImportedOpDecl
    ;

op_kind
    : 'function' # FunctionKind
    | 'node' # NodeKind
    ;

params
    : '(' (var_decls (';' var_decls)*)? ')'
    ;

returns_clause
    : RETURNS params
    ;

op_body
    : ';' # EmptyOpBody
    | local_block? (let_block ';'?)? # FullOpBody
    ;

local_block
    : VAR (var_decls ';')+
    ;

var_decls
    : var_id (',' var_id)* ':' type_expr (when_decl)? (last_decl)?
    ;

var_id
    : ID
    ;

when_decl
    : 'when' clock_expr
    ;

clock_expr
    : ID # ClockId
    | 'not' ID # NotClock
    ;

last_decl
    : 'last' '=' const_expr
    ;

//=========================
// Equations
//=========================
equation
    : lhs '=' expr ';' # Assignment
    | state_machine return_statement # StateMachineReturn
    ;

lhs
    : '(' ')' # EmptyLhs
    | lhs_id (',' lhs_id)* # LhsList
    ;

lhs_id
    : ID
    ;

return_statement
    : RETURNS returns_var ';'
    ;

returns_var
    : ID+
    ;

//=========================
// State Machines
//=========================
state_machine
    : AUTOMATON ID? state_decl+
    ;

state_decl
    : INITIAL? FINAL? STATE ID
      (UNLESS transition+)?
      ( {_input.LT(1).getType() == VAR}? state_body )
      (UNTIL transition+)?
    ;

// ★ 核心改动：state_body 不再可空，避免预测混乱
state_body
    : local_block let_block # StateBodyWithLocal
    | local_block # StateBodyLocalOnly
    | let_block # StateBodyLetOnly
    | equation # StateBodySingleEq
    ;

let_block
    : LET (equation | property | assertion | main | realizabilityInputs | ivc)* TEL
    ;

transition
    : IF expr (RESUME | RESTART) ID ';'
    ;

//=========================
// Expressions
//=========================
expr
    : simple_expr # SimpleExpr
    | 'last' '\'' ID # LastExpr
    | tempo_expr # TempoExpr
    | bool_expr # BoolExpr
    | array_expr # ArrayExpr
    | struct_expr # StructExpr
    | mixed_constructor # MixedConstructor
    | switch_expr # SwitchExpr
    | apply_expr # ApplyExpr
    ;

simple_expr
    : ID # SimpleId
    | atom # SimpleAtom
    | simple_expr '[' const_expr ']' # ArrayAccess
    | simple_expr '.' ID # StructAccess
    | unary_arith_op simple_expr # UnaryOp
    | simple_expr bin_arith_op simple_expr # BinArithOp
    | simple_expr bin_bool_op simple_expr # BinBoolOp
    | simple_expr bin_relation_op simple_expr # BinRelOp
    | '(' type_expr simple_expr ')' # TypeCast
    | '(' ID ')' # SimpleIdWithParens
    ;

tempo_expr
    : 'pre' simple_expr # PreExpr
    | simple_expr '->' simple_expr # ArrowExpr
    | 'fby' '(' simple_expr ';' const_expr ';' simple_expr ')' # FbyExpr
    | simple_expr 'fby' simple_expr # FbySimpleExpr
    | simple_expr 'when' clock_expr # WhenExpr
    | 'merge' ID '(' simple_expr ',' simple_expr ')' # MergeExpr
    ;

bool_expr
    : '#' '(' list ')'
    ;

array_expr
    : simple_expr '[' INTEGER '..' INTEGER ']' # ArraySlice
    | '(' simple_expr '.' index+ 'default' simple_expr ')' # ArrayDefault
    | simple_expr '^' const_expr # ArrayRepeat
    | '[' list ']' # ArrayConstructor
    ;

struct_expr
    : '{' label_expr (',' label_expr)* '}'
    ;

label_expr
    : ID ':' simple_expr
    ;

mixed_constructor
    : '(' ID 'with' label_or_index+ '=' simple_expr ')'
    ;

label_or_index
    : '.' ID # Label
    | index # IndexItem
    ;

index
    : '[' simple_expr ']'
    ;

switch_expr
    : IF simple_expr 'then' simple_expr 'else' simple_expr # IfThenElse
    | '(' 'case' simple_expr 'of' case_expr+ ')' # CaseOf
    ;

case_expr
    : '|' pattern ':' simple_expr
    ;

pattern
    : ID # PatternId
    | CHAR # PatternChar
    | '-'? INTEGER # PatternInt
    | 'true' # PatternTrue
    | 'false' # PatternFalse
    | '_' # PatternWildcard
    ;

apply_expr
    : prefix_operator '(' list ')' # SimpleApply
    | ('(' iterator_header ')' | iterator_header) '(' iterator_arg_list ')' # IteratorApply
    | '(' 'mapw' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr 'default' '(' list ')' ')' '(' list ')' # MapwApply
    | '(' 'mapwi' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr 'default' '(' list ')' ')' '(' list ')' # MapwiApply
    | '(' 'foldw' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr ')' '(' list ')' # FoldwApply
    | '(' 'foldwi' '<<' prefix_operator ';' const_expr '>>' 'if' simple_expr ')' '(' list ')' # FoldwiApply
    ;

iterator_header
    : iterator '<<' iterator_operator ';' const_expr '>>'
    ;

iterator_operator
    : prefix_operator # IteratorPrefixOperator
    | '+' # PlusOfficialOp
    | '-' # MinusOfficialOp
    | '*' # MulOfficialOp
    | '/' # DivOfficialOp
    | 'mod' # ModOfficialOp
    | 'div' # DivIntOfficialOp
    | '=' # EqOfficialOp
    | '<>' # NeOfficialOp
    | '<' # LtOfficialOp
    | '>' # GtOfficialOp
    | '<=' # LeOfficialOp
    | '>=' # GeOfficialOp
    | 'and' # AndOfficialOp
    | 'or' # OrOfficialOp
    | 'xor' # XorOfficialOp
    ;

iterator_arg_list
    : (expr (',' expr)*)?
    ;

prefix_operator
    : ID # PrefixId
    | prefix_unary_operator # PrefixUnaryOp
    | prefix_binary_operator # PrefixBinaryOp
    | '(' 'make' ID ')' # MakeOp
    | '(' 'flatten' ID ')' # FlattenOp
    ;

prefix_unary_operator
    : '+$' # PlusDollar
    | '-$' # MinusDollar
    | 'not$' # NotDollar
    | 'short$' # ShortDollar
    | 'int$' # IntDollar
    | 'float$' # FloatDollar
    | 'real$' # RealDollar
    ;

prefix_binary_operator
    : '$+$' # PlusOp
    | '$-$' # MinusOp
    | '$*$' # MulOp
    | '$/$' # DivOp
    | '$mod$' # ModOp
    | '$div$' # DivIntOp
    | '$=$' # EqOp
    | '$<>$' # NeOp
    | '$<$' # LtOp
    | '$>$' # GtOp
    | '$<=$' # LeOp
    | '$>=$' # GeOp
    | '$and$' # AndOp
    | '$or$' # OrOp
    | '$xor$' # XorOp
    ;

iterator
    : 'map' # Map
    | 'fold' # Fold
    | 'mapi' # Mapi
    | 'foldi' # Foldi
    | 'mapfold' # Mapfold
    ;

list
    : (simple_expr (',' simple_expr)*)?
    ;

//=========================
// Operators
//=========================
unary_arith_op
    : '-' # Minus
    | '+' # Plus
    | 'not' # Not
    ;

bin_arith_op
    : '+' # Add
    | '-' # Sub
    | '*' # Mul
    | '/' # Div
    | 'mod' # Mod
    | 'div' # DivInt
    ;

bin_relation_op
    : '=' # Eq
    | '<>' # Ne
    | '<' # Lt
    | '>' # Gt
    | '<=' # Le
    | '>=' # Ge
    ;

bin_bool_op
    : 'and' # And
    | 'or' # Or
    | 'xor' # Xor
    ;

//=========================
// Atoms
//=========================
atom
    : 'true' # True
    | 'false' # False
    | CHAR # Char
    | INTEGER # Integer
    | UINT # UInteger
    | FLOAT # Float
    | REAL # Real
    | USHORT # UShort
    | SHORT # Short
    ;

//=========================
// Properties
//=========================
property: '--%PROPERTY' ID ';';

realizabilityInputs: '--%REALIZABLE' (ID (',' ID)*)? ';';

ivc: '--%IVC' (ID (',' ID)*)? ';';

main: '--%MAIN' ';'?;

assertion: 'assert' expr ';';

//=========================
// Lexer Rules
//=========================
// ★ 关键字优先，必须放在 ID 之前
IF      : 'if';
VAR     : 'var';
LET     : 'let';
TEL     : 'tel';
STATE   : 'state';
UNLESS  : 'unless';
UNTIL   : 'until';
RESUME  : 'resume';
RESTART : 'restart';
INITIAL : 'initial';
FINAL   : 'final';
AUTOMATON : 'automaton';
RETURNS : 'returns';

ID      : [a-zA-Z_][a-zA-Z_0-9]*;
CHAR    : '\'' . '\'';
INTEGER : '0' | [1-9][0-9]*;
UINT    : INTEGER 'u';
FLOAT   : [0-9]+ '.' [0-9]* ([eE] [+-]? [0-9]+)? [fF];
REAL    : [0-9]+ '.' [0-9]* ([eE] [+-]? [0-9]+)?;
USHORT  : INTEGER 'us';
SHORT   : INTEGER 's';

COMMENT : '--' (~[%\n\r] ~[\n\r]* | /* empty */) ('\r'? '\n')? -> skip;
WS      : [ \t\r\n]+ -> skip;
