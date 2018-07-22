package com.bear.offer.collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 
 *  2018年7月18日
 *  @author Y.bear
 *  @describe
 *  在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1.
 */
public class FirstNotRepeatingChar {
	public int firstNotRepeatingChar(String str) {
		if (str==null || str.length()==0) {
			return -1;
		}
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}

		if (map.containsValue(1)) {
			Set<Entry<Character, Integer>> entrySet = map.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
			
				if (entry.getValue()==1) {
					return str.indexOf(entry.getKey());
				}
			}
		}else {
			return -1;
		}
		return -1;
	}
}
