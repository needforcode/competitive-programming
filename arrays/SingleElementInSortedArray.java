public class SingleElementInSortedArray {
	
	public static void main(String[] args) {
		System.out.println(singleElement(new int[]{1,1,2,2,3,4,4,8,8}));
	}

	public static int singleElement(int[] arr) {

		int len = arr.length;

		if(len == 0) {
			return -1;
		}

		int result=0;
		for(int i=0; i<len; i++) {
			result = result ^ arr[i];
		}

		return result;
	}
}