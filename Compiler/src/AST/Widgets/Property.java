package AST.Widgets;

import AST.Node.Node;

import java.util.ArrayList;

public class Property extends Node {
    private ArrayList<Widget> widgets;
    public Property(){this.widgets=new ArrayList<>();}

    public ArrayList<Widget> getWidgets() {
        return widgets;
    }

    public void addWidget(Widget widget) {
        this.widgets .add(widget);
        this.addNodeChild(widget);
    }
    public String generate(){
        String s="";
        System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP  "+ widgets.size());
        for (Widget widget : widgets){
            System.out.println(widget);
            s+= widget.generate();
        }
        System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");

        return s;
    }
    @Override
    public String toString() {
        return "Property{" +
                "widgets=" + widgets +
                '}';
    }
}
