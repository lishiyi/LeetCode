Palindrome Linked List 
My Submissions Question
Total Accepted: 26907 Total Submissions: 109552 Difficulty: Easy
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
        	return true;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null){
        	slow = slow.next;
        	fast = fast.next.next;
        }

        ListNode prev = slow;
        ListNode current = slow.next;
        prev.next = null;
        while(current != null){
        	ListNode next = current.next;
        	current.next = prev;
        	prev = current;
        	current = next;
        }

        ListNode left = head;
        ListNode right = prev;
        while(left != null && right != null){
        	if(left.val != right.val){
        		return false;
        	}
        	left = left.next;
        	right = right.next;
        }
        return true;
    }
}