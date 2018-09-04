package com.bear.newcoder.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Letter {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine2 = reader.readLine();
		String readLine = readLine2;
		String[] split = readLine.trim().split(" ");
		String line = reader.readLine();
		char[] charArray = line.toCharArray();
		int lastLength = 0;
		int cols = 1;
		for (char c : charArray) {
			if (Integer.parseInt(split[c - 'a']) + lastLength> 100) {
				cols++;
				lastLength = 0;
			}
			lastLength = Integer.parseInt(split[c - 'a']) + lastLength;
		}
		System.out.println(cols+" "+lastLength);
	}
}
