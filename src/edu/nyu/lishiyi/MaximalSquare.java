Maximal Square 
My Submissions Question Solution 
Total Accepted: 12733 Total Submissions: 63297 Difficulty: Medium
Given a 2D binary matrix filled with 0's and 1's, find the largest square 
containing all 1's and return its area. '

For example, given the following matrix:

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
Return 4.


public class Solution {
    public int maximalSquare(char[][] matrix) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){

        	return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        //f[i][j]:   the largest Square's edge from here. 
        int[][] f = new int[m + 1][n + 1];
        int max = 0;

        for(int i = 1; i <= m; i++){
        	for(int j = 1; j <= n; j++){

        		if(matrix[i - 1][j - 1] == '1'){
        			//if this block is '1', check ←,↑,←↑, 3 squares' edge.
        			//    if all of them are the same. +1 at them
        			//    else choose the min square +1
        			f[i][j] = Math.min(Math.min(f[i - 1][j - 1], f[i][j - 1]), f[i - 1][j]) + 1;
        			max = Math.max(f[i][j], max);
        		}
        		//if this block is '0', use the default value 0. Because at/from here,
        		//no squares could be formed.
        	}
        }

        return max * max;
    }
}