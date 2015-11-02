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
    public int sumNumbers(TreeNode root) {
        
        if(root == null){
        	return 0;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int result = 0;

        while(!queue.isEmpty()){

        	int size = queue.size();
        	for(int i = 0; i < size; i++){

        		TreeNode head = queue.poll();

        		if(head.left == null && head.right == null){
        			result += head.val;
        			continue;
        		}
        		if(head.left != null){
        			head.left.val += head.val * 10;
        			queue.add(head.left); 
        		}
        		if(head.right != null){
        			head.right.val += head.val * 10;
        			queue.add(head.right);
        		}
        	}
        }
        return result;
    }
}