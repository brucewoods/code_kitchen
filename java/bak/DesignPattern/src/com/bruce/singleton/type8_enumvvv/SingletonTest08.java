package com.bruce.singleton.type8_enumvvv;

public class SingletonTest08 {
	public static void main(String[] args) {
		//todo   more logics
    Singleton s1=Singleton.INSTANCE;
    Singleton s2=Singleton.INSTANCE;
    System.out.println(s1==s2);
    System.out.println(s1.hashCode()+"..."+s2.hashCode());
	}
}


enum Singleton{
	INSTANCE;
	public void doSome() {
		System.out.println("do something you like.");
	}
}