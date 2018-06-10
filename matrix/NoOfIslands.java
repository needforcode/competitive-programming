public class NoOfIslands {
	
	public static void main(String[] args) {

		int[][] input = new int[][]{
			{1,1,0,0,0},
			{1,1,0,0,0},
			{0,0,1,0,0},
			{0,0,0,1,1}
		};
		System.out.println(islands(input));
	}

	public static int islands(int[][] islands) {

		int rows = islands.length;
		int cols = (rows >= 1) ? islands[0].length : 0;
		int count = 0;

		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(islands[i][j] == 0) {
					continue;
				} else {
					count++;
					islandDFS(islands,i,j);
				}
			}
		}
		return count;
	}

	public static void islandDFS(int[][] islands, int i, int j) {
		if(i < 0 || j < 0 || i >= islands.length || j >= islands[0].length) {
			return;
		}

		if(islands[i][j] == 1) {
			islands[i][j]=0;
			islandDFS(islands,i+1,j);
			islandDFS(islands,i,j+1);
			islandDFS(islands,i,j+1);
			islandDFS(islands,i-1,j);
		}
	}
}