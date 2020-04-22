package com.bruce.principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.run("摩托");
		vehicle.run("飞机34");
		vehicle.run("轮船");
	}

}

class Vehicle {
	public void run(String vehicle) {
		 System.out.println(vehicle+"在公路上运行");
	 }

}
