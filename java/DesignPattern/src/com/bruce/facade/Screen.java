package com.bruce.facade;

public class Screen {
	private static Screen instance = new Screen();

	public static Screen getInstance() {
		return instance;
	}

	public void up() {
		System.out.println("Screen����");
	}

	public void down() {
		System.out.println("Screen����");
	}


}
