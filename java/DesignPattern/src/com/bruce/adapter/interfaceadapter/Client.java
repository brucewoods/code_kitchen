package com.bruce.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		System.out.println("~~�ӿ�������ģʽ~~");
		Phone phone=new Phone();
		phone.Charging(new ChargingAdapter(new Voltage220V()));

	}
}
