/**
Input: Sort 0's, 1's and 2's.
[0,0,1,1,2,2]
*/

import java.util.*;

public class SortColors {
	
	public static void main(String[] args) {
		int[] input = new int[]{1,0,2,0,1,1,2,0,1,0,2,0,0,1,0};
		sortTwoPass(input);
		System.out.println(Arrays.toString(input));
	}

	public static void sortTwoPass(int[] input) {
		if(input == null || input.length == 1) {
			return;
		}

		int i = 0;
		int zero = 0; // pointer where to keep next 0 found.
		int two = input.length-1; // pointer where to keep next 2 found.
		while(i <= two) {
			if(input[i] == 2) swap(input, i, two--);
			if(input[i] == 0) swap(input, i, zero++);
			i++;
		}
	}

	public static void swap(int[] input, int i, int j) {
		int temp = input[j];
		input[j] = input[i];
		input[i] = temp;
	}
}