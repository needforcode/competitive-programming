/**

How many days wait for warmer temperatures ? If no have 0.

input: [73, 74, 75, 71, 69, 72, 76, 73]
*/

import java.util.*;

public class DailyTemperatures {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(warmerTemp(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
	}

	public static int[] warmerTemp(int[] input) {
		if(input == null) {
			return new int[0];
		}

		if(input.length == 1) {
			return new int[]{0};
		}

		Stack stack = new Stack<Integer>();
		int[] output = new int[input.length];

		for(int i=0; i<input.length; i++) {
			if(stack.isEmpty() || input[(Integer)stack.peek()] > input[i]) {
				stack.push(i);
			} else {
				while(!stack.isEmpty() && input[(Integer)stack.peek()] < input[i]) {
					int stackTop = (Integer)stack.pop();
					output[stackTop] = i - stackTop;
				}
				stack.push(i);
			}
		}
		return output;
	}
}