package com.bear.interview;

public class StaticOrder {
	public static void main(String[] args) {
		System.out.print(Bstatic.string);
	}
}

class Astatic {
	public static String string = "ok0";
	static {
		System.out.print("JD");
	}
	
}

class Bstatic extends Astatic {
	public static String string = "ok";
	
}
