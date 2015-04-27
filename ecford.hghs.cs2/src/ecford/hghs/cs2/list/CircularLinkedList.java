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
	
	public CircularLinkedList(Object input) {
		header = new DoubleListNode(input);
		header.setPrevious(header);
		header.setNext(header);
		nodeCount = 1;
	}

	// precondition: input node is exists in List
	public void addAfter(DoubleListNode node, Object value) {
		DoubleListNode temp = new DoubleListNode(value, node, node.getNext());
		((DoubleListNode) node.getNext()).setPrevious(temp);
		((DoubleListNode) temp.getPrevious()).setNext(temp);
		nodeCount++;
	}

	public void addLast(Object value) {
		addAfter((DoubleListNode) header.getPrevious(), value);
	}

	public int getNodeCount() {
		return nodeCount;
	}

	public void remove(DoubleListNode node) {
		((DoubleListNode) node.getPrevious()).setNext(node.getNext());
		((DoubleListNode) node.getNext()).setPrevious(node.getPrevious());
		node.setNext(null);
		node.setPrevious(null);
		nodeCount--;
	}

	public DoubleListNode getHeader() {
		return header;
	}

	public void setHeader(DoubleListNode header) {
		this.header = header;
	}

}
