lexer grammar FlarscriptLexer;

channels {
	COMMENTS,
	LINEFEED
}

// whitespace
NEWLINE : ('\n' | '\r' | '\r\n') -> channel(LINEFEED) ;
WH : [ \t] -> skip ;

DECIMAL : [0-9]+('.'[0-9]+)? ;
INTEGER : [0-9]+ ;

// strings
STRING_DOUBLE : '"'.*?'"' ;
STRING_SINGLE : '\''.*?'\'' ;
STRING_BACK : '`'.*?'`' ;

// keywords
KEY_OUT : 'out' ;
KEY_IF : 'if' ;
KEY_ELSE : 'else' ;

// literals
TRUE : 'true' ;
FALSE : 'false' ;
NULL : 'null' ;

// parentheses
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;

// operators
PLUS : '+' ;
MINUS : '-' ;
SLASH : '/' ;
ASTERISK : '*' ;
PERCENT : '%' ;
LEFT_TRANSFER : '<<' ;

// equality operators
EQUAL : '==' ;
LESS : '<' ;
GREATER : '>' ;
LESS_OR_EQUAL : '<=' ;
GREATER_OR_EQUAL : '>=' ;

// misc.
SEMICOLON : ';' ;

ID : (
	[a-zA-Z_][a-zA-Z0-9_\-#]*?
	| '~' (~('\n' | '\r'))+? '~'
) ;

// comments — always at the bottom
SINGLE_LINE_COMMENT : '//' (~('\n' | '\r'))* -> channel(COMMENTS) ;
MULTILINE_COMMENT : '/*' .*? '*/' -> channel(COMMENTS) ;
