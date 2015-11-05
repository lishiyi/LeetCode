Binary Tree Right Side View My Submissions Question
Total Accepted: 25641 Total Submissions: 84729 Difficulty: Medium
Given a binary tree, imagine yourself standing on the right side of it, 
return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].

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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList();
        if(root == null){
        	return result;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){

        	int size = queue.size();
        	for(int i = 0; i < size; i++){

        		TreeNode head = queue.poll();
        		if(head.left != null){
        			queue.add(head.left);
        		}
        		if(head.right != null){
        			queue.add(head.right);
        		}
        		if(i == size - 1){
        			result.add(head.val);
        		}
        	}
        }

        return result;
    }
}