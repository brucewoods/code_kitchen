package com.bruce.facade;

public class Client {
	public static void main(String[] args) {
		// todo more logics

		HomeTheater theater = new HomeTheater();
		System.out.println("~~~~~~׼����~~~~~~~~~");
		theater.ready();
		System.out.println("~~~~~~��ʼ��~~~~~~~~~");
		theater.turnon();

		System.out.println("~~~~~~�����~~~~~~~~~");

		theater.turnoff(); 

	}
}
