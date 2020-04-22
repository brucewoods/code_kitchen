package com.bruce.builder.improve;

public class BuildDirector {
	 
	private HouseBuilder houseBuilder;
   
  
	public BuildDirector(HouseBuilder houseBuilder) {
	 
		this.houseBuilder = houseBuilder;
	}


	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	};
	
	
	public House  constructHouse() {
		 houseBuilder.buildBasic();
		 houseBuilder.buildWall();
		 houseBuilder.buildRoof();
		 
		 return houseBuilder.buildDone();
		
	}
	
}
