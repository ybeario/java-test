package com.bear.offer.datastructure;

import com.bear.offer.ListNode;
/**
 * 
 *  2018年7月18日
 *  @author Y.bear
 *  @describe
 *  输入两个链表，找出它们的第一个公共结点。
 */
public class FindFirstCommonNode {
	public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null)
			return null;
		int p1Length = 0;
		int p2Length = 0;
		ListNode pLong = pHead1;
		ListNode pShort = pHead2;
		while (pHead1 != null) {
			p1Length++;
			pHead1 = pHead1.next;
		}
		while (pHead2 != null) {
			p2Length++;
			pHead2 = pHead2.next;
		}
		int dis = p1Length - p2Length;

		if (p1Length < p2Length) {
			dis = p2Length - p1Length;
			pLong = pHead2;
			pShort = pHead1;
		}
		for (int i = 0; i < dis; i++) {
			pLong = pLong.next;
		}
		while (pLong != null && pShort != null && pLong != pShort) {
			pLong = pLong.next;
			pShort = pShort.next;
		}
		return pLong;
	}
}
