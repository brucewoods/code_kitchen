package com.bruce.decorater;

public class CoffeeBar {
	public static void main(String[] args) {
	  Drink drink=new LongBlack();
	  System.out.println("����1:"+drink.cost());
	  System.out.println("����1:"+drink.getDesc());
	  
	  drink=new Milk(drink);
	  
	  
	  System.out.println("����:"+drink.cost());
	  System.out.println("����1:"+drink.getDesc());
      	  

	}
}
