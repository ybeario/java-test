package com.bear.offer.datastructure;

import com.bear.offer.ListNode;

/**
 * 
 * 2018年6月20日
 * 
 * @author Y.bear
 * @describe 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeList {
	public static ListNode Merge(ListNode list1, ListNode list2) {
		ListNode listNode = null;
		ListNode preNode = null;
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				if (listNode == null) {
					listNode = list1;
					preNode = listNode;
				} else {
					preNode.next = list1;
					preNode = list1;
				}
				list1 = list1.next;

			} else {
				if (listNode == null) {
					listNode = list1;
					preNode = listNode;
				} else {
					preNode.next = list2;
					preNode = list2;
				}
				list2 = list2.next;

			}
		}
		if (list1 == null && list2 == null) {
			preNode.next = null;
		} else if (list1 != null) {
			preNode.next = list1;
		} else {
			preNode.next = list2;
		}
		return listNode;

	}

	public static ListNode mergeList(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		if (list1.val < list2.val) {
			list1.next = mergeList(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeList(list1, list2.next);
			return list2;
		}

	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node2.next = new ListNode(99);
		ListNode newNode = null;
		node.next = new ListNode(4);
		node.next.next = new ListNode(10);
		newNode = mergeList(node, node2);
		while (newNode != null) {
			System.out.println(newNode.val);
			newNode = newNode.next;
		}
	}
}
