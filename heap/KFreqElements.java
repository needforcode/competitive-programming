/**
LeetCode
Given a non-empty array of integers, return the k most frequent elements.

Given [1,1,1,2,2,3] and k = 2, return [1,2].
*/

import java.util.*;

class Node {
	int val;
	int freq;

	public Node(int val, int freq) {
		this.val = val;
		this.freq = freq;
	}
}

public class KFreqElements {
	
	public static void main(String[] args) {
		int[] input = new int[]{1,1,1,2,2,2,3,3,3,3};
		kFreqElements(input, 2);
	}

	public static void kFreqElements(int[] input, int target) {
		if(input == null) {
			System.out.println("empty input");
		}

		Queue queue = new PriorityQueue<Node>(new Comparator<Node>() {
			@Override
			public int compare(Node n1, Node n2) {
				int ret = n2.freq > n1.freq ? 1 : n1.freq > n2.freq ? -1 : 0;
				return ret;
			}
		});

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=0 ; i<input.length; i++) {
			if(map.containsKey(input[i])) {
				int count = (Integer)map.get(input[i]);
				map.put(input[i], count+1);
			} else {
				map.put(input[i], 1);
			}
		}

		for(Map.Entry<Integer, Integer> set: map.entrySet()) {
			queue.add(new Node(set.getKey(), set.getValue()));
		}

		for(int i=0; i<queue.size(); i++) {
			System.out.println(((Node)queue.poll()).val);
		}
	}
}