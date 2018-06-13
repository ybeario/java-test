package com.bear.newcoder.qihoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPinjie {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		int i;
		int j;
		String str = null;
		while ((str = br.readLine()) != null) {
			n = Integer.parseInt(str.trim());
			if (n % 2 == 0) {
				i = (n / 6) * 2;
				j = (n % 6 / 2);
				System.out.println((int) (Math.pow(3, i) * Math.pow(2, j)));
			} else {
				i = ((n - 3) / 6) * 2 + 1;
				j = ((n - 3) % 6) / 2;
				System.out.println((int)(Math.pow(3, i) * Math.pow(2, j)));
			}
		}

	}
}
