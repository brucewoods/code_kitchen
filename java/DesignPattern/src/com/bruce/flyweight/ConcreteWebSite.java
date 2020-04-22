package com.bruce.flyweight;

public class ConcreteWebSite extends WebSite {
	
	private String type="";

	public ConcreteWebSite(String type) {
		 
		this.type = type;
	}

	@Override
	public void Use(User user) {
		
		System.out.println(type+"��վ�Ѿ�������...ʹ����:"+user.getName());
		
	}
	
}
