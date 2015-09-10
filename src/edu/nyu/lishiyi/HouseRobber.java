House Robber

Total Accepted: 31188 Total Submissions: 105082 My Submissions Question Solution 
You are a professional robber planning to rob houses along a street. 
Each house has a certain amount of money stashed, the only constraint stopping you from 
robbing each of them is that adjacent houses have security system connected and it will 
automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.

Credits:
Special thanks to @ifanchu for adding this problem and creating all test cases. 
Also thanks to @ts for adding additional test cases.

public class Solution {
    public int rob(int[] nums) {
        
    	if(nums == null || nums.length == 0){

    		return 0;
    	}
    	//If only 1 house.
    	if(nums.length == 1){

    		return nums[0];
    	}
    	//Max amount can be robbed for first i houses.
        int[] f = new int[nums.length];
        //Initial
        f[0] = nums[0];
        // For 2 houses choose the larger.
        f[1] = Math.max(nums[0], nums[1]);
        //For more houses, choose i - 2 and this house, or choose the latest house.
        for(int i = 2; i < nums.length; i++){

        	f[i] = Math.max(f[i - 2] + nums[i], f[i - 1]);
        }

        return f[nums.length - 1];
    }
}