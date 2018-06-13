package com.bear.newcoder.qihoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainShudui {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] lines=br.readLine().split(" ");
		int n=Integer.parseInt(lines[0]);
		int k=Integer.parseInt(lines[1]);
		int x = 1;
		int y=1;
		int num=0;
		for (;x<=n; x++) {
			for (y=1; y <= n; y++) {
				if (x%y>=k) {
					num++;
				}
			}
			
		}
		System.out.println(num);
	}
}
