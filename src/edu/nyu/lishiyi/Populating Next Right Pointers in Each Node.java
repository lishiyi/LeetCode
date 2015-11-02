Populating Next Right Pointers in Each Node 
My Submissions Question
Total Accepted: 67829 Total Submissions: 186689 Difficulty: Medium
Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node. If there is no next right node, 
the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, 
  and every parent has two children).
For example,
Given the following perfect binary tree,
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        
        if(root == null){
            return;
        }
        Queue<TreeLinkNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i = 0; i < size; i++){

                TreeLinkNode head = queue.poll();
                if(i < size - 1){
                    head.next = queue.peek();
                }
                if(head.left != null){
                    queue.add(head.left);
                }
                if(head.right != null){
                    queue.add(head.right);
                }
            }
        } 
    }
}