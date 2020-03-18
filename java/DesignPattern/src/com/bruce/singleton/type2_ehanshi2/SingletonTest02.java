package com.bruce.singleton.type2_ehanshi2;

public class SingletonTest02 {
	public static void main(String[] args) {
		//todo   more logics
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()+".."+s2.hashCode());

	}
}

class   Singleton{
	
	//������˽�л�
	private Singleton() {
		
	}
	private   static Singleton instance;
	
	//�ھ�̬����� ������������
	static {
		instance=new Singleton();
	}
	public static Singleton getInstance() {
		return instance;
	}
	
}