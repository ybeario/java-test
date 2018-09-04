package com.bear.offer.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月3日 下午2:54:32 类说明
 *          继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：首先将电话号码中的每个数字加上8取个位，然后使用对应的大写字母代替
 *          （"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN",
 *          "EIGHT", "NINE"）， 然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
 */
public class TelDisassemble {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.valueOf(reader.readLine());
		String[] results = new String[times];
		for (int i = 0; i < times; i++) {
			int[] result = new int[10];
			String readLine = reader.readLine();
			transform(readLine, result);
			print(result, i, results);
		}
		for (String string : results) {
			System.out.println(string);
		}

	}

	public static void print(int[] result, int index, String[] results) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			while (result[i] > 0) {
				result[i]--;
				buffer.append(i);
			}
		}
		results[index] = buffer.toString();

	}

	public static void getResult(int num, int count, int[] result) {
		while (count > 0) {
			count--;
			result[(num + 2) % 10]++;
		}
	}

	public static void transform(String line, int[] result) {
		char[] letters = new char[26];
		char[] charArray = line.toUpperCase().toCharArray();
		for (char c : charArray) {
			letters[c - 'A']++;
		}
		int zero = letters['Z' - 'A'];
		getResult(0, zero, result);
		letters['Z' - 'A'] -= zero;
		letters['E' - 'A'] -= zero;
		letters['R' - 'A'] -= zero;
		letters['O' - 'A'] -= zero;

		int two = letters['W' - 'A'];
		getResult(2, two, result);
		letters['T' - 'A'] -= two;
		letters['W' - 'A'] -= two;
		letters['O' - 'A'] -= two;

		int four = letters['U' - 'A'];
		getResult(4, four, result);
		letters['F' - 'A'] -= four;
		letters['O' - 'A'] -= four;
		letters['U' - 'A'] -= four;
		letters['R' - 'A'] -= four;

		int six = letters['X' - 'A'];
		getResult(6, six, result);
		letters['S' - 'A'] -= six;
		letters['I' - 'A'] -= six;
		letters['X' - 'A'] -= six;

		int eight = letters['G' - 'A'];
		getResult(8, eight, result);
		letters['E' - 'A'] -= eight;
		letters['I' - 'A'] -= eight;
		letters['G' - 'A'] -= eight;
		letters['H' - 'A'] -= eight;
		letters['T' - 'A'] -= eight;

		int one = letters['O' - 'A'];
		getResult(1, one, result);
		letters['O' - 'A'] -= one;
		letters['N' - 'A'] -= one;
		letters['E' - 'A'] -= one;

		int three = letters['T' - 'A'];
		getResult(3, three, result);
		letters['T' - 'A'] -= three;
		letters['H' - 'A'] -= three;
		letters['R' - 'A'] -= three;
		letters['E' - 'A'] -= three;
		letters['E' - 'A'] -= three;

		int five = letters['F' - 'A'];
		getResult(5, five, result);
		letters['F' - 'A'] -= five;
		letters['I' - 'A'] -= five;
		letters['V' - 'A'] -= five;
		letters['E' - 'A'] -= five;

		int seven = letters['S' - 'A'];
		getResult(7, seven, result);
		letters['S' - 'A'] -= seven;
		letters['E' - 'A'] -= seven;
		letters['V' - 'A'] -= seven;
		letters['E' - 'A'] -= seven;
		letters['N' - 'A'] -= seven;

		int nine = letters['I' - 'A'];
		getResult(9, nine, result);
		letters['N' - 'A'] -= nine;
		letters['I' - 'A'] -= nine;
		letters['N' - 'A'] -= nine;
		letters['E' - 'A'] -= nine;

	}
}
