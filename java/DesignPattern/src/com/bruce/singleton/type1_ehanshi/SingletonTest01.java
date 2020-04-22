package com.bruce.singleton.type1_ehanshi;

public class SingletonTest01 {
	public static void main(String[] args) {
		//todo   more logics
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()+".."+s2.hashCode());

	}
}

class   Singleton{
	
	//构造器私有化
	private Singleton() {
		
	}
	private final static Singleton instance=new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
}