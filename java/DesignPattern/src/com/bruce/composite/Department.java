package com.bruce.composite;

 

public class Department extends OrganizationComponent {

	public Department(String name, String desc) {
		super(name, desc);

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc();
	}

	@Override
	protected void print() {

		System.out.println(getName());

	}
}
