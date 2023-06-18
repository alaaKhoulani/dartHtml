package AST.Widgets;

import AST.BinaryOperation.IBinaryOperation;
import AST.BinaryOperation.PostOperations;
import AST.Declare.IAssignment;
import AST.Element.Element;
import AST.Element.Identifier;
import AST.Expression.IExpression;
import AST.Function.VoidFunction;
import AST.Node.Node;
import AST.Statement;

public class SetState extends Node {
    private VoidFunction voidFunction;

    public VoidFunction getVoidFunction() {
        return voidFunction;
    }

    public void setVoidFunction(VoidFunction voidFunction) {
        this.voidFunction = voidFunction;
        this.addNodeChild(voidFunction);
    }

    @Override
    public String generate() {
        String s="";
        System.out.println(voidFunction.getBlock().generate());
        for (Node statement: voidFunction.getBlock().getStatements()){
            s+=statement.generate()+"\n";
            if (statement.getChildren().get(0) instanceof IAssignment){
                IAssignment assignment =(IAssignment) statement.getChildren().get(0);
                System.out.println(assignment.generate() +" Inner if "+assignment.getID() );
                String name="";
                for (int i=0;i<assignment.generate().length();i++){
                    if(assignment.generate().charAt(i)=='='){
                        name=assignment.generate().substring(i+1);
                        break;
                    }
                }
                s+="if (localStorage.getItem(\"mapState\") != null) {\n" +
                        "            let arr=getState(\""+assignment.getID().generate()+"\");\n" +
                        "            arr.forEach(element => {\n" +
                        "element.includes(\"image_\")\n" +
                        "              ? (document.getElementById(element).src = "+name+ ")\n" +
                        "              : (document.getElementById(element).innerHTML ="+name+");\n"+
//                        "              document.getElementById(element).innerHTML = "+name+ ";\n" +
                        "            });\n" +
                        "\t\t}";
//                s+="if(getData(\""+ assignment.getID().getID()  +"\")!=null){\n"+
//                    "document.getElementById(getData(\"" + assignment.getID().getID()  +"\")).innerHTML = getData(' " +((IAssignment) statement).getID().getID()+"')}\n";
            }

            else if(statement.getChildren().get(0) instanceof PostOperations){
                PostOperations obj=(PostOperations) statement.getChildren().get(0);

                if (obj.getChildren().get(0) instanceof Element){
                     Element element= (Element) obj.getElement();
                    String name=element.getID().getID();
                    s+="if (localStorage.getItem(\"mapState\") != null) {\n" +
                            "            let arr=getState(\""+name+"\");\n" +
                            "            arr.forEach(element => {\n" +
                            "              document.getElementById(element).innerHTML = "+name+ ";\n" +
                            "            });\n" +
                            "\t\t}";
                }
                else if(obj.getChildren().get(0) instanceof Identifier){
                    Identifier identifier=(Identifier) obj. getElement();
                    String name = identifier.getID();
                    s+="if (localStorage.getItem(\"mapState\") != null) {\n" +
                            "            let arr=getState(\""+name+"\");\n" +
                            "            arr.forEach(element => {\n" +
                            "              document.getElementById(element).innerHTML = "+name+ ";\n" +
                            "            });\n" +
                            "\t\t}";
                }
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "SetState{" +
                "voidFunction=" + voidFunction +
                '}';
    }
}
