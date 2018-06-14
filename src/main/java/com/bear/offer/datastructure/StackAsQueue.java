package com.bear.offer.datastructure;

import java.util.Stack;

/**
 * 
 * 2018年6月14日
 * 
 * @author Y.bear
 * @describe 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class StackAsQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() throws Exception {
		if (stack2.size()>0) {
			return stack2.pop();
		}else {
			if (stack1.size()<=0) {
				throw new Exception("queue is empty");
			}
			while (stack1.size()>0) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}
		
	}
}
