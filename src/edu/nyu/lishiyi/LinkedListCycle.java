package edu.nyu.lishiyi;

/**
 * #141 Linked List Cycle
 * @author lishiyi
 * Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
        
		ListNode fast =head;
		
		ListNode slow = head;
		
		while(fast!=null&&fast.next!=null){
			
			//fast moves twice than slow, let it be 2k
			fast = fast.next.next;
			//slow moves k
			slow = slow.next;
			
			//when in cycle, slow moves k, and fast moves 2k, so each time, fast is 1 step closer to slow(round behind). 
			if(fast==slow){
				
				//when they meets, return true(if they are equal)
				return true;
			}
			
		}
		
		//else the iteration ends, no loop exists.
		return false;
    }
	
	 public static void main(String[] args) {
			
			ListNode l1 = new ListNode(3);
			ListNode l2 = new ListNode(1);
			ListNode l3 = new ListNode(2);
			ListNode l4 = new ListNode(4);
			ListNode l5 = new ListNode(6);
			ListNode l6 = new ListNode(5);
			
			ListNode p1 = new ListNode(9);
			ListNode p2 = new ListNode(8);
			ListNode p3 = new ListNode(7);
			l1.next = l2;
			l2.next = l3;
			l3.next = l4;
			l4.next = l5;
			l5.next = l6;
			l6.next = p1;
			
			p1.next = p2;
			p2.next = p3;
			p3.next = l4;
	
			
			LinkedListCycle mt = new LinkedListCycle();
			boolean ll1 = mt.hasCycle(l1);
			
			try{
				System.out.println(ll1);

			} catch(NullPointerException e){
				System.out.println("No more elements");
			}
		}
}
