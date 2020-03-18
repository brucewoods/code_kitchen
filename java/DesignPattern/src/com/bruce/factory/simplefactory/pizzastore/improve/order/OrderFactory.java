package com.bruce.factory.simplefactory.pizzastore.improve.order;

import com.bruce.factory.simplefactory.pizzastore.improve.pizza.Pizza;
import com.bruce.factory.simplefactory.pizzastore.improve.pizza.CheesPizza;
import com.bruce.factory.simplefactory.pizzastore.improve.pizza.GreekPizza;
import com.bruce.factory.simplefactory.pizzastore.improve.pizza.JapanPizza;

public class OrderFactory {

	static Pizza pizza = null;

	public  Pizza createPizza(String orderType) {

		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
		} else if (orderType.equals("cheese")) {
			pizza = new CheesPizza();
		} else if (orderType.equals("japan")) {
			pizza = new JapanPizza();

		}
	 
		return pizza;

	}
}
