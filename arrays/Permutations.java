import java.util.*;
import java.lang.*;

public class Permutations {

	static List output = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		
		int[] input = new int[]{1,2,3,4};

		List<List<Integer>> out = permutate(new ArrayList<Integer>(), input, input.length, 0);
		for(List<Integer> row : out) {
			System.out.println(Arrays.toString(row.toArray()));
		}
	}

	public static List<List<Integer>> permutate(ArrayList<Integer> tempList, int[] input, int size, int start) {
		if(tempList.size() == size) {
			output.add(new ArrayList<Integer>(tempList));
		} else {
				for(int i=start; i<input.length; i++) {
					if(tempList.contains(input[i])) {
						continue;
					}
					tempList.add(input[i]);
					permutate(tempList, input, size, 0);
					tempList.remove(tempList.size()-1);
				}
		}

		return output;
	}
}