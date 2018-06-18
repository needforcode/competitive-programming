/**
LeetCode

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", find if is in board and return true.
*/

public class WordSearchMatrix {

	static boolean ret = false;
	
	public static void main(String[] args) {

		char[][] mat = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String str = "ABCCED";

		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				boolean[][] visited = new boolean[mat.length][mat[0].length];
				ret = wordSearch(i, j, mat, str, visited);
				if(ret == true) {
					break;
				}
			}
			if(ret == true) {
					break;
				}
		}
		System.out.println("output: " + ret);
	}

	public static boolean wordSearch(int i, int j, char[][] mat, String str, boolean[][] visited) { 

		if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length) {
			return false;
		}

		if(str.length() == 0) {
			return true;
		}

		if(visited[i][j] == true) {
			return false;
		}
		visited[i][j] = true;

		
		if(str.charAt(0) == mat[i][j]) {
			return wordSearch(i+1, j, mat, str.substring(1), visited) || wordSearch(i, j+1, mat, str.substring(1), visited) ||
			wordSearch(i-1, j, mat, str.substring(1), visited) || wordSearch(i, j-1, mat, str.substring(1), visited);
		} 
		
		return false;	
	}
}