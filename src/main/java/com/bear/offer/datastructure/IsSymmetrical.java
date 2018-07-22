package com.bear.offer.datastructure;

import com.bear.offer.TreeNode;

/**
 * 
 * 2018年7月20日
 * 
 * @author Y.bear
 * @describe 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class IsSymmetrical {
	boolean isSymmetrical(TreeNode pRoot) {
		TreeNode temp = Mirror(pRoot);
		return isTrue(temp, pRoot);
	}

	public static boolean isTrue(TreeNode temp, TreeNode pRoot) {
		if (pRoot == null && temp == null)
			return true;
		if (pRoot == null || temp == null)		//若全为空，前面已经返回。必须有此判断，否则后面.val会报空指针异常
			return false;
		if (pRoot.val == temp.val)
			return isTrue(temp.left, pRoot.left) && isTrue(temp.right, pRoot.right);
		return false;
	}

	public static TreeNode Mirror(TreeNode root) {
		if (root == null)
			return null;
		TreeNode temp = new TreeNode(root.val);		//必须新建整棵树，否则指向同一地址。始终为true
		temp.left = Mirror(root.right);
		temp.right = Mirror(root.left);
		return temp;
	}
}
