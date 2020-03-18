package com.bruce.builder.improve;

public abstract class HouseBuilder {
     
	   House house=new House();
	
	   public abstract  void buildBasic();
	   public abstract  void buildWall();
	   public abstract  void buildRoof();
	   public House buildDone() {
		   return  house;
	   }
	   
}
