package com.example.demo.strategy2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.demo.strategy2.MessageService;

 

@Component
public class MessageServiceContext {
	 
	private final  Map<Integer, MessageService> handlerMap=new HashMap< >();
	
	public  MessageService getMessageService(Integer type) {
		return handlerMap.get(type);
	}
	
	public void  putMessageService(Integer code,MessageService messageService) {
		handlerMap.put(code, messageService);
	}
}
