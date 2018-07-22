package com.bear.offer.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 
 * 2018年7月17日
 * 
 * @author Y.bear
 * @describe 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class GetLeastNumbers_Solution {
	public ArrayList<Integer> getLeastNumbers_Solution(int[] input, int k) {

		// Arrays.sort(input);
		// ArrayList<Integer> list=new ArrayList<>();
		// if (k>input.length||input==null || k==0) {
		// return list;
		// }
		// for (int i = 0; i < k; i++) {
		// list.add(input[i]);
		// }
		// return list;

		ArrayList<Integer> list = new ArrayList<>();
		if (k > input.length || input == null || k==0) {
			return list;
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		for (int i = 0; i < input.length; i++) {
			if (queue.size() != k) {
				queue.offer(input[i]);
			} else if (queue.peek() > input[i]) {
				queue.poll();
				queue.offer(input[i]);
			}
		}
		for (Integer integer : queue) {
			list.add(integer);
		}
		return list;

	}
}
