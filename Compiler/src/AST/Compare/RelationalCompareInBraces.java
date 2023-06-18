package AST.Compare;

import AST.Node.Node;

public class RelationalCompareInBraces extends Node implements IRelationalCompare{
	IRelationalCompare relationalCompare ;
	public void setRelationalCompare(IRelationalCompare relationalCompare) {
		this.relationalCompare = relationalCompare;
		this.addNodeChild((Node) relationalCompare);
	}
	public IRelationalCompare getRelationalCompare() {
		return this.relationalCompare;
	}

	@Override
	public String generate() {
		String s ="(";
		s+= relationalCompare.generate();
		s += ")";
		return s;
	}

	@Override
	public String toString() {
		return "RelationalCompareInBraces{" +
				"relationalCompare=" + relationalCompare +
				'}';
	}
}
