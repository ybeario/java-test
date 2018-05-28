package com.bear.order;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] nums = { 10, 15, 48, 732,15,41, 13, 468, 1234, 4, 34 };
		sort(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
	}

	public static void sort(int[] arr, int low, int high) {
		int i, j, temp, t;
		if (low > high) {
			return;
		}
		i = low;
		j = high;
		// temp���ǻ�׼λ
		temp = arr[low];

		while (i < j) {
			// �ȿ��ұߣ���������ݼ�
			while (temp <= arr[j] && i < j) {
				j--;
			}
			// �ٿ���ߣ��������ҵ���
			while (temp >= arr[i] && i < j) {
				i++;
			}
			// ������������򽻻�
			if (i < j) {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}

		}
		arr[low] = arr[i];		// ��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
		arr[i] = temp;
		sort(arr, low, j - 1);	// �ݹ�����������
		sort(arr, j + 1, high);	// �ݹ�����Ұ�����
	}
}
