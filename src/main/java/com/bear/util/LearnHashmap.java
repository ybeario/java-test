package com.bear.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashmap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < 32; i++) {
			map.put("第" + i + "条", i);
		}
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
			System.out.println(entry.getKey() + entry.getValue());
		}
//		entrySet.forEach((entry) -> System.out.println(entry.getKey() + entry.getValue()));
//		map.forEach((k, v) -> System.out.println(k + "  " + v));

	}
}
