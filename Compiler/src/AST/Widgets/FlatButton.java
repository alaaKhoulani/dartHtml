package AST.Widgets;

import AST.Function.VoidFunction;
import AST.Node.Node;

public class FlatButton extends Widget {
    private TextWidget text;
    private VoidFunction onPressed;

    public VoidFunction getOnPressed() {
        return onPressed;
    }

    public void setOnPressed(VoidFunction onPressed) {
        this.onPressed = onPressed;
        this.addNodeChild((Node) onPressed);
    }

    public TextWidget getText() {
        return text;
    }

    public void setText(TextWidget text) {
        this.text = text;
        this.addNodeChild(text);
    }

    @Override
    public String generate() {
        this.setClasID(Node.getClassID());
        String s="<button id=\" "+this.getClasID()+"\" ";
        s+="onclick=\" "+onPressed.getBlock().generate()+"\"";
        s+="style=\"margin:8px; display: block;\">"+text.generate();
        s+="</button>";
        return s;
    }

    @Override
    public String toString() {
        return "FlatButton{" +
                "text=" + text +
                ", onPressed=" + onPressed +
                '}';
    }
}
