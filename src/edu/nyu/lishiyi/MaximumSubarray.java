Maximum Subarray
Total Accepted: 72946 Total Submissions: 210965 My Submissions Question Solution 
Find the contiguous subarray within an array (containing at least one number) which has 
the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution using the 
divide and conquer approach, which is more subtle.


public class Solution {
    public int maxSubArray(int[] nums) {
 		//sum[i] for at the ith number, the max sum for the current array until this (number[i]). 
 		int[] sum = new int[nums.length];
 		//Initailize
 		sum[0] = nums[0];
 		int max = nums[0];
 		for(int i = 1; i < nums.length; i++){
 			//the largest sum of current array = sum[i - 1] + this number ( that is, 
 			//we connect the new number to the former subarray, )
 			//or = this number (that is , we disconnect that and just use this number
 			//as a new subarray)
 			sum[i] = Math.max(sum[i - 1] + nums[i], nums[i]);
 			max = Math.max(max, sum[i]);
 		}
 		return max;       
    }
}