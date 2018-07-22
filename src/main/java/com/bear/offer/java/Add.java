package com.bear.offer.java;

/**
 * 
 * 2018年7月20日
 * 
 * @author Y.bear
 * @describe 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Add {
	public int add(int num1, int num2) {
		int n1 = (num1 & num2) << 1;
		int n2 = num1 ^ num2;
		int temp;
		while ((n1 & n2) != 0) {
			temp = n1;
			n1 = (n1 & n2) << 1;
			n2 = temp ^ n2;
		}
		return n1 | n2;
	}
}
