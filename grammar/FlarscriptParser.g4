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
	: LPAREN expression RPAREN #BracketExpression
	| value=(DECIMAL | INTEGER) #NumberLiteral
	| value=(STRING_DOUBLE | STRING_SINGLE | STRING_BACK) #StringLiteral
	| left=expression operator=(ASTERISK | SLASH | PERCENT) right=expression #MultiplyOrDivideExpression
	| left=expression operator=(PLUS | MINUS) right=expression #PlusOrMinusExpression
	;

ends : (SEMICOLON | NEWLINE) ;
