package edu.nyu.lishiyi;

/**
 * #21 Merge Two Sorted Lists
 * @author Administrator
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */

public class MergeTwoSortedLists {

	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		ListNode dummy = new ListNode(0);  //dummy, which is head's prev
		ListNode head = new ListNode(0);   //new list's head
		dummy.next = head;
		
		while(l1!= null || l2!= null){     //while l1 or l2 exists
			
			//if l1 is null(that is, we do not need to sort anymore, so the left of new linked list is l2)
			if(l1== null){
				head.next = l2;        
				return dummy.next.next;
			}
			//if l2 is null
			else if(l2== null){
				
				head.next = l1;
				return dummy.next.next;
			}
			//if l1's value less than l2, set the next of head to l1, then l1 and head shift One.
			else if(l1.val < l2.val){
				
				head.next = l1;
				l1 = l1.next;
				head = head.next;
			}
			//if l2's value is smaller, set the next of head to l2, then l2 and head shift One.
			else{
				head.next = l2;
				l2 = l2.next;
				head = head.next;
			}
					
		}
		
		return dummy.next.next;
    }
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(5);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		
		MergeTwoSortedLists mt = new MergeTwoSortedLists();
		ListNode ll1 = mt.mergeTwoLists(l1,l4);
		
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
