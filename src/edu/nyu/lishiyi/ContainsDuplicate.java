Contains Duplicate
My Submissions Question Solution 
Total Accepted: 41879 Total Submissions: 110849 Difficulty: Easy
Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums == null || nums.length == 0){
        	return false;
        }

        Set<Integer> set = new HashSet();
        for(int num : nums){

        	if(set.contains(num)){
        		return true;
        	}
        	set.add(num);
        }
        return false;
    }
}