package AST.LogicalOperation;

import AST.Node.Node;

public class LogicalOperator extends Node {
	private String operator;
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
	}

	@Override
	public String generate() {
		return operator;
	}

	@Override
	public String toString() {
		return "LogicalOperator{" +
				"operator='" + operator + '\'' +
				'}';
	}
}
