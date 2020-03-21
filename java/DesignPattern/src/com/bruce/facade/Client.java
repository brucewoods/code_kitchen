package com.bruce.facade;

public class Client {
	public static void main(String[] args) {
		// todo more logics

		HomeTheater theater = new HomeTheater();
		System.out.println("~~~~~~准备看~~~~~~~~~");
		theater.ready();
		System.out.println("~~~~~~开始看~~~~~~~~~");
		theater.turnon();

		System.out.println("~~~~~~看完后~~~~~~~~~");

		theater.turnoff(); 

	}
}
