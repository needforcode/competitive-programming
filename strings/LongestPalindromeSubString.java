import java.util.*;

public class LongestPalindromeSubString {
	public static void main(String[] args) {
		System.out.println(longestPalindromeSubString("abababa"));
	}

	private static String longestPalindromeSubString(String str) {
		if(str.length() == 0 || str.length() == 1) {
			return str;
		}

		int minP=0, maxP=0;

		boolean[][] dp = new boolean[str.length()][str.length()];

		// for i==j condition single only single character true always.
		for(int i=0; i<str.length(); i++) {
			dp[i][i]=true;
			minP=i;maxP=i;
		}

		// for 2 char string. equal is a[i]=a[j].
		for(int i=0; i<str.length()-1; i++) {
			int j=i+1;
			if(str.charAt(i)==str.charAt(j)) {
				dp[i][j]=true;
				minP=i;maxP=j;
			}
		}

		// for more than 2 char string.
		for(int k=2; k<str.length(); k++) {
			for(int i=0; i<str.length()-k; i++) {
				int j=i+k;
				if(dp[i+1][j-1] && str.charAt(i)==str.charAt(j)) {
					dp[i][j]=true;
					minP=i;maxP=j;
				}
			}
		}

		return str.substring(minP,maxP+1);
	}
}