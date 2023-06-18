package AST.Literal;

import AST.Node.Node;

public class DoubleLiteral extends Node implements ILiteral {
	double value;
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}

	@Override
	public String generate() {
		String s ="";
		s+=Double.toString(getValue());
		return s;
	}
	@Override
	public String toString() {
		return "value=" + value;
	}
}
