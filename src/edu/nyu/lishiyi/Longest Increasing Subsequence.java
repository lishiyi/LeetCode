Longest Increasing Subsequence 
My Submissions Question
Total Accepted: 8692 Total Submissions: 27671 Difficulty: Medium
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. 
Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?

public class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if(nums == null || nums.length == 0){
        	return 0;
        }
        int n = nums.length;
        //Longest sequence to here
        int[] f = new int[n];
        Arrays.fill(f, 1);
        int result = 1;

        for(int i = 1; i < n; i++){
        	for(int j = 0; j < i; j++){

        		if(nums[j] < nums[i]){
        			f[i] = Math.max(f[j] + 1, f[i]);
        		}
        	}
        	result = Math.max(f[i], result);
        }
        return result;
    }
}