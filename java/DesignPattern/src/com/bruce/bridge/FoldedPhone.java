package com.bruce.bridge;

public class FoldedPhone extends Phone {

	public FoldedPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.open();
		System.out.println("�۵��ֻ�����");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
		System.out.println("�۵��ֻ��ػ�");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("�۵��ֻ���绰");
	}
	
	
 
}
