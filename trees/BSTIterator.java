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

public class BSTIterator {

	Node root;
	Stack stack;

	public BSTIterator(Node root) {
		this.root = root;
		this.stack = new Stack<Node>();
	}

	public static void main(String[] args) {
		Node root = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(8, new Node(6), new Node(9)));
		BSTIterator iterator = new BSTIterator(root);
		while(iterator.hasNext()) {
			System.out.println(iterator.next().val);
		}
	}

	public boolean hasNext() {
		return (!stack.isEmpty() || root != null);
	}

	public Node next() {

		Node result = null;
		while(true) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}

			if(stack.isEmpty()) break;

			root = (Node)stack.pop();
			result = root;

			root = root.right;
			return result;
		}
		return result;
	}
}