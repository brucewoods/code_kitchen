package com.bruce.priciple.denpendecyinversion;

public class DependecyInversionImprove {
	public static void main(String[] args) {
		//TODO   more logics
		Person2  person=new Person2();
		person.receive(new Email2());
		person.receive(new Weixin());

	}
}

class Email2 implements Ireceiver{
	public void getInfo() {
		System.out.println("�ʼ���Ϣ:hellow world!");
		
	}
}
class Weixin implements Ireceiver{
	public void getInfo() {
		System.out.println("΢����Ϣ:hellow weixin!");
		
	}
}
interface Ireceiver{
	public void  getInfo();
}
class Person2{
	public void  receive(Ireceiver receiver) {
		receiver.getInfo();
	}
}
