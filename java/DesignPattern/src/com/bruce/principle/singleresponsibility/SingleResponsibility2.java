package com.bruce.principle.singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("Ħ��");
		roadVehicle.run("����");

		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("�ɻ�");
		airVehicle.run("ս����");

		WaterVehicle waterVehicle = new WaterVehicle();
		waterVehicle.run("����");
		waterVehicle.run("��ͧ");

	}

}

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�ڹ�·������");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�����������");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "��ˮ��������");
	}
}
