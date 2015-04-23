package ecford.hghs.cs2.trees;

public class TreeNode<E> {
	private TreeNode<E> left;
	private TreeNode<E> right;
	private E value;

	TreeNode(E value) {
		this(value, null, null);
	}

	TreeNode(E value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

}
