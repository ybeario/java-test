package com.bear.offer.datastructure;

import com.bear.offer.TreeNode;

/**
 * 
 * 2018年6月21日
 * 
 * @author Y.bear
 * @describe 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 
 */
public class Mirror {
	public void mirror(TreeNode root) {
		if ((root == null) || (root.left == null && root.right == null)) {
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if (root.left != null) {
			mirror(root.left);
		}
		if (root.right != null) {
			mirror(root.right);
		}
	}
}
