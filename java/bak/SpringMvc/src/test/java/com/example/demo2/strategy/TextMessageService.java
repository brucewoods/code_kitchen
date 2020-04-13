package com.example.demo2.strategy;

import org.springframework.stereotype.Service;

import com.example.demo.strategy2.MSG_TYPE;
import com.example.demo.strategy2.MessageInfo;
import com.example.demo.strategy2.MessageService;
import com.example.demo.strategy2.MsgTypeHandler;

@Service
@MsgTypeHandler(value = MSG_TYPE.TEXT)
public class TextMessageService implements MessageService {

    @Override
    public void handleMessage(MessageInfo messageInfo) {
        System.out.println("处理文本消息 " + messageInfo.getContent());
    }
}
 