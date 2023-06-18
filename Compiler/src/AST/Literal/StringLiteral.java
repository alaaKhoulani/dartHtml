package AST.Literal;

import AST.Element.Identifier;
import AST.Node.Node;

public class StringLiteral extends Node implements ILiteral{
	String value;

	Identifier identifier;
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	@Override
	public String generate() {
		String s ="";
		if (value!=null) return value;
		else return identifier.generate();
//		if (value!=null && value.length()>2)
//			s+=getValue().substring(1,value.length()-1);
//		else if(value!=null) s+=value;
//		else if (identifier!=null)
//			s+=identifier.generate();
//		s+="";
//		return s;
	}

	@Override
	public String toString() {
		return "StringLiteral{" +
				"value='" + value + '\'' +
				", identifier=" + identifier +
				'}';
	}
}
