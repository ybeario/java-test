package com.bear.offer.datastructure;

import java.util.Stack;

import com.bear.offer.ListNode;

/**
 * 
 * 2018年8月9日
 * 
 * @author Y.bear
 * @describe 有一个单链表，请设计一个算法，使得每K个节点之间逆序，如果最后不够K个节点一组，则不调整最后几个节点。
 *           例如链表1->2->3->4->5->6->7->8->null，K=3这个例子。调整后为，3->2->1->6->5->4->7->8->null。
 *           因为K==3，所以每三个节点之间逆序，但其中的7，8不调整，因为只有两个节点不够一组。
 *           给定一个单链表的头指针head,同时给定K值，返回逆序后的链表的头指针。
 */
public class KInverse {
	public ListNode inverse(ListNode head, int k) {
		if (k <= 1)
			return head;
		Stack<Integer> stack = new Stack<>();
		ListNode front = head;
		ListNode back = head;
		while (front != null) {
			for (int i = 0; i < k; i++) {
				if (front == null) {
					return head;
				}
				stack.push(front.val);
				front = front.next;
			}
			while (stack.isEmpty() == false) {
				back.val = stack.pop();				//注意此处共有三个指向链表头，但是只有head一直没移动
				back = back.next;                   //front探路，back修改值
			}
		}
		return head;
	}
}
