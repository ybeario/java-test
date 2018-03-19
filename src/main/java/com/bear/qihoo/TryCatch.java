package com.bear.qihoo;

public class TryCatch {
	public int add(int a, int b) {
		try {
			return a + b;
		} catch (Exception e) {
			System.out.println("catch Óï¾ä¿é");
		} finally {
			System.out.println("finally Óï¾ä¿é");
		}
		return 0;
	}

	public static void main(String argv[]) {
		TryCatch test = new TryCatch();
		System.out.println("ºÍÊÇ£º " + test.add(9, 34));
	}
}