import java.util.*;

public class DifferentWaystoAddParentheses {
	
	public static void main(String[] args) {
		String input = "2*3-4*5";
		List<Integer> output = waysToAddParen(input);

		for(Integer i : output) {
			System.out.println("output: " + i);
		}
	}

	public static List waysToAddParen(String input) {

		List<Integer> returnList = new LinkedList<Integer>();

		if(input == null || input.length() == 0) {

			return returnList;
		}

		if(input.length() == 1) {
			if(Character.isDigit(input.charAt(0))) {
				returnList.add(Character.getNumericValue(input.charAt(0)));
			}
		}

		Set set = new HashSet<Character>() {{
			add('*');
			add('-');
			add('+');
			add('/');
		}};

		for(int i = 0; i < input.length(); i++) {
			if(set.contains(input.charAt(i))) {
				List<Integer> left = waysToAddParen(input.substring(0,i));
				List<Integer> right = waysToAddParen(input.substring(i+1,input.length()));
				char ch = input.charAt(i);
				int result = 0;
				for(Integer j : left) {
					for(Integer k : right) {
						switch(ch) {
							case '-' : result = j - k; break;
							case '+' : result = j + k; break;
							case '*' : result = j * k; break;
							case '/' : result = j / k; break;
						}

					returnList.add(result);
					}
				}
				
			}
		} 
		return returnList;
	}
}