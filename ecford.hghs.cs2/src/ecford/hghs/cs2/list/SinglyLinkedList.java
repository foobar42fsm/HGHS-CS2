package ecford.hghs.cs2.list;

public class SinglyLinkedList {
	protected ListNode head;
	protected int nodeCount;

	public SinglyLinkedList() {
		head = null;
		nodeCount = 0;
	}

	public SinglyLinkedList(Object v) {
		head = new ListNode(v, null);
		nodeCount = 1;
	}

	public SinglyLinkedList(Object[] array) {
		head = new ListNode(array[0], null);
		if (array.length > 1) {
			for (int i = 1; i < array.length; i++) {
				addEnd(array[i]);
			}
		}
	}

	public void addEnd(Object v) {
		ListNode nx = new ListNode(v, null);
		if (nodeCount != 0) {
			ListNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nx);
		} else {
			head = nx;
		}
		nodeCount++;
	}

	public void addFirst(Object v) {
		ListNode nx = new ListNode(v, head);
		head = nx;
		nodeCount++;
	}

	public void addAt(Object v, int loc) {
		ListNode nx = new ListNode(v, null);
		if (nodeCount != 0) {
			int pos = 0;
			ListNode temp = head;
			while (temp.getNext() != null && pos < (loc - 1)) {
				temp = temp.getNext();
				pos++;
			}
			ListNode placeTemp = new ListNode(v, temp.getNext());
			temp.setNext(placeTemp);
		} else {
			head = nx;
		}
		nodeCount++;
	}

	public Object removeFirst() {
		Object retX = head.getValue();
		if (head == null) {
			return retX;
		}
		if (head.getNext() == null) {
			head = null;
			nodeCount--;
			return retX;
		}
		nodeCount--;
		head = head.getNext();
		return retX;
	}

	public Object removeEnd() {
		if (nodeCount < 1) {
			head = null;
			return null;
		}
		if (nodeCount < 2) {
			nodeCount--;
			Object retX = head.getValue();
			head.setNext(null);
			return retX;
		}
		int pos = 0;
		ListNode temp = head;
		while (pos < (nodeCount - 2)) {
			temp = temp.getNext();
			pos++;
		}
		Object retX = temp.getNext().getValue();
		temp.setNext(null);
		nodeCount--;
		return retX;
	}

	public Object remove(int index) {
		if (index > nodeCount) {
			return null;
		}
		if (index == nodeCount) {
			return removeEnd();
		}
		if (index == 0) {
			return removeFirst();
		}
		ListNode temp = head;
		int pos = 0;
		while (pos < index - 1) {
			temp = temp.getNext();
			pos++;
		}
		Object retX = temp.getValue();
		temp.setNext(temp.getNext().getNext());
		return retX;
	}

	public Object getValueHead() {
		return head.getValue();
	}

	public ListNode getHead() {
		return head;
	}

	public int size() {
		return nodeCount;
	}

	public static void main(String[] args) {
		SinglyLinkedList test = new SinglyLinkedList();
		test.addEnd("hello");
		test.addEnd("hi");
		test.addAt("boo", 1);
		System.out.println(test.removeEnd());
		System.out.println(test.getValueHead());
		System.out.println(test.getHead().getNext().getValue());
		// System.out.println(test.getHead().getNext().getNext().getValue());
	}

}
