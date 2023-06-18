package AST.Class;

import AST.Function.DeclarationTypeFunction;
import AST.Node.Node;
import genaration.Generator;

import java.util.ArrayList;

public class Class extends Node {
    private String ID;
    private ArrayList<IMember> members;
    private String extendsClass="";
    private Constructor constructor;
    private boolean isStateClass=false;

    public boolean isStateClass() {
        return isStateClass;
    }

    public void setStateClass(boolean stateClass) {
        isStateClass = stateClass;
    }

    public Class() {
        this.members = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
        this.addNodeChild(constructor);
    }

    public void addMember(IMember member) {
        this.members.add(member);
        this.addNodeChild((Node) member);
    }

    public String getExtendsClass() {
        return extendsClass;
    }

    public void setExtendsClass(String extendsClass) {
        this.extendsClass = extendsClass;
    }

    @Override
    public String generate() {
        if (extendsClass.equals("StatefulWidget")) return  "";
        if (isStateClass()) {
            return this.generateStateClass();
        }
        return this.generateNormalClass();
    }

    private String generateNormalClass() {
        String s = "class " + ID+" ";
        if (!extendsClass.equals("")) {
            s += "extends " + extendsClass;
        }
        s += "{\n";
        if (constructor!=null)
            s+=constructor.generate()+"\n";
        for (IMember member : members) {
                s += member.generate() + "\n";
        }
        s += "}";
        return s;
    }

    public String generateScriptForStateClass(){
        String s="";
//        DeclarationTypeFunction function = null;
        for (IMember member : members) {
            if (member instanceof FunctionMember) {
                if (((FunctionMember) member).getFunction() instanceof DeclarationTypeFunction) {
                    if (((DeclarationTypeFunction) ((FunctionMember) member).getFunction()).getID().equals("build")) {
//                        function = ((DeclarationTypeFunction) ((FunctionMember) member).getFunction());
                        continue;
                    }
                }
                s+="function "+member.generate()+"\n";
            }
            else s +="let "+ member.generate() + "\n";
        }
        return s;
    }
    public String generateBodyForStateClass(){
        String s="";
        DeclarationTypeFunction function = null;
        for (IMember member : members) {
            if (member instanceof FunctionMember) {
                if (((FunctionMember) member).getFunction() instanceof DeclarationTypeFunction) {
                    if (((DeclarationTypeFunction) ((FunctionMember) member).getFunction()).getID().equals("build")) {
                        function = ((DeclarationTypeFunction) ((FunctionMember) member).getFunction());
                        break;
                    }
                }
            }
        }
        if (function!=null){
            if (function.getFunction().getBlock().getStatements()!=null){
            String code="";
            for (Node node : function.getFunction().getBlock().getStatements()){
                code+=node.generate()+"\n";
            }
                Generator.currentPage.addToScript(code);
            }
            s+= function.getFunction().getBlock().getReturnWidget().generate();
        }

        return s;
    }

    private String generateStateClass() {
       String s=generateScriptForStateClass()+"\n"+generateBodyForStateClass()+"\n";
        return s;
    }

    @Override
    public String toString() {
        return "Class{" +
                "ID='" + ID + '\'' +
                ", members=" + members +
                ", extendsClass='" + extendsClass + '\'' +
                '}';
    }
}
