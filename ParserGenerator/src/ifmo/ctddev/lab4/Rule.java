package ifmo.ctddev.lab4;

import java.util.*;

public class Rule {
    private String name;
    private Type returnedType = Type.VOID;
    private String returnedVarName;
    private Map<String, Type> localAttrs = new HashMap<>();
    private List<Production> productions = new ArrayList<>();

    private List<String> args;
    private Mark mark;

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

    public void setReturnedVarName(String varName) {
        this.returnedVarName = varName;
    }

    public String getReturnedVarName() {
        return returnedVarName;
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

    public void addArg(String arg) {
        args.add(arg);
    }

    public List<String> getArgs() {
        return args;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Mark getMark() {
        return mark;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(name);
        StringJoiner joiner;
        if (!localAttrs.isEmpty()) {
            joiner = new StringJoiner(", ", " (", ") ");
            for (Map.Entry<String, Type> attr : localAttrs.entrySet()) {
                joiner.add(attr.getValue() + " " + attr.getKey());
            }
            builder.append(joiner.toString());
        }
        if (returnedType != Type.VOID) {
            builder.append("[").append(returnedType.toString()).append(" ").append(returnedVarName).append("]");
        }
        builder.append(" : ");
        joiner = new StringJoiner(" | ", "", "");
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

    public enum Mark {
        ASTERISK("*"),
        PLUS("+"),
        QUESTION_MARK("?");

        private String mark;

        private Mark(String mark) {
            this.mark = mark;
        }

        @Override
        public String toString() {
            return mark;
        }
    }
}
