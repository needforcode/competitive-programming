class Node {
	int val;
	Node next;

	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		Node input = new Node(1, new Node(2, new Node(3, new Node(4, null))));
		Node node = reverseIterative(input);
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}

		System.out.println();

		Node in = new Node(1, new Node(2, new Node(3, new Node(4, null))));
		Node root = reverseRecursive(null,in);
		while(root != null) {
			System.out.print(root.val + " ");
			root = root.next;
		}
	}

	public static Node reverseIterative(Node head) {
		if(head == null || head.next == null) {
			return head;
		}

		Node prev = null;
		                
		while(head != null) {
			Node temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}

	public static Node reverseRecursive(Node prev, Node head) {
		if(head == null) {
			return prev;
		}
 		Node temp = head.next;
		head.next = prev;
		prev = head;
		Node result = reverseRecursive(prev, temp);

		return result;
	}
}