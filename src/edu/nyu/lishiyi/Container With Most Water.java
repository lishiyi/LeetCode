Container With Most Water 
My Submissions Question Solution 
Total Accepted: 55704 Total Submissions: 172277 Difficulty: Medium
Given n non-negative integers a1, a2, ..., an, where each represents 
a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints 
of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, 
such that the container contains the most water.

Note: You may not slant the container.


public class Solution {
    public int maxArea(int[] height) {
        
        if(height == null){
        	return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right){

        	max = Math.max(max, (Math.min(height[left], height[right])) * (right - left - 1) );

        	if(height[left] < height[right]){
        		left++;
        	}
        	else{
        		right--;
        	}
        }
        return max;

    }
}