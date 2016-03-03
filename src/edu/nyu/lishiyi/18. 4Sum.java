18. 4Sum 
My Submissions Question
Total Accepted: 64815 Total Submissions: 278122 Difficulty: Medium
Given an array S of n integers, are there elements a, b, c, and d in S such that 
a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.
    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

    A solution set is:
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)


public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
    	List<List<Integer>> result = new ArrayList();
    	Arrays.sort(nums);

    	for(int i = 0; i < nums.length - 1; i++){
    		if(i != 0 && nums[i] == num[i - 1]) continue;
    		for(int j = i + 1; j < nums.length - 1; j++){
    			if(j != i + 1 && nums[j] == nums[j - 1]) continue;
    			int targetL = target - nums[i] - nums[j];
    			int left = j + 1;
    			int right = nums.length - 1;
    			while(left < right){
    				if(nums[left] + nums[right] == targetL){
    					result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
    					while(left < right && nums[left] == nums[left + 1]) left++;
    					while(left < right && nums[right] == nums[right - 1]) right--;
    					left++;
    					right--;
    				}
    				else if(nums[left] + nums[right] < targetL){
    					left++;
    				}
    				else{
    					right--;
    				}
    			}
    		}
    	}
    	return result;
    }
}