package com.bear.newcoder.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jump {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		System.out.println(JumpFloor(n));
	}

	public static int JumpFloor(int target) {
		int sum = 0;
		if (target == 0) {
			return 0;
		}
		if (target > 0) {
			if (target == 1) {
				return 1;
			}
			if (target == 2) {
				return 2;
			}
			int one = 1;
			int two = 2;

			while (target > 2) {
				sum = one + two;
				one = two;
				two = sum;
				target--;
			}
		}
		return sum;
	}
}
