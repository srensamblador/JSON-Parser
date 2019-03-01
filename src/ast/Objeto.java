/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	objeto:valor -> atributo:atributo*

public class Objeto extends AbstractValor {

	public Objeto(List<Atributo> atributo) {
		this.atributo = atributo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(atributo);
	}

	@SuppressWarnings("unchecked")
	public Objeto(Object atributo) {
		this.atributo = (List<Atributo>) atributo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(atributo);
	}

	public List<Atributo> getAtributo() {
		return atributo;
	}
	public void setAtributo(List<Atributo> atributo) {
		this.atributo = atributo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Atributo> atributo;

	public String toString() {
       return "{atributo:" + getAtributo() + "}";
   }
}
