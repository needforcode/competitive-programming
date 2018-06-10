/**
Validate if a tree if BST, assume no duplicates.
*/

import java.util.Stack;

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

public class ValidateBSTIterative {

	Node pre = null;
	
	public static void main(String[] args) {
		Node root = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8, new Node(6), new Node(9)));
		System.out.println(validateBST(root));
	}

	public static boolean validateBST(Node root) {

		Node pre = new Node(Integer.MIN_VALUE);
		Stack stack = new Stack<Node>();
		
		while(true) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}

			if(stack.isEmpty()) break;

			root = (Node)stack.pop();
			if(pre.val > root.val) {
				return false;
			}
			pre = root;
			root = root.right;
		}
		return true;
	}
}