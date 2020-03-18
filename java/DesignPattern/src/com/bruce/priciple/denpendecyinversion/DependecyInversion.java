package com.bruce.priciple.denpendecyinversion;

public class DependecyInversion {
	public static void main(String[] args) {
		//TODO   more logics
		Person  person=new Person();
		person.Receive(new Email());

	}
}

class Email{
	public void getInfo() {
		System.out.println("” º˛–≈œ¢:hellow world!");
		
	}
}

class Person{
	public void  Receive(Email email) {
		email.getInfo();
	}
}
