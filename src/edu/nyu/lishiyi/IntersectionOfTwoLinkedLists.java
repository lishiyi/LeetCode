package edu.nyu.lishiyi;
/**
 * #160 Intersection of Two Linked Lists
 * @author Shiyi Li
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 ¡ú a2
                                                                    ¨K
                     c1 ¡ú c2 ¡ú c3
                                                                    ¨J            
B:     b1 ¡ú b2 ¡ú b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
		//check if the head is null(if null, there is no head.next, we cannot go to line 40)
		if(headA == null||headB==null){    
			return null;
		}
		
		//create fast and slow pointers to compare the length of two linked lists
		ListNode fastA = headA;
		ListNode fastB = headB;
		
		ListNode slowA = headA;
		ListNode slowB = headB;
		
		//the shorter one's next goes null first
		while(fastA.next!=null&&fastB.next!=null){
			
			fastA = fastA.next;
			fastB = fastB.next;
		}
		
		//if A is the shorter one, let B move some steps, to make it from the same start line as A. 
		if(fastA.next == null){
			while(fastB.next != null){
				fastB = fastB.next;
				slowB = slowB.next;
			}
		}
		//if B is the shorter one
		else if(fastB.next == null){
			while(fastA.next != null){
				fastA = fastA.next;
				slowA = slowA.next;
			}
		}
		
		//Now the have the same start line, move together until they have the same value. 
		while(slowA!=null && slowB!=null){
			
			//when is occurs, that is the head of their intersection, return the left linkded list.
			if(slowA.val == slowB.val){
				return slowA;
			}
			else{
				slowA = slowA.next;
				slowB = slowB.next;
			}
			
		}
		
		//If no value same, they have no intersections, return null.
		return null;
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
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		ListNode p1 = new ListNode(9);
		ListNode p2 = new ListNode(8);
		ListNode p3 = new ListNode(7);
		p1.next = p2;
		p2.next = p3;
		p3.next = l5;

		
		IntersectionOfTwoLinkedLists mt = new IntersectionOfTwoLinkedLists();
		ListNode ll1 = mt.getIntersectionNode(l1,p1);
		
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
