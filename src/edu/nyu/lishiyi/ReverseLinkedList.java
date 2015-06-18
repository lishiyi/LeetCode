package edu.nyu.lishiyi;
/**
 * #206 Reverse Linked List
 * @author Shiyi Li
 * 
 * Reverse a singly linked list.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 *
 */


public class ReverseLinkedList {

	

    public ListNode reverseList(ListNode head) {
    	
    	//Set prev node to null
    	ListNode prev = null;
    	//Set current node to head
        ListNode current = head;

        
        while (current!= null){
        	
        	//new a temp node which is the next of current (  → next)
        	ListNode next = current.next;
        	
        	//flip the next of current to prev node ( prev ← current)
        	current.next = prev;
        	
        	//shift prev to current ( prev → → )
        	prev = current; 
        	
        	//shift current to next  ( current → → )
        	current = next;
        }

        return prev;
        
        
    }
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		
		ReverseLinkedList re = new ReverseLinkedList();
		ListNode ll1 = re.reverseList(l1);

		System.out.println(ll1.val);
		System.out.println(ll1.next.val);
		System.out.println(ll1.next.next.val);

		

	}

}
