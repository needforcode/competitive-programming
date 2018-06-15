/**
Find if s is subsequence of t.
s = "abc", t = "ahbgdc"
*/

public class IsSubsequence {
	
	public static void main(String[] args) {
		System.out.println("result: " + subSequence("abc", "ahbgdc"));
		System.out.println("result: " + subSequence("axc", "ahbgdc"));
	}

	public static boolean subSequence(String s, String t) {

		if(s == null || t == null) {
			return false;
		}

		int sLen = s.length();
		int tLen = t.length();

		int sIndex = 0;
		int tIndex = 0;
		while(sIndex < sLen && tIndex < tLen) {
			if(s.charAt(sIndex) == t.charAt(tIndex)) {
				sIndex++;
				if(sIndex == sLen) {
					return true;
				}
			}
			tIndex++;
		}
		return false;
	}
}