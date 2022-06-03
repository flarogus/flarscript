parser grammar FlarscriptParser;

options { tokenVocab='FlarscriptLexer'; }

flarscript
	: ((statement)*? statement)? EOF
	;

statement
	: expression #SingleExpression
	| KEY_OUT LEFT_TRANSFER expression #PrintStatement
	// flow control
	| ifPart elsePart? #IfStatement
	;

expression
	: LPAREN expression RPAREN #BracketExpression
	// literals
	| value=(DECIMAL | INTEGER) #NumberLiteral
	| value=(STRING_DOUBLE | STRING_SINGLE | STRING_BACK) #StringLiteral
	| value=(FALSE | TRUE) #BooleanLiteral
	| NULL #NullLiteral
	// binary expressions
	| left=expression operator=(ASTERISK | SLASH | PERCENT) right=expression #MultiplyOrDivideExpression
	| left=expression operator=(PLUS | MINUS) right=expression #PlusOrMinusExpression
	| left=expression operator=(LESS | LESS_OR_EQUAL | EQUAL | GREATER | GREATER_OR_EQUAL) right=expression #ComparsionExpression
	;

statementBlock : ((statement ends)*? statement) ;

ifPart
	: KEY_IF LPAREN condition=expression RPAREN LCURLY statementBlock? RCURLY
	| KEY_IF LPAREN condition=expression RPAREN statement?
	;

elsePart
	: KEY_ELSE LCURLY statementBlock RCURLY
	| KEY_ELSE statement?
	;

ends : (SEMICOLON | NEWLINE) ;
