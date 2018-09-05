package com.bear.offer.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月4日 下午2:12:17 类说明
 */
public class FirstThreeTimes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		line = line.replaceAll("[^a-zA-Z]", "");
		char[] ch = line.toCharArray();
		int[] count = new int[58];
		for (int i = 0; i < line.length(); i++) {
			count[ch[i] - 'A']++;
			if (count[ch[i] - 'A'] == 3) {
				System.out.print(ch[i]);
				break;
			}
		}

	}
}
