package AST.BinaryOperation;

import java.util.ArrayList;

import AST.Element.IElement;
import AST.Node.Node;

public class ElementWithMultiOrDivOrRemOperation extends Node implements IOperationSide{
	private IElement element;
	private ArrayList<BinaryOperation> binaryOperations;
	public ElementWithMultiOrDivOrRemOperation() {
		binaryOperations = new ArrayList<>();
	}
	
	public void addBinaryOperation(BinaryOperation binaryOperation) {
		binaryOperations.add(binaryOperation);
		this.addNodeChild(binaryOperation);
	}

	@Override
	public String generate() {
		String s = "";
		s+= element.generate();
		for(BinaryOperation binaryOperation: binaryOperations){
			s += binaryOperation.generate();
		}
		return s;
	}

	public void setElement(IElement element) {
		this.element = element;
		this.addNodeChild((Node) element);
	}
	
	public IElement getElement() {
		return this.element;
	}

	@Override
	public String toString() {
		return "ElementWithMultiOrDivOrRemOperation{" +
				"element=" + element +
				", binaryOperations=" + binaryOperations +
				'}';
	}
}
