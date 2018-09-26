package com.bear.offer.num;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月19日 上午10:38:25 类说明 反转数字，同时去掉开头的0
 */
public class Reverse {
	public static void main(String[] args) {
		System.out.println(rev(rev(100)+rev(322)));
	}

	public static int rev(int num) {
		String string = num + "";
		char[] charArray = string.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (i == charArray.length - 1) {
				while (charArray[i] == '0') {
					i--;
				}
			}
			buffer.append(charArray[i]);
		}
		return Integer.parseInt(buffer.toString());
	}
}
