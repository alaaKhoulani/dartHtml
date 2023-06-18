package AST.Widgets;

import AST.Element.IElement;
import AST.Node.Node;

public class Container extends Widget {

    IElement width,height;
    Widget child;
    Color color;

    public IElement getWidth() {
        return width;
    }

    public void setWidth(IElement width) {
        this.width = width;
        this.addNodeChild((Node) width);
    }

    public IElement getHeight() {
        return height;
    }

    public void setHeight(IElement height) {
        this.height = height;
        this.addNodeChild((Node) height);

    }

    public Widget getChild() {
        return child;
    }

    public void setChild(Widget child) {
        this.child = child;
        this.addNodeChild((Node) child);

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        this.addNodeChild(color);
    }

    public String generate(){
        String s="<div  style=\" ";
        if(width!=null) s+="width:"+width.generate()+"px;";
        if(height !=null) s+="height:"+height.generate()+"px;";
        if (color!=null) s+=" background-color:"+color.generate()+";";
        s+="\" id=\""+Node.getClassID()+"\" >";
        if (child!=null) s += child.generate();
        s+="</div>\n";
        return s;
    }

    @Override
    public String toString() {
        return "Container{" +
                "width=" + width +
                ", height=" + height +
                ", child=" + child +
                ", color=" + color +
                '}';
    }
}
