package com.bear.interview;

public class OrangeFactory implements FruitFactory{

	@Override
	public Fruit getFruit() {
		return new Orange();
		
	}

}
