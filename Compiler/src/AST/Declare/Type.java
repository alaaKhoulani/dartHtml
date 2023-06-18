package AST.Declare;

import AST.Node.Node;

public class Type extends Node {
	String type;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getValue() {
		return type;
	}

	@Override
	public String generate() {
		String s="let ";
		return s;
	}

	@Override
	public String toString() {
		return "type=" + type;
	}
}
