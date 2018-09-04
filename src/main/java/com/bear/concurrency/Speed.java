package com.bear.concurrency;

public class Speed {
	public static void main(String[] args) {
		int num=45;
		long begin=System.currentTimeMillis();
		System.out.println(addBy(num));
		System.out.println(System.currentTimeMillis()-begin);
		begin=System.currentTimeMillis();
		System.out.println(add(num));
		System.out.println(System.currentTimeMillis()-begin);
	}
	public static int add(int num) {
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
	return add(num-1)+add(num-2);
	}
	public static int addBy(int num) {
		int first=0;
		int next=1;
		int result=0;
		while (num>=2) {
			num--;
			result=first+next;
			first=next;
			next=result;
		}
		return result;
	}
}
