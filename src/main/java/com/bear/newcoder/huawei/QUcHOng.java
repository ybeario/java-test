package com.bear.newcoder.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class QUcHOng {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String trim = reader.readLine().trim();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		char[] charArray = trim.toCharArray();
		for (char c : charArray) {
			set.add(c);
		}
		StringBuffer buffer=new StringBuffer();
		for (char c : set) {
			buffer.append(c);
		}
		System.out.println(buffer.toString());
	}
}
