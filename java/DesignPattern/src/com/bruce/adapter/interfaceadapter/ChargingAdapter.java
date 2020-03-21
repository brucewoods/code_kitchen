package com.bruce.adapter.interfaceadapter;

public class ChargingAdapter extends AbsAdapter {
	Voltage220V voltage220V;
	
	public ChargingAdapter(Voltage220V voltage220v) {
		super();
		voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if (null != this.voltage220V) {
			dst = voltage220V.output220V();
			System.out.println("ʹ�ýӿ���������������");
			dst = dst / 44;
			System.out.println("ʹ�ýӿ��������������");

		}
		return dst;
	}
}
