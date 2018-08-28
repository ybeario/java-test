package com.bear.interview;

public class Main {
	public static void main(String[] args) {
		FruitFactory factory=new AppleFactory();
		Fruit fruit = factory.getFruit();
		System.out.println(fruit.name);
	}
}
