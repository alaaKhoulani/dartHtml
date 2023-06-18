package AST.BinaryOperation;

import AST.Element.IElement;
import AST.Node.Node;

public class PostOperations extends Node implements IBinaryOperation{
	private String operator;
	private IElement element;
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getOperator() {
		return this.operator;
	}
	public void setElement(IElement element) {
		this.element = element;
		this.addNodeChild((Node) element);
	}
	
	public IElement getElement() {
		return this.element;
	}

	@Override
	public String generate() {
		String s = "";
		s+= element.generate();
		s+= operator;
		return s;
	}

	@Override
	public String toString() {
		return "PostOperations{" +
				"operator='" + operator + '\'' +
				", element=" + element +
				'}';
	}
}
