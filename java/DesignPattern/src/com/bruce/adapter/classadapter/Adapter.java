package com.bruce.adapter.classadapter;

//ȱ��:���˼̳�,�������,������¶������Ϣ,����ʹ�óɱ� ............
//�ŵ�:����д����ķ���,���
public class Adapter extends Voltage220V implements IVoltage5V {
	 
  
	@Override
	public int output5V() {
		int vol=super.output220V();
		int processed=vol/44;
		return processed;
	}
}
