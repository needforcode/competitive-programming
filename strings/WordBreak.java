/**
Find if the string is formed from the words in dict.
str = tomsandjerry 
wordDict = ["tom", "and", "jerry", "toms", "berry"]
*/

import java.util.*;

public class WordBreak {

	static boolean result = false;
	
	public static void main(String[] args) {
		Set set = new HashSet<String>() {{
			add("tom");
			add("and");
			add("jerry");
			add("toms");
			add("berry");
		}};

		String str = "tomsandjerry";

		System.out.println("result: " + wordBreak(str, set));
	}

	public static boolean wordBreak(String str, Set set) {
		
		if(str.length() == 0) {
			return true;
		}
		int i = 0;
		for(int j = i+1; j <= str.length(); j++) {
			if(set.contains(str.substring(i,j))) {
				result = result || wordBreak(str.substring(j,str.length()), set);
			} 
		}

		return result;
	}
}