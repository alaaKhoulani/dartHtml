package AST.BinaryOperation;

import AST.Node.Node;

public class BinaryOperation extends Node {
	private String operator;
	private IOperationSide operationSide;
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public void setOperationSide(IOperationSide operationSide) {
		this.operationSide = operationSide;
		this.addNodeChild((Node) operationSide);
	}
	
	public IOperationSide getOperationSide() {
		return this.operationSide;
	}

	@Override
	public String generate() {
		String s = "";
		if( operator != null ){
			s+= operator;
		}
		s+= operationSide.generate();
		return s;
	}

	@Override
	public String toString() {
		return "BinaryOperation{" +
				"operator='" + operator + '\'' +
				", operationSide=" + operationSide +
				'}';
	}
}
