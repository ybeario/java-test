package com.bear.newcoder.hikvision;

public class Main {
	public static void main(String[] args) {
		System.out.println(isTrue(128));
	}

	public static boolean isTrue(int num) {
		if (num == 0) {
			return false;
		}
		num = (num - 1) & num;
		if (num == 0) {
			return true;
		} else {
			return false;
		}
	}

}
