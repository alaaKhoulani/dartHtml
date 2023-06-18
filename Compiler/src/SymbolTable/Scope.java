package SymbolTable;

import Main.Main;

import java.util.ArrayList;

public class Scope {
    private static int contID = 0;
    private int id;
    private String name;
    private Scope parent;
    private ArrayList<Symbol> symbolList = new ArrayList<>();
    public Scope(Scope parent) {
        this.parent = parent;
        this.id = ++contID;
    }

    public static void createScope(String scopeTitle) {
        System.out.println("Create New Scope : " + scopeTitle);
        Scope scope;
        if (Main.symbolTable.getScopeStack().isEmpty()) {
            scope = new Scope(null);
        } else {
            Scope parentScope1 = Main.symbolTable.getScopeStack().peek();
            scope = new Scope(parentScope1);
        }
        scope.setName(scopeTitle);
        Main.symbolTable.getScopeStack().push(scope);
        Main.symbolTable.getScopes().add(scope);
    }


    public static void removeScope(String scopeTitle) {
        Main.symbolTable.getScopeStack().pop();
        System.out.println("remove last Scope from scope stack : " + scopeTitle);
    }

    public static Scope getCurrentScope() {
        if (Main.symbolTable.getScopeStack().isEmpty())
            return null;
        return Main.symbolTable.getScopeStack().peek();
    }

    public Symbol searchForSymbol(String name) {
        for (Symbol search : symbolList) {
            if (search.getValue().equals(name)) {
                return search;
            }
        }
        return null;
    }

    public  Scope searchForSymbolInParents(String symbol) {
        Scope currentScope = this;
        while (currentScope != null) {
            if (currentScope.searchForSymbol(symbol) != null){
                return currentScope;
            }

            currentScope = currentScope.parent;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public static int getContId() {
        return contID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addSymbol(Symbol symbol) {
        this.symbolList.add(symbol);
    }

    public ArrayList<Symbol> getSymbolList() {
        return symbolList;
    }

}
