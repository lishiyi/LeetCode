Missing Number 
My Submissions Question Solution 
Total Accepted: 20389 Total Submissions: 57094 Difficulty: Medium
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant extra space complexity?

public class Solution {
    public int missingNumber(int[] nums) {
        
        if(nums == null || nums.length == 0){
        	return 0;
        }

        int n = nums.length;
        long sum = n * (n + 1) / 2;
        for(int num : nums){
        	sum -= num;
        }

        return (int)sum;
    }
}