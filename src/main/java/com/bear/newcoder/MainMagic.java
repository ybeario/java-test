package com.bear.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMagic{
    public static void main(String[] args) throws NumberFormatException, IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str;
         int n;
        while((str=br.readLine())!=null){
            n = Integer.parseInt(str.trim());
            str=MainMagic.mechine(n);
            System.out.println(str);
        }
    }
    
    public static String mechine(int x){
        StringBuffer order=new StringBuffer();
        while(x>0){
            if(x%2==0){
                order.append("2");
                x=(x-2)/2;
                mechine(x);
            }else{
                order.append("1");
                x=(x-1)/2;
                mechine(x);
            }
        }
        order=order.reverse();
        return order.toString();
    }

} 
