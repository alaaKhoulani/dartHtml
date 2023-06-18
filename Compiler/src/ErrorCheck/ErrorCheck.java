package ErrorCheck;

import AST.Element.Element;
import AST.Function.NamedParameter;
import AST.Function.NonNamedParameter;
import AST.Function.PrarametersToSend;
import AST.Function.SentParameter;
import AST.Node.Node;
import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

public class ErrorCheck {
    //cc obj=cc();
    public static void CorrectObjectDefination(Symbol object, String definationClass, int line, Scope scope) {
        if (object.getType().equals("BuildContext")) return;
        boolean ok=false;
        for (Scope scope1 : Main.symbolTable.getScopes()) {
            if (scope1.getName().equals(object.getType())) {
                ok=true;
            }
        }
        if (ok) {
            if (definationClass != null && object.getType().equals(definationClass)) return;
            if(definationClass==null) return;;
            String error = "Error..! This object : " + object.getValue() + " from class " + object.getType() + " can't initialize by " + definationClass + " in line : " + line;
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
        } else {
            String error = "Error..! The Class : " + object.getType() + " Not Defined  " + " in line : " + line;
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
        }
    }

    // obj.a=e;
    public static void checkClassAttributeType(String objectName, String attributeName, Node element, int line) {
        System.out.println("object " + objectName + " att " + attributeName + " line " + line);
        Scope scopeObject = Scope.getCurrentScope().searchForSymbolInParents(objectName);
        boolean ok = false;
        if (scopeObject != null) {
            Symbol symbolObj = scopeObject.searchForSymbol(objectName);
            if (symbolObj != null) {

                ArrayList<Scope> scopes = Main.symbolTable.getScopes();
                for (Scope scope : scopes) {
                    if (scope.getName().equals(symbolObj.getType())) {

                        for (Symbol symbol : scope.getSymbolList()) {
                            System.out.println("symole : " + symbol.getValue());
                            if (attributeName.equals(symbol.getValue())) {
                                ok = true;
                                checktypes(symbol, element, line);
                                break;
                            }
                        }
                        break;
                    }
                }
                if (!ok) {
                    String error = "Error..! This var : " + attributeName + " is not attribute in Class" + " - Scope id : " + symbolObj.getType() + " in line : " + line;
                    Main.logger.info(error);
                    System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                    Main.errorCount++;
                }
            }
        }
    }


    public static void sameScopeRepeat(Symbol symbol1, int line, int id) {
        Stack<Scope> s = Main.symbolTable.getScopeStack();
        if (s.empty()) {
            return;
        }
        Scope x = s.pop();
        System.out.println("scope:" + x.getId());
        for (Symbol symbol : x.getSymbolList()) {
            if (symbol.getName().equals("Variable")) {
                if (!symbol.equals(symbol1)) if (symbol.getValue().equals(symbol1.getValue())) {
                    String error = "Error..! This var : " + symbol1.getValue() + " is used before " + " - Scope id : " + id + " in line : " + line;
                    Main.logger.info(error);
                    System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                    Main.errorCount++;
                    s.push(x);
                    return;
                }
            } else if (symbol.getName().equals("Class")) {
                if (!symbol.equals(symbol1)) if (symbol.getValue().equals(symbol1.getValue())) {
                    String error = "Error..! This Class : " + symbol1.getValue() + " is used before " + " - Scope id : " + id + " in line : " + line;
                    Main.logger.info(error);
                    System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                    Main.errorCount++;
                    s.push(x);
                    return;
                }
            }
        }
        sameScopeRepeat(symbol1, line, x.getId());
        s.push(x);
    }

    public static void NotDefineInCurrentScope(String symbol1, int line, int id) {
        Stack<Scope> s = Main.symbolTable.getScopeStack();
        if (SymbolTable.searchForClass(symbol1) || SymbolTable.searchInSpecialFuncations(symbol1)) {
            System.out.println("test true");
            return;
        }
        if (s.empty()) {
            String error = "Error..! This var : " + symbol1 + " is not define inside scope" + " - Scope id : " + id + " in line : " + line;
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
            return;
        }

        Scope x = s.pop();
        System.out.println("scope:" + x.getId());
        for (Symbol symbol : x.getSymbolList()) {
            if (symbol.getName().equals("Variable") || symbol.getName().equals("Object")) {
                if (symbol.getValue().equals(symbol1)) {
                    System.out.println("test true");
                    s.push(x);
                    return;
                }
            } else if (symbol.getName().equals("Function")) {
                if (symbol.getValue().equals(symbol1)) {
                    System.out.println("test true");
                    s.push(x);
                    return;
                }
            }
        }
        NotDefineInCurrentScope(symbol1, line, x.getId());

        s.push(x);
    }

    //symbple=elemnt
    public static void checktypes(Symbol symbol, Node element, int line) {
        System.out.println("----------------- from check typeweeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        System.out.println(symbol.getType() + "+++++++++++" + element);
        if (symbol.getType().equals("int")) {
            if (!element.getNodeType().equals("IntegerLiteral") && !element.getNodeType().equals("BinaryExpression") && !element.getNodeType().equals("BitwiseExpression")) {
                String error = "Error..! This var : " + symbol.getValue() + " type not match with type of " + element.getNodeType() + " in line : " + line;
                Main.logger.info(error);
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
            if (element.getNodeType().equals("BinaryExpression") || element.getNodeType().equals("BitwiseExpression")) {
                checkMatchVariableWithInteger(element, symbol, line);
            }

        }
        if (symbol.getType().equals("String")) {
            if (!element.getNodeType().equals("StringLiteral")) {
                checkMatchVariableWithString(element, symbol, line);
                return;
            }
        }
        if (symbol.getType().equals("double")) {
            if (!element.getNodeType().equals("DoubleLiteral") && !element.getNodeType().equals("BinaryExpression") && !element.getNodeType().equals("BitwiseExpression")) {
                String error = "Error..! This var : " + symbol + " type not match with type of " + element.getNodeType() + " in line : " + line;
                Main.logger.info(error);
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
            if (element.getNodeType().equals("BinaryExpression") || element.getNodeType().equals("BitwiseExpression")) {
                checkMatchVariableWithInteger(element, symbol, line);
            }
        }
        if (symbol.getType().equals("bool")) {
            if (!element.getNodeType().equals("BooleanLiteral") && !element.getNodeType().equals("BinaryExpression")) {
                String error = "Error..! This var : " + symbol.getValue() + " type not match with type of " + element.getNodeType() + " in line : " + line;
                Main.logger.info(error);
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
            if (element.getNodeType().equals("BinaryExpression")) {
                checkMatchVariableWithBoolean(element, symbol, line);
            }
        }
        if (symbol.getType().equals("Widget")) {
            if (!element.getNodeType().equals("Widget")) {
                String error = "Error..! This var : " + symbol.getValue() + " type not match with type of " + element.getNodeType() + " in line : " + line;
                Main.logger.info(error);
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
        }
        if (symbol.getType().equals("Function")) {
            if (!element.getNodeType().equals("FunctionNonNamedCall") && !element.getNodeType().equals("FunctionNamedCall") && !element.getNodeType().equals("VoidFunction") && !element.getNodeType().equals("TypeFunction")) {
                String error = "Error..! This var : " + symbol.getValue() + " type not match with type of " + element.getNodeType() + " in line : " + line;
                Main.logger.info(error);
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
        }
        if (symbol.getName().equals("Object")) {
            checkMtchTwoObject(symbol, element, line);
        }
    }

    public static void checkMatchVariableWithInteger(Node node, Symbol symbol, int line) {
        System.out.println("checkMatchTwoVariable ------------------- checkMatchTwoVariable");
        if (node.getNodeType().equals("Number")) {
            return;
        }
        if (node.getNodeType().equals("Element")) {
            Element element = (Element) node;
            if (element.getID() != null) {
                Scope scope = null;
                String elementName = element.getID().getID();
                scope = Scope.getCurrentScope().searchForSymbolInParents(elementName);

                if (element.getID().getDotID() != null) {
                    elementName = element.getID().getDotID();
                    Symbol symbolBaseObject = Scope.getCurrentScope().searchForSymbolInParents(element.getID().getID()).searchForSymbol(element.getID().getID());
                    if (symbolBaseObject != null) {
                        for (Scope scope1 : Main.symbolTable.getScopes()) {
                            if (scope1.getName().equals(symbolBaseObject.getType())) {
                                scope = scope1;
                            }
                        }
                    }

                }
                if (scope != null) {
                    Symbol symbol1 = scope.searchForSymbol(elementName);
                    if (symbol1 != null) {
                        if (symbol1.getValue().equals(elementName) && !symbol1.getType().equals(symbol.getType())) {
                            String error = "Error..! This var : " + symbol1.getValue() + " type not match with type of " + symbol.getType() + " in line : " + line;
                            Main.logger.info(error);
                            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                            Main.errorCount++;
                            return;
                        }
                    }
                }
//                for (Symbol symbol1 : scope.getSymbolList()) {
//
//                }

            }
        }

        for (Node child : node.getChildren()) {
            checkMatchVariableWithInteger(child, symbol, line);
        }
    }

    //symbole=element
    public static void checkMatchVariableWithString(Node node, Symbol symbol, int line) {
        System.out.println("checkMatchTwoVariableStringgggggggg ------------------- checkMatchTwoVariable  " + node);
        if (node.getNodeType().equals("Number") || node.getNodeType().equals("IntegerLiteral") || node.getNodeType().equals("DoubleLiteral") || node.getNodeType().equals("BooleanLiteral")) {

            String error = "Error..!  : " + node.getNodeType() + " Can't be assigned to " + symbol.getType() + " in line : " + line;
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
            return;
        }
        if (node.getNodeType().equals("Element")) {
            Element element = (Element) node;
            Scope scope = null;
            if (element.getID() != null) {
                String elementName = element.getID().getID();
                scope = Scope.getCurrentScope().searchForSymbolInParents(elementName);

                if (element.getID().getDotID() != null) {
                    elementName = element.getID().getDotID();
                    Symbol symbolBaseObject = Scope.getCurrentScope().searchForSymbolInParents(element.getID().getID()).searchForSymbol(element.getID().getID());
                    if (symbolBaseObject != null) {
                        for (Scope scope1 : Main.symbolTable.getScopes()) {
                            if (scope1.getName().equals(symbolBaseObject.getType())) {
                                scope = scope1;
                            }
                        }
                    }

                }
//
                if (scope != null) {
                    Symbol symbol1 = scope.searchForSymbol(elementName);
                    if (symbol1 != null) {
                        if (symbol1.getValue().equals(elementName) && !symbol1.getType().equals(symbol.getType())) {
                            String error = "Error..! This var : " + symbol1.getValue() + " type not match with type of " + symbol.getType() + " in line : " + line;
                            Main.logger.info(error);
                            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                            Main.errorCount++;
                            return;
                        }
                    }
                }
            }
        }

        for (Node child : node.getChildren()) {
            checkMatchVariableWithString(child, symbol, line);
        }
    }

    public static void checkMatchVariableWithBoolean(Node node, Symbol symbol, int line) {
        System.out.println("checkMatchTwoVariableBooooooooooooollleaan ------------------- checkMatchTwoVariable + " + node);
        if (node.getNodeType().equals("BooleanLiteral") || node.getNodeType().equals("StringLiteral")) {

            String error = "Error..!  : " + node.getNodeType() + " Can't be assigned to " + symbol.getType() + " in line : " + line;
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
            return;
        }
        if (node.getNodeType().equals("Element")) {
            Element element = (Element) node;
            if (element.getID() != null) {
                Scope scope = null;
                String elementName = element.getID().getID();
                scope = Scope.getCurrentScope().searchForSymbolInParents(elementName);
                //اول شي بدي جيب السكوب تبع اوبجيكت برودكت مشان اوصل للسيمبول تبع الاوبجيكت     ومن السيمبول بوصل لاسم الكلاس (السكوب)
                if (element.getID().getDotID() != null) {
                    elementName = element.getID().getDotID();
                    Symbol symbolBaseObject = Scope.getCurrentScope().searchForSymbolInParents(element.getID().getID()).searchForSymbol(element.getID().getID());
                    if (symbolBaseObject != null) {
                        for (Scope scope1 : Main.symbolTable.getScopes()) {
                            if (scope1.getName().equals(symbolBaseObject.getType())) {
                                scope = scope1;
                            }
                        }
                    }

                }
                if (scope != null) {
                    Symbol symbol1 = scope.searchForSymbol(elementName);
                    if (symbol1 != null) {
                        if (symbol1.getValue().equals(elementName) && !symbol1.getType().equals(symbol.getType())) {
                            String error = "Error..! This var : " + symbol1.getValue() + " type not match with type of " + symbol.getType() + " in line : " + line;
                            Main.logger.info(error);
                            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                            Main.errorCount++;
                            return;
                        }
                    }
                }
//                for (Symbol symbol1 : scope.getSymbolList()) {
//
//                }

            }
        }

        for (Node child : node.getChildren()) {
            checkMatchVariableWithBoolean(child, symbol, line);
        }
    }

    public static void checkMtchTwoObject(Symbol symbol, Node node, int line) {
        System.out.println("checkMatchTwoObject------------------- checkMatchTwoObject");
        System.out.println(node.getNodeType());
        System.out.println(node.getChildren());
        if (node.getNodeType().equals("BooleanLiteral")
                || node.getNodeType().equals("StringLiteral")
                || node.getNodeType().equals("IntegerLiteral")
                || node.getNodeType().equals("DoubleLiteral")
                || node.getNodeType().equals("Number")
        ) {
            String error = "Error..!  : " + node.getNodeType() + " Can't be assigned to " + symbol.getType() + " in line : " + line;
            Main.logger.info(error);
            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
            Main.errorCount++;
            return;
        }
        if (node.getNodeType().equals("Element")) {
            Element element = (Element) node;
            if (element.getID() != null) {
                Scope scope = Scope.getCurrentScope().searchForSymbolInParents(element.getID().getID());
                if (scope != null) {
                    Symbol symbol1 = scope.searchForSymbol(element.getID().getID());
                    if (symbol1 != null) {
                        if (!symbol1.getType().equals(symbol.getType())) {
                            String error = "Error..! This var : " + symbol1.getValue() + " type not match with type of " + symbol.getType() + " in line : " + line;
                            Main.logger.info(error);
                            System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                            Main.errorCount++;
                            return;
                        }
                    }
                }

            }
        }

        for (Node child : node.getChildren()) {
            checkMatchVariableWithBoolean(child, symbol, line);
        }
    }

    public static void checkSentNonNamedParameter(NonNamedParameter nonNamedParameter, String functionName, int line) {
        ArrayList<SentParameter> parameters = nonNamedParameter.getSentParameters();
        Scope scope = null;
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            if (Main.symbolTable.getScopes().get(i).getName().equals(functionName)) {
                scope = Main.symbolTable.getScopes().get(i);
                break;
            }
        }
        int cnt = 0;
        if (scope != null) {
            ArrayList<Symbol> symbols = scope.getSymbolList();
            for (int i = 0; i < symbols.size(); i++) {
                if (symbols.get(i).isParameter() && !symbols.get(i).isNamedOrNot()) {
                    cnt++;
                }
            }
            if (cnt != parameters.size()) {
                String error = "Error..! expected : " + cnt + " parameters but exist just " + parameters.size() + " in line : " + line;
                Main.logger.info(error);
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
            int cnt1 = 0;
            for (int i = 0; i < cnt; i++) {
                if (symbols.get(i).isParameter()) {
                    if (parameters.get(cnt1).getLiteral() != null) {
                        System.out.println(parameters.get(cnt1).getLiteral().getClass() + "9999999999999999999999999999  " + symbols.get(i).getValue());
                        checktypes(symbols.get(i), (Node) parameters.get(cnt1).getLiteral(), line);
                    } else if (parameters.get(cnt1).getExpression() != null) {
                        checktypes(symbols.get(i), (Node) parameters.get(cnt1).getExpression(), line);
                    } else if (parameters.get(cnt1).getFunctionCall() != null) {
                        checktypes(symbols.get(i), (Node) parameters.get(cnt1).getFunctionCall(), line);
                    } else if (parameters.get(cnt1).getVoidFunction() != null) {
                        checktypes(symbols.get(i), (Node) parameters.get(cnt1).getVoidFunction(), line);
                    } else if (parameters.get(cnt1).getTypeFunction() != null) {
                        checktypes(symbols.get(i), (Node) parameters.get(cnt1).getTypeFunction(), line);
                    } else if (parameters.get(cnt1).getWidget() != null) {
                        checktypes(symbols.get(i), (Node) parameters.get(cnt1).getWidget(), line);

                    }
                    cnt1++;
                }
            }
        }
    }

    public static void checkSentNamedParameter(NamedParameter namedParameter, String functionName, int line) {
        ArrayList<String> names = namedParameter.getID();
        ArrayList<SentParameter> parameters = namedParameter.getSentParameters();
        Scope scope = null;
        for (int i = 0; i < Main.symbolTable.getScopes().size(); i++) {
            if (Main.symbolTable.getScopes().get(i).getName().equals(functionName)) {
                scope = Main.symbolTable.getScopes().get(i);
                break;
            }
        }
        int cnt = 0;
        if (scope != null) {
            ArrayList<Symbol> symbols = scope.getSymbolList();
            for (int i = 0; i < symbols.size(); i++) {
                if (symbols.get(i).isParameter() && symbols.get(i).isNamedOrNot()) {
                    cnt++;
                }
            }
            if (cnt != parameters.size()) {
                String error = "Error..! expected : " + cnt + " parameters but exist just " + parameters.size() + " in line : " + line;
                Main.logger.info(error);
                System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                Main.errorCount++;
                return;
            }
            int cnt1 = 0;

            for (int i = cnt + 1; i < symbols.size(); i++) {
                if (symbols.get(i).isParameter()) {
                    if (!names.contains(symbols.get(i).getValue())) {
                        String error = "Error..! : " + symbols.get(i).getValue() + " not exist when Function " + functionName + " is called in line : " + line;
                        Main.logger.info(error);
                        System.out.println(Main.ANSI_YELLOW + error + Main.ANSI_RESET);
                        Main.errorCount++;
                        return;
                    } else {
                        if (parameters.get(cnt1).getLiteral() != null) {
                            checktypes(symbols.get(i), (Node) parameters.get(cnt1).getLiteral(), line);
                        } else if (parameters.get(cnt1).getExpression() != null) {
                            checktypes(symbols.get(i), (Node) parameters.get(cnt1).getExpression(), line);
                        } else if (parameters.get(cnt1).getFunctionCall() != null) {
                            checktypes(symbols.get(i), (Node) parameters.get(cnt1).getFunctionCall(), line);
                        } else if (parameters.get(cnt1).getVoidFunction() != null) {
                            checktypes(symbols.get(i), (Node) parameters.get(cnt1).getVoidFunction(), line);
                        } else if (parameters.get(cnt1).getTypeFunction() != null) {
                            checktypes(symbols.get(i), (Node) parameters.get(cnt1).getTypeFunction(), line);
                        } else if (parameters.get(cnt1).getWidget() != null) {
                            checktypes(symbols.get(i), (Node) parameters.get(cnt1).getWidget(), line);
                        }
                        cnt1++;
                    }
                }
            }
        }

    }

    public static void checkParametersInCall(PrarametersToSend prarameters, String functionName, int line) {
        if (prarameters.getNonNamedParameters() != null)
            checkSentNonNamedParameter(prarameters.getNonNamedParameters(), functionName, line);
        if (prarameters.getNamedParameters() != null)
            checkSentNamedParameter(prarameters.getNamedParameters(), functionName, line);
    }

}
