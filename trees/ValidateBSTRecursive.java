/**
Validate if a tree if BST, assume no duplicates.
*/
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

public class ValidateBSTRecursive {

	Node pre = null;
	
	public static void main(String[] args) {
		Node root = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8, new Node(6), new Node(9)));
		System.out.println(validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public static boolean validateBST(Node root, Integer min, Integer max) {
		if(root == null) {
			return true;
		}

		if(root.val < min || root.val > max) {
			return false;
		}

		boolean left = validateBST(root.left, min, root.val);
		boolean right = validateBST(root.right, root.val, max);

		if(left == false || right == false) {
			return false;
		}

		return true;
	}
}