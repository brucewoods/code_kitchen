package com.bruce.prototype;

public class Sheep     {

	private int age;
	private String name;
	private String color;

	public Sheep(int age, String name, String color) {
		setColor(color);
		setName(name);
		setAge(age);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
