package com.bear.order;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSort {
	public static void main(String[] args) {
		// mathSort();
		stringSort();
	}

	public static void stringSort() {
		int length = 10;
		String[] array = new String[length];
		for (int i = 0; i < length; i++) {
			array[i] = String.valueOf(((char) ('a' + (int) (Math.random() * 10))));
		}
		Arrays.sort(array, Collections.reverseOrder());
		for (String string : array) {
			System.out.println(string);
		}
	}

	public static void mathSort() {
		int length = 10;
		Integer[] array = new Integer[length];
		for (int i = 0; i < length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(array, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		for (int i : array) {
			System.out.println(i);
		}
	}
}
