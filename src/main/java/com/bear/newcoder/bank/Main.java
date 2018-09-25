package com.bear.newcoder.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> students = new ArrayList<>();
		ArrayList<Integer> candies = new ArrayList<>();
		String[] split = reader.readLine().trim().split(" ");
		for (String string : split) {
			students.add(Integer.parseInt(string));
		}
		split = reader.readLine().trim().split(" ");
		for (String string : split) {
			candies.add(Integer.parseInt(string));
		}
		Collections.sort(students);
		Collections.sort(candies);
		int num = 0;
		int stuIndex = 0;
		int canIndex = 0;
		while (stuIndex < students.size() && canIndex < candies.size()) {
			if (candies.get(canIndex) >= students.get(stuIndex)) {
				canIndex++;
				stuIndex++;
				num++;
			} else {
				canIndex++;
			}
		}
		System.out.println(num);
	}
}
