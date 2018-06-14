public class BuyAndSellStock {
	
	public static void main(String[] args) {
		int[] input = new int[]{100, 180, 260, 310, 40, 535, 695};
		System.out.println(buyAndSellStock(input));
	}

	public static int buyAndSellStock(int[] input) {

		int len = input.length;
		if(input == null || input.length == 1 ) {
			return -1;
		}

		int min = 0; 
		int profit = 0;
		int totalProfit = 0; 
		for(int i=1; i<len; i++) {  
			if(input[i-1] < input[i]) {
				profit = input[i] - input[min];
			} else {
				min = i;
				totalProfit = totalProfit + profit;
				profit = 0;
			}

		}
		if (profit != 0) {
			totalProfit = totalProfit + profit;
		}
		return totalProfit;
	}
}