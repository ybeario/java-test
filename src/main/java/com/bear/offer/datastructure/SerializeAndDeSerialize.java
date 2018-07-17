package com.bear.offer.datastructure;

import com.bear.offer.TreeNode;

public class SerializeAndDeSerialize {
	StringBuffer buffer=new StringBuffer();
	String Serialize(TreeNode root) {
		if (root==null) {
			buffer.append("# ");
		}else {			
			buffer.append(root.val + " ");
			Serialize(root.left);
			Serialize(root.right);
		}
		return buffer.toString();
	}

	TreeNode Deserialize(String str) {
		if (str==null) {
			return null;
		}
		String[] split = str.split(" ");
		if (split.length==0) {
			return null;
		}
		return Deserialize(split);

	}
	int index=0;
	TreeNode Deserialize(String[] split) {
		if (index<split.length) {	
			String val = split[index++];
			TreeNode root = null;
			if (val.equals("#")) {
				return null;
			} else {
				root = new TreeNode(Integer.valueOf(val));
				root.left = Deserialize(split);
				root.right = Deserialize(split);
				return root;
			}
		}
		return null;
	}
}
