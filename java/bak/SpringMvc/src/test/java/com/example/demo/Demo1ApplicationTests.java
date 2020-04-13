 


package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo2.strategy.MSG_TYPE;
import com.example.demo2.strategy.MessageInfo;
import com.example.demo2.strategy.MessageService;
import com.example.demo2.strategy.MessageServiceContext;

@SpringBootTest
class Demo1ApplicationTests {

	@Autowired
	@Qualifier(value="messageService")
	MessageServiceContext messageServiceContext;

	@Test
	public void contextLoads() {
		// 构建一个文本消息
		MessageInfo messageInfo = new MessageInfo(MSG_TYPE.TEXT.code, "消息内容");
		 MessageService messageService = messageServiceContext.getMessageService(messageInfo.getType());
		// 处理文本消息 消息内容
		// 可以看到文本消息被文本处理类所处理
		messageService.handleMessage(messageInfo);
	}

}