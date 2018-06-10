/**
Find the ancestor of 2 values in tree, Assume both exist in the tree.
*/
class Node {
	Integer val;
	Node left;
	Node right;

	public Node(int val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class LowestCommonAncestor {
	public static void main(String[] args) {
		
		Node root = new Node(1,new Node(2, new Node(4,null,null), 
			new Node(5,null,null)),new Node(3, new Node(6,null,null), new Node(7,null,null)));

		System.out.println(lowestCommonAncestor(root,2,8).val);
	}

	public static Node lowestCommonAncestor(Node root, Integer v1, Integer v2) {
		if(root == null || root.val == v1 || root.val == v2) {
			return root;
		}

		Node left = lowestCommonAncestor(root.left, v1, v2);
		Node right = lowestCommonAncestor(root.right, v1, v2);

		if(left != null && right != null) {
			return root;
		}

		if(left != null) {
			return left;
		} else {
			return right;
		}
	}
}