package com.bear.newcoder.qihoo;

import java.util.Scanner;

public class MainFoldPaper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {

			int n = sc.nextInt();
			FoldPaper paper = new FoldPaper();
			String s = paper.fold(1, n, true);
			char[] c = s.toCharArray();
			StringBuffer sb = new StringBuffer("[");
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '0') {
					sb.append("\"" + "up" + "\"").append(",");
				} else {
					sb.append("\"" + "down" + "\"").append(",");
				}
			}
			System.out.println(sb.substring(0, sb.length() - 1) + "]");// sb.length()-1��ȥ��"��"
		}
		sc.close();
	}
}

class FoldPaper {
	public StringBuffer sb = new StringBuffer();

	public String fold(int index, int n, boolean isDown) {

		if (index > n) {
			return null;
		}
		fold(index + 1, n, true);
		if (isDown) {
			sb.append("1");
		} else {
			sb.append("0");
		}
		fold(index + 1, n, false);
		return sb.toString();

	}

}
