package com.bear.newcoder.sfTechnology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] split = reader.readLine().trim().split(",");
		int maxWidth = Integer.parseInt(reader.readLine());
		List<String> result = new ArrayList<>();
		result = fullJustify(split, maxWidth);
		for (String string : result) {
			System.out.println(string);
		}
	}

	public static List fullJustify(String[] words, int maxWidth) {
		List<String> result = new ArrayList<>();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			if (buffer.length() != 0) {
				buffer.append(" " + words[i]);
			} else {
				buffer.append(words[i]);
			}
			if (i == words.length - 1) {
				result.add(buffer.toString());
			} else if (buffer.length() + 1 + words[i + 1].length() > maxWidth) {
				result.add(buffer.toString());
				buffer.setLength(0);
			}
		}
		return result;

	}
}
