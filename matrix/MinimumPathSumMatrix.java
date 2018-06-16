import java.util.*;

public class MinimumPathSumMatrix {

	static int globalMinPathLen = Integer.MAX_VALUE;
	static String globalPath;
	
	public static void main(String[] args) {
		int[][] input = new int[][]{{1,3,1},
									{1,5,1},
									{4,2,1}};
		System.out.println(minPathSum(input, 0, 0, 3, 3, "", 0));
		System.out.println("path: " + globalPath);
	}

	public static int minPathSum(int[][] input, int row, int col, int rowL, int colL, String path, int sum) {
		
		if(row < 0 || col < 0 || row >= rowL || col >= colL) {
			return 0;
		}

		if((sum+input[row][col] > globalMinPathLen)) {
			return 0;
		} else {
			path = path + "->" + input[row][col];
			sum = sum + input[row][col];
			if((row == rowL-1) && (col == colL-1)) {
				if(sum < globalMinPathLen) {
					globalMinPathLen = sum;
					globalPath = path;
					path = "";
				}
			}
		}
			
		minPathSum(input, row+1, col, rowL, colL, path, sum);
		minPathSum(input, row, col+1, rowL, colL, path, sum);

		return globalMinPathLen;	
	}
}