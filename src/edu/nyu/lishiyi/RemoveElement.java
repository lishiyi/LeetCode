Remove Element 
My Submissions Question Solution 
Total Accepted: 80789 Total Submissions: 252304 Difficulty: Easy
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

public class Solution {
    public int removeElement(int[] nums, int val) {
        
        int pointer = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] != val){
        		//Will rewrite all element which == val
        		nums[pointer] = nums[i];
        		pointer++;
        	}
        }
        return pointer;
    }
}