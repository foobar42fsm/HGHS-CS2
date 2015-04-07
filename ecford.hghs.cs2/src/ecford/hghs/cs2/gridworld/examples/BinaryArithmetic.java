package ecford.hghs.cs2.gridworld.examples;

public class BinaryArithmetic {

	// Adding one: If the digit on the tape is zero, then simply change that
	// digit to a one.
	// If the digit is a one, change it to a zero, move left, and apply the same
	// procedure at that position
	public int Increment(int firstBinary) {
		String temp = new String(Integer.toString(firstBinary));
		if (temp.length() < 2) {
			if (firstBinary == 1) {
				return 10;
			} else {
				return 1;
			}
		}
		if (Integer.lowestOneBit(firstBinary) == 1) {
			return Integer.parseInt(new String(Increment(Integer.parseInt(temp
					.substring(0, temp.length() - 1))) + "0"));
		} else {
			return Integer.parseInt(new String(temp.substring(0,
					temp.length() - 1) + "1"));

		}
	}
	
	

	public static void main(String[] args) {
		BinaryArithmetic test = new BinaryArithmetic();
		System.out.println(test.Increment(1010101));
	}
}
