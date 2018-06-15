/**
Leetcode
Q) Min SubArray with given sum.

sum = 7, input = [2,3,1,2,4,3]
*/

import java.util.*;

public class MinSubArraySum {
	
	public static void main(String[] args) {
		int[] input = new int[]{2,3,1,2,4,3};
		System.out.println(Arrays.toString(minSubArraySum(input,7)));
	}
 
	public static int[] minSubArraySum(int[] input, int target) {

		if(input == null) {
			return new int[]{-1,-1};
		}

		int sum = 0;
		int minLen = Integer.MAX_VALUE;
		int start = 0;                     
		int[] index = new int[]{-1,-1}; 
		for(int end=0; end<input.length; end++) {
			
			sum = sum + input[end]; // add end to sum

			// Adjust start value of sliding window.
			while(sum > target && (start < input.length)) {
				sum = sum - input[start];
				start++;
			}

			// update min length and index.
			if((target == sum) && (end-start) < minLen) {
				minLen = (end-start);
				index[0] = start;
				index[1] = end;
			}
		}

		return index;
	}
}
