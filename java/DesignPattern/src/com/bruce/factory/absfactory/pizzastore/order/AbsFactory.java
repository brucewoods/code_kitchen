package com.bruce.factory.absfactory.pizzastore.order;

import com.bruce.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {

	  public Pizza createPizza(String orderType);
}
