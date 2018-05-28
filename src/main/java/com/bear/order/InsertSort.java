package com.bear.order;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] nums = { 10, 15, 48, 732, 41, 13, 468, 1234, 4, 34 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void sort(int[] nums) {
		int temp = 0;
		for (int i = 1; i < nums.length; i++) { // 倒着进行比较，temp为刚刚插入进来的数放在最后一位。第一个temp为15，第二个为48.。。。。
			int j = i - 1;				//j必须定义在此处，否则后面与temp交换无法获取j
			temp = nums[i];
			for (; j >= 0 && temp < nums[j]; j--) { // 如果temp小，则符合要求，大数后移
				nums[j + 1] = nums[j]; // 将大于temp的值整体后移一个单位
			}
			nums[j + 1] = temp; // 如果temp>nums[j],那么nums[j+1]就应该是temp
		}
	}
}
