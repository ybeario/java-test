package com.bear.newcoder;

import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<Integer>();
		char[] cs;
		String string = "123456789";
		char[] st = string.toCharArray();
		if (sc.hasNext()) {
			String n = sc.next().trim();
			cs = n.toCharArray();
			for (char c : cs) {
				if (!String.valueOf(c).equals("0")) {
					set.add(Integer.parseInt(String.valueOf(c)));
				}
			}
		}
		StringBuilder builder = new StringBuilder();
		for (Integer num : set) {
			builder.append(num);
		}
		System.out.println(builder.toString());
		cs = builder.toString().toCharArray();
			for (int i = 0; i <cs.length; i++) {
				if (cs[i] != st[i]) {
					System.out.println(st[i]);
					break;
				}
				if (i==cs.length-1 && i<st.length-1) {
					System.out.println(st[i+1]);
					break;
				}
				if (i==st.length-1) {
					System.out.println(10);
				}
			}
		}
	}

