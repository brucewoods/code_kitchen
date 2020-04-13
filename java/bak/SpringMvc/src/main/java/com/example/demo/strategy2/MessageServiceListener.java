package com.example.demo.strategy2;

import java.beans.Beans;
import java.util.Map;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.strategy2.MessageService;
import com.example.demo.strategy2.MessageServiceContext;
import com.example.demo.strategy2.MsgTypeHandler;

@Component
public class MessageServiceListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("initializing messagetype...xxxx1");
		Map<String, Object> beans=event.getApplicationContext().getBeansWithAnnotation(MsgTypeHandler.class);
		System.out.println("beans count:"+beans.size());
		MessageServiceContext messageServiceContext=event.getApplicationContext().getBean(MessageServiceContext.class);
	    beans.forEach((name,bean)->{
	    	System.out.println("initializing messagetype...xxxx2");
	    	MsgTypeHandler typeHandler=bean.getClass().getAnnotation(MsgTypeHandler.class);
	    	messageServiceContext.putMessageService(typeHandler.value().code, (MessageService)bean);
	    	
	    });
		
	}
	 
}
