package com.bear.order;

import java.util.*;

public class RadixSort {
    public int[] radixSort(int[] A, int n) {
      if (A == null || n <= 1)
			return A;
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(new ArrayList<>());
		}
		int max=A[0];
		for (int i : A) {
			max=Math.max(max, i);
		}
		int length=String.valueOf(max).length();
		int num=1;
		while(length-->0) {
			for (int i : A) {
				list.get(i/num%10).add(i);
			}
			int index=0;
			for (ArrayList<Integer> arrayList : list) {
				if (!arrayList.isEmpty()) {
					for (Integer integer : arrayList) {
						A[index++]=integer;
					}
				}
			}
			for (ArrayList<Integer> arrayList : list) {
				arrayList.clear();
			}
			num*=10;
		}
		return A;

    }
}