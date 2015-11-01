Convert Sorted Array to Binary Search Tree 
My Submissions Question
Total Accepted: 57637 Total Submissions: 165034 Difficulty: Medium
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

Subscribe to see which companies asked this question

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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums == null || nums.length == 0){
        	return null;
        }
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
    }

    private TreeNode helper(int[] nums, int start, int end){

    	if(start > end){
    		return null;
    	}
    	//Use the middle number as this "root" for each time.
    	int mid = start + (end - start) / 2;
    	TreeNode head = new TreeNode(nums[mid]);
    	head.left = helper(nums, start, mid - 1);
    	head.right = helper(nums, mid + 1, end);
    	return head;
    }
}