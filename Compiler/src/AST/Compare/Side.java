package AST.Compare;

import AST.Element.IElement;
import AST.Node.Node;

public class Side extends Node {
	private IElement element;

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
		s += element.generate();
		return s;
	}

	@Override
	public String toString() {
		return "Side{" +
				", element=" + element +
				'}';
	}
}
