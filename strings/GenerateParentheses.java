import java.util.*;

public class GenerateParentheses {

	static List<String> output = new ArrayList<String>();

	public static void main(String[] args) {
		for(String i: generateParentheses(3)) {
			System.out.println(i);
		}
	}

	public static List<String> generateParentheses(int max) {
		return generateParentheses(0,0,max,"");
	}

	public static List<String> generateParentheses(int open, int close, int max, String str) {
		if(open == max && close == max) {
			output.add(str);
		}
		if(open < max) generateParentheses(open+1, close, max, str+"(");
		if(open > close && close < max ) generateParentheses(open, close+1, max, str+")");

		return output;
	}
}