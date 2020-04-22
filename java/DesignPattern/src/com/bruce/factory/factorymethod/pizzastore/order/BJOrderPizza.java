package com.bruce.factory.factorymethod.pizzastore.order;

import com.bruce.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.bruce.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.bruce.factory.factorymethod.pizzastore.pizza.Pizza;
 

public class BJOrderPizza  extends OrderPizza{
   
	static Pizza pizza = null;

	public  Pizza createPizza(String orderType) {

		if (orderType.equals("bjcheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("bjpepper")) {
			pizza = new BJPepperPizza();
		}  
	 
		return pizza;

	}
}
	 
 
