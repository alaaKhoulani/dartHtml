package AST.Widgets;

import AST.Element.IElement;
import AST.Node.Node;

public class Color extends Node {
    IElement color;
    String hexColor;

    public IElement getColor() {
        return color;
    }

    public void setColor(IElement color) {
        this.color = color;
        this.addNodeChild((Node) color);
    }

    public void setHexColor(String hexColor){
        this.hexColor = hexColor;
    }
    public String generate(){
        String s = "";
        s += "#" + hexColor;
        return s;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color=" + color +
                '}';
    }
}
