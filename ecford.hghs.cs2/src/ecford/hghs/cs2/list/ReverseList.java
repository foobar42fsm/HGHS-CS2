package ecford.hghs.cs2.list;

public class ReverseList {
	SinglyLinkedList linkedList;
	SinglyLinkedList flippedLinkedList;

	public ReverseList(Object[] array) {
		linkedList = new SinglyLinkedList(array);
		flippedLinkedList = new SinglyLinkedList(flip(linkedList));

	}

	private Object[] flip(SinglyLinkedList linkedList2) {
		int size = linkedList2.size();
		SinglyLinkedList local = linkedList2;
		Object[] retX = new Object[linkedList.size()];
		for (int i = 0; i < size; i++) {
			retX[i] = local.removeEnd();
		}
		return retX;
	}

	public String flippedToString() {
		StringBuilder retX = new StringBuilder();
		ListNode temp = flippedLinkedList.getHead();
		retX.append(temp.getValue()+ " ");

		while (temp.getNext() != null) {

			retX.append(temp.getNext().getValue() + " ");
			temp = temp.getNext();
		}
		return retX.toString();
	}

	public static void main(String[] args) {
		String[] input = new String[] { "man", "dog", "gas" };
		ReverseList test = new ReverseList(input);
		System.out.println(test.flippedToString());
	}
}
