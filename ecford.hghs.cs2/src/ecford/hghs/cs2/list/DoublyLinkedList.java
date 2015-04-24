package ecford.hghs.cs2.list;

public class DoublyLinkedList implements LinkedList {

	protected DoubleListNode head;
	protected int nodeCount;

	public DoublyLinkedList() {
		head = null;
		nodeCount = 0;
	}

	public DoublyLinkedList(Object v) {
		super();
		this.head = new DoubleListNode(v);
		this.nodeCount = 1;
	}

	public void DoublyLinkedListArray(Object[] array) {
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				addEnd(array[i]);
			}
		}
	}

	@Override
	public void addEnd(Object v) {
		if (nodeCount != 0) {
			ListNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			DoubleListNode nx = new DoubleListNode(v, null, temp);
			temp.setNext(nx);
		} else {
			addFirst(v);
		}
		nodeCount++;
	}

	@Override
	public void addFirst(Object v) {
		DoubleListNode foo = new DoubleListNode(v, head, null);
		if (head != null) {
			head.setPrevious(foo);
		}
		head = foo;
		nodeCount++;
	}

	@Override
	public void add(Object v, int loc) {
		if (nodeCount != 0) {
			int pos = 0;
			ListNode temp = head;
			while (temp.getNext() != null && pos < (loc - 1)) {
				temp = temp.getNext();
				pos++;
			}
			DoubleListNode nx = new DoubleListNode(v, temp.getNext(), temp);
			temp.setNext(nx);
		}
	}

	@Override
	public Object removeFirst() {
		Object retX = null;
		if (head != null) {
			retX = head.getValue();
			head = (DoubleListNode) head.getNext();
			if (head != null) {
				head.setPrevious(null);
			}
			nodeCount--;
		}
		return retX;
	}

	@Override
	public Object removeEnd() {
		return remove(nodeCount-1);
	}

	@Override
	public Object remove(int index) {
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
		if (temp.getNext().getNext() != null) {
			((DoubleListNode) temp.getNext().getNext()).setPrevious(temp);
		}
		temp.setNext(null);
		nodeCount--;
		return retX;
	}

	@Override
	public Object getValueHead() {
		return head.getValue();
	}

	@Override
	public ListNode getHead() {
		return head;
	}

	@Override
	public int size() {
		return nodeCount;
	}

}
