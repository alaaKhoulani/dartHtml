lexer grammar DartLexer;

@header {
	package grammars;
}

DOT
 : '.'
 ;

OPENED_BRACES
 : '('
 ;

CLOSED_BRACES
 : ')'
 ;

OPENED_CURLY_BRACES
 : '{'
 ;

CLOSED_CURLY_BRACES
 : '}'
 ;

OPENED_SQUERE_BRACES
 : '['
 ;


CLOSED_SQUERE_BRACES
 : ']'
 ;

ARROW
 :'=>'
 ;

IMPORT
 : 'import'
 ;

CLASS
 : 'class'
 ;

FOR
 : 'for'
 ;

WHILE
 : 'while'
 ;

DO
 : 'do'
 ;

BODY
 : 'body'
 ;

LIST
 : 'List'
 ;

WIDGET
 :'Widget'
 ;

FUNCTION
 : 'Function'
 ;

STATE
 : 'State'
 ;

LISTVIEW
 : 'ListView'
 ;

CHILDREN
 : 'children'
 ;

CHILD
 : 'child'
 ;

ROW
 : 'Row'
 ;

COLUMN
 : 'Column'
 ;

TEXTWIDGET
 : 'Text'
 ;

CONTAINER
 : 'Container'
 ;

WIDTH
 : 'width'
 ;

HEIGHT
 : 'height'
 ;

BUTTON
 : 'TextButton'
 ;

ONPRESSED
 : 'onPressed'
 ;

COLOR
 : 'color'
 ;

COLOR_C
 :'Color'
 ;

IMAGE_I
 :'Image'
 ;

IMAGE
 : 'image'
 ;

ASSETIMAGE
 :'AssetImage'
 ;

NETWORKIMAGE
 :'NetworkImage'
 ;

NAVIGATOR
 :'Navigator'
 ;

PUSH
 : 'push'
 ;

POP
 : 'pop'
 ;

BUILDER
 : 'builder'
 ;

MATERIALPAGEROUTE
: 'MaterialPageRoute'
;

MATERIALAPP
 :'MaterialApp'
 ;

HOME
 :'home'
 ;


SCAFFOLD
 :'Scaffold'
 ;

TEXTFIELD
 :'TextField'
 ;

ONCHANGED
 :'onChanged'
 ;
SETSTATE
 :'setState'
 ;
INTEGER_LITERAL
 : DIGIT
 ;

DOUBLE_LITERAL
 : DIGIT '.' DIGIT
 ;

BOOLEAN_LITERAL
 : TRUE
 | FALSE
 ;

STRING_LITERAL
 : DOUBLE_QOUTE ('.' | '/' |  DIGIT |' ' | LETTER | DOLLAR_SIGN OPENED_CURLY_BRACES IDENTIFIER(DOT IDENTIFIER)? CLOSED_CURLY_BRACES)* DOUBLE_QOUTE
 | SINGLE_QOUTE ('.' | '/'| DIGIT |' '| LETTER  | DOLLAR_SIGN OPENED_CURLY_BRACES IDENTIFIER(DOT IDENTIFIER)? CLOSED_CURLY_BRACES )* SINGLE_QOUTE
 ;

DOUBLE_QOUTE
 : '"'
 ;

SINGLE_QOUTE
 : '\''
 ;

VOID
 : 'void'
 ;

INT
 : 'int'
 ;

DOUBLE
 : 'double'
 ;

STRING
 : 'String'
 ;

BOOLEAN
 : 'bool'
 ;

TRUE
 : 'true'
 ;

FALSE
 : 'false'
 ;

VAR
 : 'var'
 ;

CONST
 : 'const'
 ;

SWITCH
 : 'switch'
 ;

CASE
 : 'case'
 ;

DEFAULT
 : 'default'
 ;

BREAK
 : 'break'
 ;

RETURN
 : 'return'
 ;

IF
 : 'if'
 ;



ELSE
 : 'else'
 ;

MAIN
 : 'main'
 ;

EXTEND
 : 'extends'
 ;

OVERRIDE
 : 'override'
 ;

REQUIRED
 : 'required'
 ;

COLOR_START
 : '0x'
 ;

HEXDIGIT
 : [a-fA-F0-9]
 ;

COLOR_HEX
 : HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
 ;

DIGIT
 : [0-9]+
 ;

IDENTIFIER
 : IDENTIFIER_START IDENTIFIER_PART*
 ;

IDENTIFIER_START
 : LETTER
 | '_'
 ;

IDENTIFIER_PART
 : IDENTIFIER_START
 | DIGIT
 ;


LETTER
 : [a-zA-Z]+
 ;

EQUAL
 : '='
 ;

PLUS
 : '+'
 ;

PLUSPLUS
 : '++'
 ;

MINUS
 : '-'
 ;

MINUSMINUS
 : '--'
 ;

MULTI
 : '*'
 ;

DDIVIDE
 : '/'
 ;

IDIVIDE
 : '~/'
 ;

REMAIN
 : '%'
 ;

LESS_THAN
 : '<'
 ;

LESS_THAN_EQUAL
 : '<='
 ;

GREATER_THAN
 : '>'
 ;

GREATER_THAN_EQUAL
 : '>='
 ;

NOT_EQUAL
 : '!='
 ;

EQUAL_EQUAL
 : '=='
 ;

NOT
 : '!'
 ;

OR
 : '|'
 ;

OROR
 : '||'
 ;

AND
 :'&'
 ;

ANDAND
 :'&&'
 ;

XOR
 : '^'
 ;

LEFT_SHIFT
 : '<<'
 ;

RIGHT_SHIFT
 : '>>'
 ;

DOLLAR_SIGN
 : '$'
 ;

AT_SIGN
 : '@'
 ;

WS
 : [ \t\r\n] -> skip
 ;

COMMA
 : ','
 ;

COLON
 : ':'
 ;

SEMICOLON
 : ';'
 ;

 CHAR
  : EQUAL
  | PLUS
  | MINUS
  | MULTI
  | DDIVIDE
  | IDIVIDE
  | REMAIN
  | LESS_THAN
  | LESS_THAN_EQUAL
  | GREATER_THAN
  | GREATER_THAN_EQUAL
  | NOT_EQUAL
  | EQUAL_EQUAL
  | NOT
  | OR
  | AND
  | XOR
  | DOLLAR_SIGN
  | AT_SIGN
  | COMMA
  | COLON
  | SEMICOLON
  ;