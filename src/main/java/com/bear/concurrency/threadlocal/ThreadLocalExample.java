package com.bear.concurrency.threadlocal;

public class ThreadLocalExample {
	public static final ThreadLocal<Integer> local = new ThreadLocal<>();

	public static void main(String[] args) {
		local.set(0);
		Thread[] threads=new Thread[5];
		for (int i = 0; i < 5; i++) {
			threads[i]=new Thread(new MyThread());
		}
		for (Thread thread : threads) {
			thread.start();
		}
	}
}

class MyThread implements Runnable {
	public static int add(int num) {
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
	return add(num-1)+add(num-2);
	}

	@Override
	public void run() {
		
		ThreadLocalExample.local.set(0);
		int num =ThreadLocalExample.local.get();
		num=add(40);
		ThreadLocalExample.local.set(num);
		System.out.println(ThreadLocalExample.local.get());
	}

}
