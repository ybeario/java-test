package com.bear.newcoder.study.dynamicplanning;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月6日 下午3:02:52 类说明 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n
 *          个学生中按照顺序选取 k 名学生，要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 */

public class Chorus {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextInt()) {
			int n = cin.nextInt(); // n 个学生
			int[] arr = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				arr[i] = cin.nextInt();
			}
			int k = cin.nextInt(); // 选出K个
			int d = cin.nextInt(); // 两个学生的位置编号的差不超过 d
			long[][] fmax = new long[k + 1][n + 1]; // 记录最大乘积
			long[][] fmin = new long[k + 1][n + 1]; // 记录最小乘积
			// fmax[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最大乘积；
			// fmin[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最小乘积；
			// 初始化第一行
			long res = Integer.MIN_VALUE; // 记得用Long类型，考虑数值范围
			for (int i = 1; i <= n; i++) { // i放数进入图表
				fmax[1][i] = arr[i];
				fmin[1][i] = arr[i];
				for (int t = 2; t <= k; t++) { // t代表第几个数 表中数据的横坐标代表当前由几个数组成，纵坐标代表以当前纵坐标为最后一个所选择的数
					for (int j = i - 1; j > 0 && i - j <= d; j--) {
						fmax[t][i] = Math.max(fmax[t][i], Math.max(fmax[t - 1][j] * arr[i], fmin[t - 1][j] * arr[i]));
						fmin[t][i] = Math.min(fmin[t][i], Math.min(fmax[t - 1][j] * arr[i], fmin[t - 1][j] * arr[i]));
					}
				}
				System.out.println("i="+i);
				System.out.println("fmax");
				for (long[] ls : fmax) {
					System.out.println(Arrays.toString(ls));
				}
				System.out.println("fmin");
				for (long[] ls : fmin) {
					System.out.println(Arrays.toString(ls));
				}
				res = Math.max(res, fmax[k][i]);
				System.out.println("--------------分割线------------------");
			}
			System.out.println(res);
		}
	}
}
