package com.bear.order;

import java.util.Arrays;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月4日 下午4:10:29 类说明
 */
public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		int key = 10;
		int[] array = { 1, 23, 123, 3423, 53, 10, 234 };
		Arrays.sort(array);
		int index = search.search(array, key);
		System.out.println(index);
	}

	public int search(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		int mid = (high + low) / 2;
		if (key < array[low] || key > array[high] || low > high) {
			return -1;
		}

		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid] > key) {
				high = mid - 1;
			} else if (array[mid] < key) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1; // 最后仍然没有找到，则返回-1

	}
}
