package com.bear.offer.array;

import java.util.ArrayList;
import java.util.Collections;

public class GetMedian {
	public ArrayList<Integer> list = new ArrayList<>();

	public void Insert(Integer num) {
		list.add(num);
	}

	public Double getMedian() {
		if (list.size() == 0)
			return 0.0;
		Collections.sort(list);
		if ((list.size() ^ 1) == 1)
			return Double.valueOf(list.get((list.size() - 1) / 2));
		return Double.valueOf((list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2);
	}

	public static void main(String[] args) {
		GetMedian median = new GetMedian();
		median.Insert(12);
		median.Insert(1);
		median.Insert(7);
		median.Insert(121);
		median.Insert(152);
		median.Insert(56);
		System.out.println(median.getMedian());
	}
}
