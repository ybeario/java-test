package com.bear.offer.num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
//给n个数，输出由它们组成的最大数
public class BigestInt {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		if ((line=reader.readLine()) != null) {
			String[] num =line.split(" ");
			Comparator<String> comparator = (o1, o2) -> {
				return (o2 + o1).compareTo(o1 + o2);
			};
			Arrays.sort(num, comparator);
			for (String string : num) {
				System.out.print(string);
			}
		}
	}
}

//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Main{
//	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(reader.readLine());
//		List<Integer> list = new ArrayList<>();
//		String[] num = reader.readLine().split(" ");
//		for (int i = 0; i < n; i++) {
//			list.add(Integer.parseInt(num[i]));
//		}
//		Comparator<Integer> comparator = (o1, o2) -> {
//			return (o2.toString() + o1.toString()).compareTo(o1.toString() + o2.toString());
//		};
//		Collections.sort(list, comparator);
//		for (Integer i : list) {
//			System.out.print(i);
//		}
//	}
//}