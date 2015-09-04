Triangle Total Accepted: 48258 Total Submissions: 175858 My Submissions Question Solution 
Given a triangle, find the minimum path sum from top to bottom. 
Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

Note:
Bonus point if you are able to do this using only O(n) extra space, 
where n is the total number of rows in the triangle.

public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        
        if(triangle == null || triangle.size() == 0){

        	return 0;
        }

        int n = triangle.size();
        //make a new array
        int[][] sum = new int[n][n];

        //Initialize the last row(the same as triangle)
        for(int i = 0; i < n; i++){

        	sum[n - 1][i] = triangle.get(n - 1).get(i);
        }

        //From the 2nd last row to the top
        for(int i = n - 2; i >= 0; i--){ 
        	//From the 1st to the last for each row
        	for(int j = 0; j <= i; j++){
        		//The sum = the min of 2 elements below + (this)
        		sum[i][j] = Math.min(sum[i + 1][j], sum[i + 1][j + 1]) + triangle.get(i).get(j);
        	}
        }

        //The top will be the min path sum
        return sum[0][0];
    }
}