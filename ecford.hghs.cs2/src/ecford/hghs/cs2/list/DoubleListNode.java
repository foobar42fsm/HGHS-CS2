package ecford.hghs.cs2.list;

public class DoubleListNode extends ListNode {

	private ListNode previous;

	public DoubleListNode(Object v) {
		this(v,null,null);
	}

	public DoubleListNode(Object v, ListNode nx, ListNode bf) {
		super(v, nx);
		previous = bf;
	}

	public void setPrevious(ListNode bf) {
		previous = bf;
	}

	public ListNode getPrevious() {
		return previous;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
