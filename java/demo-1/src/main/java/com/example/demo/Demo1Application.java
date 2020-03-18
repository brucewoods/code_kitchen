package com.example.demo;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Demo1Application.class, args);
	}
	
//	@Bean
//	public CommandLineRunner
//commandLineRunner(ApplicationContext ctx) {
//		return args->{
//			System.out.println("Let's inspect the beans provided by Spring Boot.");
////			String[] beanNameStrings=ctx.get;
////			Arrays.sort(beanNames);
//			
//		}
//	}

}
