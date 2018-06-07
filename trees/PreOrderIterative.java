import java.util.*;

public class PreOrderIterative {

	static Stack<Node> stack = new Stack<Node>();
	
	public static void main(String[] args) {

		Node root = new Node(1,null,null);
		root.left = new Node(2,new Node(4,null,null),new Node(5,null,null));
		root.right = new Node(3,new Node(6,null,null), new Node(7,null,null));

		preOrderIterative(root);
	}

	public static void preOrderIterative(Node root) {
     
    	stack.push(root);

    	while(!stack.isEmpty()) {
    		Node node = stack.pop();
    		System.out.println(node.val);

    		if(node.right != null) {
    			stack.push(node.right);
    		}

    		if(node.left != null) {
    			stack.push(node.left);
    		}
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
