Add Two Numbers 
My Submissions Question
Total Accepted: 101578 Total Submissions: 480040 Difficulty: Medium
You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null){
        	return l2;
        }
        if(l2 == null){
        	return l1;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int c = 0;
        while(l1 != null && l2 != null){

        	int value = l1.val + l2.val;
        	if(value + c < 10){
        		value = value + c;
        		c = 0;
        	}
        	else{
        		value = value + c - 10;
        		c = 1;
        	}
        	current.next = new ListNode(value);
        	l1 = l1.next;
        	l2 = l2.next;
        	current = current.next;
        }

        while(l1 != null){

        	int value = l1.val + c;
        	if(value < 10){
        		c = 0;
        	}
        	else{
        		value -= 10;
        		c = 1;
        	}
        	current.next = new ListNode(value);
        	l1 = l1.next;
        	current = current.next;
        }
        while(l2 != null){

        	int value = l2.val + c;
        	if(value < 10){
        		c = 0;
        	}
        	else{
        		value -= 10;
        		c = 1;
        	}
        	current.next = new ListNode(value);
        	l2 = l2.next;
        	current = current.next;
        }
        if(c == 1){
        	current.next = new ListNode(1);
        }
        return dummy.next;
    }
}