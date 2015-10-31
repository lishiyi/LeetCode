Minimum Depth of Binary Tree 
My Submissions Question
Total Accepted: 78154 Total Submissions: 266023 Difficulty: Easy
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path 
from the root node down to the nearest leaf node.
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
    public int minDepth(TreeNode root) {
        
        if(root == null ){
        	return 0;
        }
        if(root.left == null && root.right == null){
        	return 1;
        } 
        int left = root.left != null ?  minDepth(root.left) + 1 : Integer.MAX_VALUE;
        int right = root.right != null ? minDepth(root.right) + 1: Integer.MAX_VALUE;
        return Math.min(left, right);
    }
}