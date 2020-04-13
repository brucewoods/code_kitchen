package com.example.demo.strategy2;

public enum MSG_TYPE {
	TEXT(1, "文本"), IMAGE(2, "图片"), VIDEO(3, "视频");

	public final int code;
	public final String name;

	private MSG_TYPE(int code, String name) {
		this.code = code;
		this.name = name;
	}

}
