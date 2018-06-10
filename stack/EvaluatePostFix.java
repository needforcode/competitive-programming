import java.util.Stack;

public class EvaluatePostFix {
	
	public static void main(String[] args) {
		String[] input = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		System.out.println("output:"+evaluatePostFix(input));
	}

	public static Integer evaluatePostFix(String[] input) {

		int len = input.length;

		Stack stack = new Stack<Integer>();

		int i = 0;
		while(i < len) {
			String str = input[i];
			if(str.matches("-?[0-9]+")) {
				stack.push(new Integer(input[i]));
			} else {
				int op2 = (int)stack.pop(); // 1st one should be operand 2.
				int op1 = (int)stack.pop(); 
				switch(str) {
					case "+" : stack.push(op1 + op2); break;
					case "-" : stack.push(op1 - op2); break;
					case "*" : stack.push(op1 * op2); break;
					case "/" : stack.push(op1 / op2); break;
				} 
			}
			i++;
		}

		return (Integer)stack.pop();
	}
}