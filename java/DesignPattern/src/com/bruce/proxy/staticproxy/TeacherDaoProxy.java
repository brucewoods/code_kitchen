package com.bruce.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{
	 
	private ITeacherDao target;

	public TeacherDaoProxy(ITeacherDao target) {
		 
		this.target = target;
	}

	@Override
	public void teach() {
		
		System.out.println("������ʦ��ǰ˵��~~");
		target.teach();
		System.out.println("������ʦ�κ�˵��~~");
	}
	
	
}
