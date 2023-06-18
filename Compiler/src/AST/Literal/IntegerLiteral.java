package AST.Literal;

import AST.Node.Node;

public class IntegerLiteral extends Node implements ILiteral{
	int value;
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

	@Override
	public String generate() {
		String s ="";
		s+=Integer.toString(getValue());
		return s;
	}
	@Override
	public String toString() {
		return "value=" + value;
	}
}
