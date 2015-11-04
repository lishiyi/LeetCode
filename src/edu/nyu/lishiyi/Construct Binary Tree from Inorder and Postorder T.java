Construct Binary Tree from Inorder and Postorder Traversal 
My Submissions Question
Total Accepted: 42839 Total Submissions: 155908 Difficulty: Medium
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
    	if(inorder == null || inorder.length == 0){
    		return null;
    	}
    	return buildTree(inorder, postorder, 0, postorder.length - 1, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int start, int end, int poend){

    	if(start > end || poend < 0){
    		return null;
    	}

    	TreeNode root = new TreeNode(postorder[poend]);
    	int rootIndex = start;
    	for(; rootIndex <= end; rootIndex++){
    		if(inorder[rootIndex] == root.val) break;
    	}
    	if(rootIndex < end){
    		root.right = buildTree(inorder, postorder, rootIndex + 1, end, poend - 1);
    	}
    	if(rootIndex > start){
    		root.left = buildTree(inorder, postorder, start, rootIndex - 1, poend - 1 - (end - rootIndex));
    	}
    	return root;
    }
}