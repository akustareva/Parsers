package ifmo.ctddev.lab4;

import java.util.*;

public class Rule {
    private String name;
    private Type returnedType = Type.VOID;
    private Map<String, Type> localAttrs = new HashMap<>();
    private List<Production> productions = new ArrayList<>();

    private List<String> args = new ArrayList<>();

    public Rule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addLocalAttr(String name, Type type) {
        localAttrs.put(name, type);
    }

    public String getLocalAttrsInString() {
        if (!localAttrs.isEmpty()) {
            StringJoiner joiner = new StringJoiner(", ", "(", ") ");
            for (Map.Entry<String, Type> attr : localAttrs.entrySet()) {
                joiner.add(attr.getValue() + " " + attr.getKey());
            }
            return joiner.toString();
        }
        return "() ";
    }

    public void addLocalAttr(String name, String type) {
        addLocalAttr(name, Type.getTypeByName(type));
    }

    public void setReturnedType(Type returnedType) {
        this.returnedType = returnedType;
    }

    public void setReturnedType(String returnedType) {
        this.returnedType = Type.getTypeByName(returnedType);
    }

    public Type getReturnedType() {
        return returnedType;
    }

    public void addProduction(Production production) {
        productions.add(production);
    }

    public List<Production> getProductions() {
        return productions;
    }

    public void addArg(String arg) {
        args.add(arg);
    }

    public List<String> getArgs() {
        return args;
    }

    public String getArgsInString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        args.forEach(joiner::add);
        return joiner.toString();
    }

    public boolean isTerminal() {
        return (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z');
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(name).append(" ");
        builder.append(getLocalAttrsInString());
        if (returnedType != Type.VOID) {
            builder.append("[").append(returnedType.toString()).append("]");
        }
        builder.append(" : ");
        StringJoiner  joiner = new StringJoiner(" | ", "", "");
        for (Production production : productions) {
            joiner.add(production.toString());
        }
        builder.append(joiner);
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
