package com.bruce.facade;

public class TheaterLight {
	private static TheaterLight instance = new TheaterLight();

	public  static TheaterLight getInstance() {
		return instance;
	}

	public void up() {
		System.out.println("投影仪灯光升起");
	}

	public void down() {
		System.out.println("投影仪灯光降下");
	}

	public void dim() {
		System.out.println("投影仪灯光变暗");
	}

	public void bright() {
		System.out.println("投影仪灯光变亮");
	}

	public void focus() {
		System.out.println("投影仪灯光聚焦");
	}

}
