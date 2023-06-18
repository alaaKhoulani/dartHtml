package AST.Literal;

import AST.Node.Node;

public class BooleanLiteral extends Node implements ILiteral{
	boolean value;
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
	public boolean getValue() {
		return this.value;
	}

	@Override
	public String generate() {
		String s ="";
		s+=Boolean.toString(getValue());
		return s;
	}

	@Override
	public String toString() {
		return "value=" + value;
	}
}
