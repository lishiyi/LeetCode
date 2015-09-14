Clone Graph 
My Submissions Question Solution 
Total Accepted: 46892 Total Submissions: 192592 Difficulty: Medium
Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.


OJ's undirected graph serialization: '
Nodes are labeled uniquely.

We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
As an example, consider the serialized graph {0,1,2#1,2#2,2}.

The graph has a total of three nodes, and therefore contains three parts as separated by #.

First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
Second node is labeled as 1. Connect node 1 to node 2.
Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
Visually, the graph looks like the following:

       1
      / \
     /   \
    0 --- 2
         / \
         \_/

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        
        if(node == null){

        	return null;
        }
        //1. Create a new node.
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        //2. Create a new HashMap for the new graph 
        HashMap<Integer, UndirectedGraphNode> map = new HashMap();
        //3. put the first new node into the map
        map.put(newNode.label, newNode);
        //4. For BFS, create a Queue saving the nodes of the original graph.
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        //5. Add the first node of original graph.
        queue.add(node);

        //6. BFS start(while still have nodes)
        while(!queue.isEmpty()){

        	//7. Deal with the node at the head of the queue.
        	UndirectedGraphNode n = queue.poll();
        	//8. iterate each neighbor of the node
        	for(UndirectedGraphNode neighbor : n.neighbors){
        		//9. If it is not yet is the map: 
        		if(!map.containsKey(neighbor.label)){
        			//10. put this neighbor into the map(By creacting a new node)
	        		map.put(neighbor.label, new UndirectedGraphNode(neighbor.label));
	        		//11. add this neighbor to the queue(For next BFS)
	        		queue.add(neighbor);
        		}
        		//12. Add this neighbor to neighbors of current node(Because neighbors is <ArrayList>, we use "add" here)
        		map.get(n.label).neighbors.add(map.get(neighbor.label));
        	}
        }

        return newNode;
    }
}