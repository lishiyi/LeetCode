package edu.nyu.lishiyi;
/**
 * #143 Reorder List
 * @author Shiyi Li
 *  Given a singly linked list L: L0¡úL1¡ú¡­¡úLn-1¡úLn,
	reorder it to: L0¡úLn¡úL1¡úLn-1¡úL2¡úLn-2¡ú¡­
	
	You must do this in-place without altering the nodes' values.
	
	For example,
	Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
public class ReorderList {

	public void reorderList(ListNode head) {
        
		//If the linked list is null or only has one element, it will be not applicable
		if(head==null||head.next==null){
			return;
		}
		
		//We set to pointers, one fast, one slow.
		ListNode fast = head;
		
		ListNode slow = head;
		
		//Fast runs 2 times faster than the Slow
		while(fast.next!=null && fast.next.next!=null){
			
			slow = slow.next;
			
			fast = fast.next.next;
		}
		
		//head1 is the original head
		ListNode head1 = head;
		
		//head2 is the on the second half of the ll (n/2 + 1)
		ListNode head2 = slow.next;
		
		//Set the next of slow to null make sure head1 has only first half of the ll
		//That is no more elements after the half
		slow.next = null;
		
		head2 = reverse(head2);
		
		while(head1!=null && head2!=null){
			
			
		}
		
		
		
    }
	
	public ListNode reverse(ListNode head){
		
		ListNode prev = null;
		
		ListNode current = head;
		
		while(current!=null){
			
			ListNode next = current.next;
			
			current.next = prev;
			
			prev = current;
			
			current = next;
			
		}
		
		return prev;
	}
}
