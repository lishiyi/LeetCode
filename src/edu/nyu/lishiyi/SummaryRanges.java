Summary Ranges 
My Submissions Question Solution 
Total Accepted: 23896 Total Submissions: 118336 Difficulty: Easy
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> result = new ArrayList();
        if(nums == null || nums.length == 0){
        	return result;
        }

        int from = nums[0];
        int to = nums[0];
        for(int i = 0; i < nums.length; i++){

        	if(nums[i] > to + 1){
        		if(from == to){
        			result.add("" + from);
        		}
        		else{
        			result.add(from + "->" + to);
        		}
        		from = nums[i];
        	}
        	to = nums[i];
        }

        if(from == to){
        	result.add("" + from);
        }
		else{
			result.add(from + "->" + to);
		}
        return result;
    }
}