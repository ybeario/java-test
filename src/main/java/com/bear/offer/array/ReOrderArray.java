package com.bear.offer.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * 2018年6月19日
 * 
 * @author Y.bear
 * @describe 输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 *           并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
	public static void reOrderArray(int[] array) {
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		if (array == null || array.length == 0) {
			System.out.println("");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenList.add(array[i]);
			} else {
				oddList.add(array[i]);
			}
		}
		oddList.addAll(evenList);
		Object[] arrayList = oddList.toArray();
		for (int i = 0; i < arrayList.length; i++) {
			array[i]=(int) arrayList[i];
		}
	}
	public static void reOrder(int[] array) {
		int[] odd=new int[array.length];
		int[] even=new int[array.length];
		int k=0,q=0;
		if (array == null || array.length == 0) {
			System.out.println("");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even[q]=array[i];
				++q;
			} else {
				odd[k]=array[i];
				++k;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i<k) {
				array[i]=odd[i];
			}else {
				array[i]=even[i-k];
			}
		}
	}
	/**
	 * 
	 * @param array
	 * 利用冒泡的方式，把偶数放到最后
	 */
    public void reOrderArray2(int [] array) {
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
	public static void main(String[] args) {
		int[] testArray= {1,2,3,4,5,6,7};
		reOrderArray(testArray);
		System.out.println(Arrays.toString(testArray));
		
	}
}
