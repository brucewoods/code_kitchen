package com.bruce.factory.simplefactory.pizzastore.pizza;

public class JapanPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println(name + ":  preparing");

	}

}
