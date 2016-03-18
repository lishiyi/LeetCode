297. Serialize and Deserialize Binary Tree 
My Submissions Question
Total Accepted: 15373 Total Submissions: 56705 Difficulty: Hard
Serialization is the process of converting a data structure or object into a sequence of bits so that 
it can be stored in a file or memory buffer, or transmitted across a network connection link to be 
reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your 
serialization/deserialization algorithm should work. You just need to ensure that a binary tree can 
be serialized to a string and this string can be deserialized to the original tree structure.

For example, you may serialize the following tree

    1
   / \
  2   3
     / \
    4   5
as "[1,2,3,null,null,4,5]", just the same as how LeetCode OJ serializes a binary tree. 
You do not necessarily need to follow this format, so please be creative and come up with different 
approaches yourself.
Note: Do not use class member/global/static variables to store states. Your serialize and deserialize 
algorithms should be stateless.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode root, StringBuilder sb){

    	if(root == null){
    		sb.append("#").append(",");
    		return;
    	}
    	sb.append(root.val).append(",");
    	buildString(root.left, sb);
    	buildString(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        Queue<String> queue = new LinkedList();
        queue.addAll(Arrays.asList(data.split(",")));
        TreeNode root = buildTree(queue);
        return root;
    }

    private TreeNode buildTree(Queue<String> queue){
    	String rootString = queue.poll();
    	if(rootString.equals("#")){
    		return null;
    	}
    	TreeNode root = new TreeNode(Integer.valueOf(rootString));
    	root.left = buildTree(queue);
    	root.right = buildTree(queue);
    	return root;
    }
}