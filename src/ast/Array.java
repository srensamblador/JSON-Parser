/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	array:valor -> valor:valor*

public class Array extends AbstractValor {

	public Array(List<Valor> valor) {
		this.valor = valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
	}

	@SuppressWarnings("unchecked")
	public Array(Object valor) {
		this.valor = (List<Valor>) valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
	}

	public List<Valor> getValor() {
		return valor;
	}
	public void setValor(List<Valor> valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Valor> valor;

	public String toString() {
       return "{valor:" + getValor() + "}";
   }
}
