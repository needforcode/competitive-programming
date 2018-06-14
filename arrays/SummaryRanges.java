import java.util.*;

public class SummaryRanges {

	static List<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(summaryRanges(new int[]{0,1,2,4,5,7}).toArray()));
	}

	public static List<String> summaryRanges(int[] input) {

		if(input == null || input.length == 0) {
			return result;
		}

		int start = -1;   
		int end = -1; 
		for(int i=0; i<input.length; i++) {
			if(start == -1) {
				start = input[i];  // start = 0
				continue;
			} else {
				if(input[i] - input[i-1] == 1) {
					end = input[i];  // end = 2
					continue;
				} else {
					result.add(start + "->" + end);
					start = input[i];
					end = -1;
				}
			}
		}

		if(start != -1 && end != -1) {
			result.add(start + "->" + end);
		} else if(start != -1) {
			result.add(start + "");
		}
		return result;
	}
}