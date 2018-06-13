
public class MultiplyStrings {
	public static void main(String[] args) {

		String s1 = "123";
		String s2 = "234";

		System.out.println(multiplyStrings(s1, s2));
	}


 	public static int multiplyStrings(String s1, String s2) {
		if(s1 == null || s2 == null || s1 == "0" || s2 == "0") {
			return 0;
		}

		int s1_len = s1.length();
		int s2_len = s2.length();

		int[] output = new int[s1_len+s2_len-1];
		int out=0;

		for(int i = s2_len-1; i >= 0; i--) {
			for(int j = s1_len-1; j >= 0; j--) {
				int prod = (Character.getNumericValue(s1.charAt(j)) * Character.getNumericValue(s2.charAt(i)));
				int k = i+j;
				while(prod > 0) {
					int sum = output[k]+prod;
					output[k] = (sum)%10;
					prod = sum/10;
					k--;
				}
			}
		}

		for(int i: output) {
			out = out * 10 + i;
		}
		return out;
	}
}