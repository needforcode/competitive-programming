class Node {
	int val;
	Node left;
	Node right;

	public Node(int val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

/**
Use post order traversal to traverse and adjust links. Output will be pre order.
*/
public class FlattenBinaryTreeLL {
	
	static Node prev = null;

	public static void main(String[] args) {
		Node root = new Node(1,null,null);
		root.left = new Node(2,new Node(4,null,null),new Node(5,null,null));
		root.right = new Node(3,new Node(6,null,null), new Node(7,null,null));

		Node result = flattenBinaryTreeLL(root);

		while(result != null) {
			System.out.println(result.val + " ");
			result = result.right;
		}
	}

	public static Node flattenBinaryTreeLL(Node root) {
		flatten(root);
		return prev;
	}

	private static void flatten(Node root) {
		if(root == null) {
			return;
		}
		flatten(root.right);
		flatten(root.left);
		root.right = prev;
		root.left = null;
		prev = root; // prev is used to adjust links.
	}
}