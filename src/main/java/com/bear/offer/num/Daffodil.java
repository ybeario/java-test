package com.bear.offer.num;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月6日 上午11:17:56 类说明 水仙花数
 */

public class Daffodil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			String[] limits = scanner.nextLine().trim().split(" ");
			int low = Integer.parseInt(limits[0]);
			int high = Integer.parseInt(limits[1]);
			ArrayList<Integer> list = new ArrayList<>();
			getNums(low, high, list);
			print(list);
		}

	public static void getNums(int low, int high, ArrayList<Integer> list) {
		for (int i = low; i <= high; i++) {
			int first = i % 10;
			int second = i % 100 / 10;
			int third = i / 100;
			if (i == (getThree(first) + getThree(second) + getThree(third)))
				list.add(i);
		}
	}

	public static int getThree(int num) {
		return num * num * num;
	}

	public static void print(ArrayList<Integer> list) {
		if (list.size() == 0)
			System.out.println("no");
		else {
			for (int i = 0; i < list.size(); i++) {
				if (i != list.size()-1)
					System.out.print(list.get(i) + " ");
				else {
					System.out.print(list.get(i));
					System.out.println();
				}
			}
		}

	}
}
