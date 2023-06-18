package AST.Bitwise;

import AST.Node.Node;
import AST.Program;

import java.util.ArrayList;

public class TwoBitwiseOperation extends Node implements IBitwiseOperation{
	private ArrayList<IBitwiseOperation> bitwiseOperations;
	private ArrayList<BitwiseOperator> bitwiseOperators;
	
	public TwoBitwiseOperation() {
		bitwiseOperators = new ArrayList<>();
		bitwiseOperations = new ArrayList<>();
	}
	
	public void addBitwiseOperation(IBitwiseOperation operation) {
		this.bitwiseOperations.add(operation);
		this.addNodeChild((Node) operation);
	}
	public void addBitwiseOperator(BitwiseOperator operator) {
		this.bitwiseOperators.add(operator);
		this.addNodeChild(operator);
	}

	@Override
	public String generate() {
		String s = "";
		for(int i =0; i<bitwiseOperations.size(); i++){
			if(i == 0) s += "(";
			s += bitwiseOperations.get(i).generate();
			if(i == 0) s += ")";
			if(i<bitwiseOperators.size()){
				s+=bitwiseOperators.get(i).generate();
			}
		}
		return s;
	}

	@Override
	public String toString() {
		return "TwoBitwiseOperation{" +
				"bitwiseOperations=" + bitwiseOperations +
				", bitwiseOperators=" +bitwiseOperators +
				'}';
	}

}
