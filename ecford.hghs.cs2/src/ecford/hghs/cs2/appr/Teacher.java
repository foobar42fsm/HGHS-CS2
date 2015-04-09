package ecford.hghs.cs2.appr;

import ecford.hghs.cs2.sorting.QuickSortInt;

public class Teacher {
	Student[] roster;

	// public int testAverage() {
	// return findAverage(roster)[0].grade;
	// }
	// private Student[] findAverage(Student[] roster2) {
	// if(roster2.length < 1) {
	// return roster2;
	// }
	// }

	public int findMedian(Student[] roster2) {
		int[] input = new int[roster2.length];
		for (int i = 0; i < roster2.length; i++) {
			input[i] = roster2[i].grade();
		}
		new QuickSortInt(input);
		if (input.length % 2 == 0) {
			return (input[input.length / 2] + input[(input.length / 2) + 1]) / 2;
		}
		return input[input.length / 2];

	}
}
