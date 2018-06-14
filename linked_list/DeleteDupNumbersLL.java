class Node {
	int val;
	Node next;
	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

public class DeleteDupNumbersLL {
	
	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(3, 
			new Node(4, new Node(4, new Node(5, null)))))));
		Node node = deleteDupLL(head);
		while(node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
	}

	public static Node deleteDupLL(Node list) {

		if(list == null) {
			return list;
		}

		Node current = list;
		int counter = 1;
		Node out = new Node(-1,null);
		Node head = out;

		while(current != null) {
			if((current.next == null || (current.val != current.next.val)) && counter == 1) {
				out.next = current;
				out = out.next;
			} else if(current.next != null && current.val == current.next.val) {
				counter++;
			} else {
				counter = 1;
			}
			current = current.next;
		}
		return head.next;
	}
}