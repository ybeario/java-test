package com.bear.offer.datastructure;

import com.bear.offer.TreeNode;

/**
 * 
 * 2018年6月13日
 * 
 * @author Y.bear
 * @describe 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *           例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ReConstructBinaryTree {
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre == null || in == null) {
			return null;
		}
		return coreConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	public static TreeNode coreConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn,
			int endIn) {
		int rootValue = pre[startPre];
		TreeNode treeNode = new TreeNode(rootValue);
		treeNode.left = treeNode.right = null;
		if (startPre == endPre) {
			if (startIn == endIn && pre[startPre] == in[startIn]) {
				return treeNode;
			} else {
				return null;
			}
		}
		int rootIn = startIn;
		while (rootIn <= endIn && in[rootIn] != rootValue) {
			rootIn++;
		}
		int leftLength = rootIn - startIn;
		int leftPreEnd = startPre + leftLength;
		if (leftLength > 0) {
			treeNode.left = coreConstructBinaryTree(pre, startPre + 1, leftPreEnd, in, startIn, rootIn - 1);
		}
		if (endIn - rootIn > 0 && startPre + leftLength + 1 < in.length) {
			treeNode.right = coreConstructBinaryTree(pre, startPre + leftLength + 1, endPre, in, rootIn + 1, endIn);
		}
		return treeNode;

	}

	public static void main(String[] args) {
		int pre[] = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int in[] = { 4, 7, 2, 1, 5, 3, 8, 6 };
	}
}

