package ecford.hghs.cs2.list;

public class SinglyLinkedListWithTail extends SinglyLinkedList {
	ListNode tail;
	
	public SinglyLinkedListWithTail() {
		super();
		tail = null;
	}
	
	public SinglyLinkedListWithTail(Object v) {
		super(v);
		tail = head;
	}
	
	public SinglyLinkedListWithTail(Object[] array) {
		super(array);
		tail = new ListNode(array[array.length-1], null);
	}
	
	@Override
	public void addEnd(Object v) {
		ListNode nx = new ListNode(v, null);
		if (nodeCount != 0) {
			ListNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nx);
			tail = nx;
		} else {
			head = nx;
			tail=nx;
		}
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
			if(loc == nodeCount-1) {
				tail = nx;
			}
		} else {
			head = nx;
		}
		nodeCount++;
	}
	
	public Object removeEnd() {
		if (nodeCount < 1) {
			head = null;
			tail = null;
			return null;
		}
		if (nodeCount < 2) {
			nodeCount--;
			Object retX = head.getValue();
			head = null;
			tail = head;
			return retX;
		}
		int pos = 0;
		ListNode temp = head;
		while (pos < (nodeCount - 2)) {
			temp = temp.getNext();
			pos++;
		}
		Object retX = temp.getNext().getValue();
		tail = temp.getNext();
		temp.setNext(null);
		nodeCount--;
		return retX;
	}

	
}
