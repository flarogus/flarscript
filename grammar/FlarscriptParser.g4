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
	// literals
	| value=(DECIMAL | INTEGER) #NumberLiteral
	| value=(STRING_DOUBLE | STRING_SINGLE | STRING_BACK) #StringLiteral
	// binary expressions
	| left=expression operator=(ASTERISK | SLASH | PERCENT) right=expression #MultiplyOrDivideExpression
	| left=expression operator=(PLUS | MINUS) right=expression #PlusOrMinusExpression
	| left=expression operator=(LESS | LESS_OR_EQUAL | EQUAL | GREATER | GREATER_OR_EQUAL) right=expression #ComparsionExpression
	;

ends : (SEMICOLON | NEWLINE) ;
