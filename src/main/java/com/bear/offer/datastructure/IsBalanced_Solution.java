package com.bear.offer.datastructure;

import com.bear.offer.TreeNode;

/**
 * 
 * 2018年7月20日
 * 
 * @author Y.bear
 * @describe 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class IsBalanced_Solution {
	public boolean isBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		int dif = left - right;
		if (dif > 1 || dif < -1) {
			return false;
		}
		return isBalanced_Solution(root.left) && isBalanced_Solution(root.right);
	}

	public static int TreeDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		return Math.max(left, right) + 1;
	}
}
