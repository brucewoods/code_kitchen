package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {
	public static void main(String[] args) {
	  
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		Object bean=applicationContext.getBean("id01");
		System.out.println("bean"+bean);
		Object bean2=applicationContext.getBean("id01");
		System.out.println("bean"+bean2);
		System.out.println(bean==bean2);
	}
}
 