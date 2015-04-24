package ecford.hghs.cs2.sorting.listImplementation;

import ecford.hghs.cs2.list.DoubleListNode;
import ecford.hghs.cs2.list.DoublyLinkedList;
import ecford.hghs.cs2.list.ListNode;

public class SelectionSortInt {
	private DoublyLinkedList list;

	public SelectionSortInt(int[] array) {
		this.list = new DoublyLinkedList();
		Integer[] input = new Integer[array.length];
		for (int i = 0; i < input.length; i++) {
			input[i] = array[i];
		}
		list.DoublyLinkedListArray(input);
		sort(list);
	}

	private void sort(DoublyLinkedList list2) {
		if (list2.size() > 1) {
			boolean wasRun = true;
			while (wasRun) {
				wasRun = false;
				for (int i = 0, j = 1; j < list2.size() - 1; i++, j++) {
					if (((Integer) get(i).getValue()) > ((Integer) get(j)
							.getValue())) {
						swap(i, j);
						wasRun = true;
					}
				}
			}
		}

	}

	private int pullInt(Object value) {
		if (value != null) {
			return (int) value;
		}
		return 0;
	}

	private void swap(int i, int j) {
		Object temp = get(i).getValue();
		if (i > 0) {
			get(i).getPrevious().getNext().setValue(get(j).getValue());
		} else {
			((DoubleListNode) list.getHead().getNext()).getPrevious().setValue(
					temp);
		}
		get(j).getPrevious().getNext().setValue(temp);

	}

	private DoubleListNode get(int i) {
		if (list.size() != 0) {
			int pos = 0;
			ListNode temp = list.getHead();
			while (temp.getNext() != null && pos < (i - 1)) {
				temp = temp.getNext();
				pos++;
			}
			return (DoubleListNode) temp.getNext();
		}
		return null;

	}

	public DoublyLinkedList getList() {
		return list;
	}

	public static void main(String[] args) {
		SelectionSortInt test = new SelectionSortInt(new int[] { 1, 2, 4, 3, 7,
				5, 2, 1 });
		DoublyLinkedList temp = test.getList();
		while (temp.getHead() != null) {
			System.out.print(temp.removeFirst() + " ");
		}

	}

}
