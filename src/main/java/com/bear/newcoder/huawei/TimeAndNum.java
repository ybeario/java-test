package com.bear.newcoder.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeAndNum {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine;
		int[] table = new int[8];
		while (!(readLine = reader.readLine().trim()).equals("-1,-1")) {
			String[] split = readLine.split(",");
			int num1 = Integer.parseInt(split[0]);
			int num2 = Integer.parseInt(split[1]);
			if (num1 < num2  && num1 < 20 && num2 > 12) {
				if (num1<12) {
					num1=12;
				}
				if (num2 > 20) {
					num2 = 20;
				}
				setNum(table, num1, num2);
			}
		}
		print(table);
	}

	public static void setNum(int[] table, int start, int end) {
		for (int i = start - 12; i < end - 12; i++) {
			table[i]++;
		}
	}

	public static void print(int[] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.println("[" + (i + 12) + "," + (i + 13) + "):" + table[i]);
		}
	}
}
