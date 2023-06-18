package AST.Widgets;

import AST.Element.IElement;
import AST.Element.Identifier;
import AST.Literal.StringLiteral;
import AST.Node.Node;
import genaration.Generator;

public class Image extends Widget {
    private StringLiteral src;



    public StringLiteral getSrc() {
        return src;
    }

    public void setSrc(StringLiteral src) {
        this.src = src;
    }
    @Override
    public String generate() {
        String ID=Node.getClassID();
        String s="<img id=\"image_" +ID+ "\"  src=\"";
        if (src.getValue()!=null) s+=src;
        s+="\" style=\"width:100px; height:100px;\" />\n";
        if (src.getIdentifier()!=null){
            Generator.currentPage.addToOnLoad("let image_"+ID+" = document.getElementById(\"image_"+ID+"\");\nimage_"+ID+".src = "+src.getIdentifier().generate()+";\n");
            Generator.currentPage.addToOnLoad("setState(\""+src.getIdentifier().generate()+"\" ,\"image_"+ID+"\");");
        }
        return s;
    }

    @Override
    public String toString() {
        return "Image{" +
                "src='" + src +
                '}';
    }
}
