package ifmo.ctddev.lab4;

import java.util.*;

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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(name);
        StringJoiner joiner = new StringJoiner(", ", " (", ")");
        for (Map.Entry<String, Type> attr : localAttrs.entrySet()) {
            joiner.add(attr.getValue() + " " + attr.getKey());
        }
        builder.append(joiner.toString());
        joiner = new StringJoiner(", ", " [", "] ");
        for (Map.Entry<String, Type> attr : returnedAttrs.entrySet()) {
            joiner.add(attr.getValue() + " " + attr.getKey());
        }
        builder.append(joiner.toString());
        builder.append(": ");
        // TODO: add productions
        return builder.toString();
    }

    public enum Type {
        VOID("void"),
        STRING("String"),
        INTEGER("Integer"),
        DOUBLE("Double");

        private String type;
        private static Map<String, Type> typeByName = new HashMap<>();

        static {
            for (Type rType : Type.values()) {
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
