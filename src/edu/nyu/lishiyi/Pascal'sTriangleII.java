Pascal's' Triangle II 
My Submissions Question Solution 
Total Accepted: 55184 Total Submissions: 184370 Difficulty: Easy
Given an index k, return the kth row of the Pascal's' triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList();
        if(rowIndex < 0){
        	return result;
        }

        for(int i = 0; i <= rowIndex; i++){

        	result.add(0, 1);
        	for(int j = 1; j < i; j++){

        		result.set(j, result.get(j) + result.get(j + 1));
        	}	
        }

        return result;
    }
}