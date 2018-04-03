package com.bear.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainKuohao {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		String str;
		while((str=br.readLine())!=null) {
			n=Integer.parseInt(str.trim());
			StringBuffer buffer=new StringBuffer();
			getKuohao(n, buffer,1);
			System.out.println(buffer.toString());
		}
	}
	public static void getKuohao(int n,StringBuffer buffer,int index) {
		
		if (n==0) {
			buffer.append("()");
		}
		getKuohao(n-1, buffer,index+1);
		if (index<n) {
			buffer.append("(");
		}else {
			buffer.append(")");
		}
	}

}
