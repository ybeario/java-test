package com.bear.newcoder.tencent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int index = 0;
		ArrayList<Long> preList = new ArrayList<>();
		ArrayList<Long> nextList = new ArrayList<>();
		while (getPrePart(n , index, preList) != getNextPart(n , index, nextList)) {
			index++;
		}
		System.out.println(n + index);
	}

	public static long getGongYue(long n, long m) {
		while (n % m != 0) {
			long temp = n % m;
			n = m;
			m = temp;
		}
		return m;

	}

	public static long getValue(long n, long m) {
		return n * m / getGongYue(n, m);
	}

	public static long getPrePart(int n, int index,ArrayList<Long> list) {
		long value=n;
		if (index!=0) {
			value=list.get(n+index-1);
		}
		value=getValue(value, n+index);
		return 0;

	}

	public static long getNextPart(int n, int index,ArrayList<Long> list) {
		return 0;

	}
}
