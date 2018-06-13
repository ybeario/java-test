package com.bear.newcoder.qihoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainwode {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null) {
		if (RepeatSubString(str)) {
			System.out.println("false");
		}
			
		}
	}
	 public static boolean RepeatSubString(String string) {  
		 String target=null;
         for (int i = 1; i < string.length()/2; i++) { 
        	 String sub = string.substring(0,i); 
        	 if (string.length()%(i)==0) {
        		 for (int j=1; i+(sub.length()*j) <= string.length(); j++) {  
        			 String strs=string.substring(i+1,i+sub.length());
        			 if (strs.equals(sub)) {
						if (sub.length()>target.length()) {
							target=sub;
						}
					}
        		 }  
			}
        } 
         if (target!=null) {
			System.out.println(target);
			return true;
		}
         return false;  
    }  
}
