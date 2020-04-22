package com.bruce.factory.simplefactory.pizzastore.improve.order;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import com.bruce.factory.simplefactory.pizzastore.improve.pizza.Pizza;

public class OrderPizza {
	OrderFactory orderFactory;
	Pizza pizza = null;

	public OrderPizza(OrderFactory orderFactory) {
		setOrderFactory(orderFactory);
	}

	void setOrderFactory(OrderFactory orderFactory) {
		System.out.println("~~�򵥹���ģʽ~~");
		String orderType = "";
		this.orderFactory = orderFactory;
		do {
			orderType = getType();
			
			pizza = orderFactory.createPizza(orderType);
			
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
		System.out.println("~~�˳�����~~");
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
