package com.bear.offer.array;

/**
 * 
 * 2018年8月7日
 * 
 * @author Y.bear
 * @describe 1元，3元和5元的硬币若干枚，如何用最少的硬币凑够11元
 */
public class CoinsMin {
	// 测试用例
	public static void main(String[] args) {
		int m = 112;
		int[] temp = coinCoin(m);
		for (int i = 0; i <= m; i++) {
			System.out.println(i + "元最少需要" + temp[i] + "个硬币！");
		}
	}

	// 找出最少的钱的数目
	private static int[] coinCoin(int m) {
		int[] a = { 1, 3, 5 }; // 硬币面值
		int[] temp = new int[m + 1]; // 存储所需硬币的数目
		for (int i = 0; i <= m; i++) {
			temp[i] = i; // 默认全部使用1元，则i元最多需要使用i个银币。
		}
		for (int i = 1; i <= m; i++) {
			// 这个外层循坏，依次对1到m个钱数，进行凑数
			for (int j = 0; j < 3; j++) {
				// 这个内层循环，每次都会固定执行3次
				if (a[j] <= i && temp[i - a[j]] + 1 < temp[i]) {
					temp[i] = temp[i - a[j]] + 1;
					/*
					 * a[j] <= i依次判断i和1,3,5的相对大小，决定第一步有几种方案， temp[i - a[j]] + 1 < temp[i]这个不太容易理解，
					 * 我们将temp[i]初始值设为i,在三次内循环判断中，如果这一次temp[i - a[j]] 比上一次小，那么就将这一次的值赋给temp[i]
					 *
					 * 举例，i=6,此时前面循环执行完毕 temp[0] = 0,temp[1] = 1 temp[2] = 2,temp[3] = 1 temp[4] =
					 * 2,temp[5] = 3 第一步就有三种方案，当前内循环执行三次 j = 0 时，a[j]=1 <= i=6成立，temp[i - a[j]] + 1
					 * = temp[6-1] + 1 = 4 < temp[i]=6成立 所以temp[6] = temp[i - a[j]] + 1 = 4 j = 1
					 * 时，a[j]=3 <= i=6成立，temp[i - a[j]] + 1 = temp[6-3] + 1 = 2 < temp[i]=4成立
					 * 所以temp[6] = temp[i - a[j]] + 1 = 2 j = 2 时，a[j]=5 <= i=6成立，temp[i - a[j]] + 1
					 * = temp[6-5] + 1 = 2 < temp[i]=2不成立 所以temp[6] = temp[i - a[j]] + 1 = 2
					 * 这样，最终temp[6] = 2，就从三种方案中选择出最小的了
					 */
				}
			}
		}
		return temp;
	}

}
