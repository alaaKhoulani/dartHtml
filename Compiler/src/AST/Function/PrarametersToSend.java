package AST.Function;

import AST.Node.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrarametersToSend extends Node {
    private NamedParameter  namedParameter;
    private NonNamedParameter nonNamedParameter ;

//    private Map<Integer, Node> totalParameters = new HashMap<>();

//    public Map<Integer, Node> getTotalParameters() {
//        return totalParameters;
//    }

    public NamedParameter getNamedParameters() {
        return namedParameter;
    }

    public NonNamedParameter getNonNamedParameters() {
        return nonNamedParameter;
    }

        public void addNamedParameter(NamedParameter namedParameter){
        this.namedParameter=namedParameter;
        this.addNodeChild(namedParameter);
//        this.totalParameters.put(index, namedParameter);

    }

    public void addNonNamedParameter(NonNamedParameter nonNamedParameter ){
        this.nonNamedParameter=nonNamedParameter;
        this.addNodeChild(nonNamedParameter);
//        this.totalParameters.put(index, nonNamedParameter);
    }

    @Override
    public String generate() {
        String s = "(";
        if(nonNamedParameter!=null)
            s+=this.nonNamedParameter.generate();
        if (namedParameter!=null)
            s+=" , "+this.namedParameter.generate();
        s+=")";
        return s;
    }

    @Override
    public String toString() {
        return "PrarametersToSend{" +
                "namedParameter=" + namedParameter +
                ", nonNamedParameter=" + nonNamedParameter +
                '}';
    }
}
