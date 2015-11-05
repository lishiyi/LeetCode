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
    /*
    *	Because the end of postorder always be the Root. We create a pointer to that.
    *   And use this root to split inorder into 2 parts, left part will be left chilren
    * 													 right part will be right chilren
    *   For the right part, endofPostorder - 1, is just the Root of right.
    *	For left part, [endofPostorder - 1], after that, we need -(the length of right part)
    *   	So [endofPostorder - 1] - (end - rootIndex) is the Root if left.
    *	
    *	
    */
    private TreeNode buildTree(int[] inorder, int[] postorder, int start, int end, int poend){

    	if(start > end || poend < 0){
    		return null;
    	}
    	//Create root, it is at the end of postorder(subarray). 
    	TreeNode root = new TreeNode(postorder[poend]);
    	//Search for the root in inorder array. Save its index.
    	int rootIndex = start;
    	for(; rootIndex <= end; rootIndex++){
    		if(inorder[rootIndex] == root.val) break;
    	}
    	//If there is still something at the right of the root:
    	if(rootIndex < end){
    		root.right = buildTree(inorder, postorder, rootIndex + 1, end, poend - 1);
    	}
    	//If there is still something at the left of the root:
    	if(rootIndex > start){
    		root.left = buildTree(inorder, postorder, start, rootIndex - 1, poend - 1 - (end - rootIndex));
    	}
    	return root;
    }
}