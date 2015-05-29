package edu.nyu.lishiyi;
/**
 * #203 Remove Linked List Elements
 * @author Shiyi
 *Remove all elements from a linked list of integers that have value val.

	Example
	Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
	Return: 1 --> 2 --> 3 --> 4 --> 5
 */


public class RemoveLinkedListElements {

	
	
	public ListNode removeElements(ListNode head, int val) {
        
		if(head == null){
			return null;
		}
		
		
		while(head.val == val){
			
			if(head.next!=null)
				head = head.next;
			else{
				return null;
			}
		}
		
		ListNode current = head;
		
		while(current.next!=null){
			
			while(current.next.val == val){
				
				if(current.next.next!=null)
					current.next = current.next.next;
				else{
					current.next = null;
					return head;
				}
			}
			
			if(current.next!=null)
				current = current.next;
			else{
				current.next = null;
			}
		}
		
		
		return head;
    }
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(1);
		ListNode l6 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		
		RemoveLinkedListElements rm = new RemoveLinkedListElements();
		ListNode ll1 = rm.removeElements(l1,1);

		System.out.println(ll1.val);
		//System.out.println(ll1.next.val);
		//System.out.println(ll1.next.next.val);
		//System.out.println(ll1.next.next.next.val);
		//System.out.println(ll1.next.next.next.next.val);

	}

}
