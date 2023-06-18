package AST.Declare;

import AST.Element.Identifier;
import AST.Literal.ILiteral;
import AST.Node.Node;

public class LiteralAssignment extends Node implements IAssignment{
	private Identifier ID;
	private ILiteral literal;
	
	public void setLiteral(ILiteral literal) {
		this.literal = literal;
		this.addNodeChild((Node) literal);
	}
	
	public ILiteral getLiteral() {
		return this.literal;
	}

	public Identifier getID() {
		return ID;
	}

	public void setID(Identifier ID) {
		this.ID = ID;
	}

	@Override
	public String generate() {
		String s = "";
		s += ID.generate();
		s += "=";
		s += literal.generate();
		return s;
	}

	@Override
	public String toString() {
		return "LiteralAssignment{" +
				"ID='" + ID + '\'' +
				", literal=" + literal +
				'}';
	}
}
