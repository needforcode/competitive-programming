import java.util.*;
import java.lang.*;

public class SubSetSum {

	static List<List<Integer>> output = new ArrayList<List<Integer>>();
	
	public static void main(String[] args) {
		int[] input = new int[]{2,3,6,7};
		Arrays.sort(input);
		List<List<Integer>> out = subsetSum(input);
		for(List<Integer> l : out) {
			System.out.println(Arrays.toString(l.toArray()));
		}
	}

	public static List<List<Integer>> subsetSum(int[] input) {
		if(input == null || input.length == 0) {
			return null;
		}
		return combinationSum(input, new ArrayList<Integer>(), 7, 0);
	}

	public static List<List<Integer>> combinationSum(int[] input, List<Integer> temp, int target, int start) {
		if(target == 0) {
			output.add(new ArrayList<Integer>(temp));
		} else {
			for(int i=start; i<input.length; i++) { // 2 3 6 7
				if(target - input[i] >= 0) {
					temp.add(input[i]);
					System.out.println("target:" +target + " " + "input:"+ input[i] + " tl:" + Arrays.toString(temp.toArray()));

					combinationSum(input, temp, target-input[i], i);
					if (temp.size() != 0) temp.remove(temp.size()-1);
				} else {
					System.out.println("target:" +target + " " + "input:"+ input[i] + " tl:" + Arrays.toString(temp.toArray()));
				}
				
			}
		}
		return output;
	}
}