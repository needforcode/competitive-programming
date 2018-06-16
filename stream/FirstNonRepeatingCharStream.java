import java.util.*;

public class FirstNonRepeatingCharStream {

	public static Map map = new HashMap<Character, Integer>();
	public static Queue queue = new LinkedList<Character>();
	
	public static void main(String[] args) {
		char[] input = new char[]{'a', 'b', 'c', 'd', 'a', 'b'};
		for(int i=0; i<input.length; i++) {
			System.out.println("From 0th to " + i +" th index:" + firstNonRep(input[i]));
		}
	}

	public static Character firstNonRep(char ch) {
		
		System.out.println(" started char: " + ch);
		if(map.containsKey(ch)) {
			int val = (Integer)map.get(ch);
			map.put(ch, val+1);

			while(!queue.isEmpty() && (Integer)map.get(queue.peek()) > 1) {
				queue.remove();
			}
		} else {
			map.put(ch,1);
			queue.add(ch);
		}

		Character ret = (Character)queue.peek();

		return ret;
	}
}