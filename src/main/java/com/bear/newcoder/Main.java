package com.bear.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int temp=0;
		int index=0;
		if ((line = br.readLine()) != null) {
			char[] S = line.trim().toCharArray();
			char[] T = br.readLine().trim().toCharArray();
			while (index+T.length<=S.length) {
				for (int i = index; i < T.length+index; i++) {
					if (T[i-index]!=S[i]) {
						temp++;
					}
				}
				index++;
			}
		}
		System.out.println(temp);
	}
}
