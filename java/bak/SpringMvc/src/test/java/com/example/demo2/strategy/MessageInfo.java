package com.example.demo2.strategy;

import com.example.demo2.strategy .Data;

@Data
@AllArgsConstructor
public class MessageInfo {

    // 消息类型
    private Integer type;
    public MessageInfo(Integer type, String content) {
		super();
		this.type = type;
		this.content = content;
	}
	// 消息内容
    private String content;
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