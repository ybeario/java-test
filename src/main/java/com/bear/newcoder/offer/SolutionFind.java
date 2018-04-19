package com.bear.newcoder.offer;

public class SolutionFind {
	public boolean Find(int target, int[][] array) {
		int length = array.length - 1; //横向长度
		int i = 0;						//纵向长度
		while (length >= 0 && i < array[0].length) {   //保证边界安全
			if (target < array[length][i]) {			//右上角开始
				length--;
			} else if (target > array[length][i]) {
				i++;
			} else {
				return true;							//边界内，却不满足前两个条件，表明target == array[length][i]
			}
		}
		return false;
	}
}