package com.bear.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringArray {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		String[] split = readLine.trim().split(" ");
		ArrayList<ArrayList<String>> result = new ArrayList<>();

		Arrays.sort(split, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		int[] indexs=new int[split.length];
		for (int i = 0; i < split.length; i++) {
			ArrayList< String> list=new ArrayList<>();
			if (indexs[i]!=1) {
				
				list.add(split[i]);
				indexs[i]=1;
			}else {
				continue;
			}
			for (int j = i; j < split.length; j++) {
				if (checkIfSame(split[i], split[j])&&indexs[j]!=1) {
					list.add(split[j]);
					indexs[j]=1;
				}
			}
			result.add(list);
		}
		for (ArrayList<String> lists : result) {
			for (String string : lists) {
				System.out.println(string);
			}
		}
	}

	public static boolean checkIfSame(String Str1, String Str2) {
		boolean flag = true;
		int[] status = new int[24];
		if (Str1.length() == Str2.length()) {
			char[] charyArray1 = Str1.toCharArray();
			char[] charyArray2 = Str2.toCharArray();
			for (char c : charyArray1) {
				status[c - 'a']++;
			}
			for (char c : charyArray2) {
				status[c - 'a']--;
			}
			for (int num : status) {
				if (num != 0) {
					flag = false;
				}
			}

		}

		return flag;
	}
}
