Sum Root to Leaf Numbers 
My Submissions Question
Total Accepted: 60066 Total Submissions: 194193 Difficulty: Medium
Given a binary tree containing digits from 0-9 only, 
each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.

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

	private int sum;
    public int sumNumbers(TreeNode root) {
        
        if(root == null){
        	return 0;
        }
        sum = 0;
        helper(root, 0);
        return sum;
    }

    private void helper(TreeNode root, int path){

    	if(root == null){
    		sum += path;
    		return;
    	}

    	if(root.left == null && root.right == null){
    		sum += path + root.val;
    		return;
    	}
    	if(root.left != null){

    		helper(root.left, (path + root.val) * 10);
    	}
    	if(root.right != null){

    		helper(root.right, (path + root.val) * 10);
    	}

    }
}