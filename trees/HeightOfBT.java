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

public class HeightOfBT {
	
	public static void main(String[] args) {
		Node root = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8, new Node(6), new Node(9)));
		System.out.println("Iterative: " + heightBT_Iterative(root));
		System.out.println("Recursive: " + heightBT_Recursive(root));
	}

	public static int heightBT_Iterative(Node root) {

		if(root == null) {
			return 0;
		} else if(root.left == null || root.right == null) {
			return 1;
		}

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int count = 0;

		while(!queue.isEmpty()) {
			Node node = queue.remove();
			if(queue.isEmpty()) {
				count++;
			}
			if(node.left != null) {
				queue.add(node.left);
			}
			if(node.right != null) {
				queue.add(node.right);
			}
		}
		return count+1;
	}

	public static int heightBT_Recursive(Node root) {
		if(root == null) {
			return 0;
		} 
		int height = 1+Math.max(heightBT_Recursive(root.left),heightBT_Recursive(root.right));
		return height;
	}
}