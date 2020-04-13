package com.bruce.flyweight;

public class ConcreteWebSite extends WebSite {
	
	private String type="";

	public ConcreteWebSite(String type) {
		 
		this.type = type;
	}

	@Override
	public void Use(User user) {
		
		System.out.println(type+"网站已经在运行...使用者:"+user.getName());
		
	}
	
}
