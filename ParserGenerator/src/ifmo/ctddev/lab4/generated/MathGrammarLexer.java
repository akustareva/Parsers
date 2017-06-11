package ifmo.ctddev.lab4.generated;

public class MathGrammarLexer {
	private String expression;
	private String lastTokenText;
	private int pos;

	public MathGrammarLexer(String expression) {
		this.expression = expression;
		this.pos = 0;
	}

	public boolean hasNextToken() {
		while (pos < expression.length() && isBlank(expression.charAt(pos))) {
			pos++;
		}
		return pos != expression.length();
	}

	public MathGrammarToken getNextToken() {
		if (!hasNextToken()) {
			return MathGrammarToken.EOF;
		}
		if (expression.startsWith("9", pos)) {
			pos += "9".length();
			lastTokenText = "9";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("8", pos)) {
			pos += "8".length();
			lastTokenText = "8";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("7", pos)) {
			pos += "7".length();
			lastTokenText = "7";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("6", pos)) {
			pos += "6".length();
			lastTokenText = "6";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("5", pos)) {
			pos += "5".length();
			lastTokenText = "5";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("4", pos)) {
			pos += "4".length();
			lastTokenText = "4";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("3", pos)) {
			pos += "3".length();
			lastTokenText = "3";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("2", pos)) {
			pos += "2".length();
			lastTokenText = "2";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("1", pos)) {
			pos += "1".length();
			lastTokenText = "1";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("0", pos)) {
			pos += "0".length();
			lastTokenText = "0";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("+", pos)) {
			pos += "+".length();
			lastTokenText = "+";
			return MathGrammarToken.PLUS;
		} else if (expression.startsWith("*", pos)) {
			pos += "*".length();
			lastTokenText = "*";
			return MathGrammarToken.MUL;
		} else if (expression.startsWith(")", pos)) {
			pos += ")".length();
			lastTokenText = ")";
			return MathGrammarToken.R_PAR;
		} else if (expression.startsWith("(", pos)) {
			pos += "(".length();
			lastTokenText = "(";
			return MathGrammarToken.L_PAR;
		}
		throw new IllegalStateException("Unknown token from pos " + pos);
	}

	public int getPos() {
		return pos;
	}

	public String getLastTokenText() {
		return lastTokenText;
	}

	private boolean isBlank(char c) {
		return c == ' ' || c == '\r' || c == '\n' || c == '\t';
	}

}
