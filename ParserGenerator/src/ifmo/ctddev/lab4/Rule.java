package ifmo.ctddev.lab4;

import java.util.HashMap;
import java.util.Map;

public class Rule {
    private String name;
    private ReturnType returnType = ReturnType.VOID;

    public enum ReturnType {
        VOID("void"),
        STRING("String"),
        INTEGER("Integer"),
        DOUBLE("Double");

        private String type;
        private static Map<String, ReturnType> returnTypeByName = new HashMap<>();

        static {
            for (ReturnType rType : returnTypeByName.values()) {
                returnTypeByName.put(rType.toString(), rType);
            }
        }

        private ReturnType(String type) {
            this.type = type;
        }

        public static ReturnType getReturnTypeByName(String name) {
            return returnTypeByName.get(name);
        }

        @Override
        public String toString() {
            return type;
        }
    }
}
