package com.bruce.builder;

public abstract class AbstractBuilder {

	public abstract void buildBasic();

	public abstract void buildWall();

	public abstract void buildRoof();

	public void build() {
		buildBasic();
		buildWall();
		buildRoof();
	}

}
