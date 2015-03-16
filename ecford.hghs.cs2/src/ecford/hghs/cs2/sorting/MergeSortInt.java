package ecford.hghs.cs2.sorting;

/*Merge sort class for sorting ints
 *@author Elliot Ford
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MergeSortInt {
	private int[] array;
	private int[] sortedArray;

	public MergeSortInt(int[] array) {
		this.array = array;
		sortedArray = new int[array.length];
		sort(0, array.length);
	}

	private void sort(int lower, int upper) {
		if (upper - lower < 2) {
			return;
		}
		int i = lower;
		int j = upper;
		int middle = lower + (upper - lower) / 2;
		sort(lower, middle);
		sort(middle, upper);
		sortsort(lower, middle, upper);
	}

	private void sortsort(int lower, int middle, int upper) { // top most value
																// is inclusive
		List<Integer> array0 = new ArrayList<Integer>();
		List<Integer> array1 = new ArrayList<Integer>();
		for (int i = lower; i < upper; i++) {
			if (i < middle) {
				array0.add(array[i]);
			} else {
				array1.add(array[i]);
			}
		}
		int counter = 0;
		while (!array0.isEmpty() || !array1.isEmpty()) {
			while (array0.get(0) > array1.get(0)
					&& (counter < array.length || counter < array1.size())) {
				array[lower + counter] = array1.get(0);
				array1.remove(0);
			}

		}
	}

	public int[] getSorted() {
		return array;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 18, 7, 19, 16 };
		MergeSortInt sorter = new MergeSortInt(input);
		int[] output = sorter.getSorted();
		System.out.print("[");
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
			if (i < output.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}
