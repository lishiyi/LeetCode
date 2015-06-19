package edu.nyu.lishiyi;
/**
 * #61 Rotate List
 * @author Administrator
 *	Given a list, rotate the list to the right by k places, where k is non-negative.

	For example:
	Given 1->2->3->4->5->NULL and k = 2,
	return 4->5->1->2->3->NULL.
 */

public class RotateList {

	public ListNode rotateRight(ListNode head, int k) {
		
		if(head==null||head.next == null){
			
			return head;
		}
		
		
		//count the length of linked list
		ListNode current0 = head;
		
		int count = 0;
		
		while(current0!=null){
			
			current0 = current0.next;
			
			count += 1;
		}
		
		
		//because we move every count of the linked list are the same, we simplify that to
		//the mode of k steps.
		int move = (k>count) ? (k%count) : k;
		
		//each iteration, move one step to left; if we want to move right, just the count  - move.
		for(int i=0; i < (count - move) ; i++){
			
			ListNode newHead = head.next;
			
			ListNode current = head;
			
			while(current.next!=null){
				
				current = current.next;
			}
			
			current.next = head;
			
			head.next = null;
			
			head = newHead;
			
		}
		
		return head;
	}
	
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		ListNode p1 = new ListNode(9);
		ListNode p2 = new ListNode(8);
		ListNode p3 = new ListNode(7);
		p1.next = p2;
		p2.next = p3;
		p3.next = l5;

		
		RotateList mt = new RotateList();
		ListNode ll1 = mt.rotateRight(l1,2_000_000_000);
		
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
