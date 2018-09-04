package com.bear.interview;

public class AppleFactory implements FruitFactory{

	@Override
	public Fruit getFruit() {
		return new Apple();
	}

}
