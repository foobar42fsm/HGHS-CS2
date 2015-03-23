package ecford.hghs.cs2.sorting;

/*Merge sort class for sorting ints
 *@author Elliot Ford
 */

public class MergeSortInt {
	private int[] array;

	public MergeSortInt(int[] array) {
		this.array = array;
		sort(0, array.length-1);
	}

	private void sort(int lower, int upper) {
		if (lower < upper) {
			int middle = lower + (upper - lower) / 2;
			sort(lower, middle);
			sort(middle + 1, upper);
			sortsort(lower, middle, upper);
		}
	}

	private void sortsort(int lower, int middle, int upper) {
		int[] array0 = array.clone();
		int i = lower;
		int j = middle + 1;
		int k = lower; // position in original array to read to

		while (i <= middle && j <= upper) {// i is the left array scanner, j is
											// the right scanner
			if (array0[i] <= array0[j]) {
				array[k] = array0[i];
				i++;
			} else {
				array[k] = array0[j];
				j++;
			}
			k++;

		}
		while (i <= middle) {
		      array[k] = array0[i];
		      k++;
		      i++;
		    }
	}

	public int[] getSorted() {
		return array;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 1, 18, 7, 19, 16,42,89,91,777,666,351, };
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
