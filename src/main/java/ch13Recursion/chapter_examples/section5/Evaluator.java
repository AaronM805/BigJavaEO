package ch13Recursion.chapter_examples.section5;

/**
 * A class that can compute the value of an arithmetic expression.
 */
public class Evaluator {
	private ExpressionTokenizer tokenizer;

	/**
	 * Constructs an evaluator.
	 *
	 * @param expression a string containing the expression to be evaluated.
	 */
	public Evaluator(String expression) {
		this.tokenizer = new ExpressionTokenizer(expression);
	}

	/**
	 * Evaluates the expression.
	 *
	 * @return the value of the expression
	 */
	public int getExpressionValue() {
		int value = getTermValue();
		boolean done = false;

		while(!done) {
			String next = tokenizer.peekToken();
			
			if("+".equals(next) || "-".equals(next)) {
				tokenizer.nextToken(); // Discard "+" or "-"
				int value2 = getTermValue();

				if("+".equals(next)) {
					value += value2;
				}
				else {
					value -= value2;
				}
			}
			else {
				done = true;
			}
		}
		return value;
	}

	/**
	 * Evaluates the next term found in the expression.
	 *
	 * @return teh value of the term
	 */
	public int getTermValue() {
		int value = getFactorValue();
		boolean done = false;

		while(!done) {
			String next = tokenizer.peekToken();

			if("*".equals(next) || "/".equals(next)) {
				tokenizer.nextToken();
				int value2 = getFactorValue();

				if("*".equals(next)) {
					value *= value2;
				}
				else {
					value /= value2;
				}
			}
			else {
				done = true;
			}
		}
		return value;
	}

	/**
	 * Evaluates the next factor found in the expression.
	 *
	 * @return the value of the factor.
	 */
	public int getFactorValue() {
		int value;
		String next = tokenizer.peekToken();
		if("(".equals(next)) {
			tokenizer.nextToken(); // Discard "("
			value = getExpressionValue();
			tokenizer.nextToken(); // Discards ")"
		}
		else {
			value = Integer.parseInt(tokenizer.nextToken());
		}

		return value;
	}
}