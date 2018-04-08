package com.bear.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTencentN {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int m;
		String[] strings;
		String str;
		while ((str = br.readLine()) != null) {
			strings = str.split(" ");
			n = Integer.parseInt(strings[0]);
			m = Integer.parseInt(strings[1]);
			int f = n / 2;
			System.out.println(f * m);
		}
		// for (int i = 1; i <= n; i++) {
		// if (index == m) {
		// index = 0;
		// flag = flag * (-1);
		// }
		// sum = sum + (i * flag);
		// index++;
		// }
		// System.out.println(sum);
	}

}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
//
// public class Main {
//
// public static void main(String[] args) throws IOException {
//
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int n;
// int m;
// String[] strings;
// strings = br.readLine().split(" ");
// n = Integer.parseInt(strings[0]);
// m = Integer.parseInt(strings[1]);
// int flag=-1;
// int p=-1;
// int sum=0;
// int index=0;
// for (int i = 1; i <=n; i++) {
// if (index==m) {
// index=0;
// flag=flag*p;
// }
// sum=sum+(i*flag);
// index++;
// }
// System.out.println(sum);
// }
//
// }