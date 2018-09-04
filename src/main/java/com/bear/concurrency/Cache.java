package com.bear.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Cache {
	static Map<String, Object> map = new HashMap<>();
	static ReentrantReadWriteLock lock = new ReentrantReadWriteLock(false);
	static Lock read = lock.readLock();
	static Lock write = lock.writeLock();
	static CountDownLatch latch = new CountDownLatch(10);
	static volatile int num = 0;

	public static final Object get(String key) {
		read.lock();
		try {
			return map.get(key);

		} finally {
			read.unlock();
		}
	}

	public static final void getAll() {
		read.lock();
		try {
			Set<Entry<String, Object>> entrySet = map.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		} finally {
			read.unlock();
		}
	}

	public static final Object put(String key, Object value) {
		write.lock();
		try {
			return map.put(key, value);
		} finally {
			write.unlock();
		}
	}

	public static final void clear() {
		write.lock();
		try {
			map.clear();
		} finally {
			write.unlock();
		}

	}

	public static void main(String[] args) throws InterruptedException {
	//	testTime(); // 非公平锁效率高于公平锁。主要原因在于线程间的上下文切换时间开销
		testSecurity();

	}

	public static void testSecurity() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int j=0;j<100;j++) {
						map.put(String.valueOf(num++), num);
					}	
				}
			}).start();
		}
		Thread.sleep(3000);
		Set<Entry<String, Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void testTime() throws InterruptedException {
		long time = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					for (int j = 0; j < 100000; j++) {
						Cache.put(String.valueOf(num++), num);
					}
					latch.countDown();
				}
			}).start();
		}
		latch.await();
		Cache.getAll();
		System.out.println(System.currentTimeMillis() - time);
	}
}
