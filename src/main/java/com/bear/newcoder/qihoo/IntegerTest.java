package com.bear.newcoder.qihoo;

public class IntegerTest {
	public static void main(String[] args) {
		Integer a =1;
		Integer b=2;
		operater(a, b);
		System.out.println(a);
		System.out.println(b);
	}
	public static void operater(Integer a,Integer b) {
		a=a+b;
		b=a;
		System.out.println(a);
		System.out.println(b);
	}
}
