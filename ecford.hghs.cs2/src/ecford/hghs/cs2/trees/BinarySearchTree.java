package ecford.hghs.cs2.trees;

import java.util.Comparator;

public class BinarySearchTree<E> extends BinaryTree {

	public BinarySearchTree() {
		super();

	}

	@SuppressWarnings("unchecked")
	public BinarySearchTree(E value) {
		super(value);
	}
	
	//TODO doesn't work, make this WORK!
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insert(Comparable add) {
		TreeNode<E> temp = getRoot();
		while (temp.getLeft() != null || temp.getRight() != null) {
			if (add.compareTo(temp.getValue()) > 0) {

			}else {
				//TreeNode<E> input = new TreeNode<E>(, left, right);
				//doesn't work
			}
		}
	}

	public TreeNode find(Comparable key) {
		TreeNode p = getRoot();
		while (p != null && key.compareTo(p.getValue()) != 0) {
			if (key.compareTo(p.getValue()) < 0) {
				p = p.getLeft();
			} else {
				p = p.getRight();
			}
		}
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
