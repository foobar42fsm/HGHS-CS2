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
		head.setPrevious(foo);
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
		head = (DoubleListNode) head.getNext();
		head.setPrevious(null);
		return null;
	}

	@Override
	public Object removeEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getValueHead() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListNode getHead() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
