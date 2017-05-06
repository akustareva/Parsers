package expression.computation;

public enum Token {
    Var("var"),
    Colon(":"),
    Semicolon(";"),
    Comma(","),
    Name("");

    private String name;

    private Token(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
