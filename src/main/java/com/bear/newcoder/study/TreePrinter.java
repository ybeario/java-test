package com.bear.newcoder.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 *  2018年6月23日
 *  @author Y.bear
 *  @describe
 *  有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 *  给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
 *  所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
 */
public class TreePrinter {
	public int[][] printTree(TreeNode root) {
		ArrayList<ArrayList<TreeNode>> list = new ArrayList<>();
		if (root == null) {
			return null;
		}
		TreeNode temp = null;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			ArrayList<TreeNode> nodes = new ArrayList<>();
			for (int i = queue.size(); i > 0; i--) {
				temp = queue.poll();
				nodes.add(temp);
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
			list.add(nodes);
		}
		int[][] results=new int[list.size()][];
		for (int i = 0; i < results.length; i++) {
			results[i]=new int[list.get(i).size()];
			for (int j = 0; j < list.get(i).size(); j++) {
				results[i][j]=list.get(i).get(j).val;
			}
		}
		return results;

	}
}
