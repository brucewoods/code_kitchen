package com.example.demo.strategy2;

import org.springframework.stereotype.Service;

import com.example.demo.strategy2.MSG_TYPE;
import com.example.demo.strategy2.MessageInfo;
import com.example.demo.strategy2.MessageService;
import com.example.demo.strategy2.MsgTypeHandler;

@Service
@MsgTypeHandler(value=MSG_TYPE.TEXT)
public class TextMessageService  implements  MessageService{

	@Override
	public void handleMessage(MessageInfo info) {
		// TODO Auto-generated method stub
		
		System.out.println("处理文本消息："+info.getContent());
	}
 
}
