package com.bruce.adapter.classadapter;

//缺点:用了继承,增加耦合,父类显露所有信息,增加使用成本 ............
//优点:可重写父类的方法,灵活
public class Adapter extends Voltage220V implements IVoltage5V {
	 
  
	@Override
	public int output5V() {
		int vol=super.output220V();
		int processed=vol/44;
		return processed;
	}
}
