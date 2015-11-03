Binary Tree Zigzag Level Order Traversal 
My Submissions Question
Total Accepted: 46016 Total Submissions: 171153 Difficulty: Medium
Given a binary tree, return the zigzag level order traversal of its nodes'' values.
 (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
    	List<List<Integer>> result = new ArrayList();
    	if(root == null){
    		return result;
    	}
    	Queue<TreeNode> queue = new LinkedList();
    	queue.add(root);
    	boolean reverse = false;

    	while(!queue.isEmpty()){

    		List<Integer> level = new ArrayList();
    		int size = queue.size();
    		for(int i = 0; i < size; i++){

    			TreeNode head = queue.poll();
    			level.add(head.val);
    			if(head.left != null){
    				queue.add(head.left);
    			}
    			if(head.right != null){
    				queue.add(head.right);
    			}
    		}
    		if(reverse){ 
    			Collections.reverse(level);
    		}
    		reverse = !reverse;
    		result.add(level);
    	}
    	return result;
    }
}