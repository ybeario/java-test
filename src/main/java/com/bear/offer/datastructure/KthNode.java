package com.bear.offer.datastructure;

import java.util.ArrayList;

import com.bear.offer.TreeNode;

/**
 * 
 * 2018年7月22日
 * 
 * @author Y.bear
 * @describe 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8） 中，按结点数值大小顺序第三小结点的值为4。
 */
public class KthNode {
	static ArrayList<TreeNode> list = new ArrayList<>();
	public static void main(String[] args) {
		TreeNode node=new TreeNode(10);
		node.left=new TreeNode(5);
		node.right=new TreeNode(8);
		TreeNode kthNode = kthNode(node, 4);
		System.out.println(kthNode.val);
	}

	public static TreeNode kthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k <= 0)
			return null;
		helper(pRoot);
		if (k > list.size()) {
			return null;
		} else {
			return list.get(k - 1);
		}

	}

	public static void helper(TreeNode pRoot) {
		if (pRoot == null)
			return;
		helper(pRoot.left);
		list.add(pRoot);
		helper(pRoot.right);
	}
}
