package edu.nyu.lishiyi;
/**
 * #203 Remove Linked List Elements V2
 * @author Shiyi
 *Remove all elements from a linked list of integers that have value val.

	Example
	Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
	Return: 1 --> 2 --> 3 --> 4 --> 5
 */


public class RemoveLinkedListElementsV2 {

	
	
	public ListNode removeElements(ListNode head, int val) {
        
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode current = dummy;
		
		while(current.next!=null){
			
			if(current.next.val == val){
				
				if(current.next.next!=null) //If not the last one, skip(remove) that.
					current.next = current.next.next;
				else{                       //That is, if this is the last element.
					current.next = null;
					return dummy.next;
				}
			}
			else{
				current = current.next;
			}
			
		}
		
		return dummy.next;
    }
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		
		RemoveLinkedListElementsV2 rm = new RemoveLinkedListElementsV2();
		ListNode ll1 = rm.removeElements(l1,1);
		
		try{
			System.out.println(ll1.val);
			System.out.println(ll1.next.val);
			System.out.println(ll1.next.next.val);
			System.out.println(ll1.next.next.next.val);
			System.out.println(ll1.next.next.next.next.val);
		} catch(NullPointerException e){
			System.out.println("No more elements");
		}

	}

}
