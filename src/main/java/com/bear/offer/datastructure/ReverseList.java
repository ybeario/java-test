package com.bear.offer.datastructure;

import com.bear.offer.ListNode;

/**
 * 
 * 2018年6月19日
 * 
 * @author Y.bear
 * @describe 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseList {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode pre = null;
		ListNode next = null;

		while (head!= null) {
			next=head.next;
			head.next=pre;
			pre=head;
			head=next;
		}
		return pre;
	
	}
}
