package com.bruce.principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.run("Ħ��");
		vehicle.run("�ɻ�34");
		vehicle.run("�ִ�");
	}

}

class Vehicle {
	public void run(String vehicle) {
		 System.out.println(vehicle+"�ڹ�·������");
	 }

}
