package com.example.demo.strategy2;

import com.example.demo.strategy2.Data;

@Data

public class MessageInfo {
	
	private Integer type;
	private String content;
	public MessageInfo(Integer type, String content) {
		super();
		this.type = type;
		this.content = content;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
