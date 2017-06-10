grammar GrammarOfGrammar;

gram
    : header? members? grammarRule*
    ;

header
    : HEADER JAVA_CODE
    ;

members
    : MEMBERS JAVA_CODE
    ;

grammarRule
    : NON_TERM_NAME localAttrs? returnedAttr? COLON nonTerminalProduction (PIPE nonTerminalProduction)* SEMI # nonTermRuleLabel
    | TERM_NAME COLON terminalProduction (PIPE terminalProduction)* SEMI                                     # termRuleLabel
    ;

localAttrs
    : LEFT_PARENTHESIS attr (COMMA attr)* RIGHT_PARENTHESIS
    ;

returnedAttr
    : SQUARE_BR_LEFT attr SQUARE_BR_RIGHT
    ;

nonTerminalProduction
    : nonTermVariations* JAVA_CODE?
    ;

nonTermVariations
    : TERM_NAME (ASTERISK | PLUS | QUESTION_MARK)?
    | NON_TERM_NAME args?
    ;

terminalProduction
    : STRING+
    ;

attr
    : attrType attrName
    ;

args
    : LEFT_PARENTHESIS attrName (COMMA attrName)* RIGHT_PARENTHESIS
    ;

attrType
    : identifier
    ;

attrName
    : identifier
    ;

identifier
    : NON_TERM_NAME
    | TERM_NAME
    ;

NON_TERM_NAME
    : [a-z][a-zA-Z_0-9]*
    ;

TERM_NAME
    : [A-Z][a-zA-Z_0-9]*
    ;

STRING
    : QUOTE ~'\''+ QUOTE
    ;

QUOTE
    : '\''
    ;

HEADER
    : '@header'
    | '@ header'
    ;

MEMBERS
    : '@members'
    | '@ members'
    ;

JAVA_CODE
    : LEFT_BRACE (~[{}]+ JAVA_CODE?)* RIGHT_BRACE
    ;

AT
    : '@'
    ;

QUESTION_MARK
    : '?'
    ;

ASTERISK
    : '*'
    ;

PLUS
    : '+'
    ;

PIPE
    : '|'
    ;

LEFT_BRACE
    : '{'
    ;

RIGHT_BRACE
    : '}'
    ;

LEFT_PARENTHESIS
    : '('
    ;

RIGHT_PARENTHESIS
    : ')'
    ;
    
SQUARE_BR_LEFT
    : '['
    ;
    
SQUARE_BR_RIGHT
    : ']'
    ;

SEMI
   : ';'
   ;

COLON
   : ':'
   ;

COMMA
   : ','
   ;

OLD_STYLE_COMMENT
   : '(*' .*? '*)' -> skip
   ;

COMMENT
   : '{' .*? '}' -> skip
   ;

WS
   : [ \t\r\n]+ -> skip
   ;