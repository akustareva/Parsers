grammar PascalGrammer;

@parser::header {
import ifmo.ctddev.lab3.maps.VarTypes;
import ifmo.ctddev.lab3.maps.Functions;
}

program returns [String code]
    : (programHeading)? {
       $code = "#include <stdlib.h>\n";
       $code += "#include <stdio.h>\n";
       $code += "#include <stdbool.h>\n\n";
      }
      (varDeclarations {$code += $varDeclarations.code;})*
      programBody {
           $code += "int main() {\n";
           $code += $programBody.code;
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

programBody returns [String code]
    : BEGIN {$code = "";} (mainPart {$code += $mainPart.code;})* END DOT
    ;

varsDeclarationBlock returns [String code]
    @after {
        VarTypes.addVars($ctx.type().code, $ctx.listOfIdentifiers().code.split(", "));
    }
    : listOfIdentifiers COLON type SEMI {$code = $type.code + " " + $listOfIdentifiers.code + ";";}
    ;

listOfIdentifiers returns [String code]
    : identifier {$code = $identifier.text;} (COMMA identifier {$code += ", " + $identifier.text;})*
    ;

type returns [String code]
    : CHAR {$code = "char";} | BOOLEAN {$code = "bool";} 
    | INTEGER {$code = "int";} | DOUBLE {$code = "double";}
    ;

mainPart returns [String code]
    : readWritePart {$code = $readWritePart.code;}
    | assignmentPart {$code = $assignmentPart.code;}
    ;

readWritePart returns [String code]
    @after {
        $code = Functions.convertFuncToC($ctx.funcName().name,
        $ctx.listOfIdentifiers() == null ? new String[0] : $ctx.listOfIdentifiers().code.split(", "));
    }
    : funcName LPAREN (listOfIdentifiers)? RPAREN SEMI
    ;

assignmentPart returns [String code]
    : identifier {$code = "\t" + $identifier.text + " = ";} ASSIGNMENT
      (identifier {$code += $identifier.text;}
       | number {$code += $number.text;}
       | simpleExpression {$code += $simpleExpression.code;})
      SEMI {$code += ";\n";}
    ;

funcName returns [String name]
    : READ {$name = "read";}
    | READLN {$name = "readln";}
    | WRITE {$name = "write";}
    | WRITELN {$name = "writeln";}
    ;

simpleExpression returns [String code]
    : (identifier {$code = $identifier.text;} | number {$code = $number.text;})
      ((PLUS {$code += " + ";} | MINUS {$code += " - ";} | MUL {$code += " * ";} | DIV {$code += " / ";})
      (identifier {$code += $identifier.text;} | number {$code += $number.text;}))+
    ;

identifier
    : IDENTIFIER
    ;

number
    : NUMBER
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

LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;

EQUALITY
   : '='
   ;

ASSIGNMENT
   : ':='
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

MUL
   : '*'
   ;

DIV
   : '/'
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

READ
   : R E A D
   ;

READLN
   : R E A D L N
   ;

WRITE
   : W R I T E
   ;

WRITELN
   : W R I T E L N
   ;

IDENTIFIER
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;

NUMBER
   : ('0' .. '9')+
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