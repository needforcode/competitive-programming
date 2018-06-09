public class MaxProductSubArray {
	public static void main(String[] args) {
		int[] arr = new int[]{2,4,-2,-9,0,5,2};
		System.out.println(maxProduct(arr));
	}

	public static int maxProduct(int[] arr) {
		Integer currMax = arr[0];
		Integer currMin = arr[0];
		Integer globalMax = currMax;

		for(int i=1; i< arr.length; i++) {
			// if < 0 reverse min and max that are being saved.
			if(arr[i] < 0) {
				Integer temp = currMax;
				currMax = currMin;
				currMin = temp;
			}

			currMax = Math.max(arr[i], currMax*arr[i]);
			currMin = Math.min(arr[i], currMax*arr[i]);
			// update globalMax every time.
			if(currMax > globalMax) {
				globalMax = currMax;
			}
		}

		return globalMax;
	}
}