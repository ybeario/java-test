package com.bear.offer.array;

import java.util.ArrayList;
/**
 * 
 *  2018年6月22日
 *  @author Y.bear
 *  @describe
 *  输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 *  例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 *  则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix == null) {
			return null;
		}
		ArrayList<Integer> list = new ArrayList<>();
		int row = matrix.length - 1;
		int columns = matrix[0].length - 1;
		int start = 0;
		while (row > start && columns > start) {
			for (int i = start; i <= columns; i++) {
				list.add(matrix[start][i]);
			}
			for (int i = start + 1; i <= row; i++) {
				list.add(matrix[i][columns]);
			}
			for (int i = columns - 1; i >= start; i--) {
				list.add(matrix[row][i]);
			}
			for (int i = row - 1; i > start; i--) {
				list.add(matrix[i][start]);
			}
			start++;
			row--;
			columns--;
		}
		if (row == start && columns == start) {

			list.add(matrix[start][start]);

		} else {

			if (row == start) {
				for (int i = start; i <= columns; i++) {
					list.add(matrix[row][i]);
				}
			}
			if (columns == start) {
				for (int i = start; i <= row; i++) {
					list.add(matrix[i][columns]);
				}
			}
		}
		return list;

	}
}
