Search in Rotated Sorted Array II 
My Submissions Question Solution 
Total Accepted: 47845 Total Submissions: 153200 Difficulty: Medium
Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?

Write a function to determine if a given target is in the array.

public class Solution {
    public boolean search(int[] nums, int target) {
        
    	int start = 0;
    	int end = nums.length - 1;
    	int mid;

    	while(start + 1 < end){

    		mid = start + (end - start) / 2;

    		if(nums[mid] == target){
    			return true;
    		}
    		if(nums[mid] < nums[end]){

    			if(nums[mid] < target && target <= nums[end]){
    				start = mid;
    			}
    			else{
    				end = mid;
    			}
    		}
    		else if(nums[mid] > nums[end]){

    			if(nums[start] <= target && target < nums[mid]){
    				end =mid;
    			}
    			else{
    				start = mid;
    			}
    		}
    		else{
    			end--;
    		}
    	}

    	return nums[start] == target || nums[end] == target;
    }
}