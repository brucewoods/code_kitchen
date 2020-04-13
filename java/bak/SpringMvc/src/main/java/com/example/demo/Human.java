package com.example.demo;

public class Human {
	 private Object head;
	 private String behavior="吃饭";
	 public Object getHead() {
		return head;
	}

	@Override
	public String toString() {
		return "Human [head=" + head + ", behavior=" + behavior + ", eye=" + eye + ", hands=" + hands + ", feet=" + feet
				+ "]";
	}

	public void setHead(Object head) {
		this.head = head;
	}

	public Object getEye() {
		return eye;
	}

	public void setEye(Object eye) {
		this.eye = eye;
	}

	public Object getHands() {
		return hands;
	}

	public void setHands(Object hands) {
		this.hands = hands;
	}

	public Object getFeet() {
		return feet;
	}

	public void setFeet(Object feet) {
		this.feet = feet;
	}

	private Object eye;
	 private Object hands;
	 private Object feet;
	 
	 public void talk() {
		 
		 System.out.println( "nice to meet you!");
	 }
	 
	 
}
