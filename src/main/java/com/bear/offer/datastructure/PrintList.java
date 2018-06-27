package com.bear.offer.datastructure;

import java.util.ArrayList;
import java.util.Stack;

import com.bear.offer.ListNode;
/*
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class PrintList {

	ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//		if (listNode != null) {							//递归方法
//			if (listNode.next != null) {
//				printListFromTailToHead(listNode.next);
//			}
//			list.add(listNode.val);
//			System.out.println(listNode.val);
//		}
//		return list;
		
		Stack<Integer> stack=new Stack<>();			//利用栈的属性，先进后出
		while (listNode!=null) {
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		ArrayList<Integer> list=new ArrayList<>();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
}


