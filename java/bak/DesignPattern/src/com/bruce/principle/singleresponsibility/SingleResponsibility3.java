package com.bruce.principle.singleresponsibility;

public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 vehicle2=new Vehicle2();
		vehicle2.run("����");
		vehicle2.runAir("�ɻ�");
		vehicle2.runWater("����");
	}
}


//�˷����ڴ�������ʺ�
//��Ȼû�����༶�����ص�һԭ��,���ڷ������ص�һԭ��,��Ȼ��Ϊ����
class Vehicle2{
	
	public void run(String vehicle) {
		System.out.println(vehicle+"�ڹ�·������.....");
		
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+"������Ϸ���.....");
		
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+"��ˮ������........");
		
	}
}