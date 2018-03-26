package com.bear.concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {
	public static void main(String[] args) {
		ThreadMXBean threadMXBean=ManagementFactory.getThreadMXBean();
		ThreadInfo[] dumpAllThreads = threadMXBean.dumpAllThreads(true, true);
		for (ThreadInfo threadInfo : dumpAllThreads) {
			System.out.println(threadInfo.getThreadId()+":"+threadInfo.getThreadName());
	//		System.out.println(threadInfo.getLockedMonitors().toString()+threadInfo.getLockedSynchronizers().toString());
		}
	}
}
