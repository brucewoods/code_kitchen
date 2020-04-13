package com.bruce.builder.improve;

public class Client {
	public static void main(String[] args) {
		 
		BuildDirector buildDirector=new BuildDirector(new CommonHouse());
		buildDirector.constructHouse();
		
		System.out.println("~~客户要建高楼~~");
		buildDirector.setHouseBuilder(new HighBuilding());
       buildDirector.constructHouse();
	}
}
