package com.bruce.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.bruce.factory.simplefactory.pizzastore.pizza.CheesPizza;
import com.bruce.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.bruce.factory.simplefactory.pizzastore.pizza.JapanPizza;
import com.bruce.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
			} else if (orderType.equals("cheese")) {
				pizza = new CheesPizza();
			} else if (orderType.equals("japan")) {
				pizza = new JapanPizza();

			}

			else {

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
