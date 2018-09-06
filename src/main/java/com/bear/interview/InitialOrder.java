package com.bear.interview;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月5日 下午7:01:04 类说明
 */
public class InitialOrder {
	public static C c = new C();

	public static void main(String[] args) {
		System.out.println("------main------");
		new C();
	}

	static {
		System.out.println("static InitialOrder");
	}
}

 class C {
	public C() {
		
		System.out.println("C");
	}
}
