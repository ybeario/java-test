package com.bear.newcoder.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candies {
public static void main(String[] args) throws IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	String readLine = reader.readLine();
	String[] split = readLine.trim().split(" ");
	int min=split.length;
	
	
	System.out.println(min);
}
}
