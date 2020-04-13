package com.bruce.strategy;

public class WildDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("野鸭");
	}

}

class ToyDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("玩具鸭");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("玩具鸭不会叫");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("玩具鸭不会游泳");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("玩具鸭不会飞");
	}

}