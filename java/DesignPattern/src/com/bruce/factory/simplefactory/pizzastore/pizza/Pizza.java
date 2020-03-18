package com.bruce.factory.simplefactory.pizzastore.pizza;

public abstract class Pizza {
 
	protected String name;
	
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println(name+" is baked");
	}
	public void cut() {
		System.out.println(name+" is cut");
	}
	public void box() {
		System.out.println(name+" is boxing");
	}
	public void setName(String name) {
		this.name=name;
	}
}
