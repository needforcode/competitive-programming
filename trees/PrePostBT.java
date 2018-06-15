/**
Tree:
		1
	2		3
  4	  5

Pre Order: 1 2 4 5 3 
In Order: 4 2 5 1 3
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

public class PrePostBT {

	static int preStart;
	static int preEnd;
	
	public static void main(String[] args) {
		int[] pre = new int[]{1,2,4,5,3};
		int[] in = new int[]{4,2,5,1,3};
		
		preStart = 0;
		preEnd = pre.length-1;

		printPreOrder(constructTree(pre, in, 0, in.length-1));
	}

	public static Node constructTree(int[] pre, int[] in, int inStart, int inEnd) {

		Node root = new Node(pre[preStart]);

		int index = getInOrderIndex(in, inStart, inEnd, pre[preStart]);

		if(inEnd - inStart >= 1) {
			++preStart;
			root.left = constructTree(pre, in, inStart, index-1);
			++preStart;
			root.right = constructTree(pre, in, index+1, inEnd);
		}

		return root;
	}

	public static int getInOrderIndex(int[] in, int inStart, int inEnd, int element) {
		for(int i=inStart; i <= inEnd; i++) {
			if(in[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void printPreOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.val);
		if(root.left != null) printPreOrder(root.left);
		if(root.right != null) printPreOrder(root.right);
	}
}