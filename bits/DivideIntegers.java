public class DivideIntegers {
	public static void main(String[] args) {
		System.out.println(divideIntegers(101,10));
	}

	public static int divideIntegers(int dividend, int divisor) {
		if(divisor == 0) {
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}

		if((dividend == 0) || (divisor > dividend)) {
			return 0;
		} else if(divisor == dividend) {
			return 1;
		}

		int count = 1;

		while(dividend > divisor) {
			divisor = divisor << 1;
			count = count << 1;
		}

		divisor >>= 1;
		count >>= 1;

		divisor = divisor/count;
		dividend = dividend - (divisor * count);

		while(dividend > 0) {
			dividend = dividend - divisor;
			count++;
		}

		if(dividend < 0) {
			count--;
		}

		return count;
	}
}