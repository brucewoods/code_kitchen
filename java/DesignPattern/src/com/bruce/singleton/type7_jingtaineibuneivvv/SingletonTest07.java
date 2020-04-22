package com.bruce.singleton.type7_jingtaineibuneivvv;

 

public class SingletonTest07 {
	public static void main(String[] args) {
		// todo more logics
		//todo   more logics
		System.out.println("����ʽ,�̰߳�ȫ");
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()+".."+s2.hashCode());


	}
}

class Singleton {

	private static Singleton instance;

	private Singleton() {

	}
   //����ͬ������Ĵ���,����̰߳�������
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();

		}
		return instance;
	}

}
