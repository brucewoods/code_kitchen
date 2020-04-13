package com.bruce.flyweight.jdkdemo;

public class FlyWeight {
	public static void main(String[] args) {
		Integer x=Integer.valueOf(3);
		
		Integer y=new Integer(3);;
		Integer z=new Integer(3);
		Integer a=Integer.valueOf(3);
		
		System.out.println( x==y);
		System.out.println( y==z);
		System.out.println( x==a);
 
	 
		
	}
}
