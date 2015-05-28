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
    	
    	//check if the linked list is null
    	if(head == null){                
    		return null;
    	}
    	
    	// check if the linked list only have one item.
    	if(head.next == null){          
    		return head;
    	}
    	
    	//a current point to head
        ListNode current = head;

        //while there is next item
        while (current.next != null){
        	
            //get the next node
            ListNode temp = current.next;

            //take the next node out of the chain and set current's next node to its next node
            current.next = temp.next;

            //now make the node we took out to point to head  
            temp.next = head;

            //reassign the head
            head = temp;
        }

        return head;
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
