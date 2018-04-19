package com.bear.newcoder.jd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainKuohao {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().trim());
		List<String> strings=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String iString =reader.readLine().trim();
			strings.add(iString);
		}
		for (String string : strings) {
			if (string.equals("(")||string.equals(")")) {
				name(string);
			}else {
				System.out.println("No");
			}
		}
	}
	public static void name(String string) {
		char[] c=string.toCharArray();
		int zuo=0;
		int you=0; 
		int flag=0;
		for (char d : c) {
			if (String.valueOf(d).equals("(")) {
				zuo++;
			}else {
				you++;
			}
			if (you-zuo>=1) {
				flag++;
				if (flag==2) {					
					System.out.println("No");
					break;
				}
			}
		}
		if (flag<=1&& zuo==you) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

