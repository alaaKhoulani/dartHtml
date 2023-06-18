package AST.BinaryOperation;

import AST.Node.Node;

public class BinaryOperationSideInBraces extends Node implements IOperationSide{
	private IOperationSide operationSide;
	public void setOperationSide(IOperationSide operationSide) {
		this.operationSide = operationSide;
		this.addNodeChild((Node) operationSide);
	}
	
	public IOperationSide getOperationSide() {
		return this.operationSide;
	}

	@Override
	public String generate() {
		String s = "(";
		s+= operationSide.generate();
		s+=")";
		return s;
	}

	@Override
	public String toString() {
		return "BinaryOperationSideInBraces{" +
				"operationSide=" + operationSide +
				'}';
	}
}
