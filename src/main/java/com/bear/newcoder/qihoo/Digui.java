package com.bear.newcoder.qihoo;

public class Digui {
	static int count=0;
	int fib(int n) {
		count++;
		if (n == 0)
			return 1;
		else if (n == 1)
			return 2;
		else
			return fib(n - 1) + fib(n - 2);
	}
	public static void main(String[] args) {
	Digui gDigui=new Digui();
	gDigui.fib(10);
	System.out.println(count);
}
}
