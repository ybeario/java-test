package com.bear.qihoo;

public class Byte {
	public static void main(String[] args) {
		byte b1=1,b2=2,b3,b6;
		final byte b4=4,b5=6;
		b6=b4+b5;
		b3=(byte) (b1+b2);//�����д��byte���򱨴�Type mismatch: cannot convert from int to byte
		System.out.println(b3+b6);
	}
}
