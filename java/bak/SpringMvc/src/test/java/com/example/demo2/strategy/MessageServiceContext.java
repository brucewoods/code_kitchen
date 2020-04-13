package com.example.demo2.strategy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo2.strategy.MessageService;

 
@Component("messageService")
public class MessageServiceContext {

    private final Map<Integer, MessageService> handlerMap = new HashMap<>();

    public MessageService getMessageService(Integer type) {
        return handlerMap.get(type);
    }

    public void putMessageService(Integer code, MessageService messageService) {
        handlerMap.put(code, messageService);
    }

} 