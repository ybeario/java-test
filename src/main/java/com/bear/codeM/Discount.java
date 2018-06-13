package com.bear.codeM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Discount {
	public static Map<Integer, Integer> discountInfo = new HashMap<>();
	public static Map<Integer, Integer> goodsInfo = new IdentityHashMap<>();
	static double discount = 0;
	static double nondiscount = 0;
	static double dis = 0;
	public static int n, m;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] split = reader.readLine().split(" ");
		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);
		init(reader);
		min();
	}

	private static void init(BufferedReader reader) throws IOException {
		for (int i = 0; i < n; i++) {
			String[] split = reader.readLine().split(" ");
			goodsInfo.put(new Integer(Integer.parseInt(split[0])), Integer.parseInt(split[1]));
		}
		for (int i = 0; i < m; i++) {
			String[] split = reader.readLine().split(" ");
			if (goodsInfo.containsKey(Integer.parseInt(split[0]))
					&& Integer.parseInt(split[1]) < goodsInfo.get(Integer.parseInt(split[0]))) {
				continue;
			}
			discountInfo.put(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
		}
	}

	private static void min() {
		goodsInfo.forEach((k, v) -> {
			nondiscount += k;
			if (v == 1) {
				discount += 0.8 * k;
			} else if (v == 0) {
				discount += k;
			}
		});
		discountInfo.forEach((k, v) -> {
			if (nondiscount >= k) {
				if (v > dis) {
					dis = v;
				}
			}
		});
		nondiscount = nondiscount - dis;
		DecimalFormat format = new DecimalFormat("0.00");
		System.out.println(format.format(Math.min(discount, nondiscount)));
	}
}
