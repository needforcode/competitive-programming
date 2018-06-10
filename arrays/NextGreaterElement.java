/**
Find the next greater element for every element in an array. Assume no duplicates.
*/

import java.util.*;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int[] input = new int[]{6,5,8,4,1,2};
		nextGreaterElement(input);
	}

	public static void nextGreaterElement (int[] input) {
		
		Stack stack = new Stack<Integer>(); // 6 5
		int i = 0;
		while(i < input.length) { // i = 2
			if (!stack.isEmpty() && input[i] > (Integer)stack.peek()) {
				while(!stack.isEmpty() && (Integer)stack.peek() < input[i]) {
					Integer pop = (Integer)stack.pop();
					System.out.println("Next highest for " + pop + " is " + input[i]);
				}
			}
			stack.push(input[i]);
			i++;
		}

		while(!stack.isEmpty()) {
			System.out.println("Next element for " + (Integer)stack.pop() + " is null");
		}
	}
}