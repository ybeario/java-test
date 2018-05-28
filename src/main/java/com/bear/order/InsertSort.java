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
		for (int i = 1; i < nums.length; i++) { // ���Ž��бȽϣ�tempΪ�ող�����������������һλ����һ��tempΪ15���ڶ���Ϊ48.��������
			int j = i - 1;				//j���붨���ڴ˴������������temp�����޷���ȡj
			temp = nums[i];
			for (; j >= 0 && temp < nums[j]; j--) { // ���tempС�������Ҫ�󣬴�������
				nums[j + 1] = nums[j]; // ������temp��ֵ�������һ����λ
			}
			nums[j + 1] = temp; // ���temp>nums[j],��ônums[j+1]��Ӧ����temp
		}
	}
}
