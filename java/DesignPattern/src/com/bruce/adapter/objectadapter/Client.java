package com.bruce.adapter.objectadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println("~~����������ģʽ~~");
		Phone phone=new Phone();
		phone.Charging(new Adapter(new Voltage220V()));

	}
}
