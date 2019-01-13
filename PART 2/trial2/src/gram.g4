grammar gram;


prog: 'sc.range(' RANGE ')' mod1| ;
mod1: '.map' ROUND UDF ')'mod1|  ;
UDF: IDENTIFIER ARROW EXP;
EXP: CURLY COMPLEXEXP CURLY | SIMPLEEXP;
SIMPLEEXP: PUREEXP | ROUND TUPLEEXP ROUND;
COMPLEXEXP: SIMPLEEXP | ASSEXP SEMICOLON SIMPLEEXP;
TUPLEEXP: (PUREEXP ',' PUREEXP);
ASSEXP: VAL IDENTIFIER '=' PUREEXP;
PUREEXP: (NUMBER | IDENTIFIER | IDENTIFIER '.' NUMBER | ROUND PUREEXP ')' | (' ')'if(' (' ')COMPEX ')' PUREEXP (' ')'else'(' ') PUREEXP| (' ')* IDENTIFIER PUREXPRIME);
PUREXPRIME:  ('+' | '-' | '*' | '/' | '%') PUREEXP;
COMPEX: PUREEXP COMP PUREEXP;
COMP: '==' | '<' | '>' | '!=' | '>=' | '<=' ;



SYMBOL: ~([a-z] | [A-Z] | [0-9] | '"' | '\\' | '\'');
//PARANTHESIS: '('|')';

//Lexer Rules

STRING     : '"' (NUMBER|LETTER)+ '"';
CHAR       : '\'' (NUMBER|LETTER) '\'';
DIGIT      : '0'..'9';
NUMBER     : DIGIT+;
fragment LETTER     : ([a-z]|[A-Z]|'_'|'.');

IDENTIFIER : LETTER(NUMBER|LETTER)*;
COMMA: ',';
CURLY: '{' | '}';
ROUND: '(' ;
ARROW: '=>';
VAL: 'val ';
RANGE: NUMBER ',' NUMBER;
SEMICOLON: ';';
