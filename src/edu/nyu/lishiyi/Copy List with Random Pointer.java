Copy List with Random Pointer 
My Submissions Question
Total Accepted: 52501 Total Submissions: 204612 Difficulty: Hard
A linked list is given such that each node contains an additional random pointer 
which could point to any node in the list or null.

Return a deep copy of the list.

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        
        if(head == null){
        	return null;
        }

        RandomListNode dummy = new RandomListNode(0);
        dummy.next = head;
        RandomListNode current = head;
        //1. Copy Nodes
        while(current != null){

        	RandomListNode next = current.next;
        	current.next = new RandomListNode(current.label);
        	current.next.next = next;
        	current = next;
        }

        //2. Copy Random
        current = head;
        while(current != null && current.next != null){
        	current.next.random =  current.random == null ? null : current.random.next;
        	current = current.next.next;
        }
        //3. Divide
        dummy.next = head.next;
        current = head;
        while(current != null && current.next != null){

        	RandomListNode next = current.next;
        	current.next = current.next.next;
        	current = next;
        }
        return dummy.next;
    }
}