grammar PascalGrammer;

program returns [String code]
    : (programHeading)? {
       $code = "#include <stdlib.h>\n";
       $code += "#include <stdio.h>\n";
       $code += "#include <stdbool.h>\n\n";
      }
      (varDeclarations {$code += $varDeclarations.code;})*
      programBody {
           $code += "int main() {\n";
           $code += "\treturn 0;\n";
           $code += "}\n";
      }
    ;

programHeading
    : PROGRAM identifier SEMI
    ;

varDeclarations returns [String code]
    : VAR {$code = "";} (varsDeclarationBlock {$code += $varsDeclarationBlock.code + "\n";})+
    ;

programBody
    : BEGIN END DOT
    ;

identifier
    : IDENTIFIER
    ;

varsDeclarationBlock returns [String code]
    : listOfIdentifiers COLON type SEMI {$code = $type.code + " " + $listOfIdentifiers.code + ";";}
    ;

listOfIdentifiers returns [String code]
    : identifier {$code = $identifier.text;} (COMMA identifier {$code += ", " + $identifier.text;})*
    ;

type returns [String code]
    : CHAR {$code = "char";} | BOOLEAN {$code = "bool";} 
    | INTEGER {$code = "int";} | REAL {$code = "float";}
    | DOUBLE {$code = "double";} | EXTENDED {$code = "long double";}
    | STRING {$code = "char *";}
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

DOT
   : '.'
   ;

PROGRAM
    : P R O G R A M
    ;

VAR
    : V A R
    ;

BEGIN
   : B E G I N
   ;

END
    : E N D
    ;

BOOLEAN
   : B O O L E A N
   ;

CHAR
   : C H A R
   ;

INTEGER
   : I N T E G E R
   ;

REAL
   : R E A L
   ;

DOUBLE
   : D O U B L E
   ;

EXTENDED
   : E X T E N D E D
   ;

STRING
   : S T R I N G
   ;

IDENTIFIER
    : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
    ;

fragment A
       : ('a' | 'A')
       ;

fragment B
   : ('b' | 'B')
   ;

fragment C
   : ('c' | 'C')
   ;

fragment D
   : ('d' | 'D')
   ;

fragment E
   : ('e' | 'E')
   ;

fragment F
   : ('f' | 'F')
   ;

fragment G
   : ('g' | 'G')
   ;

fragment H
   : ('h' | 'H')
   ;

fragment I
   : ('i' | 'I')
   ;

fragment J
   : ('j' | 'J')
   ;

fragment K
   : ('k' | 'K')
   ;

fragment L
   : ('l' | 'L')
   ;

fragment M
   : ('m' | 'M')
   ;

fragment N
   : ('n' | 'N')
   ;

fragment O
   : ('o' | 'O')
   ;

fragment P
   : ('p' | 'P')
   ;

fragment Q
   : ('q' | 'Q')
   ;

fragment R
   : ('r' | 'R')
   ;

fragment S
   : ('s' | 'S')
   ;

fragment T
   : ('t' | 'T')
   ;

fragment U
   : ('u' | 'U')
   ;

fragment V
   : ('v' | 'V')
   ;

fragment W
   : ('w' | 'W')
   ;

fragment X
   : ('x' | 'X')
   ;

fragment Y
   : ('y' | 'Y')
   ;

fragment Z
   : ('z' | 'Z')
   ;

WS
   : [ \t\r\n]+ -> skip
   ;

OLD_STYLE_COMMENT
   : '(*' .*? '*)' -> skip
   ;

COMMENT
   : '{' .*? '}' -> skip
   ;