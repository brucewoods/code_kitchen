package com.bruce.builder;

 

public class HighBuilding extends AbstractBuilder {
	@Override
	public void buildBasic() {
		
		System.out.println("大厦房子打地基");
		
	}

	@Override
	public void buildWall() {
		System.out.println("大厦房子打墙");
		
		
	}

	@Override
	public void buildRoof() {
		System.out.println("大厦房子盖房顶");
		
		
	}
}
