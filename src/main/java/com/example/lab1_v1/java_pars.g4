parser grammar java_pars;

options {
    tokenVocab=java_lex;
}

program: (statement)* EOF;

statement: declaration | assignment | if_statement | for_loop | increment | decrement | class_declaration | method_declaration | method_call | import_statement;

declaration: (MODIFIER? TYPE VARIABLE (ASSIGN expression)? (COMMA VARIABLE (ASSIGN expression)?)*) SEMI;

assignment: TYPE? VARIABLE ASSIGN expression SEMI;

if_statement: IF LPAREN expression RPAREN LBRACE statement RBRACE (ELSE LBRACE statement RBRACE)?;

expression: term ((ARITHMETIC | DIV | MOD) term)*;

term: factor ((SIGN) factor)*;

factor: (LPAREN expression RPAREN) | VARIABLE | NUMBER;

increment: VARIABLE INC SEMI;
decrement: VARIABLE DEC SEMI;

//for
for_loop: FOR LPAREN for_init expression SEMI for_update RPAREN LBRACE statement RBRACE;
for_init: (assignment | declaration | SEMI)?;
for_update: (expression | increment_in_for | decrement_in_for)?;
increment_in_for: VARIABLE INC;
decrement_in_for: VARIABLE DEC;

//class
class_declaration: MODIFIER? CLASS VARIABLE LBRACE (class_statement)* RBRACE;
class_statement: declaration | assignment | if_statement | for_loop | increment | decrement | method_declaration | method_call;

//functions
method_declaration: MODIFIER? TYPE VARIABLE LPAREN (parameter_list)? RPAREN LBRACE statement* RBRACE;
parameter_list: parameter (COMMA parameter)*;
parameter: TYPE VARIABLE;
method_call: VARIABLE LPAREN (expression_list)? RPAREN SEMI;
expression_list: expression (COMMA expression)*;

//import
import_statement: IMPORT import_name SEMI;
import_name: VARIABLE (DOT VARIABLE)*;