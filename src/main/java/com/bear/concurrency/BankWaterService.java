package com.bear.concurrency;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class BankWaterService {
	private ConcurrentHashMap<String, Integer> sheetBankWaterCount = new ConcurrentHashMap<>();
	private Runnable result = () -> {
		int result = 0;
		Set<Entry<String, Integer>> sheet = sheetBankWaterCount.entrySet();
		for (Entry<String, Integer> entry : sheet) {
			result += entry.getValue();
		}
		sheetBankWaterCount.put("result", result);
		System.out.println(result);

	};

	private CyclicBarrier barrier = new CyclicBarrier(4, result);
	private static ExecutorService executor = Executors.newFixedThreadPool(4);

	private Runnable run = () -> {
		sheetBankWaterCount.put(Thread.currentThread().getName(), 1);
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

	private void count() {
		for (int i = 0; i < 4; i++) {
			executor.execute(run);
		}
	}

	public static void main(String[] args) {
		BankWaterService service = new BankWaterService();
		service.count();
		executor.shutdown();
	}

}
