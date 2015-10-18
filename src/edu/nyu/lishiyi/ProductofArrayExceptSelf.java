Product of Array Except Self 
My Submissions Question Solution 
Total Accepted: 19489 Total Submissions: 52277 Difficulty: Medium
Given an array of n integers where n > 1, nums, return an array output such that output[i] 
is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as 
	extra space for the purpose of space complexity analysis.)

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length <= 1){
        	return nums;
        }

        
        int[] result = new int[nums.length];
        result[0] = 1;

        for(int i = 1; i < nums.length; i++){

        	result[i] = result[i - 1] * nums[i - 1];
        }

        int productFromRight = 1;
        for(int i = nums.length - 2; i >= 0; i--){

        	productFromRight *= nums[i + 1];
        	result[i] *= productFromRight;
        }

        return result;
    }
}