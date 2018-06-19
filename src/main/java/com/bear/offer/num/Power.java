package com.bear.offer.num;
/**
 * 
 *  2018年6月19日
 *  @author Y.bear
 *  @describe
 *  给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power {
    public double powerNum(double base, int exponent) {
    	double result=1;
		if (exponent>0) {
			for (int i = 0; i < exponent; i++) {
				result *=base;
			}
			return result;
		}else if (exponent<0) {
			exponent=-exponent;
			for (int i = 0; i < exponent; i++) {
				result *=base;
			}
			result=1.0/result;
			return result;
		}else {
			return 1.0;
		}
  }
}
