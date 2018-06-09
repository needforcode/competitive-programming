public class Power {
	public static void main(String[] args) {
		System.out.println(power(2,3));
	}

	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}

		if(n == 1 || x == 1) {
			return x;
		}

		int pow = 1;

		while(n > 0) {
			if((n & 1) == 1) {
				pow = pow * x;
			}

			n = n >> 1;
			x = x * x;
		}

		return pow;
	}
}