package ifmo.ctddev.lab4.generated;

public class MathGrammarParser {
	private MathGrammarLexer lexer;

	public MathGrammarParser(String expression) {
		this.lexer = new MathGrammarLexer(expression);
	}

	public Integer parse() {
		return expr();
	}

	private Integer fact() {
		MathGrammarToken token = lexer.getNextToken();
		if (MathGrammarToken.NUMBER == token) {
			
		} else if (MathGrammarToken.L_PAR == token) {
			
		}
		throw new AssertionError();
	}

	private Integer mul(Integer i) {
		MathGrammarToken token = lexer.getNextToken();
		if (MathGrammarToken.MUL == token) {
			
		} else if (MathGrammarToken.R_PAR == token) {
			
		} else if (MathGrammarToken.EOF == token) {
			
		} else if (MathGrammarToken.PLUS == token) {
			
		}
		throw new AssertionError();
	}

	private Integer expr() {
		MathGrammarToken token = lexer.getNextToken();
		if (MathGrammarToken.NUMBER == token) {
			
		} else if (MathGrammarToken.L_PAR == token) {
			
		}
		throw new AssertionError();
	}

	private Integer sum(Integer i) {
		MathGrammarToken token = lexer.getNextToken();
		if (MathGrammarToken.R_PAR == token) {
			
		} else if (MathGrammarToken.EOF == token) {
			
		} else if (MathGrammarToken.PLUS == token) {
			
		}
		throw new AssertionError();
	}

	private Integer term() {
		MathGrammarToken token = lexer.getNextToken();
		if (MathGrammarToken.NUMBER == token) {
			
		} else if (MathGrammarToken.L_PAR == token) {
			
		}
		throw new AssertionError();
	}

}
