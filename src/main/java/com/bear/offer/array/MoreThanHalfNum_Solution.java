package com.bear.offer.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 *  2018年7月18日
 *  @author Y.bear
 *  @describe
 *  数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *  例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，
 *  因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum_Solution {
	 public int moreThanHalfNum_Solution(int [] array) {
	        if(array==null||array.length==0){
	            return 0;
	        }
	        int length=array.length;
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int arr:array){
	           if(!map.containsKey(arr)){
	            map.put(arr,1);
	        }else{
	               map.put(arr,map.get(arr)+1);
	           }
	        }
	        Collection<Integer> values = map.values();
	        int max=map.get(array[0]);
	        for (Integer integer : values) {
				if (integer>max) {
					max=integer;
				}
			}
	        if (max>(length/2)) {
				Set<Entry<Integer, Integer>> entrySet = map.entrySet();
				for (Entry<Integer, Integer> entry : entrySet) {
					if (entry.getValue()==max) {
						return entry.getKey();
					}
				}
			}
			return 0;
	        
	       
	    }
}
