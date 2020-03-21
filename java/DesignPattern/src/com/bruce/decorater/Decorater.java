package com.bruce.decorater;

public class Decorater  extends Drink{

	private Drink obj;
	
	public  Decorater(Drink obj) {
		// TODO Auto-generated constructor stub
	 this.obj=obj;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice()+obj.cost();
	  
	}
	
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.desc+" " +super.getPrice()+"&&"+obj.getDesc();
	}
	
 
}
