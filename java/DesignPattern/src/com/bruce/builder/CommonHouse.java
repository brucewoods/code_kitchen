package com.bruce.builder;

public class CommonHouse extends AbstractBuilder {

	@Override
	public void buildBasic() {
		
		System.out.println("普通房子打地基");
		
	}

	@Override
	public void buildWall() {
		System.out.println("普通房子打墙");
		
		
	}

	@Override
	public void buildRoof() {
		System.out.println("普通房子盖房顶");
		
		
	}
	 
}
