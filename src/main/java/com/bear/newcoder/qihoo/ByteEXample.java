package com.bear.newcoder.qihoo;

public class ByteEXample {
	public static void main(String[] args) {
		final byte b1=1,b2=0;
		byte b3=2;
		byte b6;
		final byte b4=4,b5=6;
		b6=b4+b5;
		b3=(byte) (b1+b2);//如果不写（byte）则报错Type mismatch: cannot convert from int to byte
		b6=b3;
		System.out.println(b3+b6);
	}
}
