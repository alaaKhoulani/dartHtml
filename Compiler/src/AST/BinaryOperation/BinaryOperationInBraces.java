package AST.BinaryOperation;

import AST.Node.Node;

import java.util.ArrayList;

public class BinaryOperationInBraces extends Node implements IOperationSide {
	private IBinaryOperation binaryOperation;
	private ArrayList<BinaryOperation> binaryOperations;
	public BinaryOperationInBraces() {
		binaryOperations = new ArrayList<>();
	}
	
	public void setBinaryOperation(IBinaryOperation binaryOperation) {
		this.binaryOperation= binaryOperation;
		this.addNodeChild((Node) binaryOperation);
	}

	public IBinaryOperation getBinaryOperation() {
		return this.binaryOperation;
	}
	public void addBinaryOperation(BinaryOperation binaryOperation) {
		binaryOperations.add(binaryOperation);
		this.addNodeChild(binaryOperation);
	}

	@Override
	public String generate() {
		String s = "(";
		s+= binaryOperation.generate();
		s+=")";
		for(BinaryOperation binaryOperation1: binaryOperations){
			s+= binaryOperation1.generate();
		}
		return s;
	}

	@Override
	public String toString() {
		return "BinaryOperationInBraces{" +
				"binaryOperation=" + binaryOperation +
				", binaryOperations=" + binaryOperations +
				'}';
	}
}
