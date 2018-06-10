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

public class SortedArrayToBST {

	public static void main(String[] args) {
		
		int[] input = new int[]{1,2,3,4,5,6,7};
		printBSTInOrder(sortedArrayToBST(input, 0, input.length-1));
	}

	public static Node sortedArrayToBST(int[] input, int low, int high) {

		if(low > high) {
			return null;
		}

		int mid = low + ((high-low)/2);

		Node root = new Node(input[mid]);

		root.left = sortedArrayToBST(input, low, mid-1);
		root.right = sortedArrayToBST(input, mid+1, high);

		return root;
	}

	public static void printBSTInOrder(Node root) {
		if(root.left != null)  printBSTInOrder(root.left);
		System.out.println(root.val);
		if(root.right != null) printBSTInOrder(root.right);
	}
}