package com.bear.newcoder.qihoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTencentSing {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		String[] strings;
		strings = br.readLine().split(" ");
		int A = Integer.parseInt(strings[0]);
		int X = Integer.parseInt(strings[1]);
		int B = Integer.parseInt(strings[2]);
		int Y = Integer.parseInt(strings[3]);
		int sum = 0;
		for (int i = 1; i <= X; i++) {
			for (int j = 1; j <= Y; j++) {
				if (i * A + j * B == K) {
					sum = sum + jie(i, X) * jie(j, Y);
				}
			}
		}
		System.out.println((sum + 1000000007) % 1000000007);
	}

	public static int jie(int x, int index) {
		if (x == 1) {
			return index;
		}
		return index * jie(--x, --index);
	}
}
