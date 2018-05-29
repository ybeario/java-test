package com.bear.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainChuan {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			repeatedSubstringPattern(str);
		}
	}

	public static void repeatedSubstringPattern(String str) {
		int len = str.length();

		List<String> list = new ArrayList<String>();

		String temp = "";
		// len/2 可以生成的子串最大长度
		for (int i = 1; i <= len / 2; i++) {
			if (len % i == 0) {
				// 取子串
				String tem = str.substring(0, i);
				StringBuffer sb = new StringBuffer();
				for (int j = 0; j < len / i; j++) {
					// 循环生成最终字符串str
					sb = sb.append(tem);
				}
				// 验证
				if (sb.toString().equals(str))
					list.add(tem);
			}
		}
		if (list.size() == 0) {
			System.out.println("false");
		} else {
			for (int s = 0; s < list.size(); s++) {
				if (list.get(s).length() > temp.length()) {
					temp = list.get(s);
				}
				System.out.println(temp);
			}
		}
	}
}