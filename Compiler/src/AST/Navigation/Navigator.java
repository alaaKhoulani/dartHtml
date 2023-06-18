package AST.Navigation;

import AST.Node.Node;

public class Navigator extends Node {
    String context;
    private boolean pop=false;
    MaterialPageRoute materialPageRoute;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public MaterialPageRoute getMaterialPageRoute() {
        return materialPageRoute;
    }

    public void setMaterialPageRoute(MaterialPageRoute materialPageRoute) {
        this.materialPageRoute = materialPageRoute;
        this.addNodeChild(materialPageRoute);
    }

    public boolean isPop() {
        return pop;
    }

    public void setPop(boolean pop) {
        this.pop = pop;
    }

    @Override
    public String generate() {
        String s="";
        if (!pop){

            return materialPageRoute.generate();
        }
        else{
            s+="history.back();";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Navigator{" +
                "context='" + context + '\'' +
                ", pop=" + pop +
                ", materialPageRoute=" + materialPageRoute +
                '}';
    }
}
