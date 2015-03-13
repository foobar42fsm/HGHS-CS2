package ecford.hghs.cs2.sorting;

public class QuickSortInt {
	private int[] array;

	public QuickSortInt(int[] array) {
		this.array = array;
		sort(0, array.length - 1);
	}

	public void sort(int lower, int upper) {
		int i = lower;
		int j = upper;
		int pivot = array[lower + (upper - lower) / 2];
		while (i < j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (lower < j) {
			sort(lower, j);
		}
		if (i < upper) {
			sort(i, upper);
		}
	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public int[] getSorted() {
		return array;

	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 18	, 7, 19,16 };
		QuickSortInt sorter = new QuickSortInt(input);
		int[] output = sorter.getSorted();
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
