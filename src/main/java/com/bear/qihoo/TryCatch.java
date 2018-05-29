package com.bear.qihoo;

public class TryCatch {
	public int add(int a, int b) {
		try {
			return a + b;
		} catch (Exception e) {
			System.out.println("catch 语句块");
		} finally {
			System.out.println("finally 语句块");
		}
		return 0;
	}

	public static void main(String argv[]) {
		TryCatch test = new TryCatch();
		System.out.println("和是： " + test.add(9, 34));
	}
}