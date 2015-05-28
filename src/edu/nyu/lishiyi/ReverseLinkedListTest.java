package edu.nyu.lishiyi;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseLinkedListTest {

	@Test
	public void test() {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		
		ReverseLinkedList re = new ReverseLinkedList();
		ListNode ll1 = re.reverseList(l1);
		
		assertEquals(3, ll1.val);
		assertEquals(2, ll1.next.val);
		assertEquals(1, ll1.next.next.val);

	}

}
