Flatten Binary Tree to Linked List My Submissions Question
Total Accepted: 64451 Total Submissions: 219388 Difficulty: Medium
Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6

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

    private TreeNode pointer = null;
    public void flatten(TreeNode root) {
        
        if(root == null){
            return;
        }
        if(pointer != null){

            pointer.right = root;
        }
        pointer = root;
        TreeNode temp = root.right;
        flatten(root.left);
        root.left = null;
        flatten(temp);
    }
}