package com.bruce.adapter.interfaceadapter;

//缺点:用了继承,增加耦合,父类显露所有信息,增加使用成本 ............
//优点:可重写父类的方法,灵活
public abstract class AbsAdapter implements IVoltage5V {

	 

	@Override
	public int output5V() {
	
      return 0;
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
