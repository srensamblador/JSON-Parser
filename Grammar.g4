start returns [JSON ast]
	: valor EOF { $ast = $valor.ast ;} ;

valor returns [Valor ast]
	: STRING  {$ast = new Cadena($STRING) ;}
	| NUMBER {$ast = new Numero($NUMBER) ;}
	| 'true' {$ast = new True(); }
	| 'false' {$ast = new False(); }
	| 'null' {$ast = new Null(); }
	| '{' propiedades '}' { $ast = new Objeto($propiedades.list); }
	| '[' valores ']' {$ast = new Array($valores.list); }
	;

propiedades returns [List<Valor> list = new ArrayList<>()]
	: (propiedad {$list.add($propiedad.ast); } (',' propiedad {$list.add($propiedad.ast); } ) *)? ;

propiedad returns [Atributo ast]
	: STRING ':' valor { $ast = new Atributo($STRING, $valor.ast); } ; 

valores returns [List<Valor> list = new ArrayList<>()]
	: (valor {$list.add($valor.ast); } (',' valor {$list.add($valor.ast);})*)? ;