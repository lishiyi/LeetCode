200. Number of Islands 
My Submissions Question
Total Accepted: 38083 Total Submissions: 141486 Difficulty: Medium
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3

public class Solution {

    public int numIslands(char[][] grid) {
        
        if(grid == null || grid.length == 0 || grid[0].length == 0){
        	return 0;
        }

        int result = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(grid[i][j] == '1'){
        			result++;
        			search(grid, i, j, m, n);
        		}
        	}
        }
        return result;
    }

    private void search(char[][] grid, int i, int j, int m, int n){

    	if(i < 0 || i >= m) return;
    	if(j < 0 || j >= n) return;
    	if(grid[i][j] == '0') return;

    	grid[i][j] = '0';
    	search(grid, i + 1, j, m, n);
    	search(grid, i - 1, j, m, n);
    	search(grid, i, j + 1, m, n);
    	search(grid, i, j - 1, m, n);
    }
}