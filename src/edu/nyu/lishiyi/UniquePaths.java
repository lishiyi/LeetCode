Unique Paths 
Total Accepted: 57686 Total Submissions: 174112 My Submissions Question Solution 
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. 
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in 
	the diagram below).

How many possible unique paths are there?


Above is a 3 x 7 grid. How many possible unique paths are there?

Note: m and n will be at most 100.

public class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] sum = new int[m + 1][n + 1];
        sum[0][1] = 1;

        for(int i = 1; i <= m; i++){
        	for(int j = 1; j <= n; j++){

        		sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
        	}
        }

        return sum[m][n];
    }
}