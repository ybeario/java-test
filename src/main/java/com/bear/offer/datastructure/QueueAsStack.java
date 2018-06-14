package com.bear.offer.datastructure;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 *  2018年6月14日
 *  @author Y.bear
 *  @describe
 *  用两个队列模拟一个栈
 */
public class QueueAsStack {
	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();

	public void push(int node) {
		queue1.add(node);
	}

	public int pop() throws Exception {
		if (queue1.size() == 0 && queue2.size() != 0) {
			while (queue2.size() > 1) {
				queue1.add(queue2.poll());
			}
			if (queue2.size() == 1) {
				return queue2.poll();
			}
		} else if (queue2.size() == 0 && queue1.size() != 0) {
			while (queue1.size() > 1) {
				queue2.add(queue1.poll());
			}
			if (queue1.size() == 1) {
				return queue1.poll();
			}
		} else {
			throw new Exception("empty");
		}
		throw new Exception("error");
	}

	public static void main(String[] args) throws Exception {
		QueueAsStack stack = new QueueAsStack();
		stack.push(10);
		stack.push(9);
		stack.push(8);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(7);
		stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}