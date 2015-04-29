package ecford.hghs.cs2.stacks;

public class PostfixEvaluation {
	private String postfix;
	char[] operators;

	public PostfixEvaluation(String postfix) {
		super();
		this.postfix = postfix;
		operators = new String("+-*/%^").toCharArray();
	}

	// preconditions: index value included in search
	private int findDigit(String input, int index) { // returns the position in
														// the string, -1 if
														// index to big
		if (input.length() < index) {
			return -1;
		}
		for (int i = index; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				return i;
			}
		}
		return -1;
	}

	private int findOperator(String input, int index) { // returns the postition
														// in the string, -1 if
														// index to big
		if (input.length() < index) {
			return -1;
		}
		for (int i = index; i < input.length(); i++) {
			if (isOperator(input.charAt(i))) {
				return i;
			}
		}
		return -1;

	}

	private boolean isOperator(char input) {
		boolean retX = false;
		for (int i = 0; i < operators.length; i++) {
			if(input == operators[i]) {
				
			}
		}
		return false;
	}
}
