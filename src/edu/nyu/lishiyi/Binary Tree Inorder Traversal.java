Binary Tree Inorder Traversal 
My Submissions Question
Total Accepted: 92441 Total Submissions: 248457 Difficulty: Medium
Given a binary tree, return the inorder traversal of its nodes' values.'

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result){

    	if(root == null){
        	return;
        }
        helper(root.left, result);
        result.add(root.val);
        helper(root.right,result);
    }
}