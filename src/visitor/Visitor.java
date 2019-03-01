/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Atributo node, Object param);
	public Object visit(Cadena node, Object param);
	public Object visit(Numero node, Object param);
	public Object visit(True node, Object param);
	public Object visit(False node, Object param);
	public Object visit(Null node, Object param);
	public Object visit(Objeto node, Object param);
	public Object visit(Array node, Object param);
	public Object visit(Json node, Object param);
}
