package com.bear.offer.datastructure;

import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

/**
 * 
 * 2018年6月19日
 * 
 * @author Y.bear
 * @describe 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
	public ListNode findKthToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}
		int index = 0;
		List<ListNode> list = new ArrayList<>();
		while (head != null) {
			list.add(head);
			index++;
			head = head.next;
		}
		if (k <= index) {
			return list.get(index - k);
		} else {
			return null;
		}
	}
}
