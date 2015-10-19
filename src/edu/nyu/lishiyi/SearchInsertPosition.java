Search Insert Position 
My Submissions Question Solution 
Total Accepted: 77330 Total Submissions: 216541 Difficulty: Medium
Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

public class Solution {
    public int searchInsert(int[] nums, int target) {
      	
      	if(nums == null){
      		return 0;
      	}

        for(int i = 0; i < nums.length ; i++){

        	if(target <= nums[i]){
        		return i;
        	}
        }
        return nums.length;
    }
}