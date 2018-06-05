package com.bear;

import java.util.Arrays;
import java.util.Random;

public class DynamicMax {
	private static final int X = 4;
	private static final int Y = 4;
	private static final int bound = 10;

	public static void main(String[] args) {
		int road[][] = new int[X][Y];
		Random random = new Random();
		for (int i = 0; i < road.length; i++) {
			for (int j = 0; j < road[0].length; j++) {
				road[i][j] = (random.nextBoolean()?1:-1)*random.nextInt(bound);
				System.out.print(road[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		road[0][0]=Math.abs(road[0][0]);
		maxPathSum(road);
	}

	public static void maxPathSum(int arr[][]) {
		int ret[][] = new int[arr.length][arr[0].length];
		for (int i = 0; i < ret.length; i++) {
			Arrays.fill(ret[i], 0);
		}
		ret[0][0] = arr[0][0];
		for (int i = 1; i < ret[0].length; i++) {
			ret[0][i] = arr[0][i] >= 0 ? ret[0][i - 1] + arr[0][i] : Integer.MIN_VALUE;
		}
		for (int j = 1; j < ret.length; j++) {
			ret[j][0] = arr[j][0] >= 0 ? ret[j - 1][0] + arr[j][0] : Integer.MIN_VALUE;
		}
		for (int i = 1; i < ret.length; i++) {
			for (int j = 1; j < ret[0].length; j++) {
			ret[i][j] =arr[i][j]>=0? Math.max(ret[i - 1][j], ret[i][j - 1]) + arr[i][j]:Integer.MIN_VALUE;
			}
		}
		System.out.println("----------");
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[0].length; j++) {
				System.out.print(ret[i][j]);
				System.out.print("     ");
			}
			System.out.println();
		}
		System.out.println(ret[ret.length-1][ret[0].length-1]>0?"最大距离是:"+ret[ret.length-1][ret[0].length-1]:"不存在符合要求的路径");
	}
}
