package com.bruce.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bruce.factory.absfactory.pizzastore.pizza.Pizza;
 

public class OrderPizza {
	AbsFactory factory;
	public OrderPizza(AbsFactory factory) {
	
		this.setFactory(factory);
	}
	
	private void setFactory(AbsFactory factory) {
		this.factory=factory;
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();

            pizza=this.factory.createPizza(orderType);
           
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
