package com.bear.newcoder;

public class IntTest {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		operater(a, b);
		System.out.println(a);
		System.out.println(b);
	}

	public static void operater(int a, int b) {
		a = a + b;
		b = a;
		System.out.println(a);
		System.out.println(b);
	}
}
