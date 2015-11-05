Construct Binary Tree from Preorder and Inorder Traversal 
My Submissions Question
Total Accepted: 48234 Total Submissions: 179586 Difficulty: Medium
Given preorder and inorder traversal of a tree, construct the binary tree.

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
    	if(preorder == null || preorder.length == 0){
    		return null;
    	}
    	return buildTree(preorder, inorder, 0, preorder.length - 1, 0);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int start, int end, int preStart){

    	if(start > end){
    		return null;
    	}

    	TreeNode root = new TreeNode(preorder[preStart]);
    	int rootIndex;
    	for(rootIndex = start; rootIndex <= end; rootIndex++){

    		if(inorder[rootIndex] == root.val) break;
    	}

    	if(rootIndex > start){

    		root.left = buildTree(preorder, inorder, start, rootIndex - 1, preStart + 1);
    	}

    	if(rootIndex < end){

    		root.right = buildTree(preorder, inorder, rootIndex + 1, end, preStart + 1 + (rootIndex - start));
    	}

    	return root;
    }
}