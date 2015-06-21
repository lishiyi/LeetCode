package edu.nyu.lishiyi;
/**
 * #92 Reverse Linked List II
 * @author lishiyi
 *	Reverse a linked list from position m to n. Do it in-place and in one-pass.

	For example:
	Given 1->2->3->4->5->NULL, m = 2 and n = 4,
	
	return 1->4->3->2->5->NULL.
	
	Note:
	Given m, n satisfy the following condition:
	1 ¡Ü m ¡Ü n ¡Ü length of list.
 */
public class ReverseLinkedListII {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		
		//If null or only has 1 element or m == n, should be the same as head
		if(head == null||head.next==null|| m == n ){
			
			return head;
		}
		
		//Dummy for old head
		ListNode dummy0 = new ListNode(0);
		
		dummy0.next = head;
		
		//current1 for 1~m
		ListNode current1 = dummy0;
		
		//move m-1 times
		for(int i = 1 ; i < m ; i++){
			
			current1 = current1.next;
			//System.out.println(i +" times");
		}
		
		//Dummy for new head
		ListNode dummy = new ListNode(0);
		
		dummy.next = current1.next;
		
		//System.out.println(dummy.next.val);
		
		
		//Set the first part(do not need to be reversed) tail.
		current1.next = null;
		
		//The 2nd current
		ListNode current2 = dummy.next;
		
		//move m-n steps
		for(int i = m;  i < n; i++){
			
			current2 = current2.next;
		}
		
		//save the next
		ListNode next = current2.next;
		
		//Set the second part(What we will reverse) tail
		current2.next =null;
		
		//reverse it!
		ListNode sb = reverse(dummy.next);
		
		//part1's tail connect to new ll
		current1.next = sb;
		
		
		while(sb!=null && sb.next!=null){
			
			sb = sb.next;
		}
		
		//part2's tail connect to part 3 
		sb.next = next;
		
	    return dummy0.next;    
	}
	
	/**
	 * The method to reverse a linked list
	 * @param head
	 * @return New Head
	 */
	private ListNode reverse(ListNode head){
		
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

		
		ReverseLinkedListII mt = new ReverseLinkedListII();
		ListNode ll1 = mt.reverseBetween(l1, 1, 2);
		
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
