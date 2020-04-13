package com.example.demo.strategy2;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

import com.example.demo.strategy2.MSG_TYPE;

@Documented
@Inherited

public @interface MsgTypeHandler {
   
	  MSG_TYPE value();
}
