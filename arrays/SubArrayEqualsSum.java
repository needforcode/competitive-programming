import java.util.*;

public class SubArrayEqualsSum {
	
	public static void main(String[] args) {
		int[] input = new int[]{1, 4, 20, 3, 10, 5};
		System.out.println(Arrays.toString(subArrayEqualsSum(input, 33)));
	}

	public static int[] subArrayEqualsSum(int[] input, int target) {

		int len = input.length;

		int sum = input[0];
		int i=0;
		int j=1;

		while(j < len) {
			if(sum == target) {
				return new int[]{i,j-1};
			}
			sum = sum + input[j++];
			while(sum > target) {
				sum = sum - input[i++];
			}
		}

		return new int[]{-1,-1};
	}
}