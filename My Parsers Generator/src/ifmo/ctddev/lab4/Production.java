package ifmo.ctddev.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Production {
    private List<Rule> rules = new ArrayList<>();
    private String javaCode;

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setJavaCode(String javaCode) {
        this.javaCode = javaCode;
    }

    public String getJavaCode() {
        return javaCode;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ", "", "");
        for (Rule rule : rules) {
            joiner.add(rule.getName());
        }
        return joiner.toString();
    }
}
