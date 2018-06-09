public class SearchRotatedSortedArray {
	
	public static void main(String[] args) {
		System.out.println(searchRotatedSortedArray(new int[]{4,5,6,7,1,2,3}, 6));
	}

	public static int searchRotatedSortedArray(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}

		if(arr.length == 1) {
			if(arr[0] == target) {
				return 0;
			}
		}

		int low = 0;
		int high = arr.length-1;
		int mid;
		while(low < high) {
			mid = low + ((high-low)/2);
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid]<arr[high]) {
				if(arr[mid] < target && target <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid -1;
				}
			} else {
				if(arr[low] <= target && target < arr[mid]) {
					high = mid -1;
				} else {
					low = mid + 1;
				}
			}
		}
		
		int ret = (arr[low] == target) ? low : -1;
		return ret;
	}
}