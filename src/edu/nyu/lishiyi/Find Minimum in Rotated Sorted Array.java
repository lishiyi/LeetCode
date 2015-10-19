Find Minimum in Rotated Sorted Array 
My Submissions Question Solution 
Total Accepted: 64504 Total Submissions: 189387 Difficulty: Medium
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

public class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while(start + 1 < end){

        	mid = start + (end - start) / 2;
        	if(nums[start] < nums[mid]){

				if(nums[start] > nums[end]){
					start = mid;
				}
				else{
					end = mid;
				}
			}
			else{

				if(nums[start] > nums[end]){
					end = mid;
				}
				else{
					start = mid;
				}
			}
        }
        return Math.min(nums[start], nums[end]);
    }
}