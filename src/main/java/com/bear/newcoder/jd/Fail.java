package com.bear.newcoder.jd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class Fail {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().trim());
		int[][] nums = new int[n][3];
		for (int i = 0; i < n; i++) {
			String[] split = reader.readLine().trim().split(" ");
			nums[i][0] = Integer.parseInt(split[0]);
			nums[i][1] = Integer.parseInt(split[1]);
			nums[i][2] = Integer.parseInt(split[2]);
		}
		System.out.println(check(nums));

	}

	public static int check(int[][] nums) {
		int firstMin = findMin(nums, 0);
		int secondMin = findMin(nums, 1);
		int thirdMin = findMin(nums, 2);
		int firstMax = findMax(nums, 0);
		int secondMax = findMax(nums, 1);
		int thirdMax = findMax(nums, 2);
		int[] max = new int[nums.length];
		int[] min = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i][0] == firstMin) {
				min[i] = 1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i][1] == secondMin) {
				min[i] = 1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i][2] == thirdMin) {
				min[i] = 1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i][0] == firstMax) {
				max[i] = 1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i][1] == secondMax) {
				max[i] = 1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i][2] == thirdMax) {
				max[i] = 1;
			}
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (min[i] != 0 && max[i] != min[i]) {
				index++;
			}
		}
		return index;

	}

	public static int findMax(int[][] nums, int index) {
		int max = nums[0][index];
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i][index]) {
				max = nums[i][index];
			}
		}
		return max;
	}

	public static int findMin(int[][] nums, int index) {
		int min = nums[0][index];
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i][index]) {
				min = nums[i][index];
			}
		}
		return min;
	}
}
