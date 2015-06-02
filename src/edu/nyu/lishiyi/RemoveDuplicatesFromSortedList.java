package edu.nyu.lishiyi;
/**
 * #83 Remove Duplicates from Sorted List
 * @author Administrator
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {

	
	public ListNode deleteDuplicates(ListNode head) {
        
		
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		if(head==null){
			return null;
		}
		
		while(head.next!=null){
			
			if(head.next.val == head.val){
				
				head.next = head.next.next;
			}
			else{
				head = head.next;
			}
			
		}

		
		return dummy.next;
    }
	
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		l1 = null;
		
		RemoveDuplicatesFromSortedList mt = new RemoveDuplicatesFromSortedList();
		ListNode ll1 = mt.deleteDuplicates(l1);
		
		try{
			System.out.println(ll1.val);
			System.out.println(ll1.next.val);
			System.out.println(ll1.next.next.val);
			System.out.println(ll1.next.next.next.val);
			System.out.println(ll1.next.next.next.next.val);
			System.out.println(ll1.next.next.next.next.next.val);
		} catch(NullPointerException e){
			System.out.println("No more elements");
		}
	}

}
