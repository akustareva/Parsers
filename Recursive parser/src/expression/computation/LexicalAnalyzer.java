package expression.computation;

public class LexicalAnalyzer {
    private String expression;
    private String lastName;
    private int pos;

    public LexicalAnalyzer(String expression) {
        this.expression = expression;
        this.pos = 0;
    }

    public boolean hasNextToken() {
        while (pos < expression.length() && isBlank(expression.charAt(pos))) {
            pos++;
        }
        return pos != expression.length();
    }

    public Token getNextToken() {
        if (!hasNextToken()) {
            return null;
        }
        String nextChar = Character.toString(expression.charAt(pos++));
        if (Token.Comma.toString().equals(nextChar)) {
            return Token.Comma;
        } else if (Token.Semicolon.toString().equals(nextChar)) {
            return Token.Semicolon;
        } else if (Token.Colon.toString().equals(nextChar)) {
            return Token.Colon;
        } else {
            pos--;
        }
        String nextTokenValue = getNextTokenValue();
        if (Token.Var.toString().equalsIgnoreCase(nextTokenValue)) {
            return Token.Var;
        } else if (!nextTokenValue.isEmpty()) {
            lastName = nextTokenValue;
            return Token.Name;
        } else {
            throw new IllegalArgumentException("Incorrect string.");
        }
    }

    public Token seeNextToken() {
        Token token= getNextToken();
        if (token == Token.Name) {
            pos -= getLastName().length();
        } else {
            pos -= token.toString().length();
        }
        return token;
    }

    public String getLastName() {
        return lastName;
    }

    private String getNextTokenValue() {
        StringBuilder value = new StringBuilder();
        while (pos < expression.length() && !isBlank(expression.charAt(pos)) && !isPunctuationMark(expression.charAt(pos))) {
            value.append(expression.charAt(pos++));
        }
        return value.toString();
    }

    private boolean isBlank(char c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private boolean isPunctuationMark(char c) {
        return c == ',' || c == ':' || c == ';';
    }

    public int getPos() {
        return pos;
    }
}
