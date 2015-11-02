Validate Binary Search Tree 
My Submissions Question
Total Accepted: 68143 Total Submissions: 337004 Difficulty: Medium
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's' key.
The right subtree of a node contains only nodes with keys greater than the node's' key.
Both the left and right subtrees must also be binary search trees.

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
    public boolean isValidBST(TreeNode root) {
        
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min, long max){

    	if(root == null) return true;
    	if(root.val >= max || root.val <= min){
    		return false;
    	}
    	return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}