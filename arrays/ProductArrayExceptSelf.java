/**
Perform product of array except self with out division operator.
*/

import java.util.*;

public class ProductArrayExceptSelf {
	
	public static void main(String[] args) {
		int[] input = new int[]{1,2,3,4};
		System.out.println(Arrays.toString(productArrayExceptSelf(input)));
	}

	public static int[] productArrayExceptSelf(int[] input) {
		if(input == null) {
			return new int[]{};
		}

		int[] output = new int[input.length];

		int carryProduct = 1;
		int revCarry = 0;
		int temp = 0;
		for(int i=0; i<input.length; i++) {
			if(i != input.length -1) {
				temp = input[i];
			} else {
				revCarry = input[i];
			}
			output[i] = carryProduct;
			carryProduct = carryProduct * temp;
		}

		int carryRevProduct = revCarry;
		for(int i=input.length -2; i>=0; i--) {
			output[i] = carryRevProduct * output[i];
			carryRevProduct = carryRevProduct * input[i];
		}

		return output;
	}
}