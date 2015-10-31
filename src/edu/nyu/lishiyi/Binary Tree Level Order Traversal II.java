Binary Tree Level Order Traversal II 
My Submissions Question
Total Accepted: 58039 Total Submissions: 183041 Difficulty: Easy
Given a binary tree, return the bottom-up level order traversal of its nodes''
 values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList();
        if(root == null){
        	return result;
        }
        Queue<TreeNode> queue = new LinkedList();

        queue.add(root);

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
        	result.add(level);
        }
        Collections.reverse(result);
        return result;
    }
}