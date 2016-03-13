
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class Boolean extends Terminal {
	
	public Boolean (String theSpelling, SourcePosition thePosition) {
		super (theSpelling, thePosition);
	}

	public Object visit(Visitor v, Object o) {
		return v.visitBoolean(this, o);
		//return null;
	}
}
