package com.bear.offer.datastructure;

import java.util.ArrayList;
import java.util.List;

import com.bear.offer.ListNode;


/**
 * 
 * 2018年6月19日
 * 
 * @author Y.bear
 * @describe 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
//	public ListNode findKthToTail(ListNode head, int k) {
//		if (head == null || k == 0) {
//			return null;
//		}
//		int index = 0;
//		List<ListNode> list = new ArrayList<>();
//		while (head != null) {
//			list.add(head);
//			index++;
//			head = head.next;
//		}
//		if (k <= index) {
//			return list.get(index - k);
//		} else {
//			return null;
//		}
//	}
	/**
	 * 
	 * @param head
	 * @param k
	 * @return
	 * 利用双指针遍历链表，一个指针先走，一个后走，中间的距离即可认为是倒数的距离
	 * 
	 * 
	 * 拓展：求链表的中间元素，一个指针每次一步，一个每次两步
	 */
	 public ListNode findKthToTail(ListNode head,int k) {
	        if(head==null || k==0){
	            return null;
	        }
	        ListNode pFirst=head;
	        ListNode pSecond=head;
	        int count=0;
	        while(pFirst!=null){
	            if(count>=k){
	                pSecond=pSecond.next;
	            }
	            pFirst=pFirst.next;
	            count++;
	            
	        }
	        if(count<k){
	            return null;
	        }
	        return pSecond;
	    }
}
