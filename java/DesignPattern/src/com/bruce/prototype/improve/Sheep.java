package com.bruce.prototype.improve;

public class Sheep implements Cloneable {

	private int age;
	private String name;
	private String color;
    private String address="ци╧е";
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



	@Override
	public String toString() {
		return "Sheep [age=" + age + ", name=" + name + ", color=" + color + ", address=" + address + "]";
	}

	@Override
	protected Object clone() {

		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sheep;
	}

}
