package com.bruce.factory.absfactory.pizzastore.order;

import com.bruce.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.bruce.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.bruce.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {

	Pizza pizza=null;
	@Override
	public Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		if (orderType.equals("bjcheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("bjpepper")) {
			pizza = new BJPepperPizza();
		} else {
			System.out.println("¶©¹ºÊ§°Ü");
		}
	 
		return pizza;
	}
	 
}
