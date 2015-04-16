package ecford.hghs.cs2.list;

public interface LinkedList {
	
	
	public void addEnd(Object v);

	public void addFirst(Object v);

	public void add(Object v, int loc);

	public Object removeFirst();

	public Object removeEnd();

	public Object remove(int index);

	public Object getValueHead();

	public ListNode getHead();

	public int size();
}
