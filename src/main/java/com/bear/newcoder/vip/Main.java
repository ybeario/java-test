package com.bear.newcoder.vip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().trim().split(" ");
		String binary = add(str[0], str[1]);
		System.out.println(binary);
	}

	public static String add(String num1, String num2) {
		int[] num1Array = new int[num1.length()];
		int[] num2Array = new int[num2.length()];
		for (int i = 0; i < num1.length(); i++) {
			num1Array[i] = (char)num1.charAt(i)-'0';
		}
		for (int i = 0; i < num2.length(); i++) {
			num2Array[i] = num2.charAt(i)-'0';
		}
		if (num1Array.length < num2Array.length) {
			int[] tmp = num1Array;
			num1Array = num2Array;
			num2Array = tmp;
		}
		int num1Index = num1Array.length - 1;
		int num2Index = num2Array.length - 1;
		int up = 0; 
		int result; 
		while (num1Index >= 0 && num2Index >= 0) {
			result = num1Array[num1Index] + num2Array[num2Index] + up;
			num1Array[num1Index] = result % 2;
			up = result / 2;
			num1Index--;
			num2Index--;
		}
		while (num1Index >= 0) {
			result = num1Array[num1Index] + up;
			num1Array[num1Index] = result % 2;
			up = result / 2;
			if (up == 0) {
				break;
			}
			num1Index--;
		}
		if (up == 0) {
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < num1Array.length; i++) {
				buffer.append( num1Array[i]);
			}
			return buffer.toString();
		} else {
			StringBuffer buffer = new StringBuffer("1");
			for (int i = 0; i < num1Array.length; i++) {
				buffer.append(num1Array[i]);
			}
			return buffer.toString();
		}
	}
}
