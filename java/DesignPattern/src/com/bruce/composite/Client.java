package com.bruce.composite;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
        OrganizationComponent university=new University("清华大学",	"清华大学");
        
        OrganizationComponent computerCollege=new University("计算机学院",	"计算机学院");
        OrganizationComponent infoCollege=new University("信息工程学院",	"信息工程学院");
        
        computerCollege.add(new Department("软件工程", "软件工程"));
        
        computerCollege.add(new Department("网络工程", "网络工程"));
        computerCollege.add(new Department("计算机科学  与技术", "计算机科学  与技术"));
       
        infoCollege.add(new Department("通信工程", "通信工程"));
        infoCollege.add(new Department("信息工程", "信息工程"));
        
        
        university.add(computerCollege);
        university.add(infoCollege);
        
        university.print();
        
	}
}
