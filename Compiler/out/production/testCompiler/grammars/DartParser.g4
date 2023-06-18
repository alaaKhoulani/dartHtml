parser grammar DartParser;
options { tokenVocab=DartLexer ; }

@header {
	package grammars;
}

program
 :   (dclass | functionDeclaration | declaration SEMICOLON )* initFunction (dclass | functionDeclaration | declaration SEMICOLON )*
 ;

initFunction
 : VOID MAIN OPENED_BRACES CLOSED_BRACES OPENED_CURLY_BRACES (statement)*  CLOSED_CURLY_BRACES
 ;


statement
 : navigation SEMICOLON
 | declaration SEMICOLON
 | assignment SEMICOLON
 | binaryOperation SEMICOLON
 | relationalCompare SEMICOLON
 | logicalOperation SEMICOLON
 | dwhile
 | dfor
 | functionDeclaration
 | functionCall SEMICOLON
 | dswitch
 | ifCondition
 | setState SEMICOLON
 ;

navigation
 : NAVIGATOR DOT PUSH OPENED_BRACES IDENTIFIER COMMA materialPageRoue  CLOSED_BRACES
 | NAVIGATOR DOT POP OPENED_BRACES IDENTIFIER CLOSED_BRACES
 ;

materialPageRoue
 : MATERIALPAGEROUTE OPENED_BRACES BUILDER COLON OPENED_BRACES sentParameter CLOSED_BRACES typeFunctionBlock CLOSED_BRACES
 ;

declaration
 : CONST? type (IDENTIFIER | assignment) (COMMA (IDENTIFIER | assignment))*
 | IDENTIFIER IDENTIFIER (EQUAL IDENTIFIER OPENED_BRACES CLOSED_BRACES)?
 ;


assignment
 : IDENTIFIER ( DOT IDENTIFIER)? EQUAL literal #literalAssignment
 | IDENTIFIER ( DOT IDENTIFIER)?  EQUAL expression #expressionAssignment
 | IDENTIFIER ( DOT IDENTIFIER)?  EQUAL listElements #listAssignment
 | IDENTIFIER ( DOT IDENTIFIER)?  EQUAL widget #widgetAssignment
 | IDENTIFIER ( DOT IDENTIFIER)?  EQUAL (functionCall | functionType |functionVoid ) #functionAssignment
 ;

type
 : INT
 | DOUBLE
 | STRING
 | BOOLEAN
 | VAR
 | LIST
 | WIDGET
 | FUNCTION
 ;

literal
 : INTEGER_LITERAL #integerLiteral
 | DOUBLE_LITERAL #doubleLiteral
 | STRING_LITERAL #stringLiteral
 | BOOLEAN_LITERAL #booleanLiteral
 ;

number
 : INTEGER_LITERAL
 | DOUBLE_LITERAL
 ;

binaryOperation
 : binaryOperationSide plusOrMinusOperation* #operationSideWithPlusOrMinusOperation
 | element PLUSPLUS #plusPlusOperation
 | element MINUSMINUS #miusMinusOperation
 ;

binaryOperationSide
 : element multiOrDivOrRemOperation* #elementWithMultiOrDivOrRemOperation
 | OPENED_BRACES binaryOperation CLOSED_BRACES multiOrDivOrRemOperation* #binaryOperationInBraces
 | OPENED_BRACES binaryOperationSide CLOSED_BRACES #binaryOperationSideInBraces
 ;

plusOrMinusOperation
 : (PLUS | MINUS) binaryOperationSide
 ;

multiOrDivOrRemOperation
 : (MULTI | DDIVIDE | IDIVIDE | REMAIN) binaryOperationSide
 ;

element
 : number
 | IDENTIFIER (DOT IDENTIFIER)?
 ;

relationalOperator
 : (GREATER_THAN_EQUAL | GREATER_THAN | LESS_THAN_EQUAL | LESS_THAN | EQUAL_EQUAL | NOT_EQUAL)
 ;

side
 : element
 | binaryOperation
 ;

relationalCompare
 : side relationalOperator side #twoSideComapre
 | OPENED_BRACES relationalCompare CLOSED_BRACES #relationalCompareInBraces
 ;

bitwiseOperator
 : (OR | AND | XOR | LEFT_SHIFT | RIGHT_SHIFT)
 ;

bitwiseOperation
 : side (bitwiseOperator side)+ #towSideBitwise
 | side (bitwiseOperator bitwiseOperation)+ #sideWithBitwiseOperation
 | OPENED_BRACES bitwiseOperation CLOSED_BRACES (bitwiseOperator side)* #bitwiseOperationWithSides
 | OPENED_BRACES bitwiseOperation CLOSED_BRACES (bitwiseOperator bitwiseOperation)* #twoBitwiseOperation
 ;

logicOperator
 : ANDAND
 | OROR
 ;

booleanSide
 : relationalCompare #relationalBooleanSide
 | OPENED_BRACES logicalOperation CLOSED_BRACES #logicalBooleanSide
 | BOOLEAN_LITERAL #booleanBooleanSide
 ;

logicalOperation
 : booleanSide (logicOperator booleanSide)* #condition
 | NOT logicalOperation #notCondition
 ;

ifCondition
 : ifExpression (ELSE ifExpression)* elseExpression?
 ;

ifExpression
 : IF OPENED_BRACES logicalOperation CLOSED_BRACES (block | statement)
 ;



elseExpression
 : ELSE (block | statement)
 ;

dfor
 : FOR OPENED_BRACES (declaration | (assignment (COMMA assignment)* ) )? SEMICOLON logicalOperation SEMICOLON (binaryOperation) CLOSED_BRACES (block | SEMICOLON)
 ;

dwhile
 : WHILE OPENED_BRACES logicalOperation CLOSED_BRACES (block | SEMICOLON)
 ;

classMemberDefinition
 : declaration SEMICOLON #declarationMember
 | (AT_SIGN OVERRIDE)? functionDeclaration #functionMember
 ;

dclass
 : CLASS IDENTIFIER (EXTEND (IDENTIFIER| STATE LESS_THAN IDENTIFIER GREATER_THAN ))? OPENED_CURLY_BRACES (classMemberDefinition)* constructor? (classMemberDefinition)* CLOSED_CURLY_BRACES
 ;

constructor
 : IDENTIFIER functionVoid
 ;

block
 : OPENED_CURLY_BRACES (statement)* CLOSED_CURLY_BRACES
 ;

listElements
 : OPENED_SQUERE_BRACES ((element|listElements|literal|IDENTIFIER) (COMMA (element|listElements|literal|IDENTIFIER) )*)?  CLOSED_SQUERE_BRACES
 ;

functionParameter //declaration parameters
 : ( declaration (COMMA declaration)* (COMMA namedDeclaration )? )? | ( namedDeclaration )?
 ;

namedDeclaration
 : OPENED_CURLY_BRACES  REQUIRED declaration (COMMA REQUIRED declaration)*  CLOSED_CURLY_BRACES
 ;

voidFunctionBlock
 : OPENED_CURLY_BRACES (statement )* (RETURN  SEMICOLON)? CLOSED_CURLY_BRACES
 ;

typeFunctionBlock
 : OPENED_CURLY_BRACES (statement)* RETURN (expression | functionCall | widget) SEMICOLON CLOSED_CURLY_BRACES
 ;

functionType
 :  OPENED_BRACES functionParameter  CLOSED_BRACES typeFunctionBlock #typeFunction
 ;

functionVoid
 :  OPENED_BRACES functionParameter  CLOSED_BRACES voidFunctionBlock #voidFunction
 ;

functionDeclaration
 : (type | WIDGET | STATE LESS_THAN IDENTIFIER GREATER_THAN ) IDENTIFIER functionType   #declarationTypeFunction
 | VOID IDENTIFIER functionVoid   #declarationVoidFunction
 ;

sentParameter
 : literal
 | functionCall
 | expression
 | booleanSide
 | functionType
 | functionVoid
 | widget
 | element
 ;

namedParameter
 : (IDENTIFIER COLON sentParameter (COMMA IDENTIFIER COLON sentParameter)*)
 ;

nonNamedParameter
: (sentParameter (COMMA sentParameter)*)
;

parametersToSend
 : ( nonNamedParameter (COMMA namedParameter)? )? | namedParameter?
 ;

functionCall
 : IDENTIFIER OPENED_BRACES parametersToSend CLOSED_BRACES
 ;

expression //return constant value
 : bitwiseOperation #bitwiseExpression
 | binaryOperation #binaryExpression
 | logicalOperation #logicalExpression
 ;

dswitch
 : SWITCH OPENED_BRACES expression CLOSED_BRACES OPENED_CURLY_BRACES switchCase* defaultCase? CLOSED_CURLY_BRACES
 ;

switchCase
 : CASE expression COLON (statement)* breakStatement?
 ;

defaultCase
 : DEFAULT COLON (statement)* breakStatement?
 ;

breakStatement
 : BREAK SEMICOLON
 ;

widget
 : listView
 | textWidget
 | container
 | button
 | row
 | column
 | image
 | scaffold
 |materialApp
 | textField
 ;

listView
 : LISTVIEW OPENED_BRACES property CLOSED_BRACES
 ;

textWidget
 : TEXTWIDGET OPENED_BRACES literal CLOSED_BRACES
 ;

container
 : CONTAINER OPENED_BRACES (CHILD COLON widget COMMA)? ( WIDTH COLON element COMMA)? ( HEIGHT COLON element COMMA)? ( color)? CLOSED_BRACES
 ;

button
 : BUTTON OPENED_BRACES CHILD COLON textWidget COMMA ONPRESSED COLON functionVoid  (COMMA  color)? CLOSED_BRACES
 ;

row
 : ROW OPENED_BRACES property CLOSED_BRACES
 ;

column
 : COLUMN OPENED_BRACES property CLOSED_BRACES
 ;

property
 : CHILDREN COLON OPENED_SQUERE_BRACES widget (COMMA widget)* CLOSED_SQUERE_BRACES
 ;

color
 : COLOR COLON ( element | COLOR_C OPENED_BRACES COLOR_START COLOR_HEX CLOSED_BRACES)
 ;

image
 : IMAGE_I OPENED_BRACES (IMAGE COLON (ASSETIMAGE | NETWORKIMAGE) OPENED_BRACES literal  CLOSED_BRACES )CLOSED_BRACES
 ;

materialApp
 : MATERIALAPP OPENED_BRACES (HOME COLON functionCall COMMA)? CLOSED_BRACES
 ;

scaffold
 : SCAFFOLD OPENED_BRACES (BODY COLON widget COMMA)? CLOSED_BRACES
 ;

textField
 : TEXTFIELD OPENED_BRACES onChanged CLOSED_BRACES
 ;

onChanged
 : ONCHANGED COLON OPENED_BRACES declaration CLOSED_BRACES voidFunctionBlock
 ;

setState
 : SETSTATE OPENED_BRACES functionVoid CLOSED_BRACES
 ;


