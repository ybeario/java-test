package com.bear.offer.num;
/**
 * 
 *  2018年6月17日
 *  @author Y.bear
 *  @describe
 *  大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 *	n<=39
 */
public class Fibonacci {
	public static int FibonacciNum(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		int one = 0;
		int two = 1;
		int num = 0;
		for (int i = 0; i < n; i++) {
			num = one + two;
			two = one;
			one = num;
		}
		return num;
	}
	public static void main(String[] args) {
	System.out.println(FibonacciNum(4));	
	}
}
