Path Sum II 

My Submissions Question
Total Accepted: 61709 Total Submissions: 229010 Difficulty: Medium
Given a binary tree and a sum, find all root-to-leaf paths where each path's' sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
    	List<List<Integer>> result = new ArrayList();
    	if(root == null){
    		return result;
    	}
    	//Record each number of the path
    	List<Integer> list = new ArrayList();
    	helper(root, sum, result, list);
    	return result;
    }

    private void helper(TreeNode root, int sum, List<List<Integer>> result, List<Integer> list){

    	if(root == null){
    		return;
    	}
    	//Add the root number first.
    	list.add(root.val);
    	//If the node is a leaf and the sum == sum, add it to the result
    	if(root.left == null && root.right == null && sum - root.val == 0){

    		result.add(new ArrayList(list));
    		//Remenber to remove it because it will return, we can't use the last line for backtrack
    		list.remove(list.size() - 1);
    		return;
    	}
    	helper(root.left, sum - root.val, result, list);
    	helper(root.right, sum - root.val, result, list);
    	//Remove the new one for backtrack
    	list.remove(list.size() - 1);
    }
}