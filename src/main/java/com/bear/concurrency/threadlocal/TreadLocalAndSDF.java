package com.bear.concurrency.threadlocal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.CountDownLatch;

public class TreadLocalAndSDF {
	public static ThreadLocal<SimpleDateFormat> local = new ThreadLocal<>();

	public static SimpleDateFormat getSimpleDateFormat() {
		if (local.get() == null) {
			local.set(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		}
		return local.get();

	}

	public static void main(String[] args) throws InterruptedException, ParseException {
		long begin = System.currentTimeMillis();
		CountDownLatch latch = new CountDownLatch(1000);
		for (int i = 0; i < 1000; i++) {
			SimpleDateFormat format = getSimpleDateFormat();		//通过ThreadLocal实现每个线程一份SimpleDateFormat
			String dateTime = "2016-12-30 15:35:34";

			System.out.println(format.parse(dateTime));
			latch.countDown();

		}
		latch.await();
		System.out.println(System.currentTimeMillis() - begin);
	}
}
