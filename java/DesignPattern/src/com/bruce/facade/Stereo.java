package com.bruce.facade;

public class Stereo {
	private static Stereo instance = new Stereo();

	public static Stereo getInstance() {
		return instance;
	}

	public void up() {
		System.out.println("���������");
	}

	public void down() {
		System.out.println("�����С��");
	}

	public void off() {
		System.out.println("����ص�");
	}
 
}
