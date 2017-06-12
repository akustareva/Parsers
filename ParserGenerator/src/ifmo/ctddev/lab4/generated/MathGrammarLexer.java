package ifmo.ctddev.lab4.generated;

public class MathGrammarLexer {
	private String expression;
	private MathGrammarToken currentToken;
	private String currentTokenText;
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
			currentToken = MathGrammarToken.EOF;
			currentTokenText = "";
			return MathGrammarToken.EOF;
		}
		if (expression.startsWith("9", pos)) {
			pos += "9".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "9";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("8", pos)) {
			pos += "8".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "8";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("7", pos)) {
			pos += "7".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "7";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("6", pos)) {
			pos += "6".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "6";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("5", pos)) {
			pos += "5".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "5";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("4", pos)) {
			pos += "4".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "4";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("3", pos)) {
			pos += "3".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "3";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("2", pos)) {
			pos += "2".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "2";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("1", pos)) {
			pos += "1".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "1";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("0", pos)) {
			pos += "0".length();
			currentToken = MathGrammarToken.NUMBER;
			currentTokenText = "0";
			return MathGrammarToken.NUMBER;
		} else if (expression.startsWith("+", pos)) {
			pos += "+".length();
			currentToken = MathGrammarToken.PLUS;
			currentTokenText = "+";
			return MathGrammarToken.PLUS;
		} else if (expression.startsWith("*", pos)) {
			pos += "*".length();
			currentToken = MathGrammarToken.MUL;
			currentTokenText = "*";
			return MathGrammarToken.MUL;
		} else if (expression.startsWith(")", pos)) {
			pos += ")".length();
			currentToken = MathGrammarToken.R_PAR;
			currentTokenText = ")";
			return MathGrammarToken.R_PAR;
		} else if (expression.startsWith("(", pos)) {
			pos += "(".length();
			currentToken = MathGrammarToken.L_PAR;
			currentTokenText = "(";
			return MathGrammarToken.L_PAR;
		}
		throw new IllegalStateException("Unknown token from pos " + pos);
	}

	public MathGrammarToken getCurrentToken() {
		return currentToken;
	}

	public int getPos() {
		return pos;
	}

	public String getCurrentTokenText() {
		return currentTokenText;
	}

	private boolean isBlank(char c) {
		return c == ' ' || c == '\r' || c == '\n' || c == '\t';
	}

}
