package com.bear.qihoo;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.common.collect.Lists;

public class CASCounter {
	private AtomicInteger atomicInteger = new AtomicInteger();
	private int i = 0;

	public static void main(String[] args) {
		final CASCounter cas = new CASCounter();
		List<Thread> threads = Lists.newArrayList();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(() -> {
				cas.count();//有可能出现值不为100的情况   线程不安全
				cas.safeCount();//线程安全  始终为100
			});
			threads.add(thread);
		}
		for (Thread thread : threads) {
			thread.start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(cas.i);
		System.out.println(cas.atomicInteger.get());
		System.out.println(System.currentTimeMillis()-start);
	}

	private void safeCount() {
		for (;;) {
			int i = atomicInteger.get();
			boolean suc = atomicInteger.compareAndSet(i, ++i);
			if (suc) {
				break;
			}
		}
	}

	private void count() {
		i++;
	}
}
