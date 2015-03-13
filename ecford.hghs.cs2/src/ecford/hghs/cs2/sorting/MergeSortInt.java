package ecford.hghs.cs2.sorting;

public class MergeSortInt{
	private int[] array;
	
	public MergeSortInt(int[] array) {
		this.array = array;
		sort(array);
	}

	private int[] sort(int[] array2) {
		int[] input = array2;
		
		if(input.length > 1) {
			return input;
		}
		
	}
}
