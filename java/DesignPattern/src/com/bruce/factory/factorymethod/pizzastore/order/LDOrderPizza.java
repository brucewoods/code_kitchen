package com.bruce.factory.factorymethod.pizzastore.order;

import com.bruce.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.bruce.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.bruce.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
	static Pizza pizza = null;

	public  Pizza createPizza(String orderType) {

		if (orderType.equals("ldcheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("ldpepper")) {
			pizza = new BJPepperPizza();
		}  
	 
		return pizza;

	}
}
