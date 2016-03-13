package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ExpressionCommand extends Command {

	public ExpressionCommand(Expression eAST, SourcePosition thePosition) {
		super(thePosition);
		E = eAST;
	}

	
	public Object visit(Visitor v, Object o) {
		return v.visitExpressionCommand(this, o);
	}
	
	public Expression E;

}
