package com.bruce.template;

public class Client {
	public static void main(String[] args) {
		// todo more logics

		System.out.println("������������~~~~~~");
		SoyaMilk soyaMilk = new PeanutSoyaMilk();
		soyaMilk.make();
		System.out.println("�����춹����~~~~~~");
		soyaMilk = new RedBeanSoyaMilk();
		soyaMilk.make();
		//���ӷ���
		System.out.println("����������~~~~~");
		soyaMilk=new PureSoyaMilk();
		soyaMilk.make();
	}
}
