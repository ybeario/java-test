package com.bear.offer.array;

import java.io.IOException;
import java.util.Scanner;

import com.bear.util.DoubleDimensionalArray;
/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindEqualNum {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		int target=scanner.nextInt();
		int[][] arr=DoubleDimensionalArray.getDoubleDimensionalArray(5, 5, 20);
		System.out.println(findEqualNum(arr, target));
	}
	public static boolean findEqualNum(int[][] arr, int num) {
		int x = arr.length - 1;
		int y = 0;
		while (y < arr[0].length && x >= 0) { // 保证边界安全
			if (num < arr[x][y]) { // 右上角开始
				--x;
			} else if (num > arr[x][y]) {
				++y;
			} else {
				return true; // 边界内，却不满足前两个条件，表明target == array[length][i]
			}
		}
		return false;
	}
}