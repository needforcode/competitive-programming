import java.util.Arrays;

public class SumClosest {
	
	public static void main(String[] args) {
		int[] input = new int[]{-1, 2, 1, -4};
		System.out.println(Arrays.toString(sumClosest(input, 1)));
	}

	public static int[] sumClosest(int[] input, int target) {

		Arrays.sort(input);

		int[] output = new int[3];
		int closest = Integer.MAX_VALUE;
		int sum = 0;

		for(int i=0; i<input.length; i++) {
			sum = input[i]; // 1st
			int low = i+1; int high = input.length-1;
			while(low < high) {
				sum =  sum + input[low] - input[high]; // 2nd & 3rd

				if(Math.abs(target-Math.abs(sum)) < closest) {
					closest = Math.abs(sum);
					output[0] = input[i];
					output[1] = input[low];
					output[2] = input[high];
				}

				if(sum == target) {
					return output;
				}

				if(sum < target) {
					low++;
				} else {
					high--;
				}
			}
		}
		return output;
	}
}