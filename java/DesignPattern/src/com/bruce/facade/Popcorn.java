package com.bruce.facade;

public class Popcorn {
 
	private static Popcorn instance=new Popcorn();
	
	public static Popcorn getInstance() {
		return instance;
	}
	
	public  void on() {
		System.out.println("���׻�����ʼ����");
	}
	public void off() {
		
		System.out.println("���׻����ص�");
	}
}
