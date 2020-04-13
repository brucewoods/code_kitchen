package com.example.demo2.strategy;

import org.springframework.stereotype.Service;

import com.example.demo2.strategy.MessageInfo;
@Service
public interface MessageService {

    void handleMessage(MessageInfo messageInfo);
}