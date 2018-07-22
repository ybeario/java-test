package com.bear.offer.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

import com.bear.offer.TreeNode;

/**
 * 
 * 2018年7月22日
 * 
 * @author Y.bear
 * @describe
 * 
 */
public class Print {
	public static void main(String[] args) {
		Print print=new Print();
		TreeNode node=new TreeNode(10);
		node.left=new TreeNode(5);
		node.right=new TreeNode(8);
		ArrayList<ArrayList<Integer>> print2 = print.print(node);
		for (ArrayList<Integer> arrayList : print2) {
			for (Integer integer : arrayList) {
				System.out.println(integer);
			}
		}
	}
	public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		LinkedList<TreeNode> queue = new LinkedList<>();
		LinkedList<TreeNode> queue2 = new LinkedList<>();
		if (pRoot == null)
			return result;
		queue.add(pRoot);

		while (!queue.isEmpty() || !queue2.isEmpty()) {

			if (!queue.isEmpty()) {
				int size = queue.size();
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int i = size - 1; i >= 0; i--) {
					TreeNode temp = queue.get(i);
					if (temp.left != null)
						queue2.add(temp.left);
					if (temp.right != null)
						queue2.add(temp.right);
					list.add(temp.val);
				}
				queue.clear();
				result.add(list);

			}
			if (!queue2.isEmpty()) {
				int size = queue2.size();
				ArrayList<Integer> list = new ArrayList<Integer>();

				for (int i = size - 1; i >= 0; i--) {
					TreeNode temp = queue2.get(i);
					if (temp.right != null)
						queue.add(temp.right);
					if (temp.left != null)
						queue.add(temp.left);
					list.add(temp.val);
				}
				queue2.clear();
				result.add(list);
			}

		}
		return result;
	}
}
