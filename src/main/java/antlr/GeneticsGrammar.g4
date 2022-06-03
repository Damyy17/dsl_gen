grammar GeneticsGrammar;

// LEXER

WS: [ \t\r\n]+ -> skip;
WHITESPACE : ' ';

LPAREN: '(';
RPAREN: ')';
COMMA: ',';
SEMICOLON: ';';
SYMBOLS: '/'|'?'|'.'|';';
DQ:'"';

COMMENT: '/*' .*? '*/';
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);

BIGALPHA: 'A'..'Z';
SMALLALPHA: 'a'..'z';
NUMBER: '-'? DIGIT '.' [0-9] + EXP? | '-'? DIGIT EXP | '-'? DIGIT;
fragment DIGIT:'0' | [1-9] [0-9]*;
//NO leading zeros
fragment EXP: [Ee] [+\-]? DIGIT;

fragment ESC: '\\' . ;
STRING: '"' ( ESC | ~[\\"\r\n] )* '"';

TRUE: 'true';
FALSE: 'false';
AND: 'and';
OR: 'or';
CROSS_OPERATION: '*';

//types
FAMILY: 'family';
GENES: 'genes';
PARENT: 'parents';
GENERATION :'generation';
DSLBOOLEAN: 'boolean';
DSLNUMBER: 'number';
DSLSTRING: 'string';

SET: 'set';
//fields
DOM: 'dom';
PHENOTYPE: 'phenotype';
CODOMINANCE: 'codominance';
LOCATION: 'location';
LABEL: 'label';
PARENTS: 'ancestors';
GENOTYPE: 'genotype';
FREQUENCY: 'frequency';
PUNNET: 'square';
VALUE: 'value';
GEN: 'gen';

//computations
FIND: 'find';
CROSS: 'cross';
PRED: 'pred';
ESTIMATE: 'estimate';

//keywrods
IF: 'if';
THEN: 'then';
ELSE: 'else';
END: 'end';
WHILE: 'while';
DO: 'do';
FOR: 'for';

//io
ALL: 'all';
PRINT: 'print';

// PARSER

program: statements+ EOF;
statements: declaration | assigments | flow_structure | computations | io;

id: alpanum+;
declaration: type  id (','  id)?';';
type: GENES | PARENT | GENERATION | DSLBOOLEAN | DSLNUMBER | DSLSTRING | FAMILY;

bool: TRUE | FALSE;
string: STRING;
number: NUMBER;

// added new -> array
values : bool | number | string ;
array_init_id: id  ',' array_init_id | id;
array_init_alpha: alpha+ ',' array_init_alpha | alpha+;
array_init_values: values ',' array_init_values | values ;
array: '[' (array_init_alpha | array_init_id | array_init_values) ']';

alpha: BIGALPHA | SMALLALPHA;
alpanum: alpha | NUMBER;
operator: '>' | '<' | '<=' | '>=' | '==' | '!=' | AND | OR;
expresion: bool | number | string | array | alpha+;

assigments: SET field id '=' expresion ';'
            | DOM ':'  id  '->'  id ';'
            | SET field id '='  computations ';';

field: LABEL | PHENOTYPE | DOM | CODOMINANCE | LOCATION | GENOTYPE | FREQUENCY | PUNNET | VALUE | PARENTS | GEN;

computations: FIND field alpha+
              | PRED id
              | PRED array
              | ESTIMATE field id COMMA alpha+ number
              | ESTIMATE field id COMMA alpha+
              | CROSS id CROSS_OPERATION id ;

flow_structure: IF  condition  THEN  statements+?  ELSE  statements+  END ';'
                | condition '?' statements ':' statements ';'
                | WHILE  condition  DO  statements+  END ';'
                | FOR iterator = id 'from' id ':'
                      statements+
                      END ';'
                ;

condition: id operator id
         | id operator expresion;

io: PRINT id field ';'
  | PRINT id field alpha+ ';'
  | PRINT id ';';

