package AST.Function;

import AST.Node.Node;

import java.util.ArrayList;

public class NamedParameter extends Node{
    private ArrayList<SentParameter> sentParameters;
    private ArrayList<String> ID;

    public NamedParameter() {
        this.sentParameters = new ArrayList<>();
        this.ID = new ArrayList<>();
    }

    public ArrayList<SentParameter> getSentParameters() {
        return sentParameters;
    }

    public void addParameters(SentParameter sentParameters) {
        this.sentParameters .add(sentParameters);
        this.addNodeChild(sentParameters);
    }

    public ArrayList<String> getID() {
        return ID;
    }

    public void addID(String ID) {
        this.ID.add(ID);
    }

    @Override
    public String generate() {
        String s="{ ";
        for (int i=0;i<sentParameters.size();i++){
            s+=ID.get(i)  + " : "+sentParameters.get(i).generate();
            if (i<sentParameters.size()-1) s+=" , ";
        }
        s+="}";
        return s;
    }

    @Override
    public String toString() {
        return "NamedParameter{" +
                "sentParameters=" + sentParameters +
                ", ID=" + ID +
                '}';
    }
}
