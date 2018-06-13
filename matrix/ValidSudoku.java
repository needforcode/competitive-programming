public class ValidSudoku {
	
	public static void main(String[] args) {
		int[][] sudoku = {{4,2,9,8,1,3,5,6,7}, {5,1,6,4,7,2,9,3,8}, {7,8,3,6,5,9,2,4,1},
                 {6,7,2,1,3,4,8,5,9}, {3,9,5,2,8,6,1,7,4}, {8,4,1,7,9,5,6,2,3}, 
                 {1,5,8,3,6,7,4,9,2}, {9,3,4,5,2,8,7,1,6}, {2,6,7,9,4,1,3,8,5}};
		System.out.println(validSudoku(sudoku));
	}

	public static boolean validSudoku(int[][] sudoku) {
		if(sudoku == null || sudoku.length == 0) {
			return false;
		}

		short[] rows = new short[9];
		short[] cols = new short[9];
		short[] boxes = new short[9];

		for(int i=0; i<sudoku.length; i++) {
			for(int j=0; j<sudoku[0].length; j++) {

				short val = (short)(1 << (sudoku[i][j]-1));
				
				if((val & rows[i]) >= 1) {
					return false;
				} else if((val & cols[j]) >= 1) {
					return false;
				} else if((val & boxes[(3*(i/3))+(j/3)]) >=1) {
					return false;
				}

				rows[i] |= val;
				cols[j] |= val;
				boxes[(3*(i/3))+(j/3)] |= val;				
			}
		}
		return true;
	}
}