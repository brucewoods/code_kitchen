package com.bruce.strategy;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
          Duck wildDuck=new WildDuck();
          wildDuck.fly();
          wildDuck.display();
          
          System.out.println("~~~Íæ¾ßÑ¼~~~");
          Duck toyDuck=new ToyDuck();
          toyDuck.fly();
          toyDuck.display();
	}
}
 