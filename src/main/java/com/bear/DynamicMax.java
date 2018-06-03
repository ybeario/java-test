package com.bear;

import java.util.Arrays;
import java.util.Random;

public class DynamicMax {
	private static final int X = 4;
	private static final int Y = 4;

	public static void main(String[] args) {
		int road[][] = new int[X][Y];
		Random random = new Random();
		for (int i = 0; i < road.length; i++) {
			for (int j = 0; j < road[0].length; j++) {
				road[i][j] = random.nextInt(10);
				System.out.print(road[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		maxPathSum(road);
	}

	public static void maxPathSum(int arr[][]) {
		int ret[][] = new int[arr.length][arr[0].length];
		for (int i = 0; i < ret.length; i++) {
			Arrays.fill(ret[i], 0);
		}
		ret[0][0] = arr[0][0];
		for (int i = 1; i < ret[0].length; i++) {
			ret[0][i] = ret[0][i - 1] + arr[0][i];
		}
		for (int j = 1; j < ret.length; j++) {
			ret[j][0] = ret[j - 1][0] + arr[j][0];
		}
		for (int i = 1; i < ret.length; i++) {
			for (int j = 1; j < ret[0].length; j++) {
				ret[i][j] = Math.max(ret[i - 1][j], ret[i][j - 1]) + arr[i][j];
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
	}
}
