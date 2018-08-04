package com.bear.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

public class WeakHash {
	public static void main(String[] args) {
		HashMap<String, Object> wmap = new HashMap<String, Object>();
		final int SIZE = 10;
		String[] str = new String[SIZE];
		for (int i = 0; i < SIZE; i++) {
			String key = Integer.toString(i);
			String value = Integer.toString(i);
			// 每隔3个保留一个引用
			if (i % 3 == 0)
				str[i] = key;
			wmap.put(key, value);
		}
		System.gc();
		Iterator<String> iter = wmap.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(wmap.get(iter.next()));
		}
	}
}
