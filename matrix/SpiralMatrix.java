/**
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

OUTPUT: 1 2 3 6 9 8 7 4 5
*/

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		printSpiral(mat);
	}

	public static void printSpiral(int[][] mat) {

		if(mat == null || mat.length == 0) {
			System.out.println("matrix is empty");
		}

		int rows = mat.length;
		int cols = mat[0].length;
 
		if(rows == 1) {
			for(int i=0; i<rows; i++) {
				System.out.println(mat[0][i]);
			}
		} else if(cols == 1) {
			for(int j=0; j<cols; j++) {
				System.out.println(mat[j][0]);
			}
		}

		int rowStart = 0;
		int rowEnd = rows-1;
		int colStart = 0;
		int colEnd = cols-1;

		while(rowStart <= rowEnd && colStart <= colEnd) {
			for(int i=colStart; i<=colEnd; i++) {
				System.out.println(mat[rowStart][i]);
			}
			rowStart ++;

			for(int i=rowStart; i<=rowEnd; i++) {
				System.out.println(mat[i][colEnd]);
			}
			colEnd--;

			for(int i=colEnd; i>=colStart; i--) {
				System.out.println(mat[rowEnd][i]);
			}
			rowEnd--;

			for(int i=rowEnd; i>=rowStart; i--) {
				System.out.println(mat[i][colStart]);
			}
			colStart++;
		}
	}
}