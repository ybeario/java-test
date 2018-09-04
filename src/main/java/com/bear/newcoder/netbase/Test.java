package com.bear.newcoder.netbase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		String[] split = readLine.trim().split(" ");
		int n = Integer.parseInt(split[0]);
		int k = Integer.parseInt(split[1]);
		int[] score = new int[n];
		int[] status = new int[n];
		String scoreString = reader.readLine();
		String[] split2 = scoreString.trim().split(" ");
		for (int i = 0; i < split2.length; i++) {
			score[i] = Integer.parseInt(split2[i]);
		}
		String statusString = reader.readLine();
		String[] split3 = statusString.trim().split(" ");
		for (int i = 0; i < split3.length; i++) {
			status[i] = Integer.parseInt(split3[i]);
		}
		int result = 0;

		int max = 0;
		int finalIndex = -2;
		int finalEndIndex = -2;

		for (int i = 0; i < status.length; i++) {
			if (status[i] == 0) {
				int index = i;
				int startIndex = i;
				int temp = 0;
				int times = k;
				while (index < status.length && times > 0) {
					temp += score[index];
					index++;
					times--;
				}
				if (temp > max) {
					max = temp;
					finalIndex = startIndex;
					finalEndIndex = index - 1;
				}
			}
		}

		if (finalIndex == -2) {

			for (int i = 0; i < score.length; i++) {
				if (status[i] == 1) {
					result += score[i];
				}
			}
		} else {
			for (int i = 0; i < score.length; i++) {
				if (i >= finalIndex && i <= finalEndIndex) {
					result += score[i];
				} else {

					if (status[i] == 1) {
						result += score[i];
					}
				}

			}
		}
		System.out.println(result);
	}
}
