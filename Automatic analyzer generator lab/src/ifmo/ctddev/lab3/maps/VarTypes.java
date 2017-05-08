package ifmo.ctddev.lab3.maps;

import java.util.HashMap;
import java.util.Map;

public class VarTypes {
    private static Map<String, String> varTypes = new HashMap<>();

    public static void addVars(String type, String ... args) {
        for (String arg : args) {
            if (varTypes.containsKey(arg)) {
                throw new IllegalArgumentException("Variable " + arg + " has more than one declaration.");
            }
            varTypes.put(arg, type);
        }
    }

    public static String getVarType(String var) {
        if (!varTypes.containsKey(var)) {
            throw new IllegalArgumentException("Variable " + var + " wasn't declared.");
        }
        return varTypes.get(var);
    }

    public static Map<String, String> getVarTypes() {
        return varTypes;
    }

    public static void resetVarTypes() {
        varTypes = new HashMap<>();
    }
}
