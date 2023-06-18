package AST.Widgets;

public class Scaffold extends Widget{
    Widget child;

    public Widget getChild() {
        return child;
    }

    public void setChild(Widget child) {
        this.child = child;
        this.addNodeChild(child);
    }

    @Override
    public String generate() {
        String s=child.generate();
        return s;
    }


    @Override
    public String toString() {

        return "Scaffold{" +
                "child=" + child +
                '}';
    }
}
