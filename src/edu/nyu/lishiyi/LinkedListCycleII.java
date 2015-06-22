package edu.nyu.lishiyi;
/**
 * #142 Linked List Cycle II 
 * @author lishiyi
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?
 */
public class LinkedListCycleII {
	
    public ListNode detectCycle(ListNode head) {
        
    	ListNode fast = head;
    	
    	ListNode slow = head;
    	
    	while(fast!=null&&fast.next!=null){
    		
    		fast = fast.next.next;
    		
    		slow = slow.next;
    		
    		if(fast == slow){
    			
    			break;
    		}
    	}
    	
    	if(fast==null||fast.next==null){
    		
    		return null;
    	}
    	
    	/**
    	 * slow:k steps, fast: 2k steps when they meets.  set slow to head, let the head to cycle begin node  B be x steps. 
    	 *  Because fast moves k steps more than the slow, it takes k steps from the meet point back the meet point (the cycle length is k). 
    	 * From B to M, is (k-x) steps. Thus, the rest (M to "tail") is (k - (k-x) )== x.  
    	 * Then slow starts from the head, fast starts from M has the same speed as slow, after x steps, they will meet again at B.    
    	 */
    	slow = head;
    	
    	while(fast!=slow){
    		
    		fast = fast.next;
    		
    		slow = slow.next;
    	}
    	
    	return slow;
    }
    
    public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		ListNode l8 = new ListNode(8);
		ListNode l9 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		l9.next = l4;

		LinkedListCycleII mt = new LinkedListCycleII();
		ListNode ll1 = mt.detectCycle(l1);
		
		try{
			System.out.println("The begin node is: " + ll1.val);

		} catch(NullPointerException e){
			System.out.println("No more elements");
		}
	}
}
