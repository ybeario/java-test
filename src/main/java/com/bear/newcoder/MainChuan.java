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
		// len/2 �������ɵ��Ӵ���󳤶�
		for (int i = 1; i <= len / 2; i++) {
			if (len % i == 0) {
				// ȡ�Ӵ�
				String tem = str.substring(0, i);
				StringBuffer sb = new StringBuffer();
				for (int j = 0; j < len / i; j++) {
					// ѭ�����������ַ���str
					sb = sb.append(tem);
				}
				// ��֤
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