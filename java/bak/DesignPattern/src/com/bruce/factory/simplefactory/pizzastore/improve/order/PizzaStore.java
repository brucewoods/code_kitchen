package com.bruce.factory.simplefactory.pizzastore.improve.order;

public class PizzaStore {
	public static void main(String[] args) {
		 
		new OrderPizza(new OrderFactory());
		
		new OrderPizza2();
	}
}
