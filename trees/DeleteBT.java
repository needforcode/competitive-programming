import java.util.*;

class Node {
	int val;
	Node left;
	Node right;
	
	public Node(int val) {
		this(val, null, null);
	}

	public Node(int val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class DeleteBT {
	
	public static void main(String[] args) {
		Node root = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8, new Node(6), new Node(9)));
		root = deleteBT(root);
		System.out.println(root == null);
	}

	public static Node deleteBT(Node root) {
		if(root == null) {
			return root;
		} else {
			deleteBT(root.left);
			deleteBT(root.right);
			root = null;
		}
		return root;
	}
}