package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class BooleanExpression extends Expression {

	  public BooleanExpression (Boolean bolAST, SourcePosition thePosition) {
	    super (thePosition);
	    BOL = bolAST;
	  }

	  public Object visit(Visitor v, Object o) {
	    return v.visitBooleanExpression(this, o);
	  }

	  public Boolean BOL;
	}

