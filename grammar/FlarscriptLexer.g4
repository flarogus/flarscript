lexer grammar FlarscriptLexer;

channels {
	COMMENTS
}

// whitespace
NEWLINE : '\n' | '\r' | '\r\n' ;
WH : [ \t] -> skip ;

DECIMAL : [0-9]+('.'[0-9]+)? ;
INTEGER : [0-9]+ ;

// strings
STRING_DOUBLE : '"'.*?'"' ;
STRING_SINGLE : '\''.*?'\'' ;
STRING_BACK : '`'.*?'`' ;

// keywords
KEY_OUT : 'out' ;

// parentheses
LPAREN : '(' ;
RPAREN : ')' ;

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

// comments — always at the bottom
SINGLE_LINE_COMMENT : '//' (~('\n' | '\r'))* -> channel(COMMENTS) ;
MULTILINE_COMMENT : '/*' .*? '*/' -> channel(COMMENTS) ;
