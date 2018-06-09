public class MinRotatedSortedArray {
	public static void main(String[] args) {
		System.out.println(findMin(new int[]{12,15,19,4,9,11}));
	}

	public static int findMin(int[] arr) {

		int low = 0;
		int high = arr.length-1;

		if(arr.length == 0) {
			return -1;
		}

		if(arr[low] < arr[high]) {
			return arr[low];
		}
		int mid;
		while(low < high) {
			mid = low + ((high-low)/2);
			if(arr[mid] > arr[high]) {
				low = mid+1;
			} else {
				high = mid;
			}
		}
		return arr[low];
	}
}