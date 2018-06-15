import java.util.*;

public class LargestNumber {
	
	public static void main(String[] args) {
		int[] input = new int[]{10,2,32};
		largestNumber(input);
	}

	public static void largestNumber(int[] input) {

		if(input == null || input.length == 1) {
			return;
		}

		// convert to string so comparator would work easily.
		String[] str = new String[input.length];
		for(int i=0; i<input.length; i++) {
			str[i] = String.valueOf(input[i]);
		} 

		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String i1, String i2) {
				String s1 = i1+""+i2;
				String s2 = i2+""+i1;
				System.out.println("s1: " + s1 + " s2: " + s2 + " comp: " + s1.compareTo(s2));
				return s1.compareTo(s2);
			}
		});

		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i]);
		}
	}
}