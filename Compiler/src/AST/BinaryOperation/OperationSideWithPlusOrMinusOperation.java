package AST.BinaryOperation;

import AST.Node.Node;

import java.util.ArrayList;

public class OperationSideWithPlusOrMinusOperation extends Node implements IBinaryOperation{
	private IOperationSide operationSide;
	private ArrayList<BinaryOperation> binaryOperations;
	public OperationSideWithPlusOrMinusOperation() {
		binaryOperations = new ArrayList<>();
	}
	
	public void addBinaryOperation(BinaryOperation binaryOperation) {
		binaryOperations.add(binaryOperation);
		this.addNodeChild(binaryOperation);
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
		s+= operationSide.generate();
		for(BinaryOperation binaryOperation: binaryOperations){
			s += binaryOperation.generate();
		}
		return s;
	}

	@Override
	public String toString() {
		return "OperationSideWithPlusOrMinusOperation{" +
				"operationSide=" + operationSide +
				", binaryOperations=" + binaryOperations +
				'}';
	}
}
