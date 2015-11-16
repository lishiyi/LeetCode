Remove Duplicates from Sorted List II 
My Submissions Question
Total Accepted: 57715 Total Submissions: 225297 Difficulty: Medium
Given a sorted linked list, delete all nodes that have duplicate numbers, 
leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null){
        	return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while(current != null){

        	while(current.next != null && current.val == current.next.val){

        		current = current.next;
        	}

        	if(current != prev.next){

        		prev.next = current.next;
        	}
        	else{
  				
        		prev = prev.next;
        	}

        	current = current.next;
        }

        return head;
    }
}