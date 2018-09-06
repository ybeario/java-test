package com.bear.interview;

/**
 * @author Y.bear
 * @version 创建时间：2018年9月5日 下午6:53:20 类说明
 */
public class OverrideOrNot {
	public static void main(String[] args) {
	A a=new B();
		System.out.println(a.a);	//值没有覆盖
		a.getNum();					//方法覆盖
	}

}

class A {
	public int a = 0;

	public void getNum() {
		System.out.println("a");
	}
}

class B extends A {
	public int a = 1;

	public void getNum() {
		System.out.println("b");
	}
}
