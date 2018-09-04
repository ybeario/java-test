package com.bear.offer.collection;

import java.util.ArrayList;

public class MultiArray {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				list.add(j);
			}
			result.add(list);
		}
		for (ArrayList<Integer> arraylist : result) {
			for (Integer integer : arraylist) {
				System.out.print(integer);
			}
			System.out.println();
		}
	}
}
