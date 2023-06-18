package AST.Declare;

import AST.Element.Identifier;
import AST.Node.Node;
import AST.Widgets.Widget;

public class WidgetAssignment extends Node implements IAssignment {
    private Widget widget;
    private Identifier ID;

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
        this.addNodeChild(widget);
    }

    public Identifier getID() {
        return ID;
    }

    public void setID(Identifier ID) {
        this.ID = ID;
        this.addNodeChild(ID);
    }


    @Override
    public String generate() {
        String s=ID+" = "+widget.generate();
        return s;
    }

    @Override
    public String toString() {
        return "WidgetAssignment{" +
                "widget=" + widget +
                ", ID='" + ID + '\'' +
                '}';
    }
}
