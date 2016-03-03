16. 3Sum Closest 
My Submissions Question
Total Accepted: 69261 Total Submissions: 242521 Difficulty: Medium
Given an array S of n integers, find three integers in S such that the sum is 
closest to a given number, target. Return the sum of the three integers. 
You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length; i++){
        	int left = i + 1;
        	int right = nums.length - 1;
        	while(left < right){
        		int temp = nums[i] + nums[left] + nums[right];
        		if(temp == target) return temp;
        		result = Math.abs(temp - target) < Math.abs(result - target) ? temp : result;
        		if(temp < target){
        			left++;
        		}
        		else{
        			right--;
        		}
        	}
        }
        return result;
    }
}