package com.example.demo2.strategy;

import org.springframework.stereotype.Service;

import com.example.demo.strategy2.MSG_TYPE;
import com.example.demo.strategy2.MessageInfo;
import com.example.demo.strategy2.MessageService;
import com.example.demo.strategy2.MsgTypeHandler;

@Service
@MsgTypeHandler(value = MSG_TYPE.IMAGE)
public class ImageMessageService implements MessageService {

    @Override
    public void handleMessage(MessageInfo messageInfo) {
        System.out.println("处理图片消息 " + messageInfo.getContent());
    }
}
 