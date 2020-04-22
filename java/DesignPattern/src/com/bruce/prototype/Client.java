package com.bruce.prototype;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
    Sheep sheep=new Sheep(10, "tom", "white");
    Sheep sheep2=new Sheep(sheep.getAge(),sheep.getName(), sheep.getColor());
    Sheep sheep3=new Sheep(sheep.getAge(),sheep.getName(), sheep.getColor());
    Sheep sheep4=new Sheep(sheep.getAge(),sheep.getName(), sheep.getColor());
    Sheep sheep5=new Sheep(sheep.getAge(),sheep.getName(), sheep.getColor());
    Sheep sheep6=new Sheep(sheep.getAge(),sheep.getName(), sheep.getColor());
    Sheep sheep7=new Sheep(sheep.getAge(),sheep.getName(), sheep.getColor());
    System.out.println("sheep1"+" name : "+sheep.getName()+" age: "+sheep.getAge()+" color:"+sheep.getColor());
    System.out.println("sheep2"+" name : "+sheep2.getName()+" age: "+sheep2.getAge()+" color:"+sheep2.getColor());
    System.out.println("sheep3"+" name : "+sheep3.getName()+" age: "+sheep3.getAge()+" color:"+sheep3.getColor());
    System.out.println("sheep4"+" name : "+sheep4.getName()+" age: "+sheep4.getAge()+" color:"+sheep4.getColor());
    System.out.println("sheep5"+" name : "+sheep5.getName()+" age: "+sheep5.getAge()+" color:"+sheep5.getColor());
    System.out.println("sheep6"+" name : "+sheep6.getName()+" age: "+sheep6.getAge()+" color:"+sheep6.getColor());
    System.out.println("sheep7"+" name : "+sheep7.getName()+" age: "+sheep7.getAge()+" color:"+sheep7.getColor());
   

	}
}
