137. Single Number II 
My Submissions Question
Total Accepted: 75333 Total Submissions: 204377 Difficulty: Medium
Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

//Version 1 : with extra space
public class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap();
        for(int num : nums){
        	if(!map.containsKey(num)){
        		map.put(num, 1);
        	}
        	else{
        		map.put(num, map.get(num) + 1);
        	}
        }

        for(int num: nums){
        	if(map.get(num) == 1){
        		return num;
        	}
        }
        return -1;
    }
}
//Version 2 : without extra space
public class Solution {
    public int singleNumber(int[] nums) {
        
        int[] sum = new int[32];
    	int result = 0;
    	for(int i = 0; i < 32; i++){

    		for(int j = 0; j < nums.length; j++){

    			sum[i] += ((nums[j] >>> i) & 1);
    		}

    		sum[i] = sum[i] % 3;
    		result += ((sum[i] & 1) << i);
    	}
    	return result;
    }
}