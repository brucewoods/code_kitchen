package com.bruce.builder;

public class Client {
	public static void main(String[] args) {
		 
		
		CommonHouse commonHouse=new CommonHouse();
		
		commonHouse.build();
		
		System.out.println("~~����¥~~");
		HighBuilding highBuilding=new HighBuilding();
		highBuilding.build();

	}
}
