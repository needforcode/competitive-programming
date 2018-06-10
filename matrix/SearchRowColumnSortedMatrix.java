public class SearchRowColumnSortedMatrix {
	public static void main(String[] args) {

		int[][] matrix = new int[][]{
			{1,   4,  7, 11, 15},
			{2,   5,  8, 12, 19},
			{3,   6,  9, 16, 22},
			{10, 13, 14, 17, 24},
			{18, 21, 23, 26, 30}
		};

		System.out.println(stairCaseSearch(matrix, 14));
		
	}

	public static boolean stairCaseSearch(int[][] matrix, int target) {

		int rows = matrix.length; int cols = matrix[0].length;
		int row = 0; int col = cols-1;
		while(row <= rows-1 && col >= 0) {
			if(matrix[row][col] < target) {
				row++;
			} else if (matrix[row][col] > target) {
				col--;
			} else {
				return true;
			}
		}

		return false;
	}
}