package com.bear.newcoder.qihoo;

public class StringTest {

	
	public static void main(String[] args) {
		String aString ="a";
		String bString="b";
		operater(aString, bString);
		System.out.println(aString);
		System.out.println(bString);
	}

	public static void operater(String x, String y) {
		x=x+y;
		y=x;
		System.out.println(x);
		System.out.println(y);
	}
}
