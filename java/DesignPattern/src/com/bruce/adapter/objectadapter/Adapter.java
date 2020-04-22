package com.bruce.adapter.objectadapter;

//缺点:用了继承,增加耦合,父类显露所有信息,增加使用成本 ............
//优点:可重写父类的方法,灵活
public class Adapter implements IVoltage5V {

	private Voltage220V voltage220V;

	public Adapter(Voltage220V voltage220v) {

		voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if (null != this.voltage220V) {
			dst = voltage220V.output220V();
			System.out.println("使用对象适配器进行适配");
			dst = dst / 44;
			System.out.println("使用对象适配器完成适配");

		}
		return dst;

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
}
