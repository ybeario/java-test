package com.bear.newcoder.ctrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String readLine = reader.readLine();
		Scanner scanner=new Scanner(System.in);
		long num=scanner.nextLong();
		int times=0;
		while(num!=0) {
			times++;
			num=(num-1)&num;
		}
		
		System.out.println(times);
	}
	
	
	
	
}
