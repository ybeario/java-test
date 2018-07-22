package com.bear.offer.array;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxInWindows {
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> arr = new ArrayList<>();
		if (num == null)
			return arr;
		if (num.length < size || size <= 0)
			return arr;
		Deque<Integer> queue = new LinkedList<>();
		for (int i = 0; i < num.length; i++) {
			while (!queue.isEmpty() && num[i] >= num[queue.getLast()])
				queue.pollLast();
			while (!queue.isEmpty() && queue.getFirst() < i - (size - 1))
				queue.pollFirst();
			queue.offerLast(i);
			if (i + 1 >= size)
				arr.add(num[queue.getFirst()]);
		}
		return arr;

	}
}
