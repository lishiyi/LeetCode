Binary Tree Paths 
My Submissions Question
Total Accepted: 20053 Total Submissions: 86233 Difficulty: Easy
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]

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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> result = new ArrayList();
        if(root == null){
        	return result;
        }
        helper(root, "", result);
        return result;
    }

    private void helper(TreeNode root, String s, List<String> result){

    	if(root.left == null && root.right == null){
    		result.add(s + root.val);
    	}
    	if(root.left != null){
    		helper(root.left, s + root.val + "->", result);
    	}
    	if(root.right != null){
    		helper(root.right, s + root.val + "->", result);
    	}
    }
}