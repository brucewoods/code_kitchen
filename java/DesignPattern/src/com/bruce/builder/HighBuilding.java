package com.bruce.builder;

 

public class HighBuilding extends AbstractBuilder {
	@Override
	public void buildBasic() {
		
		System.out.println("���÷��Ӵ�ػ�");
		
	}

	@Override
	public void buildWall() {
		System.out.println("���÷��Ӵ�ǽ");
		
		
	}

	@Override
	public void buildRoof() {
		System.out.println("���÷��ӸǷ���");
		
		
	}
}
