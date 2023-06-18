package AST.Class;

import AST.Element.Identifier;
import AST.Function.DeclerationParameter;
import AST.Function.VoidFunction;
import AST.Node.Node;

import java.util.ArrayList;

public class Constructor extends Node {
    private Identifier id;
//    private DeclerationParameter parameter;
    private VoidFunction voidFunction;
    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
        this.addNodeChild(id);
    }

    public VoidFunction getVoidFunction() {
        return voidFunction;
    }

    public void setVoidFunction(VoidFunction voidFunction) {
        this.voidFunction = voidFunction;
        this.addNodeChild(voidFunction);
    }

    @Override
    public String generate() {
        String s = "";
        DeclerationParameter parameter= voidFunction.getDeclerationParameter();
        s += "constructor(";
        ArrayList <String> IDNonNamed=new ArrayList<>();
        ArrayList <String> IDNamed=new ArrayList<>();
        for (int i=0;i<parameter.getDeclarations().size();i++){
            System.out.println(i+"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF  "+ parameter.getDeclarations().size());
            IDNonNamed.add(parameter.getDeclarations().get(i).getIDs().get(0));
            s+=parameter.getDeclarations().get(i).getIDs().get(0);
            if(i<parameter.getDeclarations().size()-1) s+=" , ";
        }
        if (parameter.getNamedDeclaration().getDeclarations().size()>0 && parameter.getDeclarations().size()>0) s+=" , ";
        if (parameter.getNamedDeclaration().getDeclarations().size()>0
        ) s+=" {";
        for (int i=0;i<parameter.getNamedDeclaration().getDeclarations().size();i++){
            IDNamed.add(parameter.getNamedDeclaration().getDeclarations().get(i).getIDs().get(0));
            s+=parameter.getNamedDeclaration().getDeclarations().get(i).getIDs().get(0);
            if(i<parameter.getNamedDeclaration().getDeclarations().size()-1) s+=" , ";
        }
        if (parameter.getNamedDeclaration().getDeclarations().size()>0) s+=" }={}";
        s+="){";
        for (String s1:IDNonNamed){
            s+="this."+ s1 + " = "+s1+"\n";
        }
        for (String s1 : IDNamed){
            s+="this."+s1+" = "+s1+"\n";
        }
        s += "}";
        return s;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "id=" + id +
                ", voidFunction=" + voidFunction +
                '}';
    }
}
