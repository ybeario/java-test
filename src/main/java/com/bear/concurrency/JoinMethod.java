package com.bear.concurrency;

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread2();
		Thread t2 = new Thread(new MyThread());
		t1.start();
		t1.join();
		t2.start();
		t2.join();

	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("t1");
	}

}

class MyThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("t2");
	}

}
