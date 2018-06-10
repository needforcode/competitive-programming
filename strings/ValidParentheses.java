import java.util.Stack;

public class ValidParentheses {
	
	public static void main(String[] args) {
		String str = "{}()[]";
		System.out.println(validParentheses(str));
	}

	public static boolean validParentheses(String str) {
		if(str == null || str.length() == 1 || str.trim() == "") {
			return false;
		}

		Stack stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);

			switch(ch) {
				case '{': stack.push('}'); break;
				case '[': stack.push(']'); break;
				case '(': stack.push(')'); break;
				case '}': if (stack.isEmpty() || ((Character)stack.pop()).charValue() != '}') {
								return false;
							} break;
				case ']': if(stack.isEmpty() || ((Character)stack.pop()).charValue() != ']') {
								return false;
							} break;
				case ')': if(stack.isEmpty() || ((Character)stack.pop()).charValue() != ')') {
								return false;
							} break;
				default: return false;
			}
 		}

 		if(!stack.isEmpty()) {
 			return false;
 		}
 		return true;
	}
}