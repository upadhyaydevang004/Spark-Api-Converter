grammar gram;
prog  : IDENTIFIER '=' start |start;

start : 'sc' mod '\n'*| ;


mod  : '.range(' NUMBER ',' NUMBER ')' mod
     | '.textFile(' STRING ')' mod
     | '.map('  funcmap  mod
     | '.filter' '(' FUNC ')' mod
     | '.reduce' FUNC mod
     | '.reduceByKey' FUNC  mod
     | '.sortBy' FUNC  mod
     | '.collect()' mod
     | 
     ;
     



funcmap: IDENTIFIER '=>' (SYMBOL|IDENTIFIER|NUMBER|','|'('|')')+;
SYMBOL: '('|')'|'*'|'&'|'^'|'%'|'$'|'#'|'@'|'!'|'~'|'.'|'='|'+'|'-'|'/'|'?'|'<'|'>'|':'|',';
//Lexer Rules
fragment LETTER     : ([a-z]|[A-Z]|'_');
fragment DIGIT      : [0-9];
FUNC: '(''('(IDENTIFIER':' IDENTIFIER)(','IDENTIFIER':'IDENTIFIER)* ')' ((' ')*'=>'(' ')*IDENTIFIER(' ')* ((' ')*SYMBOL (' ')* IDENTIFIER(' ')*)+)')';
NUMBER     : DIGIT+;
IDENTIFIER : LETTER(NUMBER|LETTER)*;
STRING     : '"' (NUMBER|LETTER|'.')+ '"';
CHAR       : '\'' (NUMBER|LETTER) '\'';

WS: [ \n\t\r]+ -> skip;