import java.util.*;

class Node {
	Node next;
	Integer val;

	public Node(Integer val, Node next) {
		this.val = val;
		this.next = next;
	}
}

public class PartitionList {
	
	public static void main(String[] args) {
		Node list = new Node(1, new Node(4, new Node(3, new Node(2, new Node(5, new Node(2, null))))));
		Node result = partitionList(list, 3);

		while(result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	public static Node partitionList(Node head, Integer target) {

		Node left = new Node(0,null);
		Node leftHead = left;
		Node right = new Node(0,null);
		Node rightHead = right;
		
		while(head != null) {
			if(head.val < target) {
				left.next = head;
				left = left.next;
			} else if (head.val > target) {
				right.next = head;
				right = right.next;
			} 
			head = head.next;
		}

		left.next = null;
		right.next = null;

		Node targetNode = new Node(target,null); 
		if(leftHead.next != null) {
			head = leftHead.next;
			left.next = targetNode;
			targetNode.next = rightHead.next;
		} else {
			head = targetNode;
			targetNode.next = rightHead.next;
		}

		return head;
	}
}