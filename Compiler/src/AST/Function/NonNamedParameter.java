package AST.Function;

import AST.Node.Node;

import java.util.ArrayList;

public class NonNamedParameter extends Node  {
    private ArrayList<SentParameter> sentParameters=new ArrayList<>();

    public NonNamedParameter(){
        this.sentParameters=new ArrayList<>();
    }

    public ArrayList<SentParameter> getSentParameters() {
        return sentParameters;
    }

    public void addParameters(SentParameter sentParameters) {
        this.sentParameters.add(sentParameters);
        this.addNodeChild(sentParameters);
    }

    @Override
    public String generate() {
        String s="";
        for (int i=0;i<sentParameters.size();i++){
            s+=sentParameters.get(i).generate();
            if(i<sentParameters.size()-1) s+=" , ";
        }
        return s;
    }

    @Override
    public String toString() {
        return "NonNamedParameter{" +
                "sentParameters=" + sentParameters +
                '}';
    }
}
