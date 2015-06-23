package edu.nyu.lishiyi;
/**
 * #24 Swap Nodes in Pairs 
 * @author lishiyi
 *	Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapNodesinPairs {
   
	public ListNode swapPairs(ListNode head) {
        
		ListNode dummy = new ListNode(0);
		
		dummy.next = head;

		ListNode current = head;
		
		while(current!=null&&current.next!=null){
			
			ListNode next = current.next.next;
			
			current.next.next = current;
			
			current.next = next;
			
			current = next;
		}
		
		return dummy.next;
    }
	
public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		
		ListNode p1 = new ListNode(7);
		ListNode p2 = new ListNode(8);
		ListNode p3 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = p1;
		
		p1.next = p2;
		p2.next = p3;
		p3.next = null;

		
		SwapNodesinPairs mt = new SwapNodesinPairs();
		ListNode ll1 = mt.swapPairs(l1);
		
		try{
			System.out.println(ll1.val);
			System.out.println(ll1.next.val);
			System.out.println(ll1.next.next.val);
			System.out.println(ll1.next.next.next.val);
			System.out.println(ll1.next.next.next.next.val);
			System.out.println(ll1.next.next.next.next.next.val);
			System.out.println(ll1.next.next.next.next.next.next.val);
			System.out.println(ll1.next.next.next.next.next.next.next.val);
			System.out.println(ll1.next.next.next.next.next.next.next.next.val);
			System.out.println(ll1.next.next.next.next.next.next.next.next.next.val);
			System.out.println(ll1.next.next.next.next.next.next.next.next.next.next.val);
		} catch(NullPointerException e){
			System.out.println("No more elements");
		}
	}
	
	
	
	
}
