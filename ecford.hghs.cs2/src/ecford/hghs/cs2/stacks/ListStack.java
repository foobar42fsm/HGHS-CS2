package ecford.hghs.cs2.stacks;

import ecford.hghs.cs2.list.SinglyLinkedList;

public class ListStack {
	private SinglyLinkedList list;

	public ListStack() {
		list = new SinglyLinkedList();
	}

	public boolean isEmpty() {
		if (list.size() < 1) {
			return true;
		}
		return false;
	}

	public void push(Object x) {
		list.addFirst(x);
	}

	public Object pop() {
		Object retX = list.removeFirst();
		if(retX == null) {
			return null;
		}
		return retX;
	}
	
	public Object peekTop() {
		Object retX = list.getValueHead();
		if(retX == null) {
			return null;
		}
		return retX;
	}
	
	 public static void main(String[] args) {
	        ListStack linkedListStack = new ListStack();
	        System.out.println(linkedListStack.isEmpty());
	        linkedListStack.push('z');
	        System.out.println(linkedListStack.isEmpty());
	        System.out.println(linkedListStack.peekTop());
	        System.out.println(linkedListStack.pop());
	        System.out.println(linkedListStack.isEmpty());

	 }
}
