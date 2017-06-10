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
    : NON_TERM_NAME localAttrs? returnedAttrs? COLON nonterminalProduction (PIPE nonterminalProduction)* SEMI # nonTermRuleLabel
    | TERM_NAME COLON terminalProduction (PIPE terminalProduction)* SEMI                                      # termRuleLabel
    ;

localAttrs
    : LEFT_PARENTHESIS attr (COMMA attr)* RIGHT_PARENTHESIS
    ;

returnedAttrs
    : SQUARE_BR_LEFT attr (COMMA attr)* SQUARE_BR_RIGHT
    ;

nonterminalProduction
    : (nontermVariations JAVA_CODE?)+
    ;

nontermVariations
    : TERM_NAME (ASTERISK | PLUS | QUESTION_MARK)?
    | NON_TERM_NAME args
    | LEFT_PARENTHESIS nontermVariations JAVA_CODE RIGHT_PARENTHESIS (ASTERISK | PLUS | QUESTION_MARK)
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
    : IDENTIFIER
    ;

attrName
    : IDENTIFIER
    ;

NON_TERM_NAME
    : [a-z][a-zA-Z_0-9]*
    ;

TERM_NAME
    : [A-Z][a-zA-Z_0-9]*
    ;

IDENTIFIER
    : [a-zA-Z][a-zA-Z0-9_]*
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

WS
   : [ \t\r\n]+ -> skip
   ;