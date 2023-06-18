package AST.Declare;

import AST.Element.IElement;
import AST.Element.Identifier;
import AST.Literal.ILiteral;
import AST.Node.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListElement extends Node {
    private ArrayList<IElement> elements;
    private ArrayList<ListElement> listElements;
    private ArrayList<ILiteral> literals;
    private ArrayList<Identifier> identifiers;

    private Map<Integer, Node> total;

    public ListElement() {
        this.elements = new ArrayList<>();
        this.listElements = new ArrayList<>();
        this.literals = new ArrayList<>();
        this.identifiers = new ArrayList<>();
        this.total = new HashMap<>();
    }




    public void addElement(IElement element, int index) {
        this.elements.add(element);
        this.total.put(index, (Node) element);
        this.addNodeChild((Node) element);

    }

    public void addListElement(ListElement element, int index) {
        this.listElements.add(element);
        this.total.put(index, element);
        this.addNodeChild(element);
    }

    public void addString(ILiteral string, int index) {
        this.literals.add(string);
        this.total.put(index, (Node) string);
        this.addNodeChild((Node) string);
    }

    public void addIdentifier(Identifier identifier, int index) {
        this.identifiers.add(identifier);
        this.total.put(index, identifier);
        this.addNodeChild(identifier);
    }

    @Override
    public String generate() {
        String s = "[";
        int i = 1;
        for (Map.Entry<Integer, Node> me :
                total.entrySet()) {

            s += me.getValue().generate();
            if (i < total.size()) {
                s += ",";
            }
            i++;
        }
        s += "]";

        return s;
    }

    @Override
    public String toString() {
        return "ListElement{" +
                "elements=" + elements +
                ", listElements=" + listElements +
                ", strings=" + literals +
                ", identifiers=" + identifiers +
                '}';
    }
}
