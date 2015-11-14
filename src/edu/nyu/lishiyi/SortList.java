Sort List 
My Submissions Question
Total Accepted: 57625 Total Submissions: 248549 Difficulty: Medium
Sort a linked list in O(n log n) time using constant space complexity.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        //Find the mid
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode prev = slow;
        while(fast != null && fast.next != null){
            
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        //Divide
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        //Merge
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right){

    	if(left == null){
    		return right;
    	}
    	if(right == null){
    		return left;
    	}

    	ListNode dummy = new ListNode(0);
    	ListNode current = dummy;

    	while(left != null && right != null){

    		if(left.val < right.val){
    			current.next = left;
    			left = left.next;
    		}
    		else{
    			current.next = right;
    			right = right.next;
    		}
    		current = current.next;
    	}

    	if(right == null){
    		current.next = left;
    	}
    	else if(left == null){
    		current.next = right;
    	}

    	return dummy.next;
    }
}