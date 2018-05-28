package com.bear.order;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = { 10, 15, 48, 732, 41, 13, 468, 1234, 4, 34 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void sort(int[] nums) {
		int temp=0;										//temp������ֻ��һ���м��������ʱ����ֵ��������Ƚ�
		for (int i=nums.length-1; i >0; i--) {			//�������ѭ��
			for (int j = 0; j<i; j++) {
				if (nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
	}
}
