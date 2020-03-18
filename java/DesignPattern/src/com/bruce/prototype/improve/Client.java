package com.bruce.prototype.improve;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
		System.out.println("~~~~原型模式完成对象创建~~~");
    Sheep sheep=new Sheep(10, "tom", "white");
    Sheep sheep2=(Sheep)sheep.clone();
    Sheep sheep3=(Sheep)sheep.clone();
    Sheep sheep4=(Sheep)sheep.clone();
    System.out.println("sheep2"+sheep2);
    System.out.println("sheep3"+sheep3);
    System.out.println("sheep4"+sheep4);
    
	}
}
