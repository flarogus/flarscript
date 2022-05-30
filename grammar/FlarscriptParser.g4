parser grammar FlarscriptParser;

options { tokenVocab='FlarscriptLexer'; }

flarscript
	: (statement (EOF | ends+))*
	;

statement
	: expression #SingleExpression
	| KEY_OUT LEFT_TRANSFER expression #PrintStatement
	;

expression
	: left=expression operation right=expression #OperationExpression
	| LPAREN expression RPAREN #BracketExpression
	| value=(DECIMAL | INTEGER) #NumberLiteral
	| value=(STRING_DOUBLE | STRING_SINGLE | STRING_BACK) #StringLiteral
	;

operation
	: SLASH #DivideOp
	| ASTERISK #MultiplyOp
	| PERCENT #ModuloOp
	| PLUS #PlusOp
	| MINUS #MinusOp
	;

ends : (SEMICOLON | NEWLINE) ;
