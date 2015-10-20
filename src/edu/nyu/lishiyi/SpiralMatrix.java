Spiral Matrix 
My Submissions Question Solution 
Total Accepted: 42902 Total Submissions: 203868 Difficulty: Medium
Given a matrix of m x n elements (m rows, n columns), 
return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList();

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        	return result;
        }

        int beginRow = 0;
        int endRow = matrix.length - 1;
        int beginCol = 0;
        int endCol = matrix[0].length - 1;

        while(beginRow <= endRow && beginCol <= endCol){

        	//Right
        	for(int j = beginCol; j <= endCol; j++){
        		result.add(matrix[beginRow][j]);
        	}
        	beginRow++;
        	//Down

        	for(int i = beginRow; i <= endRow; i++){
        			result.add(matrix[i][endCol]);
        	}
        	endCol--;
        	//Left
        	if(beginRow <= endRow){

        		for(int j = endCol; j >= beginCol; j--){
        			result.add(matrix[endRow][j]);
        		}
        	}
        	endRow--;
        	//Up
        	if(beginCol <= endCol){

        		for(int i = endRow; i >= beginRow; i--){
        			result.add(matrix[i][beginCol]);
        		}
        	}
        	beginCol++;
        }

        return result;
    }
}