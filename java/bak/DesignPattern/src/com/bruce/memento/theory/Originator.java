package com.bruce.memento.theory;

public class Originator {
	 
	public String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveStateMemento() {
		 
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		
		this.state=memento.getState();
	}
}
