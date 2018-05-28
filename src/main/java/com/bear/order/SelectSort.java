package com.bear.order;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] nums = { 10, 15, 48, 732, 41, 13, 468, 1234, 4, 34 };
		nums = sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int[] sort(int[] nums) {

		for (int i = 0; i < nums.length; i++) {		//�����ƣ�ÿ��ѭ������ǰ����Ҫѭ���ĸ���
			int pos = i;							//�����һ��λ����С
			int min = nums[i];
			for (int j = i; j < nums.length - 1; j++) { 	//����������ֵ����ȡ��Сֵ
				if (min> nums[j + 1]) {
					pos = j + 1;
					min = nums[pos];
				}
			}
			nums[pos] = nums[i];		//����N���ҳ�����Сֵ����λ���������еĵ�N��������λ�ý���
			nums[i] = min;
		}
		return nums;

	}
}
