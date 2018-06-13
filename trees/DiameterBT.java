
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

public class DiameterBT {

	static int diameter;
	
	public static void main(String[] args) {
		Node root = new Node(1, new Node(2, new Node(4), new Node(5, new Node(9, null, 
			new Node(10)), null)), new Node(3, new Node(6), new Node(7, new Node(8), null)));
		diameterBT(root);
		System.out.println("diameter: " + diameter);
		
	}

	public static int diameterBT(Node root) {
		if(root == null) {
			return 0;
		}
		height(root);
		return diameter;
	}

	public static int height(Node root) {
		if(root == null) {
			return 0;
		}

		int leftH = height(root.left);
		int rightH = height(root.right);

		diameter = Math.max(diameter, 1+leftH+rightH); // update dia while calculating height.

		return 1+Math.max(leftH,rightH);
	}
}