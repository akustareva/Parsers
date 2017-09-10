package ifmo.ctddev.lab3.maps;

import java.util.StringJoiner;

public class Functions {

    public static String convertFuncToC(String func, String ... args) {
        if ("read".equals(func) || "readln".equals(func)) {
            StringBuilder builder = new StringBuilder("\tscanf(\"");
            builder.append(createFormatSpecifiers(args));
            if (func.endsWith("ln")) {
                builder.append("\\n");
            }
            builder.append("\"");
            if (args.length != 0) {
                builder.append(", &");
            }
            StringJoiner joiner = new StringJoiner(", &", builder.toString(), ");\n");
            for (String arg : args) {
                joiner.add(arg);
            }
            return joiner.toString();
        } else if ("write".equals(func) || "writeln".equals(func)) {
            StringBuilder builder = new StringBuilder("\tprintf(\"");
            builder.append(createFormatSpecifiers(args));
            if (func.endsWith("ln")) {
                builder.append("\\n");
            }
            builder.append("\"");
            if (args.length != 0) {
                builder.append(", ");
            }
            StringJoiner joiner = new StringJoiner(", ", builder.toString(), ");\n");
            for (String arg : args) {
                joiner.add(arg);
            }
            return joiner.toString();
        } else {
            throw new IllegalArgumentException("Unknown function.");
        }
    }

    private static String createFormatSpecifiers(String ... args) {
        StringJoiner joiner = new StringJoiner(" ");
        for (String arg : args) {
            String type = VarTypes.getVarType(arg);
            if ("char".equals(type)) {
                joiner.add("%c");
            } else if ("bool".equals(type) || "int".equals(type)) {
                joiner.add("%d");
            } else if ("double".equals(type)) {
                joiner.add("%f");
            } else {
                throw new IllegalArgumentException("Unexpected type");
            }
        }
        return joiner.toString();
    }
}
