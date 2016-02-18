229. Majority Element II 
My Submissions Question
Total Accepted: 22526 Total Submissions: 89690 Difficulty: Medium
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 
The algorithm should run in linear time and in O(1) space.

Show Hint 
public class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> result = new ArrayList();
        if(nums == null || nums.length == 0){
        	return result;
        }
        if(nums.length == 1){
        	result.add(nums[0]);
        	return result;
        }
    	int temp1 = 0;
    	int temp2 = 0;
    	int count1 = 0;
    	int count2 = 0;

    	for(int num : nums){

    		if(num == temp1){
    			count1++;
    		}
    		else if(num == temp2){
    			count2++;
    		}
    		else if(count1 <= 0){
    			temp1 = num;
    			count1 = 1;
    		}
    		else if(count2 <= 0){
    			temp2 = num;
    			count2 = 1;
    		}
    		else{
    			count1--;
    			count2--;
    		}
    	}

    	count1 = 0;
    	count2 = 0;
    	for(int num : nums){
    		if(num == temp1){
    			count1++;
    		}
    		else if(num == temp2){
				count2++;
    		}
    	}

    	if(count1 > nums.length / 3){
    		result.add(temp1);
    	}
    	if(count2 > nums.length / 3){
    		result.add(temp2);
    	}
    	return result;
    }
}