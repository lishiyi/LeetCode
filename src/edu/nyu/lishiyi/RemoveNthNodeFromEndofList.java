package edu.nyu.lishiyi;
/**
 * #19 Remove Nth Node From End of List
 * @author Shiyi
 * 
 *Given a linked list, remove the nth node from the end of list and return its head.

  For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */

public class RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    	if(head==null){
    		
    		return null;
    	}
    	
    	if(head.next==null){
    		
    		return null;
    	}
    	
    	ListNode dummy = new ListNode(0);
    	
    	dummy.next = head;
    	
    	ListNode fast = dummy;
    	ListNode slow = dummy;
    	
    	while(n > 0){

    		fast = fast.next;
    		n--;
    	}
    	
    	while(fast.next!=null){
    		
    		fast = fast.next;
    		slow = slow.next;
    	}
    	
    	slow.next = slow.next.next;

    	
    	return dummy.next;
    }
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;
		
		RemoveNthNodeFromEndofList rm = new RemoveNthNodeFromEndofList();
		ListNode ll1 = rm.removeNthFromEnd(l1,1);

		System.out.println(ll1.val);
		System.out.println(ll1.next.val);
		System.out.println(ll1.next.next.val);
		System.out.println(ll1.next.next.next.val);
	}

}
