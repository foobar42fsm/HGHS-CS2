package ecford.hghs.cs2.trees;

public class BinaryTree<E> {
	private TreeNode<E> root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(E value) {
		root = new TreeNode<E>(value);
	}

	public TreeNode<E> getRoot() {
		return root;
	}

	public void setRoot(TreeNode<E> root) {
		this.root = root;
	}

	public void traversePreorder(TreeNode<E> root) {

		if (root != null) {
			visit(root);
			traversePreorder(root.getLeft());
			traversePreorder(root.getRight());
		}
	}

	public void traverseInorder(TreeNode<E> root) {
		if (root != null) {
			traverseInorder(root.getLeft());
			visit(root);
			traverseInorder(root.getRight());
		}
	}

	public void traversePostorder(TreeNode<E> root) {
		if(root!=null) {
			traversePostorder(root.getLeft());
			traversePostorder(root.getRight());
			visit(root);
		}
	}

	private void visit(TreeNode<E> node) {
		System.out.print(node.getValue());

	}
}
