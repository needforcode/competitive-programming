import java.util.*;
import java.lang.Character;

public class LetterCombinationPhoneNum {
	public static void main(String[] args) {
		
		Queue queue = letterCombinations("765");

		for (Object item: queue) {
			System.out.println((String)item);
		}
	}

	public static Queue letterCombinations(String number) {

		HashMap<Integer,String> map = new HashMap()
		{{
			put(1,"");put(2,"abc");
			put(3,"def");put(4,"ghi");
			put(5,"jkl");put(6,"mno");
			put(7,"pqrs");put(8,"tuv");
			put(9,"wxyz");
		}};

		int len = number.length();

		char[] charNum = number.toCharArray();
		Queue<String> queue = new LinkedList<String>();

		if(number == "") {
			return queue;
		} 

		String st = map.get(Character.getNumericValue(charNum[0]));
		for(int i=0; i<st.length(); i++) {
			queue.add(String.valueOf(st.charAt(i)));
		}

		if(len == 1) {
			return queue;
		}

		for(int i=1; i< len; i++) {
			String num = map.get(Character.getNumericValue(charNum[i]));
			int queueLen = queue.size();
			int j=0;
			while(j<queueLen) {
				String str = queue.poll();
				for(int k=0; k<num.length(); k++) {
					queue.add(str+String.valueOf(num.charAt(k)));
				}
				j++;
			}
		}
		return queue;
	}
}