package com.bear.concurrency.threadlocal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.CountDownLatch;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws InterruptedException {

		long begin = System.currentTimeMillis();
		CountDownLatch latch = new CountDownLatch(1000);
		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		//如果放在外面，SimpleDateFormat线程不安全，要报错
						String dateTime = "2016-12-30 15:35:34";
						System.out.println(format.parse(dateTime));
						latch.countDown();
					} catch (ParseException e) {
						
						e.printStackTrace();
					}
				}
			}).start();
		}
		latch.await();
		System.out.println(System.currentTimeMillis()-begin);
	}
}
