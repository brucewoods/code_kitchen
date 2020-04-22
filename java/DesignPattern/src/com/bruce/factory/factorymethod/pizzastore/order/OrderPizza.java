package com.bruce.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bruce.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
	public abstract Pizza  createPizza(String orderType);
	
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();

            pizza=createPizza(orderType);
           
		   if(pizza==null) {

				break;
			}
			pizza.setName(orderType);
			// 输出pizza制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();

		} while (true);
	}

	private String getType() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type: ");
			String string = reader.readLine();
			return string;

		} catch (IOException e) {
			e.printStackTrace();
			return "";
			// TODO: handle exception
		}
	}
}
