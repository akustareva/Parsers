package ifmo.ctddev.lab4.generated;

public class MathGrammarLexer {
	private String expression;
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
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("8", pos)) {
			pos += "8".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("7", pos)) {
			pos += "7".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("6", pos)) {
			pos += "6".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("5", pos)) {
			pos += "5".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("4", pos)) {
			pos += "4".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("3", pos)) {
			pos += "3".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("2", pos)) {
			pos += "2".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("1", pos)) {
			pos += "1".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("0", pos)) {
			pos += "0".length();
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("+", pos)) {
			pos += "+".length();
			return MathGrammarToken.PLUS;
		} else if (expression.startsWith("*", pos)) {
			pos += "*".length();
			return MathGrammarToken.MUL;
		} else if (expression.startsWith(")", pos)) {
			pos += ")".length();
			return MathGrammarToken.R_PAR;
		} else if (expression.startsWith("(", pos)) {
			pos += "(".length();
			return MathGrammarToken.L_PAR;
		}
		throw new IllegalStateException("Unknown token from pos " + pos);
	}

	public int getPos() {
		return pos;
	}

	private boolean isBlank(char c) {
		return c == ' ' || c == '\r' || c == '\n' || c == '\t';
	}

}
