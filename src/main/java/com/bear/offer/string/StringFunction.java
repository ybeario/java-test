package com.bear.offer.string;

public class StringFunction {
	public static void main(String[] args) {
		String xString = "apple junk food   ";
		String yString = "orange junk food       f";
		operater(xString, yString);
		System.out.println(xString);
		xString.toUpperCase();
		System.out.println(xString);
	}

	public static void operater(String x, String y) {
		x = y.toUpperCase(); // 无法改变原值
		x = y;
		x.replaceAll("\\s+", "%20");
		System.out.println(x.replaceAll("\\s", "%20"));
		System.out.println("x=" + x);
	}
}
