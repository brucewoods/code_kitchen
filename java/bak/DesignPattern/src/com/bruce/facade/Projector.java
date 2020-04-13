package com.bruce.facade;

public class Projector {

	private static Projector instance = new Projector();

	public static Projector getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("投影仪开机");
	}


	public void off() {
		System.out.println("投影仪关机");
	}

}
