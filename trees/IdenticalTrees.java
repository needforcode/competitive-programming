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

public class IdenticalTrees {
	
	public static void main(String[] args) {
		Node n1 = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8, new Node(6), new Node(9)));
		Node n2 = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8, new Node(6), new Node(9)));
		System.out.println(identical(n1,n2));
	}

	public static boolean identical(Node n1, Node n2) {
		if(n1 == null && n2 == null) {
			return true;
		}
		if(n1 == null || n2 == null) {
			return false;
		}
		if(n1.val != n2.val) {
			return false;
		}

		return (identical(n1.left, n2.left) && identical(n1.right, n2.right));
	}
}