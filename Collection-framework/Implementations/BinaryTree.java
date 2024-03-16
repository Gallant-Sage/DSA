class Node {
	int key;
	Node left;
	Node right;

	Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTree {
	// Root of Binary Tree
	Node root;

	// Constructors
	BinaryTree(int key) { root = new Node(key); }
	BinaryTree() { root = null; }
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		// create root
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		tree.root.left.left = new Node(4);
			/* 4 becomes left child of 2
	       	   1
	      	  / \
	      	 2   3
	       	/ \ / \
	  	   4 null null null
	   	  / \
	  	null null
	      	  */
	}
}