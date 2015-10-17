Move Zeroes
My Submissions Question Solution 
Total Accepted: 21493 Total Submissions: 52087 Difficulty: Easy
Given an array nums, write a function to move all 0's' to the end of it while 
maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

public class Solution {
    public void moveZeroes(int[] nums) {
        
    	if(nums == null || nums.length == 0){
    		return;
    	}
    	//1. Count Zeros.
		int zeros = 0;

		for(int i = 0; i < nums.length; i++){
			//Count Zeros
			if(nums[i] == 0){
				zeros++;
			}
			//If its not zero, put it at [i - zeros]
			else{
				nums[i - zeros] = nums[i];
			}			
		}
		//Set last elements to zero
		for(int i = nums.length - zeros; i < nums.length; i++){

			nums[i] = 0;
		}
    }
}