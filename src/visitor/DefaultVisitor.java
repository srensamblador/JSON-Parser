/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Atributo { String string;  Valor valor; }
	public Object visit(Atributo node, Object param) {
		if (node.getValor() != null)
			node.getValor().accept(this, param);
		return null;
	}

	//	class Cadena { String string; }
	public Object visit(Cadena node, Object param) {
		return null;
	}

	//	class Numero { String string; }
	public Object visit(Numero node, Object param) {
		return null;
	}

	//	class True {  }
	public Object visit(True node, Object param) {
		return null;
	}

	//	class False {  }
	public Object visit(False node, Object param) {
		return null;
	}

	//	class Null {  }
	public Object visit(Null node, Object param) {
		return null;
	}

	//	class Objeto { List<Atributo> atributo; }
	public Object visit(Objeto node, Object param) {
		visitChildren(node.getAtributo(), param);
		return null;
	}

	//	class Array { List<Valor> valor; }
	public Object visit(Array node, Object param) {
		visitChildren(node.getValor(), param);
		return null;
	}

	//	class Json { Valor valor; }
	public Object visit(Json node, Object param) {
		if (node.getValor() != null)
			node.getValor().accept(this, param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
