package AST.Widgets;

import AST.Node.Node;
import SymbolTable.Scope;

public  class Widget extends Node {
    private Widget widget;
    private  String clasID;

    public String getClasID() {
        return this.clasID;
    }

    public void setClasID(String classID) {
        this.clasID = classID;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
        this.addNodeChild(widget);
    }
    public String generate(){return widget.generate();}

    @Override
    public String toString() {
        return "Widget{" +
                "widget=" + widget +
                '}';
    }
}
