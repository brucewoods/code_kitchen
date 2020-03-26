package com.bruce.strategy;

public class WildDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ҰѼ");
	}

}

class ToyDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���Ѽ");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("���Ѽ�����");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("���Ѽ������Ӿ");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("���Ѽ�����");
	}

}