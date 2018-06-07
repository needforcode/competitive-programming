import java.util.*;

public class PostOrderIterative {

	static Stack<Node> stack = new Stack<Node>();
	
	public static void main(String[] args) {

		Node root = new Node(1,null,null);
		root.left = new Node(2,new Node(4,null,null),new Node(5,null,null));
		root.right = new Node(3,new Node(6,null,null), new Node(7,null,null));

		postOrderIterative(root);
	}

	public static void postOrderIterative(Node root) {
    
    	stack.push(root);
 
    	while(!stack.isEmpty()) {
        	root = stack.peek();
        	
        	if(root.left==null && root.right==null) {
            	System.out.println(stack.pop().val);
        	}
        	else {
            	if(root.right!=null) {
                	stack.push(root.right);
                	root.right = null;
            	}
 
            	if(root.left!=null) {
                	stack.push(root.left);
                	root.left = null;
            	}
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
