136. Single Number 
My Submissions Question
Total Accepted: 107015 Total Submissions: 223703 Difficulty: Medium
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        for(int num : nums){
        	result = result ^ num;
        }
        return result;
    }
}