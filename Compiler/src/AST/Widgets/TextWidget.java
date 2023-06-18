package AST.Widgets;

import AST.Class.Constructor;
import AST.Declare.Declaration;
import AST.Literal.StringLiteral;
import AST.Node.Node;
import genaration.Generator;

import java.util.ArrayList;

public class TextWidget extends Widget {
    StringLiteral text;

    public void setText(StringLiteral text) {
        this.text = text;
    }

    public StringLiteral getText() {
        return text;
    }

    @Override
    public String generate() {
        String id=Node.getClassID();

        String s="<p id=\""+id +"\" >";
        if (text.getValue()!=null){
            if (text.generate().contains("\"") || text.generate().contains("'")){
                if (text.generate().length()>2) s+=text.generate().substring(1,text.generate().length()-1);
            }
        }else if (text.getIdentifier()!=null){
//            s+=text.generate();
            if (check(text.getIdentifier().getID()))
                Generator.currentPage.addToOnLoad("document.getElementById(\""+id+"\").innerHTML=getData('"+text.getIdentifier().getID()+"')\n");
            else{
                //أسناد القيمة للبراغراف و تخزين القيمة الابتدائية في اللوكال ستوريج
                Generator.currentPage.addToOnLoad("document.getElementById(\""+id+"\").innerHTML="+text.getIdentifier().generate()+"\n");
                Generator.currentPage.addToOnLoad("setState('"+text.getIdentifier().generate()+"' , '"+id+"')\n");
            }
        }

//        if(!text.getValue().contains("$"))
//            s+=text.getValue().substring(1,text.getValue().length()-1);
//        else {
//            if (check(text.substring(3,text.length()-2)))
//                Generator.currentPage.addToOnLoad("document.getElementById(\""+id+"\").innerHTML=getData('"+text.substring(3,text.length()-2)+"')\n");
//            else{
//                Generator.currentPage.addToOnLoad("document.getElementById(\""+id+"\").innerHTML="+text.substring(3,text.length()-2)+"\n");
//                Generator.currentPage.addToOnLoad("setState('"+text.substring(3,text.length()-2)+"' , '"+id+"')\n");
//            }
////            Generator.currentPage.addToOnLoad("\nlocalStorage.setItem(\""+text.substring(3,text.length()-2)+"\",\""+id+"\")");
//        }

        s+="</p>\n";
        return s;
    }

    //Check if the variable is define in constructor
    boolean check(String var){
        if(Generator.getCurrentClass().getConstructor()!=null){
            Constructor constructor=Generator.getCurrentClass().getConstructor();
            ArrayList<Declaration> ids= constructor.getVoidFunction().getDeclerationParameter().getDeclarations();
            for (Declaration declaration : ids){
                if (declaration.getIDs().get(0).equals(var)){
                    return true;
                }
            }
            ids=constructor.getVoidFunction().getDeclerationParameter().getNamedDeclaration().getDeclarations();
            for (Declaration declaration : ids){
                if (declaration.getIDs().get(0).equals(var)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
