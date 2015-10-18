Majority Element 
My Submissions Question Solution 
Total Accepted: 68869 Total Submissions: 186222 Difficulty: Easy
Given an array of size n, find the majority element. 
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

public class Solution {
    public int majorityElement(int[] nums) {
        
        int majority = nums[0];
    	int count = 1;

    	for(int i = 1; i < nums.length; i++){

    		if(nums[i] == majority){
    			count++;
    		}
    		else{
    			count--;
    			if(count == 0){
    				majority = nums[i];
    				count++;
    			}
    		}
    	}
    	return majority;
    }
}