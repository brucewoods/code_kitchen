package com.bruce.adapter.objectadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println("~~对象适配器模式~~");
		Phone phone=new Phone();
		phone.Charging(new Adapter(new Voltage220V()));

	}
}
