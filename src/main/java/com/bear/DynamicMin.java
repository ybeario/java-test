package com.bear;

import java.util.Random;

public class DynamicMin {
	public static final int[][] maps=new int[5][5];
	//初始化数组
	public static void init() {
		Random random=new Random();
		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps[0].length; j++) {
				maps[i][j]=random.nextInt(10);
				System.out.print(maps[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	//寻找左上角到右下角的最短路径
	public static void searchRoad(int[][] roads) {
		int[][] ret=new int[roads.length][roads[0].length];	//借用ret[][]存放每一步的最优距离
		ret[0][0]=roads[0][0];
		for (int i = 1; i < ret.length; i++) {	//初始化y=0 第一行
			ret[i][0]=roads[i][0]+ret[i-1][0];
		}
		for (int j = 1; j < ret[0].length; j++) { //初始化x=0 第一列
			ret[0][j]=roads[0][j]+ret[0][j-1];
		}
		for (int i = 1; i < ret.length; i++) {
			for (int j = 1; j < ret[0].length; j++) {
				ret[i][j]=Math.min(ret[i-1][j],ret[i][j-1])+roads[i][j];
			}
		}
		System.out.println("-------------");
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[0].length; j++) {
				System.out.print(ret[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		init();
		searchRoad(maps);
	}
}
