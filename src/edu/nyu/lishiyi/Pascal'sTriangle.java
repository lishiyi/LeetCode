Pascal's' Triangle 
My Submissions Question Solution 
Total Accepted: 61035 Total Submissions: 198229 Difficulty: Easy
Given numRows, generate the first numRows of Pascal's' triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]


public class Solution {
    public List<List<Integer>> generate(int numRows) {
        	
        List<List<Integer>> result = new ArrayList();
        if(numRows == 0){
        	return result;
        }

        result.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i++){

        	List<Integer> list = new ArrayList();
        	list.add(1);
        	for(int j = 1; j < i; j++){
        		list.add( result.get(i - 1).get(j - 1) + result.get(i - 1).get(j) );
        	}
        	list.add(1);
        	result.add(list);
        }

        return result;
    }
}