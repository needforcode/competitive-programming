import java.util.*;

public class MaxSubArrayZeroSum {
	
	public static void main(String[] args) {
		int[] input = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
		int[] output = maxSubArrayZeroSum(input);
		System.out.println("longest sub array len is:" + (output[1] - output[0]+1)); // (5-1)+1 length
	}

	public static int[] maxSubArrayZeroSum(int[] input) {

		int len = input.length;
		int[] output = new int[2];

		if(input == null) {
			return new int[2];
		} else if (len == 1 && input[0] == 0) {
			output[0]=0;
			output[1]=1;
			return output;
		}

		HashMap map = new HashMap<Integer, Integer>();

		int sum = 0;
		int max = 0;
		for(int i=0; i<len; i++) {
			sum = sum + input[i];
			if(map.containsKey(sum)) {
				int localMax = i - (int)map.get(sum)+1;
				if(localMax > max) {
					max = localMax;
					output[0] = (int)map.get(sum)+1; // +1 coz add index after sum matches.
					output[1] = i;
				}
			} else {
				map.put(sum,i);
			}
		}
		return output;
	}
}