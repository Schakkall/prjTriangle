package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


public class AssignAndDeclarationCommand extends AssignCommand {

	public AssignAndDeclarationCommand(Vname vAST, Expression eAST, VarDeclaration dAST, SourcePosition thePosition) {
		super(vAST, eAST, thePosition);
		this.D = dAST;
	}

	public Object visit(Visitor v, Object o) {
		return v.visitAssignAndDeclarationCommand(this, o);
	}
	  
	
	public VarDeclaration D;  

}
