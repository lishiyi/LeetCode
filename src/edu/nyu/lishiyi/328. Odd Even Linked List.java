328. Odd Even Linked List My Submissions Question
Total Accepted: 7425 Total Submissions: 19623 Difficulty: Easy
Given a singly linked list, group all odd nodes together followed by the even nodes. 
Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.

Note:
The relative order inside both the even and odd groups should remain as it was in the input. 
The first node is considered odd, the second node even and so on ...

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null){
        	return head;
        }

        ListNode dummy1 = new ListNode(0);
        ListNode oddP = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode evenP = dummy2;
        boolean isOdd = true;

        while(head != null){
        	if(isOdd){
        		oddP.next = head;
        		oddP = oddP.next;
        	}
        	else{
        		evenP.next = head;
        		evenP = evenP.next;
        	}
        	isOdd = !isOdd;
        	head = head.next;
        }
        evenP.next = null;
        oddP.next = dummy2.next;
        return dummy1.next;
    }
}