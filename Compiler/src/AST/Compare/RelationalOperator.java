package AST.Compare;

import AST.Node.Node;

public class RelationalOperator extends Node {
	private String operator;
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
	}

	@Override
	public String generate() {
		String s = "";
		s += operator;
		return s;
	}

	@Override
	public String toString() {
		return "RelationalOperator{" +
				"operator='" + operator + '\'' +
				'}';
	}
}
