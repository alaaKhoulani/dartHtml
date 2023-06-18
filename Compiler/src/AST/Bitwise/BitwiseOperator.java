package AST.Bitwise;

import AST.Node.Node;

public class BitwiseOperator extends Node {
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
		return "BitwiseOperator{" +
				"operator='" + operator + '\''+
				'}';
	}
}
