public class JumpGame {
	
	public static void main(String[] args) {
		System.out.println(reach(new int[]{2,3,1,1,4}));
	}

	public static boolean reach(int[] input) {

		if(input == null) {
			return false;
		} 

		int reach = 0;
		for(int i=0; i<input.length; i++) {
			if(i > reach) {
				return false;
			}
			reach = Math.max(reach, i+input[i]);
			if(reach > input.length-1) {
				return true;
			}
		}
		return false;
	}
}