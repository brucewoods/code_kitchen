package com.bruce.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{
	 
	private ITeacherDao target;

	public TeacherDaoProxy(ITeacherDao target) {
		 
		this.target = target;
	}

	@Override
	public void teach() {
		
		System.out.println("代理老师课前说明~~");
		target.teach();
		System.out.println("代理老师课后说明~~");
	}
	
	
}
