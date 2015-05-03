package ecford.hghs.cs2.stacks;

import java.util.Stack;

public class PostfixEvaluation {
	private String postfix, infix, prefix;
	private boolean isReal;
	private String operators;
	private int value;

	public int getValue() {
		return value;
	}

	public PostfixEvaluation(String postfix) {
		super();
		this.postfix = postfix;
		operators = new String("+-*/%^");
		isReal = checkVadility();
		if (isReal) {
			toInfix();
			toPrefix();
			value = calculate();
		} else {
			infix = "-1";
			prefix = "-1";
		}
	}

	public String getPrefix() {
		return prefix;
	}

	public String getPostfix() {
		return postfix;
	}

	public String getInfix() {
		return infix;
	}

	public boolean getReal() {
		return isReal;
	}

	private void toPrefix() {
		Stack<Character> temp = new Stack<Character>();
		StringBuilder foo = new StringBuilder();
		for (int i = 0; i < postfix.length(); i++) {
			if (isOperator(postfix.charAt(i))) {
				foo.append(postfix.charAt(i));
				foo.append(temp.pop());
				foo.append(temp.pop());
			} else {
				temp.push(postfix.charAt(i));
			}
		}
		prefix = foo.toString();

	}

	private void toInfix() {
		Stack<String> temp = new Stack<String>();
		StringBuilder foo = new StringBuilder();
		for (int i = 0; i < postfix.length(); i++) {
			if (isOperator(postfix.charAt(i))) {
				foo.append(temp.pop());
				foo.append(postfix.charAt(i));
				foo.append(temp.pop());
			} else {
				temp.push(postfix.substring(i, i + 1));
			}
		}
		infix = foo.toString();
	}

	private int calculate() {
		int retX = 0;
		for (int i = 0; i < infix.length(); i++) {
			if (isOperator(infix.charAt(i))) {
				switch (infix.charAt(i)) {
				case '+':
					retX += Integer.parseInt(infix.substring(i - 1, i))
							+ Integer.parseInt(infix.substring(i + 1, i + 2));
					break;
				case '-':
					retX += Integer.parseInt(infix.substring(i - 1, i))
							- Integer.parseInt(infix.substring(i + 1, i + 2));
					break;
				case '*':
					retX += Integer.parseInt(infix.substring(i - 1, i))
							* Integer.parseInt(infix.substring(i + 1, i + 2));
					break;
				case '^':
					retX += Math.pow(
							Integer.parseInt(infix.substring(i - 1, i)),
							Integer.parseInt(infix.substring(i + 1, i + 2)));
					break;

				default:
					break;
				}
			}

		}
		return retX;
	}

	private boolean checkVadility() {
		for (int i = 0; i < postfix.length(); i++) {
			if (!isOperator(postfix.charAt(i))
					&& !Character.isDigit(postfix.charAt(i))
					&& !(postfix.charAt(i) == ' ')) {
				return false;
			}
		}
		return true;
	}

	private boolean isOperator(char input) {
		if (operators.indexOf(input) == -1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		PostfixEvaluation test = new PostfixEvaluation("22^");
		System.out.println(test.getInfix());
		System.out.println(test.getPostfix());
		System.out.println(test.getPrefix());
		System.out.println(test.getValue());

	}
}
