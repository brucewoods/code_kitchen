package com.bruce.facade;

public class Projector {

	private static Projector instance = new Projector();

	public static Projector getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("ͶӰ�ǿ���");
	}


	public void off() {
		System.out.println("ͶӰ�ǹػ�");
	}

}
