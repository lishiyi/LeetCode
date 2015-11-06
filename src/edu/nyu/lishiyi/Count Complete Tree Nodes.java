Count Complete Tree Nodes 
My Submissions Question
Total Accepted: 19915 Total Submissions: 89129 Difficulty: Medium
Given a complete binary tree, count the number of nodes.

Definition of a complete binary tree from Wikipedia:
In a complete binary tree every level, except possibly the last, 
is completely filled, and all nodes in the last level are as far left as possible. 
It can have between 1 and 2h nodes inclusive at the last level h.

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
    public int countNodes(TreeNode root) {
        
        int h = height(root);
        //IF h<0, that is the root is null, return the number 0.
        if(h < 0){
        	return 0;
        }
        //If right part's height == h - 1, that is left part must be a full tree.
        //So the total number is 2^h + (nodes of right part)
 		if(height(root.right) == h - 1){
 			return (1 << h)  + countNodes(root.right);
 		}
 		//Else right part is lower than left, that is right part must be a smaller full tree
 		//So the total number is (nodes of left part) + 2^(h-1)
 		else{
 			return countNodes(root.left) + (1 << (h -1));
 		}

    }

    private int height(TreeNode root){
    	if(root == null){
    		return -1;
    	}
    	return height(root.left) + 1;
    }
}