package com.bruce.adapter.interfaceadapter;

public class Phone {
	 
	public void Charging(IVoltage5V voltage5v) {
		int res=voltage5v.output5V();
		if(res==5) {
			System.out.println("电压为5V,可以正常充电");
			
		}else if(res>5) {
			System.out.println("电压大于5V,无法正常充电");
		}
	}
}
