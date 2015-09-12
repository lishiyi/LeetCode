Unique Paths II 
My Submissions Question Solution 
Total Accepted: 44594 Total Submissions: 159602 Difficulty: Medium
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.

Note: m and n will be at most 100.


public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0){

        	return 0;
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] sum = new int[m][n];
        
        for(int i = 0; i < m; i++){

        	if(obstacleGrid[i][0] == 1){

        		break;
        	} 

        	sum[i][0] = 1;
        }

        for(int j = 1; j < n; j++){

        	if(obstacleGrid[0][j] == 1){

        		break;
        	} 

        	sum[0][j] = 1;
        }


        for(int i = 1; i < m; i++){
        	for(int j = 1; j < n; j++){

        		sum[i][j] = obstacleGrid[i][j] == 1 ? 0 : sum[i][j - 1] + sum[i - 1][j];
        	}
        }

        return sum[m - 1][n - 1];
    }
}