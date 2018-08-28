package com.bear.newcoder.netbase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apple {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().trim());
		String[] split = reader.readLine().trim().split(" ");
		int[] appleNum = new int[n];
		for (int i = 0; i < split.length; i++) {
			appleNum[i] = Integer.parseInt(split[i]);
		}
		int m = Integer.parseInt(reader.readLine().trim());// 询问次数
		String[] split2 = reader.readLine().trim().split(" ");
		int[] quarryNum = new int[m];
		for (int i = 0; i < split2.length; i++) {
			quarryNum[i] = Integer.parseInt(split2[i]);
		}
		int num = appleNum[0];
		for (int i = 1; i < appleNum.length; i++) {
			appleNum[i] += num;
			num = appleNum[i];
		}
		for (int i = 0; i < quarryNum.length; i++) {
				System.out.println(binarySearch(appleNum,quarryNum[i])+1);
			
		}
	}
	
	     public static int binarySearch(int[] arr, int x) {
		         int low = 0;   
		        int high = arr.length-1;   
		         while(low <= high) {   
		             int middle = (low + high)/2;   
		             if(x == arr[middle]) {   
		                 return middle;   
		             }else if(x <arr[middle]) {   
		               high = middle - 1;   
		             }else {   
		                 low = middle + 1;   
		             }  
	         }  
		        return -1;  
     }
}
