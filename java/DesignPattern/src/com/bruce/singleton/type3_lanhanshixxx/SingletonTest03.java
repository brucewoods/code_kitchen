package com.bruce.singleton.type3_lanhanshixxx;

 

public class SingletonTest03 {
	public static void main(String[] args) {
		// todo more logics
		//todo   more logics
		System.out.println("懒汉式,线程不安全");
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

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();

		}
		return instance;
	}

}
