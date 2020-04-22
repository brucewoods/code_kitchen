package com.bruce.principle.singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("摩托");
		roadVehicle.run("汽车");

		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
		airVehicle.run("战斗机");

		WaterVehicle waterVehicle = new WaterVehicle();
		waterVehicle.run("邮轮");
		waterVehicle.run("赛艇");

	}

}

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在公路上运行");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在天空上运行");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "在水中上运行");
	}
}
