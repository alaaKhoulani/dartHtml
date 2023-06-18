package AST.Widgets;

import AST.Node.Node;

public class ListView extends Widget {
    private  Property property;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
        this.addNodeChild(property);
    }

    @Override
    public String generate() {
        String s="<div id=\""+ Node.getClassID()+"\" >";
        s+=property.generate();
        s+="</div>\n";
        return s;
    }

    @Override
    public String toString() {
        return "ListView{" +
                "property=" + property +
                '}';
    }
}
