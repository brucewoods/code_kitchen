package com.bruce.principle.singleresponsibility;

public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 vehicle2=new Vehicle2();
		vehicle2.run("汽车");
		vehicle2.runAir("飞机");
		vehicle2.runWater("邮轮");
	}
}


//此方法在此情况最适合
//虽然没有在类级别遵守单一原则,但在方法遵守单一原则,仍然视为遵守
class Vehicle2{
	
	public void run(String vehicle) {
		System.out.println(vehicle+"在公路上运行.....");
		
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+"在天空上飞行.....");
		
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+"在水里运行........");
		
	}
}