package com.bear.order;

public class ShellSort {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 希尔排序
		shellSort(a);
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void shellSort(int[] a) {
		int d = a.length;
		while (true) {
			d = d / 2;
			for (int x = 0; x < d; x++) {		//每组的第一个数是起点
				for (int i = x + d; i < a.length; i = i + d) {	//采用插入排序的方式为每个分组排序
					int temp = a[i];	//每组待插入的数
					int j;				//当前每组中的最后一位数
					for (j = i - d; j >= 0 && a[j] > temp; j = j - d) {	//小数在前，大数在后
						a[j + d] = a[j];		//如果进行了交换，大数需要后移。那么temp的值就应该替换当前位置。（为了保证下面语句一致，所以退出循环时j=j-d）
					}
					a[j + d] = temp;	//如果没有交换，说明新插入的数较大，应该后移。
				}
			}
			if (d == 1) {
				break;
			}
		}
	}
}
