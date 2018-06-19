package com.bear.offer.num;

/**
 * 
 * 2018年6月19日
 * 
 * @author Y.bear
 * @describe 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1 {
	public static int numberOf(int n) {
		int num = 0;
		int flag = 1;
		while (flag != 0) {
			if ((n & flag) != 0) {
				num++;
			}
			flag = flag << 1; // 强行循环整个int的取值范围
		}
		return num;
	}
	/**
	 * 把一个整数减去1，再和原整数做与运算，会把该整数最右边的一个1变成0.
	 * @param n
	 * @return
	 */
	public static int number(int n) {
		int num = 0;
		while (n != 0) {
			num++;
			n = n & (n - 1);
		}
		return num;
	}
}
