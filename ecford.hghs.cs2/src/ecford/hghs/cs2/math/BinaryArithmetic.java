package ecford.hghs.cs2.math;

public class BinaryArithmetic {

	// Adding one: If the digit on the tape is zero, then simply change that
	// digit to a one.
	// If the digit is a one, change it to a zero, move left, and apply the same
	// procedure at that position
	public int increment(int firstBinary) {
		String temp = new String(Integer.toString(firstBinary));
		if (temp.length() < 2) {
			if (firstBinary == 1) {
				return 10;
			} else {
				return 1;
			}
		}
		if (firstBinary % 10 == 1) {
			return Integer.parseInt(new String(increment(firstBinary / 10)
					+ "0"));
		} else {
			return firstBinary + 1;

		}
	}

	public int decrement(int binary) {
		if (binary < 10) {
			return 0;
		}
		if (binary % 10 == 0) {
			return Integer.parseInt(String
					.valueOf(decrement(binary / 10) + "1"));
		} else {
			return Integer.parseInt(new String(Integer.toString(binary / 10))
					+ "0");
		}
	}

	public int addBinaryNumbers(int binaryOne, int binaryTwo) {
		/*int temp = 0;
		if (binaryTwo < 10) {
			if (binaryTwo == 1) {
				return increment(binaryOne);
			} else {
				return binaryOne;
			}
		}

		if (binaryTwo % 10 == 1) {
			temp = increment(binaryOne);
			return Integer.parseInt(Integer.toString(addBinaryNumbers(
					temp / 10, binaryTwo / 10)) + Integer.toString(temp % 10));
		} else {
			return Integer.parseInt(Integer.toString(addBinaryNumbers(
					temp / 10, binaryTwo / 10) + Integer.parseInt("0")));
		}*/
		int retX = binaryOne;
		while(binaryTwo > 0) {
			retX = increment(retX);
			binaryTwo = decrement(binaryTwo);
		}
		return retX;
	}

	public int multiplyByAdding(int binaryOne, int binaryTwo) {
		if (binaryTwo == 0) {
			return 0;
		}
		int retX = 0;
		int counter = binaryTwo;
		while (counter > 0) {
			retX = addBinaryNumbers(binaryOne, retX);
			counter = decrement(counter);
		}
		return retX;
	}

	public static void main(String[] args) {
		BinaryArithmetic test = new BinaryArithmetic();
		// System.out.println(test.increment(11));
		System.out.println(test.addBinaryNumbers(110, 11));
		/*
		 * System.out.println(test.decrement(11));String.valueOf(binaryTwo).length
		 * () System.out.println(test.decrement(10));
		 * System.out.println(test.decrement(1));
		 * 
		 */
		System.out.println(test.multiplyByAdding(11, 111));
		 

	}
}
