package com.bruce.adapter.objectadapter;

//ȱ��:���˼̳�,�������,������¶������Ϣ,����ʹ�óɱ� ............
//�ŵ�:����д����ķ���,���
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
			System.out.println("ʹ�ö�����������������");
			dst = dst / 44;
			System.out.println("ʹ�ö����������������");

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
