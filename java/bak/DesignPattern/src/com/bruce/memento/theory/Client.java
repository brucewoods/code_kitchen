package com.bruce.memento.theory;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
		
		Originator originator=new Originator();
		
		originator.setState("×´Ì¬1:¹¥»÷Á¦100");
		
		CareTaker careTaker=new CareTaker();
		careTaker.add(originator.saveStateMemento());
		
		System.out.println("×´Ì¬1:"+originator.getState());
		
		originator.setState("×´Ì¬2:¹¥»÷Á¦50");
		careTaker.add(originator.saveStateMemento());
		originator.setState("×´Ì¬3:¹¥»÷Á¦60");
		careTaker.add(originator.saveStateMemento());
		
		System.out.println("»Ö¸´µ½×´Ì¬1");
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println(originator.getState());
		

	}
}
