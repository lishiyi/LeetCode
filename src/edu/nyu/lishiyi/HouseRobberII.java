House Robber II 

My Submissions Question Solution 
Total Accepted: 11557 Total Submissions: 42778 Difficulty: Medium
Note: This is an extension of House Robber.

After robbing those houses on that street, the thief has found himself a new 
place for his thievery so that he will not get too much attention. This time, 
all houses at this place are arranged in a circle. That means the first house is 
the neighbor of the last one. Meanwhile, the security system for these houses remain 
the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.


public class Solution {
    public int rob(int[] nums) {
        	
    	if(nums == null || nums.length == 0){

    		return 0;
    	}

    	int n = nums.length;

    	if(n == 1){
    		return nums[0];
    	}
    	if(n == 2){
    		return Math.max(nums[0], nums[1]);
    	}
    	if(n == 3){
    		return Math.max(Math.max(nums[0], nums[1]), nums[2]);
    	}
    	// 2 Arrays for DP
    	int[] fromFirstHouse = new int[n];
    	int[] fromSecondHouse = new int[n];
    	fromFirstHouse[0] = nums[0];
    	fromFirstHouse[1] = Math.max(nums[0], nums[1]);
    	fromSecondHouse[1] = nums[1];
    	fromSecondHouse[2] = Math.max(nums[1], nums[2]);

    	for(int i = 2; i < n - 1; i++){

    		fromFirstHouse[i] = Math.max(fromFirstHouse[i - 2] + nums[i], fromFirstHouse[i - 1]);
    		fromSecondHouse[i + 1] = Math.max(fromSecondHouse[i - 1] + nums[i + 1], fromSecondHouse[i]);
    	}

    	return Math.max(fromFirstHouse[n - 2], fromSecondHouse[n - 1]);
    }
}