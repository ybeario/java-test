package com.bear.concurrency;

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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ThreadLocalExample.local.set(0);
		int num =ThreadLocalExample.local.get();
		num++;
		ThreadLocalExample.local.set(num);
		System.out.println(ThreadLocalExample.local.get());
	}

}
