package com.bear.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrame {
	public static void main(String[] args) {
		Callable<Integer> callable=new CountThread(5);
		Runnable runnable=new concatThread("094", "17555470");
//		FutureTask<Integer> futureTask=new FutureTask<>(callable);
//		new Thread(futureTask).start();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		Future<?> submit = newFixedThreadPool.submit(callable);
		newFixedThreadPool.execute(runnable);
		Future<Integer> submit2 = newFixedThreadPool.submit(runnable,9);
		newFixedThreadPool.submit(Executors.callable(runnable));
		try {
			System.out.println(submit.get());
			System.out.println(submit2.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		newFixedThreadPool.shutdown();
	}
	static class CountThread implements Callable<Integer>{
		private int num;
		
		public CountThread(int num) {
			super();
			this.num = num;
		}

		@Override
		public Integer call() throws Exception {
			return add(num);
		}
		
	}
	static class concatThread implements Runnable{
		private final String area;
		private final String tel;
		
		
		public concatThread(String area, String tel) {
			super();
			this.area = area;
			this.tel = tel;
		}


		@Override
		public void run() {
			StringBuffer buffer=new StringBuffer(area.concat(tel));
			System.out.println(buffer.reverse().toString());
		}
		
	}
	public static int add(int n) {
		if (n==1) {
			return 1;
		}
		return n+add(n-1);
		
	}
}
