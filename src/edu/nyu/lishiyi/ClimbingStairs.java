Climbing Stairs
Total Accepted: 67163 Total Submissions: 194904 My Submissions Question Solution 
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?

public class Solution {
    public int climbStairs(int n) {
        
        if(n <= 0){

        	return 0;
        }
        else if(n == 1){

        	return 1;
        }

        int[] sum = new int[n];
        sum[0] = 1;
        sum[1] = 2;

        for(int i = 2; i < n; i++){

        	sum[i] = sum[i - 1] + sum[i - 2];
        }

        return sum[n - 1];
    }
}