public class MaxSubArraySum {
	
	public static void main(String[] args) {
		int[] input = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(subArraySum(input));
	}

	public static int subArraySum(int[] input) {
		int len = input.length;

		if(len == 0) {
			return Integer.MIN_VALUE;
		} else if (len == 1) {
			return input[0];
		}

		int globalMax = 0;
		int localMax = 0;
		for(int i=0; i<len; i++) {
			localMax = Math.max(localMax + input[i], input[i]);
			globalMax = Math.max(localMax, globalMax);
		}

		return globalMax;
	}
}