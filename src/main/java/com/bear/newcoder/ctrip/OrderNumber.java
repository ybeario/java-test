package com.bear.newcoder.ctrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class OrderNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int recordsNum = Integer.parseInt(reader.readLine());
		int targetTime = Integer.parseInt(reader.readLine());
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i < recordsNum; i++) {
			String readLine = reader.readLine().trim();
			String[] split = readLine.split(" ");
			String orderNumber = split[0];
			int inTime = Integer.parseInt(split[1]);
			int outTime = Integer.parseInt(split[2]);
			if (check(targetTime, inTime, outTime)) {
				set.add(orderNumber);
			}
		}
		if (set.isEmpty()) {
			System.out.println("null");
		}
		for (String string : set) {
			System.out.println(string);
		}
	}

	public static boolean check(int targetTime, int inTime, int outTime) {
		if (targetTime >= inTime && targetTime <= outTime) {
			return true;
		}
		return false;

	}
}
