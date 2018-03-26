package com.bear.newcoder;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer aBuffer=new StringBuffer("a");
		StringBuffer bBuffer=new StringBuffer("b");
		operater(aBuffer, bBuffer);
		System.out.println(aBuffer);
		System.out.println(bBuffer);
		
	}
	public static void operater(StringBuffer x,StringBuffer y) {
		x=x.append(y);
		y=y.insert(0, x);
		y=x;
		System.out.println("y="+y);
	}
}
