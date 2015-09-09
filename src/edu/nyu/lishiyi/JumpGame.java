Jump Game
Total Accepted: 53839 Total Submissions: 200238 My Submissions Question Solution 
Given an array of non-negative integers, 
you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.

public class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums == null || nums.length == 0){

        	return false;
        }

        int n = nums.length;
        boolean[] result = new boolean[n];
        result[0] = true;

        for(int i = 1; i < n; i++){

        	for(int j = 0; j < i; j++){

        		if(result[j] == true && j + nums[j] >= i){
        			result[i] = true;
        			break;
        		}
        	}
        }

        return result[n - 1];
    }
}