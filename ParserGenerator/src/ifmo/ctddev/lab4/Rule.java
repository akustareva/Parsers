package ifmo.ctddev.lab4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rule {
    private String name;
    private Map<String, Type> returnedAttrs = new HashMap<>();
    private Map<String, Type> localAttrs = new HashMap<>();
    private List<Production> productions = new ArrayList<>();

    public Rule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addLocalAttr(String name, Type type) {
        localAttrs.put(name, type);
    }

    public void addLocalAttr(String name, String type) {
        addLocalAttr(name, Type.getTypeByName(type));
    }

    public void addReturnedAttr(String name, Type type) {
        returnedAttrs.put(name, type);
    }

    public void addReturnedAttr(String name, String type) {
        addReturnedAttr(name, Type.getTypeByName(type));
    }

    public enum Type {
        VOID("void"),
        STRING("String"),
        INTEGER("Integer"),
        DOUBLE("Double");

        private String type;
        private static Map<String, Type> typeByName = new HashMap<>();

        static {
            for (Type rType : typeByName.values()) {
                typeByName.put(rType.toString(), rType);
            }
        }

        private Type(String type) {
            this.type = type;
        }

        public static Type getTypeByName(String name) {
            return typeByName.get(name);
        }

        @Override
        public String toString() {
            return type;
        }
    }
}
