package com.bear.offer.string;

public class LeftRotateString {
	public String leftRotateString(String str, int n) {
		if (str.length() == 0)
			return "";
		int len = str.length();
		n = n % len;
		str = str + str;
		return str.substring(n, len + n);
	}
}
