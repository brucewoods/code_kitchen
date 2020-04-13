package com.bruce.factory.simplefactory.pizzastore.improve.order;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import com.bruce.factory.simplefactory.pizzastore.improve.pizza.Pizza;

public class OrderPizza2 {
	 
	Pizza pizza = null;

 
	public  OrderPizza2() {
		System.out.println("~~静态工厂模式~~");
		String orderType = "";
		 
		do {
			orderType = getType();
			
			pizza = OrderFactory2.createPizza(orderType);
			
			if (pizza != null) {
				pizza.setName(orderType);
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				break;
			}

		} while (true);
		System.out.println("~~退出制作~~");
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
