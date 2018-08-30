package com.bear.offer.datastructure;

import java.util.LinkedList;

import com.bear.offer.TreeNode;

/**
 * @author Y.bear
 * @version 创建时间：2018年8月28日 下午6:26:27 类说明
 */
public class TreeToSequence {

	public int[][] convert(TreeNode root) {
		LinkedList<Integer> listFirst = new LinkedList<Integer>();
		LinkedList<Integer> listSecond = new LinkedList<Integer>();
		LinkedList<Integer> listEnd = new LinkedList<Integer>();
		preOrder(listFirst, root);
		inOrder(listSecond, root);
		lastOrder(listEnd, root);
		int[][] result = new int[3][listFirst.size()];
		for (int j = 0; j < listFirst.size(); j++) {
			result[0][j] = listFirst.get(j);
			result[1][j] = listSecond.get(j);
			result[2][j] = listEnd.get(j);
		}
		return result;
	}

	public void preOrder(LinkedList<Integer> linkedList, TreeNode root) {
		if (root == null) {
			return;
		}
		linkedList.add(root.val);
		preOrder(linkedList, root.left);
		preOrder(linkedList, root.right);
	}

	public void inOrder(LinkedList<Integer> linkedList, TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(linkedList, root.left);
		linkedList.add(root.val);
		inOrder(linkedList, root.right);
	}

	public void lastOrder(LinkedList<Integer> linkedList, TreeNode root) {
		if (root == null) {
			return;
		}
		lastOrder(linkedList, root.left);
		lastOrder(linkedList, root.right);
		linkedList.add(root.val);
	}
}
