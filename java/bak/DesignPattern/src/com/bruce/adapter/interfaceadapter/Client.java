package com.bruce.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println("~~接口适配器模式~~");
		Phone phone=new Phone();
		phone.Charging(new ChargingAdapter(new Voltage220V()));

	}
}
