package com.bear.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkAndJoin extends RecursiveTask<Integer> {
	private static final int THRESHOLD = 5;
	private static final int num=100;
	private int start;
	private int end;

	public ForkAndJoin(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		boolean canCompute = (end - start) <= THRESHOLD;
		if (canCompute) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		} else {
			int mid = (start + end) / 2;
			ForkAndJoin left = new ForkAndJoin(start, mid);
			ForkAndJoin right = new ForkAndJoin(mid + 1, end);
			left.fork();
			right.fork();
			int leftResult = left.join();
			int rightResult = right.join();
			sum += leftResult + rightResult;
		}
		return sum;
	}

	public static void main(String[] args) {
		long begin=System.currentTimeMillis();
		ForkJoinPool pool = new ForkJoinPool();
		ForkAndJoin task = new ForkAndJoin(1, num);
		ForkJoinTask<Integer> result = pool.submit(task);
		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
