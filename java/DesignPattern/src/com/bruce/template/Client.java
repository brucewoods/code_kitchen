package com.bruce.template;

public class Client {
	public static void main(String[] args) {
		// todo more logics

		System.out.println("制作花生豆浆~~~~~~");
		SoyaMilk soyaMilk = new PeanutSoyaMilk();
		soyaMilk.make();
		System.out.println("制作红豆豆浆~~~~~~");
		soyaMilk = new RedBeanSoyaMilk();
		soyaMilk.make();
		//钩子方法
		System.out.println("制作纯豆浆~~~~~");
		soyaMilk=new PureSoyaMilk();
		soyaMilk.make();
	}
}
