package com.bear.newcoder.jd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainFenjie {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().trim());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(reader.readLine().trim()));
		}
		for (Integer integer : list) {
			if (integer % 2 != 0) {
				System.out.println("No");
			} else {
				sort(integer,2);
			}
		}
	}

	public static void sort(int X,int Y) {
		if (X % 2 != 0) {
			System.out.println(X + " " + Y / 2);
		} else {
			X = X / 2;
			Y = Y * 2;
			sort(X,Y);
			
		}
	}
}
