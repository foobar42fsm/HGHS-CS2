package ecford.hghs.cs2.list;

public class CircularLinkedList {
	private DoubleListNode header;
	private int nodeCount;

	public CircularLinkedList() {
		header = new DoubleListNode(null);
		header.setPrevious(header);
		header.setNext(header);
		nodeCount = 0;
	}

	// precondition: input node is exists in List
	public void addAfter(DoubleListNode node, Object value) {
		DoubleListNode temp = new DoubleListNode(value, node, node.getNext());
		((DoubleListNode) node.getNext()).setPrevious(temp);
		((DoubleListNode) temp.getPrevious()).setNext(temp);
	}

	public DoubleListNode removeAt(DoubleListNode node) {
		return node;

	}
}
