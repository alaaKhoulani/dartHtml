package SymbolTable;

import Main.Main;

public class
Symbol {
    private String name;
    private String type;
    private String value;
    private int lineNumber;
    private Scope scope;
    private boolean isParameter;
    private boolean namedOrNot;

    public static Symbol createSymbol(int ScopeId, String name, String type, String value,boolean isParameter ,boolean namedOrNot , int lineNumber) {
        System.out.println("create new Symbol ...                SCopId" + ScopeId);
        Symbol symbol = new Symbol();
        symbol.setName(name);
        symbol.setParameter(isParameter);
        symbol.setNamedOrNot(namedOrNot);
        symbol.setType(type);
        symbol.setValue(value);
        symbol.setLineNumber(lineNumber);
        Scope scope = Main.symbolTable.getScopeByID(ScopeId);
        symbol.setScope(scope);
        scope.addSymbol(symbol);
        System.out.println("scope"+scope.getName() + "         symbol" + symbol);

        System.out.println("name: " + name + "      type: " + type + "      value: " + value + "    scope name: " + scope.getName());
        return symbol;
    }

    public boolean isNamedOrNot() {
        return namedOrNot;
    }

    public void setNamedOrNot(boolean namedOrNot) {
        this.namedOrNot = namedOrNot;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }



    public boolean isParameter() {
        return isParameter;
    }

    public void setParameter(boolean parameter) {
        isParameter = parameter;
    }

    public void print() {
        int symbolName = 8;
        int symbolType = 6;
        int symbolValue = 10;
        System.out.print(Main.TEXT_BLUE);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Line Number: " + this.getLineNumber());
        stringBuilder.append("\t\t");
        stringBuilder.append(" - Symbol Name: " + this.getName());
        for (int i=0;i<symbolName - this.getName().length(); i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("\t");
        stringBuilder.append(" - Symbol Type: " + this.getType());
        for (int i=0;i<symbolType - this.getType().length(); i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("\t");
        stringBuilder.append(" - Symbol Value: " + this.getValue());
        for (int i=0;i<symbolValue - this.getValue().length(); i++){
            stringBuilder.append(" ");
        }

        stringBuilder.append("\t");
        stringBuilder.append(" - isParameter: " + this.isParameter());
        for (int i=0;i<symbolValue - this.getValue().length(); i++){
            stringBuilder.append(" ");
        }

        stringBuilder.append("\t");
        stringBuilder.append(" - isNamedParameter: " + this.isNamedOrNot());
        for (int i=0;i<symbolValue - this.getValue().length(); i++){
            stringBuilder.append(" ");
        }

        stringBuilder.append("\t");
        stringBuilder.append(" - Scope Id: " + this.getScope().getId());
        stringBuilder.append("\t");
        stringBuilder.append(" - Scope Name: " + this.getScope().getName());
        System.out.println(stringBuilder);
        System.out.print(Main.ANSI_RESET);
    }
}
