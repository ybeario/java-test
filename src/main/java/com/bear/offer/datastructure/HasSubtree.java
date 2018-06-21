package com.bear.offer.datastructure;

class TreeNode {
	int val = 0;
	TreeNode right = null;
	TreeNode left = null;

	public TreeNode(int val) {
		this.val = val;
	}
}

/**
 * 
 * 2018年6月21日
 * 
 * @author Y.bear
 * @describe 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {
	public static boolean result = false;

	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = DoesTreeHaveTree2(root1, root2);
			}
			if (!result) {
				result = hasSubtree(root1.left, root2);
			}
			if (!result) {
				result = hasSubtree(root1.right, root2);
			}
		}

		return result;

	}

	public static boolean DoesTreeHaveTree2(TreeNode pRoot1, TreeNode pRoot2) {
		if (pRoot2 == null) {
			return true;
		}
		if (pRoot1 == null) {
			return false;
		}
		if (pRoot1.val != pRoot2.val) {
			return false;
		}
		return DoesTreeHaveTree2(pRoot1.left, pRoot2.left) && DoesTreeHaveTree2(pRoot1.right, pRoot2.right);

	}
}
