package com.bear.order;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] nums = { 10, 15, 48, 732, 41, 13, 468, 1234, 4, 34 };
		nums = sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int[] sort(int[] nums) {

		for (int i = 0; i < nums.length; i++) {		//外层控制，每次循环减少前面需要循环的个数
			int pos = i;							//假设第一个位置最小
			int min = nums[i];
			for (int j = i; j < nums.length - 1; j++) { 	//遍历所有数值，获取最小值
				if (min> nums[j + 1]) {
					pos = j + 1;
					min = nums[pos];
				}
			}
			nums[pos] = nums[i];		//将第N次找出的最小值所在位置与数组中的第N个数进行位置交换
			nums[i] = min;
		}
		return nums;

	}
}
