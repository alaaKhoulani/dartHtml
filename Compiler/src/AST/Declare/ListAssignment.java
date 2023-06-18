package AST.Declare;

import AST.Element.Identifier;
import AST.Node.Node;

public class ListAssignment  extends Node implements IAssignment{
    private Identifier ID;
    private ListElement listElement;


    public ListElement getListElement() {
        return listElement;
    }

    public void setListElement(ListElement listElement) {
        this.listElement = listElement;
        this.addNodeChild(listElement);
    }

    public Identifier getID() {
        return ID;
    }

    public void setID(Identifier ID) {
        this.ID = ID;
    }

    @Override
    public String generate() {
        String s = "";
        s += ID.generate();
        s += " = ";
        s += listElement.generate();
        return s;
    }

    @Override
    public String toString() {
        return "ListAssignment{" +
                "ID='" + ID + '\'' +
                ", listElement=" + listElement +
                '}';
    }
}
