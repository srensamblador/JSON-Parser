lexer grammar Lexicon
	;

NUMBER: [0-9]+('.'[0-9]+)?;
STRING: '"'~('"' | '\\' | '\r' | '\n')*'"';

WHITESPACE: [ \t\r\n]+ -> skip;