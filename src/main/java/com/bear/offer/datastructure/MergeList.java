package com.bear.offer.datastructure;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

/**
 * 
 * 2018年6月20日
 * 
 * @author Y.bear
 * @describe 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeList {
	public ListNode Merge(ListNode list1, ListNode list2) {
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
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		ListNode preNode=null;
		if (list1.val<=list2.val) {
			preNode=list1;
			preNode.next=mergeList(list1.next, list2);
		}else {
			preNode=list2;
			preNode.next=mergeList(list1, list2.next);
		}
		return preNode;

	}

	public static void main(String[] args) {
		ListNode preNode = null;
		ListNode list1 = new ListNode(1);
		preNode = list1;
		preNode.next = new ListNode(3);
		preNode = preNode.next;
		preNode.next = new ListNode(5);
	}
}
