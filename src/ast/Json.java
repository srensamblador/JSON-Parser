/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	json -> valor:valor

public class Json extends AbstractAST  {

	public Json(Valor valor) {
		this.valor = valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
	}

	public Json(Object valor) {
		this.valor = (Valor) ((valor instanceof ParserRuleContext) ? getAST(valor) : valor);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
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

	private Valor valor;

	public String toString() {
       return "{valor:" + getValor() + "}";
   }
}
