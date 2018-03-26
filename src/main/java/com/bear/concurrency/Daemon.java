package com.bear.concurrency;

import java.util.concurrent.TimeUnit;

public class Daemon {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			try {
				TimeUnit.SECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("DaemonThread finally run.");
			}
		}, "DaemonRunner");
		thread.setDaemon(true);
		thread.start();
	}
}
