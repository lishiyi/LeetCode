Rotate Image 
My Submissions Question Solution 
Total Accepted: 49665 Total Submissions: 152430 Difficulty: Medium
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?


public class Solution {
    public void rotate(int[][] matrix) {
        
        if(matrix == null){
        	return;
        }

        /*
        	\
        	 \    Filp from bottom-left to top-right   
        	  \
        */
        for(int i = 0; i < matrix.length; i++){
        	for(int j = i + 1; j < matrix.length; j++){

        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = temp;
        	}
        }
        /*
			|
			|    Filp from left to right
			|
        */
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix.length / 2; j++){

        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[i][matrix.length - 1 - j];
        		matrix[i][matrix.length - 1 - j] = temp;
        	}
        }
    }
}