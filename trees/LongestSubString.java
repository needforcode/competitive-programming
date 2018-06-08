import java.util.*;

public class LongestSubString {
	public static void main(String[] args) {
		System.out.println(longestSubString("ampaxop"));
	}

	public static String longestSubString(String str) {
			if(str.length() == 0 || str.length() == 1) {
				return str;
			}

			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
			String longestStr = "";

			for(int i=0; i< str.length(); i++) {
				for(int j=i; j< str.length(); j++) { 
					Character ch = str.charAt(j);    
					if(!map.containsKey(ch)) {
						map.put(ch,j);           
					} else {
						i=map.get(ch)+1;         
						map.put(ch,j);
						continue;
					}
					if(longestStr.length() < (j-i+1)) {
							longestStr = str.substring(i,j+1);  
					}
				}
			}
			return longestStr;
	}
}
