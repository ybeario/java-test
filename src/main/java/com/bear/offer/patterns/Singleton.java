package com.bear.offer.patterns;

import java.util.concurrent.CountDownLatch;

//单例模式
public class Singleton {
	private Singleton() {
	}

	public static Singleton instance = null;

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		CountDownLatch countDownLatch=new CountDownLatch(1);
		Runnable runnable=()->{
			try {
				countDownLatch.await();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":  "+getInstance());
		};
		for (int i = 0; i < 100; i++) {
			new Thread(runnable,"thread"+i).start();
		}
		countDownLatch.countDown();
	}
}