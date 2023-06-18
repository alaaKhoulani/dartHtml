package AST.Widgets;

import AST.Block.VoidFunctionBlock;
import AST.Node.Node;

public class TextField extends Widget{
    private OnChanged onChanged;

    public OnChanged getOnChanged() {
        return onChanged;
    }

    public void setOnChanged(OnChanged onChanged) {
        this.onChanged = onChanged;
        this.addNodeChild(onChanged);
    }

    @Override
    public String generate() {
        this.setClasID( Node.getClassID());
        String s="<input value=\"\" id= \" "+this.getClasID()+"\"  ";
        s+=onChanged.generate()+" ";
        s+=" />\n";
        return s;
    }

    @Override
    public String toString() {
        return "TextField{" +
                "onChanged=" + onChanged +
                '}';
    }
}
