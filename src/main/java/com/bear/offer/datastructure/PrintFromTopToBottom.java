package com.bear.offer.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.bear.offer.TreeNode;

/**
 * 
 *  2018年6月23日
 *  @author Y.bear
 *  @describe
 *  
 */
public class PrintFromTopToBottom {
	 public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
         ArrayList<Integer> list=new ArrayList<>(); 
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
       
        TreeNode temp=null;
            queue.offer(root);
        while(!queue.isEmpty()){
            temp=queue.poll();
            list.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
            return list;
    }
}
