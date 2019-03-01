/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	atributo -> string:String  valor:valor

public class Atributo extends AbstractAST  {

	public Atributo(String string, Valor valor) {
		this.string = string;
		this.valor = valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
	}

	public Atributo(Object string, Object valor) {
		this.string = (string instanceof Token) ? ((Token)string).getText() : (String) string;
		this.valor = (Valor) ((valor instanceof ParserRuleContext) ? getAST(valor) : valor);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(string, valor);
	}

	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}

	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String string;
	private Valor valor;

	public String toString() {
       return "{string:" + getString() + ", valor:" + getValor() + "}";
   }
}
