package com.bear.newcoder;

import java.util.Scanner;
public class MainOrder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int n=sc.nextInt();
                int[] a=new int[n];
                int mod4_num=0,mod2_num=0,odd=0;
                for(int j=0;j<n;j++){
                    a[j]=sc.nextInt();
                    if(a[j]%4==0) mod4_num++;
                    else if(a[j]%2==0) mod2_num++;
                    else odd++;
                }
                if(mod2_num>0){
                    if(mod4_num>=odd) System.out.println("Yes");
                    else System.out.println("No");
                }else{
                    if(mod4_num>=odd-1) System.out.println("Yes");
                    else System.out.println("No");
                }
            }
        }
    }
}