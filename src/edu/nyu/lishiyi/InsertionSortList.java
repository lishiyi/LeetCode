package edu.nyu.lishiyi;
/**
 * #147 Insertion Sort List 
 * @author lishiyi
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
        
		if(head == null){
			return null;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode current = head;
		ListNode next = head.next;

		while(current != null){

			next = current.next;

			while(prev.next != null && prev.next.val < current.val){
				prev = prev.next;
			}
			current.next = prev.next;
			prev.next = current;
			current = next;
			prev = dummy;
		}

		return dummy.next;
    }

}
