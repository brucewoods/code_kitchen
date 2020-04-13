package com.bruce.factory.absfactory.pizzastore.order;

import com.bruce.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.bruce.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.bruce.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	Pizza pizza=null;
	@Override
	public Pizza createPizza(String orderType) {
		if (orderType.equals("ldcheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("ldpepper")) {
			pizza = new BJPepperPizza();
		}  
	 
		return pizza;

	}
	 
}
