package com.bruce.memento.theory;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
		
		Originator originator=new Originator();
		
		originator.setState("״̬1:������100");
		
		CareTaker careTaker=new CareTaker();
		careTaker.add(originator.saveStateMemento());
		
		System.out.println("״̬1:"+originator.getState());
		
		originator.setState("״̬2:������50");
		careTaker.add(originator.saveStateMemento());
		originator.setState("״̬3:������60");
		careTaker.add(originator.saveStateMemento());
		
		System.out.println("�ָ���״̬1");
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println(originator.getState());
		

	}
}
