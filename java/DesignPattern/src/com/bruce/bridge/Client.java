package com.bruce.bridge;

public class Client {
	public static void main(String[] args) {

		Phone phone = new FoldedPhone(new Xiaomi());
		phone.open();
		phone.close();
		phone.call();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		phone = new FoldedPhone(new Vivo());
		phone.open();
		phone.close();
		phone.call();
	}
}
