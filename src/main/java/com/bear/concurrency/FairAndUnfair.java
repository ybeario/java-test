package com.bear.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairAndUnfair {
	private static Lock fairLock = new ReentrantLock2(true);
	private static Lock unfairLock = new ReentrantLock2(false);
	static CountDownLatch latch = new CountDownLatch(5);
	static CyclicBarrier barrier = new CyclicBarrier(5);

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		long time = System.currentTimeMillis();
		FairAndUnfair fairAndUnfair = new FairAndUnfair();

		fairAndUnfair.testLock(fairLock, latch);
		//fairAndUnfair.testLock(unfairLock, latch);
		latch.await();
		System.out.println(System.currentTimeMillis() - time);
	}

	private void testLock(Lock lock, CountDownLatch latch) throws InterruptedException, BrokenBarrierException {
		for (int i = 0; i < 5; i++) {
			new Job(lock).start();
		}
	}

	public static class Job extends Thread {
		private Lock lock;

		public Job(Lock lock) {
			this.lock = lock;
		}

		@Override
		public void run() {
			for (int i = 0; i < 200000; i++) {
				lock.lock();
				System.out.println(Thread.currentThread().getName() + ","
						+ Arrays.toString(((ReentrantLock2) lock).getQueuedThreads().toArray()));
				try {
					
				} finally {
					lock.unlock();
				}
			}

			latch.countDown();
		}

	}

	public static class ReentrantLock2 extends ReentrantLock {
		/**
		 * 
		 */
		private static final long serialVersionUID = 7418065803123998875L;

		public ReentrantLock2(boolean fair) {
			super(fair);
		}

		public Collection<Thread> getQueuedThreads() {
			List<Thread> arrayList = new ArrayList<>(super.getQueuedThreads());
			Collections.reverse(arrayList);
			return arrayList;
		}
	}
}
