package com.bear.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {
	public static void main(String[] args) {
		Callable<String> callable=new MyThread("094", "17555470");
		FutureTask<String> future=new FutureTask<>(callable);    //FutureTask实现了Runnable接口
		new Thread(future).start();
		try {
			String result=future.get();			//获取返回值ֵ
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static class MyThread implements Callable<String>{

		private final String area;
		private final String tel;
		
		public MyThread(String area, String tel) {
			super();
			this.area = area;
			this.tel = tel;
		}

		@Override
		public String call() throws Exception {
			
			return area.concat(tel).replace('5', '*');
		}
		
	}
}
