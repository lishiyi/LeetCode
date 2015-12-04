Unique Binary Search Trees II 
My Submissions Question
Total Accepted: 44961 Total Submissions: 155232 Difficulty: Medium
Given n, generate all structurally unique BST's' (binary search trees) that store values 1...n.

For example,
Given n = 3, your program should return all 5 unique BST's' shown below.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

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
    public List<TreeNode> generateTrees(int n) {
        
        List<TreeNode>[] result = new List[n + 1]; 
        result[0] = new ArrayList<TreeNode>();
        result[0].add(null);

        for(int i = 1; i <= n; i++){
        	result[i] = new ArrayList<TreeNode>();
        	
        	for(int j = 0; j < i; j++){

        		for(TreeNode nodeL : result[j]){
        			for(TreeNode nodeR : result[i - j - 1]){
        				TreeNode root = new TreeNode(j + 1);
        				root.left = nodeL;
        				root.right = colon(nodeR, offset);
        				result[i].add(root);
        			}
        		}

        	}
        }

        return result[n];
    }

    private TreeNode colon(TreeNode n, int offset){

    	if(n == null){
    		return null;
    	}
    	TreeNode node = new TreeNode(n.val + offset);
    	node.left = colon(n.left, offset);
    	node.right = colon(n.right, offset);
    	return node;
    }
}