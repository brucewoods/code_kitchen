package com.bruce.facade;

public class TheaterLight {
	private static TheaterLight instance = new TheaterLight();

	public  static TheaterLight getInstance() {
		return instance;
	}

	public void up() {
		System.out.println("ͶӰ�ǵƹ�����");
	}

	public void down() {
		System.out.println("ͶӰ�ǵƹ⽵��");
	}

	public void dim() {
		System.out.println("ͶӰ�ǵƹ�䰵");
	}

	public void bright() {
		System.out.println("ͶӰ�ǵƹ����");
	}

	public void focus() {
		System.out.println("ͶӰ�ǵƹ�۽�");
	}

}
