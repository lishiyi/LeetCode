Merge k Sorted Lists 

My Submissions Question
Total Accepted: 64053 Total Submissions: 294763 Difficulty: Hard
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists == null || lists.length == 0){
        	return null;
        }

        Comparator<ListNode> c = new Comparator<ListNode>(){

        	@Override
        	public int compare(ListNode l1, ListNode l2){

        		return l1.val - l2.val;
        	}
        };

        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.length, c);

        for(ListNode head : lists){

        	if(head != null){
        		heap.add(head);
        	}
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(!heap.isEmpty()){

        	current.next = heap.poll();
        	current = current.next;

        	if(current.next != null){
        		heap.add(current.next);
        	}
        }

        return dummy.next;
    }
}