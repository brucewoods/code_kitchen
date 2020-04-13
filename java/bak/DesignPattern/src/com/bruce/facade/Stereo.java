package com.bruce.facade;

public class Stereo {
	private static Stereo instance = new Stereo();

	public static Stereo getInstance() {
		return instance;
	}

	public void up() {
		System.out.println("音响调大声");
	}

	public void down() {
		System.out.println("音响调小声");
	}

	public void off() {
		System.out.println("音响关掉");
	}
 
}
