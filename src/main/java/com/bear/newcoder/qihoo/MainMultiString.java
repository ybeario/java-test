package com.bear.newcoder.qihoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainMultiString {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n=1;
        
        char[] chars;
       while((str=br.readLine())!=null){
    	   chars = str.toCharArray();
    	   for (int i = 0; i < chars.length-1; i++) {
			if (chars[i]!=chars[i+1]) {
				n++;
			}
		}
    	   int length=chars.length;
    	   DecimalFormat format=new DecimalFormat("0.00");
    	   System.out.println(format.format((float)length/n));
       }
   }
}
