package com.bruce.adapter.interfaceadapter;

public class Phone {
	 
	public void Charging(IVoltage5V voltage5v) {
		int res=voltage5v.output5V();
		if(res==5) {
			System.out.println("��ѹΪ5V,�����������");
			
		}else if(res>5) {
			System.out.println("��ѹ����5V,�޷��������");
		}
	}
}
