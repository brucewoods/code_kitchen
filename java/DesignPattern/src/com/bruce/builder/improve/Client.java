package com.bruce.builder.improve;

public class Client {
	public static void main(String[] args) {
		 
		BuildDirector buildDirector=new BuildDirector(new CommonHouse());
		buildDirector.constructHouse();
		
		System.out.println("~~�ͻ�Ҫ����¥~~");
		buildDirector.setHouseBuilder(new HighBuilding());
       buildDirector.constructHouse();
	}
}
