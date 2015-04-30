package ecford.hghs.cs2.stacks;

public class PostfixEvaluation {
	private String postfix;
	private String prefix;
	private char[] operators;

	public PostfixEvaluation(String postfix) {
		super();
		this.postfix = postfix;
		operators = new String("+-*/%^").toCharArray();
		convert();
	}

	private void convert() { // this just needs to burn in hell, needs so much
								// work, so much.
		StringBuilder value = new StringBuilder();
		for (int i = 0; i < postfix.length(); i++) {
			if (findDigit(postfix, i) != -1) {
				value.append(postfix.charAt(findDigit(postfix, i)));
			}
			if (findOperator(postfix, i) != -1) {
				value.append(postfix.charAt(findOperator(postfix, i)));
			}
		}
		prefix = value.toString();

	}

	// preconditions: index value included in search
	private int findDigit(String input, int index) { // returns the position in
														// the string, -1 if
														// index to big
		if (input.length() <= index) {
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
		if (input.length() <= index) {
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
		for (int i = 0; i < operators.length; i++) {
			if (input == operators[i]) {
				return true;
			}
		}
		return false;
	}

	public String getPostfix() {
		return postfix;
	}

	public String getPrefix() {
		return prefix;
	}

	public static void main(String[] args) {
		PostfixEvaluation test = new PostfixEvaluation("33+");
		System.out.println(test.getPrefix());
		System.out.println(test.getPostfix());

	}
}
