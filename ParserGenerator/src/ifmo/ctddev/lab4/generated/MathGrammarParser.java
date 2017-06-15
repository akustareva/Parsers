package ifmo.ctddev.lab4.generated;

public class MathGrammarParser {
	private MathGrammarLexer lexer;

	public MathGrammarParser(String expression) {
		this.lexer = new MathGrammarLexer(expression);
	}

	public Integer parse() {
		lexer.getNextToken();
		return expr();
	}

	private Integer fact() {
		MathGrammarToken token = lexer.getCurrentToken();
		if (MathGrammarToken.NUMBER == token) {
			String _NUMBER1 = lexer.getCurrentTokenText();
			lexer.getNextToken();
			return Integer.parseInt(_NUMBER1);
		} else if (MathGrammarToken.L_PAR == token) {
			String _L_PAR1 = lexer.getCurrentTokenText();
			lexer.getNextToken();
			Integer _expr1 = expr();
			String _R_PAR1 = lexer.getCurrentTokenText();
			lexer.getNextToken();
			return _expr1;
		}
		throw new AssertionError();
	}

	private Integer mul(Integer i) {
		MathGrammarToken token = lexer.getCurrentToken();
		if (MathGrammarToken.MUL == token) {
			String _MUL1 = lexer.getCurrentTokenText();
			lexer.getNextToken();
			Integer _pterm1 = pterm();
			Integer _mul1 = mul(i * _pterm1);
			return _mul1;
		} else if (MathGrammarToken.R_PAR == token) {
			return i;
		} else if (MathGrammarToken.EOF == token) {
			return i;
		} else if (MathGrammarToken.PLUS == token) {
			return i;
		}
		throw new AssertionError();
	}

	private Integer pow(Integer i) {
		MathGrammarToken token = lexer.getCurrentToken();
		if (MathGrammarToken.MUL == token) {
			return i;
		} else if (MathGrammarToken.POW == token) {
			String _POW1 = lexer.getCurrentTokenText();
			lexer.getNextToken();
			Integer _pterm1 = pterm();
			Integer _pow1 = pow((int) Math.pow(i, _pterm1));
			return _pow1;
		} else if (MathGrammarToken.R_PAR == token) {
			return i;
		} else if (MathGrammarToken.EOF == token) {
			return i;
		} else if (MathGrammarToken.PLUS == token) {
			return i;
		}
		throw new AssertionError();
	}

	private Integer expr() {
		MathGrammarToken token = lexer.getCurrentToken();
		if (MathGrammarToken.NUMBER == token) {
			Integer _term1 = term();
			Integer _sum1 = sum(_term1);
			return _sum1;
		} else if (MathGrammarToken.L_PAR == token) {
			Integer _term1 = term();
			Integer _sum1 = sum(_term1);
			return _sum1;
		}
		throw new AssertionError();
	}

	private Integer sum(Integer i) {
		MathGrammarToken token = lexer.getCurrentToken();
		if (MathGrammarToken.R_PAR == token) {
			return i;
		} else if (MathGrammarToken.EOF == token) {
			return i;
		} else if (MathGrammarToken.PLUS == token) {
			String _PLUS1 = lexer.getCurrentTokenText();
			lexer.getNextToken();
			Integer _term1 = term();
			Integer _sum1 = sum(i + _term1);
			return _sum1;
		}
		throw new AssertionError();
	}

	private Integer term() {
		MathGrammarToken token = lexer.getCurrentToken();
		if (MathGrammarToken.NUMBER == token) {
			Integer _pterm1 = pterm();
			Integer _mul1 = mul(_pterm1);
			return _mul1;
		} else if (MathGrammarToken.L_PAR == token) {
			Integer _pterm1 = pterm();
			Integer _mul1 = mul(_pterm1);
			return _mul1;
		}
		throw new AssertionError();
	}

	private Integer pterm() {
		MathGrammarToken token = lexer.getCurrentToken();
		if (MathGrammarToken.NUMBER == token) {
			Integer _fact1 = fact();
			Integer _pow1 = pow(_fact1);
			return _pow1;
		} else if (MathGrammarToken.L_PAR == token) {
			Integer _fact1 = fact();
			Integer _pow1 = pow(_fact1);
			return _pow1;
		}
		throw new AssertionError();
	}

}
