package com.bear.qihoo;

public class TryCatch {
	public int add(int a, int b) {
		try {
			return a + b;
		} catch (Exception e) {
			System.out.println("catch ����");
		} finally {
			System.out.println("finally ����");
		}
		return 0;
	}

	public static void main(String argv[]) {
		TryCatch test = new TryCatch();
		System.out.println("���ǣ� " + test.add(9, 34));
	}
}