package AST.Bitwise;

import java.util.ArrayList;

import AST.Compare.Side;
import AST.Node.Node;
import AST.Program;

public class SideWithBitwiseOperation extends Node implements IBitwiseOperation{
	private Side side;
	private ArrayList<BitwiseOperator> operators;
	private ArrayList<IBitwiseOperation> bitwiseOperations;
	
	public SideWithBitwiseOperation() {
		operators = new ArrayList<>();
		bitwiseOperations = new ArrayList<>();
	}
	
	public void addOperator(BitwiseOperator operator) {
		this.operators.add(operator);
		this.addNodeChild(operator);
	}
	
	public void addBitwiseOperation(IBitwiseOperation operation) {
		this.bitwiseOperations.add(operation);
		this.addNodeChild((Node) operation);
	}
	
	public void setSide(Side side) {
		this.side = side;
		this.addNodeChild(side);
	}

	public Side getSide() {
		return this.side;
	}

	@Override
	public String generate() {
		String s = "";
		s += side.generate();
		for(int i=0; i< operators.size(); i++){
			s+=operators.get(i).generate();
			s+=bitwiseOperations.get(i).generate();
		}
		return s;
	}

	public String toString() {
		return "SideWithBitwiseOperation{" +
				"side=" + side +
				", operators=" + operators +
				", bitwiseOperations=" + bitwiseOperations +
				'}';
	}
}
