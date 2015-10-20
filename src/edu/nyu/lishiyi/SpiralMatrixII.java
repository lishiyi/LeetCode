Spiral Matrix II 
My Submissions Question Solution 
Total Accepted: 39396 Total Submissions: 120973 Difficulty: Medium
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]

public class Solution {
    public int[][] generateMatrix(int n) {
     	
    	int[][] result = new int[n][n];

    	int num = 1;
    	int rowBegin = 0;
    	int rowEnd = n - 1;
    	int colBegin = 0;
    	int colEnd = n - 1;

    	while(rowBegin <= rowBegin && colBegin <= colEnd){

    		for(int j = colBegin; j <= colEnd; j++){
    			result[rowBegin][j] = num;
    			num++;
    		}
    		rowBegin++;

    		for(int i = rowBegin; i <= rowEnd; i++){
    			result[i][colEnd] = num;
    			num++;
    		}
    		colEnd--;

    		if(rowBegin <= rowEnd){

    			for(int j = colEnd; j >= colBegin; j--){
    				result[rowEnd][j] = num;
    				num++;
    			}
    		}
    		rowEnd--;

    		if(colBegin <= colEnd){

    			for(int i = rowEnd; i >= rowBegin; i--){
    				result[i][colBegin] = num;
    				num++;
    			}
    		}
    		colBegin++;

    	}

    	return result;

    }
}