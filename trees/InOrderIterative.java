import java.util.*;

public class InOrderIterative {

	static Stack<Node> stack = new Stack<Node>();
	
	public static void main(String[] args) {

		Node root = new Node(1,null,null);
		root.left = new Node(2,new Node(4,null,null),new Node(5,null,null));
		root.right = new Node(3,new Node(6,null,null), new Node(7,null,null));

		inOrderIterative(root);
	}

	public static void inOrderIterative(Node root) {
     
    	while(true) {
        	while(root != null) {
        		stack.push(root);
        		root = root.left;
        	}

        	if(stack.isEmpty()) {
        		break;
        	}

        	root = stack.pop();
        	System.out.println(root.val);

        	root = root.right;
    	}
	}
}

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
