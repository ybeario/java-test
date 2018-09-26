package com.bear.newcoder.vip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMin {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] str = reader.readLine().trim().split(" ");
		int k = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] split = reader.readLine().trim().split(" ");
			for (int j = 0; j < n; j++) {
				array[i][j] = Integer.parseInt(split[j]);
			}
		}
		System.out.println(findNthMin(array, k));
	}

	public static int findNthMin(int[][] array, int index) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int[] is : array) {
			for (Integer integer : is) {
				list.add(integer);
			}
		}
		Collections.sort(list);
		return list.get(index-1);
	}
}
