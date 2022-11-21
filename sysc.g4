grammar sysc;

//rule

compunit 
	:(decl|funcdef) (compunit)*
	;

decl	
	:constdecl
	|vardecl
	;

constdecl
	:'const' btype constdef (',' constdef)* ';'
	;

btype
	:'int'
	|'float'
	;

constdef
	:IDENT ('[' constexp ']')* '=' constinitval
	;

constinitval
	:constexp
	|'{' (constinitval (',' constinitval)*)* '}'
	;

vardecl
	:btype vardef (',' vardef)* ';'
	;

vardef 
	:IDENT ('[' constexp ']')*
	|IDENT ('[' constexp ']')* '=' initval
	;

initval
	:exp
	|'{' (initval (',' initval))* '}'
	;

funcdef
	:functype IDENT '(' (funcfparams)* ')' block
	;

functype
	:'void'
	|'int'
	|'float'
	;

funcfparams
	:funcfparam (',' funcfparam)*
	;

funcfparam
	:btype IDENT ('[' ']' '{' (exp)* ']')*
	;

block
	:'{' (blockitem)* '}'
	;

blockitem
	:decl
	|stmt
	;

stmt	
	:lval '=' exp ';'
	|(exp)* ';'
	|block
	|'if' '(' cond ')' stmt ('else' stmt)*
	|'while' '(' cond ')' stmt
	|'break' ';' 
	|'continue' ';'
	|'return' (exp)* ';'
	;

exp
	:addexp
	;

cond
	:lorexp
	;

lval
	:IDENT ('[' exp ']')*
	;

primaryexp
	:'(' exp ')'
	|lval
	|number
	;

number
	:INTCONST
	|FLOATCONST
	;

unaryexp
	:primaryexp
	|IDENT '(' (funcrparams)* ')'
	|unaryop unaryexp
	;

unaryop
	:'+'
	|'-'
	|'!'
	;

funcrparams
	:exp (',' exp)*
	;

mulexp
	:unaryexp
	|mulexp ('*' | '/' |'%') unaryexp
	;

addexp
	:mulexp
	|addexp ('+' | '-') mulexp
	;

relexp
	:addexp
	|relexp ('<' | '>' | '<=' | '>=') addexp
	;

eqexp
	:relexp
	|eqexp ('==' | '!=') relexp
	;

landexp
	:eqexp
	|landexp '&&' eqexp
	;

lorexp
	:landexp
	|lorexp '||' landexp
	;

constexp
	:addexp
	;

//token

IDENT
	:[_a-zA-Z][_a-zA-Z0-9]*
	;

INTCONST
	:([1-9][0-9]*)
	|([0][0-7]*)
	|([0][x|X][0-9a-fA-F]*)
	;

FLOATCONST
	:([1-9][0-9]*[.][0-9]*)
        |([0][0-7]*[.][0-7]*)
        |([0][x|X][0-9a-fA-F]*[.][0-9a-fA-F]*)
	;

COMMENT
	:'//' [\r\n]* ->skip
	;

BLOCK
	:'/*' .*? '*/' ->skip
	;

WS
	:[ \t\r\n]+ ->skip
	;

