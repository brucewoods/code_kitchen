package com.bruce.facade;

public class Popcorn {
 
	private static Popcorn instance=new Popcorn();
	
	public static Popcorn getInstance() {
		return instance;
	}
	
	public  void on() {
		System.out.println("爆米花机开始工作");
	}
	public void off() {
		
		System.out.println("爆米花机关掉");
	}
}
