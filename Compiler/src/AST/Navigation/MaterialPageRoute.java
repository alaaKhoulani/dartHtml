package AST.Navigation;

import AST.Block.TypeFunctionBlock;
import AST.Function.PrarametersToSend;
import AST.Function.SentParameter;
import AST.Node.Node;
import AST.Widgets.Widget;
import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import genaration.Generator;

import java.util.ArrayList;

public class MaterialPageRoute extends Node {
    SentParameter sentParameter;
    TypeFunctionBlock functionBlock;

    public SentParameter getSentParameter() {
        return sentParameter;
    }

    public void setSentParameter(SentParameter sentParameter) {
        this.sentParameter = sentParameter;
    }

    public TypeFunctionBlock getFunctionBlock() {
        return functionBlock;
    }

    public void setFunctionBlock(TypeFunctionBlock functionBlock) {
        this.functionBlock = functionBlock;
    }

    public String getData(PrarametersToSend prarametersToSend, String functionName) {
        String function="function navigation_"+((Widget)this.getParent().getParent().getParent().getParent().getParent()).getClasID()+"(){\n \t\t";
        String s = "";
        ArrayList<SentParameter> parameters=new ArrayList<>() ;
        if ( prarametersToSend.getNonNamedParameters()!=null){
            parameters= prarametersToSend.getNonNamedParameters().getSentParameters();
        }
        Scope scope = null;
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            if (Main.symbolTable.getScopes().get(i).getName().equals(functionName)) {
                scope = Main.symbolTable.getScopes().get(i);
                break;
            }
        }
        if (scope != null) {
            System.out.println("ramaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
            ArrayList<Symbol> symbols = scope.getSymbolList();

            int cnt1 = 0;
            for (int i = 0; i < symbols.size(); i++) {
                if (symbols.get(i).isParameter() && !symbols.get(i).isNamedOrNot()) {
                    if (parameters.get(cnt1).getLiteral() != null) {
                        s += "setData('" + symbols.get(i).getValue() + "' ," + parameters.get(cnt1).getLiteral().generate() + ");  ";
                    } else if (parameters.get(cnt1).getExpression() != null) {
                        s += "setData('" + symbols.get(i).getValue() + "' ," + parameters.get(cnt1).getExpression().generate() + ");  ";
                    } else if (parameters.get(cnt1).getFunctionCall() != null) {
                        s += "setData('" + symbols.get(i).getValue() + "' ," + parameters.get(cnt1).getFunctionCall().generate() + ");  ";
                    } else if (parameters.get(cnt1).getVoidFunction() != null) {
                        s += "setData('" + symbols.get(i).getValue() + "' ," + parameters.get(cnt1).getVoidFunction().generate() + ");  ";
                    } else if (parameters.get(cnt1).getTypeFunction() != null) {
                        s += "setData('" + symbols.get(i).getValue() + "' ," + parameters.get(cnt1).getTypeFunction().generate() + ");  ";
                    } else if (parameters.get(cnt1).getWidget() != null) {
                        s += "setData('" + symbols.get(i).getValue() + "' ," + parameters.get(cnt1).getWidget().generate() + ");  ";

                    }
                    cnt1++;
                }
            }

            ArrayList<String> IDs=prarametersToSend.getNamedParameters().getID();
            ArrayList<SentParameter> pp=prarametersToSend.getNamedParameters().getSentParameters();
            for (int i=0;i<pp.size();i++){
                if (pp.get(i).getLiteral() != null) {
                    s += "setData('" + IDs.get(i) + "' ," + pp.get(i).getLiteral().generate() + ");  ";
                } else if (pp.get(i).getExpression() != null) {
                    s += "setData('" + IDs.get(i) + "' ," + pp.get(i).getExpression().generate() + ");  ";
                } else if (pp.get(i).getFunctionCall() != null) {
                    s += "setData('" + IDs.get(i) + "' ," + pp.get(i).getFunctionCall().generate() + ");  ";
                } else if (pp.get(i).getVoidFunction() != null) {
                    s += "setData('" + IDs.get(i) + "' ," + pp.get(i).getVoidFunction().generate() + ");  ";
                } else if (pp.get(i).getTypeFunction() != null) {
                    s += "setData('" + IDs.get(i) + "' ," + pp.get(i).getTypeFunction().generate() + ");  ";
                } else if (pp.get(i).getWidget() != null) {
                    s += "setData('" + IDs.get(i) + "' ," + pp.get(i).getWidget().generate() + ");  ";

                }
            }
        }
        function+=s+ "\nwindow.location.href = './" + functionBlock.getFunctionCall().getID() + ".html'\n}";
        Generator.currentPage.addToScript(function);
        return "navigation_"+((Widget)this.getParent().getParent().getParent().getParent().getParent()).getClasID()+"();";
    }

    @Override
    public String generate() {
        String s = "";
        System.out.println(functionBlock.getFunctionCall());
        if (functionBlock.getFunctionCall() != null) {
            if (functionBlock.getFunctionCall().getPrarameters() != null) {
                s+=this.getData(functionBlock.getFunctionCall().getPrarameters(), functionBlock.getFunctionCall().getID());
            }
        }

        return s;
    }

    @Override
    public String toString() {
        return "MaterialPageRoute{" +
                "sentParameter=" + sentParameter +
                ", functionBlock=" + functionBlock +
                '}';
    }
}
