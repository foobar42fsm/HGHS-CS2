package ecford.hghs.cs2.list;

import org.apache.commons.lang3.ArrayUtils;

public class FlipString {
	private ReverseList reverser;

	public FlipString(String input) {
		reverser = new ReverseList(ArrayUtils.toObject(input.toCharArray()));

	}

	public String getReversedString() {
		return removeSpaces(reverser.flippedToString());
	}
	
	@SuppressWarnings("deprecation")
	private String removeSpaces(String input) {
		String local = input;
		for(int i = 0; i<local.length(); i++) {
			if(Character.isSpace(local.charAt(i))) {
				local = local.substring(0, i) + local.substring(i+1);
			}
		}
		return local;
	}
	
	public static void main(String[] args) {
		String input = "dog";
		FlipString test = new FlipString(input);
		System.out.println(test.getReversedString());
	}
}
