package com.bruce.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University extends OrganizationComponent {

	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

	public University(String name, String desc) {
		super(name, desc);

	}

	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(organizationComponent);
	}

	@Override
	protected void print() {
	    
		System.out.println("========"+getName()+"=========");
		for(OrganizationComponent org :organizationComponents) {
			
		    org.print();
		}
		
	}

}
