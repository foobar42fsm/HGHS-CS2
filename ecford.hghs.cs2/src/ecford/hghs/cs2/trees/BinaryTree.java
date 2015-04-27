package ecford.hghs.cs2.trees;

public class BinaryTree<E> {
	private TreeNode<E> root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(E value) {
		root = new TreeNode<E>(value);
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
}
