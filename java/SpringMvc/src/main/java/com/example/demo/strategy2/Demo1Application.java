package com.example.demo.strategy2;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.strategy2.MSG_TYPE;
import com.example.demo.strategy2.MessageInfo;
import com.example.demo.strategy2.MessageService;
import com.example.demo.strategy2.MessageServiceContext;
import com.example.demo.strategy2.MessageServiceListener;

@SpringBootApplication 
public class Demo1Application {
	
	public static void main(String[] args) {
		
		SpringApplication  application=new SpringApplication(Demo1Application.class);
		application.addListeners(new MessageServiceListener());
		application.run(args);
		
		MessageInfo messageInfo=new MessageInfo(MSG_TYPE.TEXT.code, "hello,are you ok?");
		//MessageService  messageService=context.getMessageService(messageInfo.getType());
		
		//messageService.handleMessage(messageInfo);

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
