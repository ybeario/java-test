package com.bear.offer.string;

public class ReverseSentence {
	public static String reverseSentence(String str) {
		if (str.trim().equals("")) {
			return str;
		}
		String[] split = str.split(" ");
		String result = helper(split, 0);
		buffer.setLength(0);
		return result;
	}

	static StringBuffer buffer = new StringBuffer();

	public static String helper(String[] str, int index) {
		if (index != str.length - 1) {
			helper(str, index + 1);
		}
		if (index == 0) {
			buffer.append(str[index]);
		} else {
			buffer.append(str[index] + " ");
		}
		return buffer.toString();
	}
}
