Minimum Path Sum 
My Submissions Question Solution 
Total Accepted: 47969 Total Submissions: 148113 Difficulty: Medium
Given a m x n grid filled with non-negative numbers, 
find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

public class Solution {
    public int minPathSum(int[][] grid) {
        
        if(grid == null || grid.length == 0 || grid[0].length == 0){

        	return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++){

        	sum[i][0] = Integer.MAX_VALUE;
        }
        for(int j = 0; j <= n; j++){

        	sum[0][j] = Integer.MAX_VALUE;
        }
        sum[0][1] = 0;
        sum[1][0] = 0;

        for(int i = 1; i <= m; i++){
        	for(int j = 1; j <= n; j++){

        		sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i - 1][j - 1];
        	}
        }

        return sum[m][n];
    }
}