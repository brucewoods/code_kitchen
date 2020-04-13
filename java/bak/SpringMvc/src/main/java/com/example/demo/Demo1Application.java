package com.example.demo;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.strategy2.MSG_TYPE;
import com.example.demo.strategy2.MessageInfo;
import com.example.demo.strategy2.MessageService;
import com.example.demo.strategy2.MessageServiceContext;
import com.example.demo.strategy2.MessageServiceListener;

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
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
