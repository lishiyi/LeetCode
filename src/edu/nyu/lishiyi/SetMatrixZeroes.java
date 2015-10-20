Set Matrix Zeroes 
My Submissions Question Solution 
Total Accepted: 49464 Total Submissions: 154996 Difficulty: Medium
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.


public class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean frow = false;
        boolean fcol = false;

        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){

        		if(matrix[i][j] == 0){
        			matrix[0][j] = 0;
        			matrix[i][0] = 0;
        			if(i == 0) frow = true;
        			if(j == 0) fcol = true;
        		}
        	}
        }
        for(int i = 1; i < m; i++){
        	for(int j = 1; j < n; j++){

        		if(matrix[0][j] == 0 || matrix[i][0] == 0){
        			matrix[i][j] = 0;
        		}
        	}
        }

        if(frow){
        	for(int j = 0; j < n; j++){
        		matrix[0][j] = 0;
        	}
        }
        if(fcol){
        	for(int i = 0; i < m; i++){
        		matrix[i][0] = 0;
        	}
        }
    }
}