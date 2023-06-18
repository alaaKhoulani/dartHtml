package AST.Widgets;

import AST.Block.VoidFunctionBlock;
import AST.Declare.Declaration;
import AST.Declare.IAssignment;
import AST.Node.Node;
import AST.Statement;
import genaration.Generator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OnChanged extends Node {
    private Declaration declaration;
    private VoidFunctionBlock block;

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
        this.addNodeChild(declaration);
    }

    public VoidFunctionBlock getBlock() {
        return block;
    }

    public void setBlock(VoidFunctionBlock block) {
        this.block = block;
        this.addNodeChild(block);
    }

    @Override
    public String generate() {
        //<input id="inp_val" onchange="changeInput(event)" />
        String functionString = "function changeInput_" + ((TextField) this.getParent()).getClasID() + "(event){\n\t\t";
        ArrayList<Statement> statements = this.block.getStatements();
        for (Node node : statements) {

            System.out.println("333aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " +node.getChildren());
            if (node.getChildren().get(0) instanceof IAssignment) {
                functionString+=((IAssignment) node.getChildren().get(0)).getID().getID()+"=event.target.value ;";
                functionString += "setData(\"" + ((IAssignment) node.getChildren().get(0)).getID().getID() + "\" , event.target.value)";
                continue;
            }
            functionString += node.generate() ;
        }
        functionString+="}\n";
        Generator.currentPage.addToScript(functionString);
        String s = "onchange=changeInput_" + ((TextField) this.getParent()).getClasID() + "(event);";
        return s;
    }

    @Override
    public String toString() {
        return "OnChanged{" +
                "declaration=" + declaration +
                ", block=" + block +
                '}';
    }
}
