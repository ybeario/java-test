package com.bear.util;

import java.util.Arrays;
import java.util.Random;

import com.bear.order.InsertSort;

public class DoubleDimensionalArray {
//	public static <T extends Number> T[][] getDoubleDimensionalArray(int length, int height, T bound, Class<T> clazz) {
//		Random random = new Random();
//		T[][] array = null;
//		if (bound instanceof Integer) {
//			int[][] arr = new int[length][height];
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr.length; j++) {
//					arr[i][j] = random.nextInt(bound.intValue());
//					array[i][j]
//				}
//
//			}
//			
//		}
//		return array;
//
//	}
	public static int[][] getDoubleDimensionalArray(int length,int height,int bound) {
		int[][] arr=new int[length][height];
		Random random=new Random();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < height; j++) {
				arr[i][j]=random.nextInt(bound);
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}
		int[] newArr=new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				newArr[j]=arr[j][i];
			}
			Arrays.sort(newArr);
			for (int j = 0; j < arr[0].length; j++) {
				arr[j][i]=newArr[j];
			}
		}
		
		System.out.println("-------------");
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < height; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		return arr;
		
		
	}
}
