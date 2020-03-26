package com.bruce.memento.theory;

public class Memento {
	private String state;
	public Memento(String state) {
	     
		this.state=state;
		// TODO Auto-generated constructor stub
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
