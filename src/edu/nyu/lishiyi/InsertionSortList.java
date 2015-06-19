package edu.nyu.lishiyi;
/**
 * #147 Insertion Sort List 
 * @author lishiyi
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
        
		//If linked list is null or has only one node, return it
		if(head == null || head.next == null){
			
			return head;
		}
		
		//Outer Iteration, set current to head
		ListNode current = head;
		
		ListNode newHead = new ListNode(999999);
		
		newHead.next = head;
		
		while(current!=null && current.next!=null){      //3
			
			ListNode save = current.next.next;           //4
			
			//save the new  1 number to sort
			ListNode newNum = current.next;              //2
			//Inner Iteration, set innerCurrent to head
			ListNode innerCurrent = newHead.next;                //n.next = 3
			//remove the elements after current
			current.next = null;                         //1.next = null
			
			while(innerCurrent!=null){                      //3   //1
				//save the next for next step iteration
				ListNode innerNext = innerCurrent.next;          //3.next = 1  //null
				//make the newNumber be the current "head" (the largest than others)   
				newNum.next = innerCurrent;                      //2.next = 3  //2.next = 1
				//If it is really largest, it's done, break it
				if(newNum.val >= innerCurrent.val){               //n/a    //2>1
					
					if(newNum.val >= newHead.next.val){           //n/a    //2<3
						newHead.next = newNum;
					}

					break;
				}
				//Else, insert into: "current" >> here >>"current.next" 
				else {
					
					newNum.next = innerCurrent.next;       //2.next = 1    //n/a
					innerCurrent.next = newNum;            //3.next = 2    //n/a
				}
				
				innerCurrent = innerNext;      //1  //n/a
			}
			
			current.next = save;
			current = current.next;
			
		}
		
		return newHead;
		//
		//return reverse(newHead);
    }
	
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
			ListNode l2 = new ListNode(3);
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
			p3.next = null;
	
			
			InsertionSortList mt = new InsertionSortList();
			ListNode ll1 = mt.insertionSortList(l1);
			
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
