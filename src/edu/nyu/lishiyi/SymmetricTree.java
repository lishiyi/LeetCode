Symmetric Tree 
My Submissions Question
Total Accepted: 78274 Total Submissions: 242916 Difficulty: Easy
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

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
    public boolean isSymmetric(TreeNode root) {
        
   		if(root == null){
   			return true;
   		}
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right){

    	if(left == null && right == null){
    		return true;
    	}
    	if(left == null || right == null){
    		return false;
    	}
    	if(left.val != right.val){
    		return false;
    	}
    	return helper(left.left, right.right) && helper(right.left, left.right);
    }
}