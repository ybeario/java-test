package com.bear.codeM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Cola {
	private static int n, m, k;
	private static double[][] level;
	private static int[] num;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] split = reader.readLine().split(" ");
		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);
		k = Integer.parseInt(split[2]);
		num = new int[k];
		level = new double[k][2];
		init(reader);
		findExpection();
	}

	private static void init(BufferedReader reader) throws IOException {
		for (int i = 0; i < k; i++) {
			String[] split = reader.readLine().split(" ");
			level[i][0] = Integer.parseInt(split[0]);
			level[i][1] = Integer.parseInt(split[1]);
		}
		Arrays.fill(num, 0);
	}

	private static void findExpection() {
		double big = (level[0][0] * m) + (n - m) * level[0][1];
		int index = 0;
		if (n != 0) {
			for (int i = 0; i < level.length; i++) {
				double val = (level[i][0] * m) + (n - m) * level[i][1];
				if (val >= big) {
					big = val;
					index = i;
				}
			}
			num[index] = n;
		}
		for (int i = 0; i < num.length; i++) {
			if (i != num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i]);
			}
		}
	}
}
