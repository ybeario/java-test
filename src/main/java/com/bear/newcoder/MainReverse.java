package com.bear.newcoder;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainReverse{
    public static void main(String[] args) throws NumberFormatException, IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str;
         int n;
        int m;
        
        // String[] strs;
        while((str=br.readLine())!=null){
            StringBuffer buffer=new StringBuffer(str.trim());
            buffer.reverse();
             n = Integer.parseInt(str.trim());
             m = Integer.parseInt(buffer.toString().trim());
             System.out.println(m+n);
         //   int[] input = new int[n];
          //  for(int i = 0; i < n; ++i)
           //    input[i] = Integer.parseInt(strs[i]);
            
        }
    }
} 

