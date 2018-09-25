package com.bear.newcoder.sfTechnology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine().trim();
		char[] charArray = str.toCharArray();
		String result="NULL";
		int times=1;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<charArray.length-1;i++) {
			if (charArray[i]==charArray[i+1]) {
				times++;
			}else {
				list.add(times);
				times=1;
			}
		}
		int index=0;
		int num=0;
		int mid=0;
		if (list.size()>2) {	
			int indexttemp=0;
			for (int i = 0; i < list.size()-2; i++) {
				indexttemp+=list.get(i);
				if (list.get(i)>list.get(i+1)&&list.get(i+2)>list.get(i+1)) {
					int temp=Math.min(list.get(i), list.get(i+2));
					if (num<temp) {
						num=temp;
						index=indexttemp;
						mid=list.get(i+1);
					}
				}
			}
		}
		if (index!=0) {
			StringBuffer buffer=new StringBuffer();
			for(int i=0;i<num;i++) {
				buffer.append(charArray[index-1]);
			}
			for(int i=0;i<mid;i++) {
				buffer.append(charArray[index+num-3]);
			}
			for(int i=0;i<num;i++) {
				buffer.append(charArray[index+num+mid-1]);
			}
			result=buffer.toString();
		}
		System.out.println(result);
	}
}
