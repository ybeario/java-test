package com.bear.newcoder.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().trim());
		int times = 0;
		for (int i = 1; i <= n; i++) {
			if (checkGoodNum(i)) {
				times++;
			}
		}
		System.out.println(times);
	}

	public static boolean checkGoodNum(int num) {
		String s = num + "";
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '2':
				charArray[i] = '5';
				break;
			case '5':
				charArray[i] = '2';
				break;
			case '6':
				charArray[i] = '9';
				break;
			case '9':
				charArray[i] = '6';
				break;
			case '3':
				return false;
			case '4':
				return false;
			case '7':
				return false;
			}
		}
		StringBuffer buffer=new StringBuffer();
		for (char c : charArray) {
			buffer.append(c);
		}
		if (buffer.toString().equals(s)) {
			return false;
		}
		return true;
	}
}
