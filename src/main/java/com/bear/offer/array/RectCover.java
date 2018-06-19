package com.bear.offer.array;
/**
 * 
 *  2018年6月19日
 *  @author Y.bear
 *  @describe
 *  我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
	   public int rectCoverRect(int target) {
		   if (target==0) {
			return 0;
		}if (target==1) {
			return 1;
		}if (target==2) {
			return 2;
		}
		int one=2;
		int two=1;
		int num=0;
		for (int i = 0; i < target-2; i++) {
			num=one+two;
			two=one;
			one=num;
		}
		return num;
	    }
}
